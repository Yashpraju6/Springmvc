<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car registration</title>
<style >
 label {
            color: #2c3e50;
        }
</style>
</head>
<body>
<div class="container">
<h3>Car Registration</h3>
<form:form action="savecar" method="post" modelAttribute="car">
   <label for="id">id:</label>
   <form:input path="id" id="id"/><br>
    <label for="carname">Name:</label>
   <form:input path="carname" id="carname"/><br>
    <label for="price">price</label>
   <form:input path="price" id="price"/><br>
    <label for="usermailid">usermailid</label>
   <form:input path="usermailid" id="usermailid"/><br>
    <label for="phno">Name:</label>
   <form:input path="phno" id="phno"/><br>
   <input type="submit" value="register">



</form:form>
</div>

</body>
</html>