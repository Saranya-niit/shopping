<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <style type="text/css">
.errStyle {
	color:red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body style="background-color:white;">
<%@ include file="/WEB-INF/views/Template/Header.jsp" %>
<br><br><br>
<div class="container">

<p>
${success}
</p>
<div class="container">
<div class="col-sm-6">
<img style="height:auto;width: 50%;" alt="welcome" src="<c:url value='/resources/image/im17.jpg'/>" />
</div>

<div class="col-sm-6">
<form:form role="form" action="Register" modelAttribute="user">

 
  <div class="form-group">
 	<form:label  path="cust.custName">
				<spring:message text="Enter Full Name"/>
	</form:label>
	<form:input  class="form-control" path="cust.custName" />
		<form:errors path="cust.custName" >
			<p class="errStyle">
					* Invalid Customer name
</p>
 </form:errors></div>
  <div class="form-group">
 	<form:label  path="userName">
				<spring:message text="User Name"/>
	</form:label>
	<form:input class="form-control" path="userName" />
		<form:errors path="userName" >
			<p class="errStyle">
					* Invalid Username
</p>
 </form:errors>
 </div>
 <div class="form-group">
 	<form:label  path="password">
				<spring:message text="Password"/>
	</form:label>
	<form:input type="password" class="form-control" path="password" />
		<form:errors path="password" >
			<p class="errStyle">
					* Invalid Password
</p>
 </form:errors>
 
  </div>
  <div class="form-group">
 	<form:label  path="cust.email">
				<spring:message text="Email"/>
	</form:label>
	<form:input class="form-control" path="cust.email" />
		<form:errors path="cust.email" >
			<p class="errStyle">
					* Invalid Email
</p>
 </form:errors>
 </div>
  <div class="form-group">
 	<form:label  path="cust.phone">
				<spring:message text="Phone Number"/>
	</form:label>
	<form:input class="form-control" path="cust.phone" />
		<form:errors path="cust.phone" >
			<p class="errStyle">
					* Invalid Phone no.
</p>
 </form:errors>
 </div>

  <div class="form-group">
 	<form:label  path="cust.address">
				<spring:message text="Address"/>
	</form:label>
	<form:input class="form-control" path="cust.address" />
		<form:errors path="cust.address" >
			<p class="errStyle">
					* Invalid Address
</p>
 </form:errors>
 </div> 
 
  <button style="margin-left: 40%;" type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>
</div>
<%@include file="/WEB-INF/views/Template/Footer.jsp" %>
</div>
</body>
</html>