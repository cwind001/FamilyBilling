	// create the module and name it cwindApp
	var cwindApp = angular.module('cwindApp', ['ngRoute', 'ngResource']);

	var baseUrl = '/FamilyBilling/billing/';
	
	var userUrl = {
		'addUrl' : baseUrl + 'account/add',
		'updateUrl' : baseUrl + 'account/update',
		'deleteUrl' : baseUrl + 'account/delete/:id',
		'queryUrl' : baseUrl + 'account/userList'
	};
	
	var categoryUrl = {
		'addCategory' : baseUrl + '/category/add',
		'queryCategory' : baseUrl + '/category/categoryList',
		'addExpenseType' : baseUrl + '/expenseType/add',
		'queryExpenseType' : baseUrl + '/expenseType/typeList',
		'updateExpenseType' : baseUrl + '/expenseType/update',
		'deleteExpenseType' : baseUrl + '/expenseType/delete/:id',
		'queryExpenseTypeByCategoryId' : baseUrl + '/expenseType/:category_id/typeList'
	};
	
	var expenseUrl = {
		'addExpense' : baseUrl + '/expense/add',
		'queryExpense' : baseUrl + '/expense/expenseList',
		'updateExpense' : baseUrl + '/expense/update',
		'deleteExpense' : baseUrl + '/expense/delete/:id'		
	};
	
	var actions = {
	        'add' : {
	            method : 'PUT',
	            isArray : true,
	            headers : {
	                'Content-Type' : 'application/json'
	            }
	        },
	        'delete' : {
	            method : 'DELETE',
	            isArray : true
	        },
	        'query' : {
	            method : 'GET',
	            isArray : true
	        },
	        'update' : {
	            method : 'POST',
	            isArray : true,
	            headers : {
	                'Content-Type' : 'application/json'
	            }
	        }
	    };
	
	// configure our routes
	cwindApp.config(function($routeProvider) {
		$routeProvider

			// route for the home page
			.when('/', {
				templateUrl : 'jsp/home.jsp',
				controller  : 'mainController'
			})
			
			.when('/category', {
				templateUrl : 'jsp/category.jsp',
				controller  : 'categoryController'
			})

			.when('/loan', {
				templateUrl : 'jsp/loan.jsp',
				controller  : 'loanController'
			})
			
			.when('/test', {
				templateUrl : 'jsp/test.jsp',
				controller : 'userController'
			})
			
			.when('/expense', {
				templateUrl : 'jsp/expense.jsp',
				controller : 'expenseController'
			})

			.when('/fundAccount', {
				templateUrl : 'jsp/fundAccount.jsp',
				controller  : 'fundAccountController'
			});
	});

	// create the controller and inject Angular's $scope
	cwindApp.controller('mainController', function($scope) {
		// create a message to display in our view
		$scope.message = '欢迎使用家用记账系统!';
	});
	
	cwindApp.controller('categoryController', function($scope, $resource) {
		var categoryList = $resource(categoryUrl.queryCategory);
		categoryList.query({}, function(categories) {
			$scope.categories = categories;
		});
		
		var expenseTypeList = $resource(categoryUrl.queryExpenseType);
		expenseTypeList.query({}, function(types) {
			$scope.expenseTypes = types;
		});
		
		var expenseTypeDelete = $resource(categoryUrl.deleteExpenseType);
		$scope.deleteExpenseType = function(expenseType, index){
			$scope.expenseTypes.splice(index, 1);
			expenseTypeDelete['delete']({
				id : expenseType.id
			}, {}, function(expenseTypes) {
				$scope.expenseTypes = expenseTypes;
			});
		};
		
		var expenseTypeAdd = $resource(categoryUrl.addExpenseType, {}, actions);
		$scope.addType = function(){
			$scope.newType.category_id = $scope.category.id;
			$scope.expenseTypes = expenseTypeAdd.add($scope.newType);
		};
	});
	
	cwindApp.controller('expenseController', function($scope, $resource) {
		var expenseTypeList = $resource(categoryUrl.queryExpenseTypeByCategoryId);
		expenseTypeList.query({
				category_id : 1
			}, function(types) {
			$scope.expenseTypes = types;
		});
		
		var expenseList = $resource(expenseUrl.queryExpense);
		expenseList.query({}, function(data) {
			$scope.expenses = data;
		});
		
		var expenseDelete = $resource(expenseUrl.deleteExpense);
		$scope.deleteExpense = function(expense, index){
			$scope.expenses = expenseDelete['delete']({id:expense.id});
		};
		
		$scope.getTotalPrice = function() {
			var total = 0;
		    for(var i = 0; i < $scope.expenses.length; i++){
		        var expense = $scope.expenses[i];
		        total += expense.price;
		    }
		    return total;
		}
		
		var expenseAdd = $resource(expenseUrl.addExpense, {}, actions);
		$scope.addExpense = function(){
			$scope.newExpense.expenseType_id = $scope.expenseType.id;
			$scope.expenses = expenseAdd.add($scope.newExpense);
		};
	});
	
	cwindApp.controller('loanController', function($scope) {
		$scope.message = '贷款管理';
	});

	cwindApp.controller('fundAccountController', function($scope) {
		$scope.message = '资金账户余额';
	});
	
	cwindApp.controller('userController', function($scope, $resource){
		var userList = $resource(userUrl.queryUrl);
		var userEntries = userList.query({}, function(data) {
			$scope.mydata = data;
		});
		
		var userDelete = $resource(userUrl.deleteUrl);
		$scope.deleteUser = function(user, index){
			$scope.mydata.splice(index, 1);
			userDelete['delete']({
	            id : user.id
	        }, {}, function(data) {
	        	$scope.mydata = data;
	        });
		};
		
		var userAdd = $resource(userUrl.addUrl, {}, actions);
		$scope.addUser = function(){
			userAdd.add($scope.newUser);
			$scope.mydata.push($scope.newUser);
			$scope.showInputField = 0;
		};
		
		$scope.showInputField = function(){
			$scope.showInputField = 1;
		}
		
	});
