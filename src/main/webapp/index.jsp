<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/FamilyBilling/css/main.css" type="text/css" />
</head>
<body>
<body style="background-color:#0E100F;">
<div style="width:1260px;margin:0 auto;">
<div id="title">
</div>
        <div id="container">
        <div id="menu">
        <br/>
        <form action="/gameforum/bbs/login" method="POST">
         <table align="center">
         <tr><td>帐号</td><td><input type="text" name="username"  value=""/></td></tr>
          <tr><td>密码</td><td><input type="password" name="password"  value=""/></td></tr>
          <tr><td>&nbsp;</td><td><input type="submit" name="Login" value="登录"/></td></tr>
          <tr><td><a href="/FamilyBilling/jsp/user/newUser.jsp">新用户注册</a></td></tr>
        </table> 
       	</form>
        </div>
        <div id="content">
        	欢迎使用家用记账系统
        	<br/>
        	<table width="400" height="30" cellpadding="0" cellspacing="0">
        	<tr><td>开支</td><td>收入</td><td>贷款</td><td>理财</td></tr>
        	</table>
        </div>
        <div id="footer">
        	家用记账系统
        </div>
        </div>
        </div>
</body>
</html>
