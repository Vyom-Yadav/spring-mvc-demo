<%--
  Created by IntelliJ IDEA.
  User: vyom
  Date: 09/06/21
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>
    <!-- path="firstName" will call getFirstName, it will
    result null if we dont have anything -->
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country: <form:select path="country">
    <form:options items="${student.countryOptions}"/>
    <%--  <form:option value="India" label="INR"/>
      <form:option value="America" label="USA"/>
      <form:option value="Portugal" label="POR"/>--%>
</form:select>
    <br><br>
    Favourite Language:
    <br><br>

    Java <form:radiobutton path="favouriteLanguage" value="Java"/>
    PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
    C# <form:radiobutton path="favouriteLanguage" value="C#"/>
    Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
    <br><br>

    <input type="submit" value="Submit"/>
    <!-- Submit will call the respective setter methods and set the fields -->
</form:form>

</body>
</html>
