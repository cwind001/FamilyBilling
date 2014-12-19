	// create the module and name it cwindApp
	var cwindApp = angular.module('cwindApp', ['ngRoute', 'ngResource']);

	// configure our routes
	cwindApp.config(function($routeProvider) {
		$routeProvider

			// route for the home page
			.when('/', {
				templateUrl : 'jsp/home.html',
				controller  : 'mainController'
			})

			// route for the about page
			.when('/about', {
				templateUrl : 'jsp/about.jsp',
				controller  : 'TestController'
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
		$scope.message = 'Everyone come and see how good I look!';
	});

	cwindApp.controller('aboutController', function($scope) {
		$scope.message = 'Look! I am an about page.';
	});

	cwindApp.controller('contactController', function($scope) {
		$scope.message = 'Contact us! JK. This is just a demo.';
	});
	
	cwindApp.factory('Test', function($resource){
		return $resource('/FamilyBilling/account/userList');
	});
	
	cwindApp.controller('TestController', function($scope, Test){
		  var entries = Test.query({}, function(data) {
			  $scope.mydata = data;
		  });
	});
