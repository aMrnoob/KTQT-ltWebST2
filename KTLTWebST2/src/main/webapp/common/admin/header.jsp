<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
    }

    .header {
        background-color: #333;
        padding: 10px 0;
    }

    .header .logo {
        color: white;
        font-size: 24px;
        font-weight: bold;
        margin-left: 20px;
        display: inline-block;
    }

    .nav {
        list-style-type: none;
        margin: 0;
        padding: 0;
        display: inline-block;
        float: right;
        margin-right: 20px;
    }

    .nav li {
        display: inline;
        margin-right: 20px;
    }

    .nav li a {
        color: white;
        text-decoration: none;
        font-size: 18px;
    }

    .nav li a:hover {
        color: #ddd;
    }
</style>
</head>
<body>
	<header class="header">
        <ul class="nav">
            <li><a href="#home">Trang Chủ</a></li>
            <li><a href="#products">Sản phẩm</a></li>
            <li><a href="#login">Đăng nhập</a></li>
        </ul>
    </header>
</body>
</html>