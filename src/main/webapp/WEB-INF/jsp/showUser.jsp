<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<center>显示页面</center>
	<table width="100%" border=1>
<tr>
	<td>商品id</td>
	<td><input type="text" name="name" value="${items.id }"/></td>
</tr>
<tr>
	<td>商品名称</td>
	<td><input type="text" name="name" value="${items.name }"/></td>
</tr>
<tr>
	<td>商品价格</td>
	<td><input type="text" name="price" value="${items.price }"/></td>
</tr>
<tr>
	<td>商品描述</td>
	<td><input type="text" name="detail"  value="${items.detail}"/></td>
</tr>
<tr>
	<td>商品生产日期</td>
	<td><input type="text" name="createtime" value="<fmt:formatDate value="${items.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
</tr>
</body>
</html>