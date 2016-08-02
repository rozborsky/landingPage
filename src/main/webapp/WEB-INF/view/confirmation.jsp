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
        <h1 class="startH1">you send data successfully</h1>

        <h1>cv - ${employee.getCv()}</h1>
        <h1>img - ${employee.getPhoto()}</h1>
	</body>
</html>

