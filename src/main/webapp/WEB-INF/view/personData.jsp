<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>SQLCmd</title>
        <style>
           <%@include file='style.css' %>
        </style>
	</head>

	<body>
        <h1 class="startH1">${usere.geteMail()}</h1>
        <div class="logForm">
            <form:form action="confirmation" commandName="user" method="post">
                <table>
                    <form:input type="hidden" path="name" value="${user.getName()}"/>
                    <form:input type="hidden" path="surname" value="${user.getSurname()}"/>
                    <form:input type="hidden" path="eMail" value="${user.geteMail()}"/>
                    <tr>
                        <td>first field</td>
                        <td><form:input type="text" path="fieldOne"/></td>
                    </tr>
                    <tr>
                        <td>second field</td>
                        <td><form:input type="text" path="fieldTwo"/></td>
                    </tr>
                    <tr>
                        <td>third field</td>
                        <td><form:input type="text" path="fieldThree"/></td>
                    </tr>
                    <tr>
                        <td>upload .doc, .pdf, .txt</td>
                        <td><form:input type="file" path="cv" accept=".doc, .txt, .pdf"/></td>
                    </tr>
                    <tr>
                        <td>upload image</td>
                        <td><form:input type="file" path="photo" accept=".jpg, .jpeg, .gif"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="send"/></td>
                    </tr>
                </table>
            </form:form>
        </div>
	</body>
</html>