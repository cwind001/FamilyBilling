<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/FamilyBilling/css/main.css" type="text/css" />
<title>新用户注册</title>
</head>
<body>
    <div>
        <form action="/FamilyBilling/user?command=newUser" method="POST">
        	<table width="800" border="0" align="center" cellspacing="0" class="rg_mtbl">
                <tr> 
                  <th width="18%"> 用 户 名：</th>
                  <td><input type="text" name="userName" id="userName" value="" style="width: 125px;" />
                  <span id="userName_tg" class="txt12">可以由英文字母、数字、圆点(.)或下划线(_)组成，4至20个字符</span></td>
                </tr>
                <tr> 
                  <th>密　　码：</th>
                  <td> <input type="password" name="pass1" id="pass1" style="width: 125px;"/> 
                  <span id="pass1_tg" class="txt12">不少于6个字符，区分大小写</span></td>
                </tr>
                <tr> 
                  <th> 确认密码：</th>
                  <td> <input type="password" name="pass2" id="pass2" style="width: 125px;" />
                  <span id="pass2_tg" class="txt12">再输入一遍密码，以确认正确</span></td>
                </tr>
                <tr> 
                  <th> 电子邮件：</th>
                  <td> <input type="email" name="email" id="email" style="width: 125px;" />
                  <span id="email_tg" class="txt12">再输入一遍密码，以确认正确</span></td>
                </tr>
                <tr>
                	<th/>
                	<td><input type="submit" value="提交"></td>
                </tr>
        	</table>
        </form>
    </div>
</body>