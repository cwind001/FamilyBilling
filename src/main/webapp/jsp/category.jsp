<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<div class="jumbotron text-left">
	<h2>分类管理</h2>
	<select ng-model="category" ng-options="item for item in categories">
		<option value="">--请选择--</option>
	</select>
	<p>{{ category }}</p>

</div>