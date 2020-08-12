<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="transfer" method="post">
	转账账户：<input type="text" name="accNoOut"/><br/>
	密码：<input type="password" name="passwordOut"/><br/>
	金额：<input type="text" name="balance"/><br/>
	收款账户：<input type="text" name="accNoIn"/><br/>
	收款人姓名：<input type="text" name="nameIn"/><br/>
	<input type="submit" value="转账"/>
</form>

</body>
</html>