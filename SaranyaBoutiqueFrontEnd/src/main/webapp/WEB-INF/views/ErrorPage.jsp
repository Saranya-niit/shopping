<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
     pageEncoding="ISO-8859-1"%> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
 <html> 
 <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
 <title>Error</title> 
 <!-- jQuery library --> 
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script> 
 
 
 <!-- Latest compiled JavaScript --> 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
 
 
</head> 

 
 <body style="background-color: #ffdd99;"> 
 <div ng-app="myapp" class="container">  
 <%@include file="/WEB-INF/views/shared/header.jsp" %> 
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> 
 	<script src="<c:url value='/resources/js/AngularProductController.js' />"></script> 
 	 
 	<table> 
 	<tr> 
	<td> 
 		<h3 style="font-family:cursive;color:red;">Product is Out of stock.</h3> 
 		<h3 style="font-family:cursive;color:red;">if u want this Dress for your event then kindly call on this number-022 2235462</h3> 
 		<h3 style="font-family:cursive;color:red;">Thank You!!!!!!</h3> 
		</td> 
	<td> 
		<img style="height:70%;width: 70%;" alt="outofstock"  src="<c:url value='/resources/image/im17.jpg'/>" "> 
		</td> 
  </tr> 
</table> 
	<a href="<c:url value='/'/>" class="btn btn-primary center">Continue Shopping</a> 
	<%@include file="/WEB-INF/views/shared/Footer.jsp" %> 
	</div> 
	 
</body> 
</html> 
