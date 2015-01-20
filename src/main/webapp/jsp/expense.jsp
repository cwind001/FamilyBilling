<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<div class="jumbotron text-left">
	<h2>费用管理</h2>
	<select ng-model="expenseType" ng-options="expenseType.displayname for expenseType in expenseTypes track by expenseType.id" class="form-control">
		<option value="">--请选择--</option>
	</select>
	<div>
		<table class="table table-striped">
			<tr>
				<th>名称</th>
				<th>数额</th>
				<th>提供商</th>
				<th>备注</th>
				<th>时间</th>
				<th>操作</th>
			</tr>
			<tr ng-repeat="expense in filtered = (expenses | filter:{'expenseType_id':expenseType.id}:true)" ng-class-even="'even'"
				ng-class-odd="'odd'">
				<td>{{expense.id}} - {{expense.title}} </td>
				<td>{{expense.price}} </td>
				<td>{{expense.vender}} </td>
				<td>{{expense.memo}} </td>
				<td>{{expense.created | date:'yyyy-MM-dd'}} </td>
				<td><a class="btn btn-danger" ng-click="deleteExpense(expense, $index)">删除</a></td>
			</tr>
		</table>
		</br>
		<table class="table table-striped">
			<tr>
				<td>记录数: {{ filtered.length }} </td>
				<td>总金额：{{ getTotalPrice() }}</td>
			</tr>
			<tr>
				<td>名称：<input type="text"	ng-model="newExpense.title" /> 
				</td>
			</tr>
			<tr>
				<td>数额：<input type="text"	ng-model="newExpense.price" /> 
				</td>
			</tr>
			<tr>
				<td>商家：<input type="text"	ng-model="newExpense.vender" /> 
				</td>
			</tr>
			<tr>
				<td>备注：<input type="text"	ng-model="newExpense.memo" /> 
				</td>
			</tr>
			<tr>
				<td>时间：<input type="date" ng-model="newExpense.created" />
				</td>
			</tr>
			<tr>
				<td><a class="btn btn-primary" ng-click="addExpense()">添加</a> 
				</td>
			</tr>
		</table>
	</div>
</div>