<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Botique</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value='/resources/js/AngularProductController.js'  />" ></script>
</head>
<body ng-app="myApp">
<div class="container">
<%@include file="/WEB-INF/views/shared/header.jsp" %>
<div ng-controller="myCtrl">
	<div class="row">
			<div class="col-sm-6">
				<input class="form-control" type="text" id ="query" ng-model="query"   />
			</div>
			<div class="col-sm-6">
					<button  class ="btn btn-primary">
					<span class="glyphicon glyphicon-search"></span>

					</button>

			</div>
	</div>
	<br/><br/><br/>
	<table class="table">
	<tr>
			<th></th>
			<th ng-click="sort('pname')" >Product Name</th>
			<th>Price</th>
	</tr>
		
	<tr ng-repeat="product in data|filter:query|orderBy:sortKey:reverse">
					<td>
						<img src="<c:url value='/resources/image/{{product.iname}}' />"  height="100" width="100"/>
						
					</td>
					<td>
							{{product.pname}} 
					</td>
					<td>
							Rs. {{product.price}} 
					</td>
					<td>
						<a href ="disp?id={{product.pid}}" class="btn btn-primary">view</a>
					 </td>
				</tr>
 </table>

</div>
</div>



</body>
</html>