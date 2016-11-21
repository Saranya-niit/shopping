<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Botique</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value='/resources/js/AngularProductController.js'  />" ></script>
</head>
<body ng-app="myApp">

<Div class="container"   >
<%@include file="/WEB-INF/views/shared/header.jsp" %>
<input type="text" /><button class="default"><span class="glyphicon glyphicon-search"></span></button>


<div ng-controller="myCtrl">


<table >
<tr ng-repeat="product in data">
	<td><img src="<c:url value='/resources/image/{{product.name}}' />" alt="no image" width="100" height="100"/></td>
	<td>{{product.pid}}</td>
	<td>{{product.pname}}</td>
	<td>{{Product.price}}</td>
	
	
</tr>
</table>

</div>
</div>
</body>
</html>