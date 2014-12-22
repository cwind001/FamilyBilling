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
        <a class="navbar-brand" href="#">家用记账系统</a>
      </div>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><i class="fa fa-home"></i> 首页</a></li>
        <li><a href="#category"><i class="fa fa-shield"></i> 分类</a></li>
        <li><a href="#contact"><i class="fa fa-shield"></i> 费用</a></li>
        <li><a href="#about"><i class="fa fa-shield"></i> 贷款</a></li>
        <li><a href="#contact"><i class="fa fa-shield"></i> 账户</a></li>
      </ul>
    </div>
  </nav>

  <div id="main">
  
    <!-- angular templating -->
		<!-- this is where content will be injected -->
    <div ng-view></div>
    
  </div>
  
  <footer class="text-center">
    <p>官方文档 <a href="http://cwind001.github.io/">Family Billing</a></p>
  
    <p>Copyright © <a href="https://github.com/cwind001">cwind001</a> 2014-2015</p>
  </footer>
  
</body>

</html>