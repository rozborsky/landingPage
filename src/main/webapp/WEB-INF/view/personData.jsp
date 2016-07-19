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
        <h1 class="startH1">second</h1>
        <div class="logForm">
            <form action="confirmation" method="post">
                <table>
                    <tr>
                        <td>first field</td>
                        <td><input type="text" name="firstField"/></td>
                    </tr>
                    <tr>
                        <td>second field</td>
                        <td><input type="text" name="secondField"/></td>
                    </tr>
                    <tr>
                        <td>third field</td>
                        <td><input type="text" name="thirdField"/></td>
                    </tr>
                    <tr>
                        <td>name</td>
                        <td><input type="text" name="name"/></td>
                    </tr>
                    <tr>
                        <td>surname</td>
                        <td><input type="text" name="surname"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="send"/></td>
                    </tr>
                </table>
            </form>
        </div>
	</body>
</html>