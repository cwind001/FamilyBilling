<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<div class="jumbotron text-center">
	<h1>About</h1>
		<div>
		<table class="table table-striped">
			<tr>
				<th>用户id</th>
				<th>用户名称</th>
				<th>用户邮箱</th>
				<th>创建日期</th>
				<th>用户操作</th>
			</tr>
			<tr ng-repeat="user in mydata" ng-class-even="'even'"
				ng-class-odd="'odd'">
				<td>{{user.id}}</td>
				<td>{{user.username}}</td>
				<td>{{user.email}}</td>
				<td>{{user.created}}</td>
				<td><a class="btn btn-danger" ng-click="deleteUser(user, $index)">删除</a></td>
			</tr>
		</table>
	</div>
</div>
<div>
	<a class="btn btn-primary" ng-click="showInputField()">添加</a>
	<div ng-show="showInputField==1">
		用户名:<input type="text" ng-model="newUser.username" /><br/>
   		Email:<input type="text" ng-model="newUser.email" /><br/>
   		<a class="btn btn-primary" ng-click="addUser()">保存</a>
	</div>
</div>