 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">saranya website</a>
    </div>
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="/SaranyaBotique">Home</a></li>
      <li><a href="aboutus">aboutus </a></li>
      <li><a href="contactus">contactus</a></li>
      <li><a href="viewall">view all</a></li>
      <li><a href="<c:url value='admin/addCategory' />">Add Category...</a>
      <li class="nav-item dropdown">
      
      <a class="nav-link dropdown-toggle" href="http://example.com" id="supportedContentDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Registration</a>
     
      <div class="dropdown-menu" aria-labelledby="supportedContentDropdown">
       
        <a class="dropdown-item" href="registration"> register now</a>
        
      </div>
    </li>
    </ul>
  </div>
</nav>
  </div>