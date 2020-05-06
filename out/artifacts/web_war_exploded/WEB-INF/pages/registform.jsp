<%--
  Created by IntelliJ IDEA.
  myComponent.User: El-Wattaneya
  Date: 4/29/2020
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>--%>
<form:form method="post" action="register.htm" modelAttribute="user" >
    <b> <spring:message code="field.username"></spring:message></b>

    <form:input path="name"/>
    <form:errors path="name" />

    <br>
    <b><spring:message code="field.salary"></spring:message></b>
    <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <input type="submit">

</form:form>


</body>
</html>