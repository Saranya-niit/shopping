<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Boutique</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color: white;">
<%@include file="/WEB-INF/views/Template/Header.jsp" %>

<br><br><br><br>
<div class="Container">
 <center>
  <h1>  <font color="black ">
  About us
  <font/>
  </h1>
  </center>

<p> Dreams botique place to get your dream clothings.It has a lagasy of 10 years<br>
Special sections for womens kids and mens wear.beautiful collection of weading wears
</p>
<br><br>
<marquee>
<table class="table">
<tr>
<td><a href="view_All?id=1"><img src="resources/image/im1.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"></a>  </td>
<td><a href="view_All?id=3"><img src="resources/image/im5.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"></a> </td>
<td> <a href="view_All?id=3"><img src="resources/image/im6.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"></a> </td>
<td> <a href="view_All?id=3"><img src="resources/image/im7.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"></a> </td>
<td> <a href="view_All?id=3"><img src="resources/image/im19.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"></a> </td>
<td> <a href="view_All?id=2"> <img src="resources/image/im16.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236"> </a></td>
</tr>
</table>
</marquee>
</div>
<%@include file="/WEB-INF/views/Template/Footer.jsp" %>
</body>
</html>
