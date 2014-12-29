<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<div class="jumbotron text-left">
	<h2>资金账户</h2>
	<select ng-model="accountType" ng-options="accountType.displayname for accountType in accountTypes track by accountType.id" class="form-control">
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
			<tr ng-repeat="account in filtered = (accounts | filter:{'expenseType_id':accountType.id})" ng-class-even="'even'"
				ng-class-odd="'odd'">
				<td>{{account.id}} - {{account.title}} </td>
				<td>{{account.price}} </td>
				<td>{{account.vender}} </td>
				<td>{{account.memo}} </td>
				<td>{{account.created}} </td>
				<td><a class="btn btn-danger" ng-click="deleteAccount(account, $index)">删除</a></td>
			</tr>
		</table>
		</br>
		<table class="table table-striped">
			<tr>
				<td>记录数: {{ filtered.length }} </td>
				<td>总金额：{{ getTotalFund() }}</td>
			</tr>
			<tr>
				<td>名称：<input type="text"	ng-model="newAccount.title" /> 
				</td>
			</tr>
			<tr>
				<td>数额：<input type="text"	ng-model="newAccount.price" /> 
				</td>
			</tr>
			<tr>
				<td>商家：<input type="text"	ng-model="newAccount.vender" /> 
				</td>
			</tr>
			<tr>
				<td>备注：<input type="text"	ng-model="newAccount.memo" /> 
				</td>
			</tr>
			<tr>
				<td><a class="btn btn-primary" ng-click="addAccount()">添加</a> 
				</td>
			</tr>
		</table>
	</div>
</div>