<%--
  Created by IntelliJ IDEA.
  User: vyom
  Date: 16/06/21
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>

Customer is confirmed: ${customer.firstName} ${customer.lastName} with ${customer.freePasses} free passes.
<br><br>
Postal Code: ${customer.postalCode}
<br><br>
Course Code: ${customer.courseCode}

</body>
</html>
