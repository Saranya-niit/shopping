<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page  isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- -jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#ffdd99">
<div class="container">
<%@include file="shared/header.jsp" %>
<div>
<table style="text-align:center;width: 50%"  class="table">
<tr>
   	<td> 
	<img src="<c:url value='/resources/image/${product.iname}' />"alt ="no images" width="300" height="300" />
	</td>
 </tr>
 <tr>
    <th>Product ID:</th>
 	<td >${product.pid}</td>
 </tr>
 <tr>
  <th>Product Name:</th>
 	<td>${product.pname} </td>
 </tr>
 <tr>
  <th>Product Description:</th>
 	<td> ${product.desc}</td>
 </tr>
 <tr>
  <th>Product Quantity:</th>
 		<td> ${product.quantity}</td>
 </tr>
 <tr>
   <th>Product Price:</th>
       <td> ${product.price}</td>
    </tr>
 </table>
 </div>
 </div>
</body>
</html>