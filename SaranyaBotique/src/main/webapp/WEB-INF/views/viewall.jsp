<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body ng-app="myApp">
<div class="container"   >
<%@include file="/WEB-INF/views/shared/header.jsp" %>
<div ng-controller="myCtrl">
{{data}}
<c:forEach items="{{data}}" var="prd">
<table>
<tr>
	<td>${prd.pid}</td>
	
</tr>
</table>

</c:forEach>
</div>
</div>
</body>
</html>