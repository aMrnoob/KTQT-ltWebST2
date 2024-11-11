<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ (admin)</title>
</head>
<body>
	<%@ include file = "/common/admin/header.jsp" %>
	<sitemesh:write property="body"/>
	<%@ include file = "/common/admin/footer.jsp" %>
</body>
</html>