<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>SQLCmd</title>
        <style>
           <%@include file='style.css'%>
        </style>
	</head>

	<body>
        <div class="logForm">
            <form:form action="confirmation" modelAttribute="employee" method="post">
                <table>
                    <form:input type="hidden" path="name" value="${employee.getName()}"/>
                    <form:input type="hidden" path="surname" value="${employee.getSurname()}"/>
                    <form:input type="hidden" path="eMail" value="${employee.geteMail()}"/>
                    <tr>
                        <td>programming language</td>
                        <td><form:input type="text" path="programmingLanguage"/></td>
                    </tr>
                    <tr>
                        <td>experience</td>
                        <td><form:input type="text" path="experience"/></td>
                    </tr>
                    <tr>
                        <td>city</td>
                        <td><form:input type="text" path="city"/></td>
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