<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<div>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">saranya Boutique website</a>
    </div>
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="/SaranyaBoutiqueFrontEnd">Home</a></li>
      <li><a href="aboutus">About us </a></li>
      <li><a href="contactus">Contact us</a></li>
      <li><a href="/SaranyaBoutiqueFrontEnd/viewall">View all</a></li>
     <li class="dropdown">
    <ul class="dropdown-menu">
      <li><a href="viewall">party wear</a></li>
      <li><a href="viewall">Casual dress</a></li>
      <li><a href="viewall">weadding dress</a></li>
    </ul>
    </li>
    <security:authorize access="hasRole('ROLE_ADMIN')">
    <li> <a href="admin/add">Add Product</a>  </li>
    </security:authorize>
     </ul> 
     <ul class="nav navbar-nav navbar-right"> 
         
 			<security:authorize access="isAnonymous()"> 
 			  <li>
 				  <a style="color:white; font-family: serif; font-size: large; "  href="/SaranyaBoutiqueFrontEnd/Register"> 
 			 		 <span class="glyphicon glyphicon-user"></span> Register
 			 	 </a>
 			  </li> 
 			  <li>
 			  			<a style="color:white; font-family: serif; font-size: large; "  href="login">
 			  					<span class="glyphicon glyphicon-hand-right"></span>View Cart
 			  			</a>
 			  </li> 
 				<li>
 						<a style="color:white; font-family: serif; font-size: large; "  href="login">
 							 <span class="glyphicon glyphicon-log-in"></span> Login</a>
 				</li> 
 			</security:authorize>
 			<security:authorize access="isAuthenticated()"> 
 				<li>
 					<span class="glyphicon"></span>
 					<h5 style="color:blue;">Welcome <%= request.getUserPrincipal().getName() %></h5>  
 				</li> 
 				
 				<security:authorize access="hasRole('ROLE_USER')"> 
 						<li>
 								<a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/memberShip'/>">
 								<span class="glyphicon glyphicon-hand-right"></span>View Cart</a>
 						</li> 
 					
 				</security:authorize> 
 						<li>
 								<a style="color: white; font-family: serif; font-size: large; "  href="<c:url  value='/logout' />" class="btn btn_primary"> 
 						<span class="glyphicon glyphicon-log-out"></span> Logout 
 				</a></li> 
 				</security:authorize> 
 		</ul> 
 		</div> 
 </nav> </div>