<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>insert title here
</title>
</head>
<body style="background-color:#DEB887">
<%@include file="shared/header.jsp" %>

 
<div class="container">   
 <h1 style="text-align: center;">Registration</h1>                                            
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <div class="form-group"><br>
      <label for="phn no">phn no:</label></br>
      <input type="phn no" class="form-control" id="phn no" placeholder="Enter phn no">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>


</body>
</html>