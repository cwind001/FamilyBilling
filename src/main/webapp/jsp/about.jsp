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
				<th>用户姓名</th>
				<th>创建日期</th>
				<th>用户操作</th>
			</tr>
			<tr ng-repeat="user in mydata" ng-class-even="'even'"
				ng-class-odd="'odd'">
				<td>{{user.id}}</td>
				<td>{{user.username}}</td>
				<td>{{user.email}}</td>
				<td>{{user.created}}</td>
				<td></td>
			</tr>
		</table>
	</div>
</div>