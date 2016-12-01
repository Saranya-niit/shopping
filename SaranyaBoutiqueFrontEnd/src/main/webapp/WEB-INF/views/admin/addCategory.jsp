<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<div>
<span style="color: green; font-size: 24px; "> ${successMsg} </span>
<spring:form class="form" action="/admin/addCategory" modelAttribute="category" >
	Enter Cid
	<spring:input id="cid" path="cid" class="form-control" />
	Enter CName:
	<spring:input id="cname" path="cname" class="form-control" />
	Enter Cdesc:
	<spring:input id="cdesc" path="cdesc" class="form-control" />
	<spring:button type="submit"> Add Category</spring:button>
</spring:form>



</div>

</body>
</html>