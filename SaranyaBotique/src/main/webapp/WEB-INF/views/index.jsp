 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<title>
Bootstrap Case</title><meta charset="utf-8">
  
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>

<body>
<div class="container">
<%@include file="/WEB-INF/views/shared/header.jsp" %>

  
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img style="height:300px;"src="<c:url value='/resources/image/im17.jpg'/>" alt="Flower">
    </div>

    <div class="item">
          <img style="height:300px;"src="<c:url value='/resources/image/im20.jpg'/>" alt="Flower">
    
   
    </div>

    <div class="item">
    <img style="height:300px;"src="<c:url value='/resources/image/im21.jpg'/>" alt="Flower">
    
      
    </div>

    <div class="item">
     <img style="height:300px;"src="<c:url value='/resources/image/im11.jpg'/>" alt="Flower">
    
         </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

 

<div >
  <h1>Dreams Botique</h1>
  <p>A collection of desined dresses.sarees,salvars, shirts ,kid wear.</p>
</div>
</div>
 
</body>
</html>

