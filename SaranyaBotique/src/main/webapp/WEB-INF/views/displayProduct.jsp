
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
<body style="bac kground-color:#ffdd99">
<div class="container"></div>
<%@include file="shared/header.jsp" %>
<table class="table">
<tr>
   <td> <img src="<c:url value='/resources/image/${product.iname}' />"alt ="no images" width="300" height="300" /></td>
 </tr>
 ${product.pid}</td>
 </tr>
 <tr><td>
 ${product.pname} </td></tr>
 <tr><td> ${product.desc}</td></tr>
 <tr><td> ${product.quantity}</td></tr>
 </table>
 </div>
</body>
</html>