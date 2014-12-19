<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- define angular app -->
<html ng-app="cwindApp">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- SCROLLS -->
  <link rel="stylesheet" href="/FamilyBilling/css/bootstrap.min.css" />
  <link rel="stylesheet" href="/FamilyBilling/css/font-awesome.css" />

  <!-- SPELLS -->
  <script src="/FamilyBilling/js/angular.min.js"></script>
  <script src="/FamilyBilling/js/angular-route.js"></script>
  <script src="/FamilyBilling/js/angular-resource.js"></script>
  <script src="/FamilyBilling/js/script.js"></script>
</head>

<!-- define angular controller -->
<body ng-controller="mainController">

  <nav class="navbar navbar-default">
    <div class="container">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">欢迎使用</a>
      </div>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
        <li><a href="#about"><i class="fa fa-shield"></i> About</a></li>
        <li><a href="#contact"><i class="fa fa-comment"></i> Contact</a></li>
      </ul>
    </div>
  </nav>

  <div id="main">
  
    <!-- angular templating -->
		<!-- this is where content will be injected -->
    <div ng-view></div>
    
  </div>
  
  <footer class="text-center">
    <p>View the tutorial on <a href="http://scotch.io/tutorials/javascript/single-page-apps-with-angularjs-routing-and-templating">Scotch.io</a></p>
  
    <p>View a tutorial on <a href="http://scotch.io/tutorials/javascript/animating-angularjs-apps-ngview">Animating Your Angular Single Page App</a></p>
  </footer>
  
</body>

</html>