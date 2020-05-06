
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body style="align-content: center;alignment: center;">
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>--%>
<form:form method="post" action="register.htm" modelAttribute="user" cssStyle="padding: 20px;margin: 20px;width: 100px;height: 50px;align-content: center;alignment: center;">
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