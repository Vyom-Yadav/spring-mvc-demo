<%--
  Created by IntelliJ IDEA.
  User: vyom
  Date: 16/06/21
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
  <style>
    .error {
      color: red;
    }
  </style>
</head>
<body>
Fill the Form. Astrix (*) fields are mandatory
  <form:form action="processForm" modelAttribute="customer">

First Name: <form:input path="firstName" />
    <br><br>
Last Name (*): <form:input path="lastName" />
  <form:errors path="lastName" cssClass="error" />
    <br><br>
    <input type="submit" value="Submit" />

  </form:form>

</body>
</html>
