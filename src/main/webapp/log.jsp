<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border='1'>
		<tr>
			<th>转账账号</th>
			<th>收款账号</th>
			<th>转账金额</th>
		</tr>
		<c:forEach items="${pageInfo.list }" var="pl">
			<tr>
				<td>${pl.accOut}</td>
				<td>${pl.accIn}</td>
				<td>${pl.money}</td>
			</tr>
		</c:forEach>
	</table>
	<a
		href="log?pageSize=${pageInfo.pageSize}&pageNum=${pageInfo.pageNum-1}"
		<c:if test="${pageInfo.pageNum<=1}"> onclick="javascript:return false;"</c:if>>上一页</a>
	<a
		href="log?pageSize=${pageInfo.pageSize}&pageNum=${pageInfo.pageNum+1}"
		<c:if test="${pageInfo.pageNum>=pageInfo.total }"> onclick="javascript: return false;"</c:if>>下一页</a>
</body>
</html>