	// create the module and name it cwindApp
	var cwindApp = angular.module('cwindApp', ['ngRoute', 'ngResource']);

	var userUrl = {
		'addUrl' : '/FamilyBilling/account/add',
		'updateUrl' : '/FamilyBilling/account/update',
		'deleteUrl' : '/FamilyBilling/account/delete/:id',
		'queryUrl' : '/FamilyBilling/account/userList'
	}
	
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

			// route for the about page
			.when('/about', {
				templateUrl : 'jsp/about.jsp',
				controller  : 'UserController'
			})

			// route for the contact page
			.when('/contact', {
				templateUrl : 'jsp/contact.html',
				controller  : 'contactController'
			});
	});

	// create the controller and inject Angular's $scope
	cwindApp.controller('mainController', function($scope) {
		// create a message to display in our view
		$scope.message = '欢迎使用家用记账系统!';
	});
	
	cwindApp.controller('categoryController', function($scope) {
		$scope.message = 'Category';
	})

	cwindApp.controller('contactController', function($scope) {
		$scope.message = 'Contact us! JK. This is just a demo.';
	});
	
	cwindApp.controller('UserController', function($scope, $resource){
		var userList = $resource(userUrl.queryUrl);
		var userEntries = userList.query({}, function(data) {
			$scope.mydata = data;
		});
		var userDelete = $resource(userUrl.deleteUrl);
		$scope.deleteUser = function(user){
		};
	});
