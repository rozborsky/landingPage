<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>SQLCmd</title>
        <style>
           <%@include file='style.css' %>
        </style>
	</head>

	<body>
        <h1 class="startH1">you send data</h1>
        <p>${user.getName()}</p>
        <p>${user.getSurname()}</p>
        <p>${user.geteMail()}</p>
        <p>${user.getFieldOne()}</p>
        <p>${user.getFieldTwo()}</p>
	</body>
</html>