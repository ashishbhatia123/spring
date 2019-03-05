<%@page import="javax.servlet.jsp.tagext.TagLibraryValidator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sf:form action="registerUserAction.obj" method="post" modelAttribute="customer">
<h2>customer registration form</h2>
<table>
<tr><td>Enter First name:<sf:input type ="text" path= "firstName"></sf:input> </td>
<tr><td>Enter last name:<sf:input type ="text" path= "lastName"></sf:input> </td>
<tr><td>Enter age:<sf:input type ="text" path= "age"></sf:input> </td> 
<tr><td>Enter mobile number:<sf:input type ="text" path= "mobileNo"></sf:input> </td> 
<tr><td>Enter Email ID:<sf:input type ="email" path="email"></sf:input></td> </tr> 
<tr><td>Select city:<sf:select path="city">
<sf:option value="Pune">PUNE</sf:option>
<sf:option value="MUMBAI">MUMBAI</sf:option>
<sf:option value="AGRA">AGRA</sf:option>
<sf:option value="DELHI">DELHI</sf:option>
<sf:option value="GOA">GOA</sf:option>
<sf:option value="TAMIL">TAMIL</sf:option>
<sf:option value="ALLAHABAD">ALLAHABAD</sf:option>
</sf:select>
<tr><td><input type="submit" name= "submit" value="register mee !!">
</td></tr>

</table>
</sf:form>
</body>
</html>