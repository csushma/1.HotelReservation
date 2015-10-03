<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<title>Dallas - Victory Hotel</title>
<link rel="stylesheet" type="text/css" href="./CSS/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="./CSS/carousel.css" />
<link rel="stylesheet" type="text/css" href="./CSS/bootstrap.css" />
<link rel="icon" type="image/ico" href="./Images/favicon.jpg" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script> 
$(function(){
  $("#header").load("header.html"); 
  $("#footer").load("footer.html"); 
});
</script>
<style>
h1,h2{
	text-align: center;
	color: white;
}
div{
	text-align: center;
}
</style>
</head>
<body>
<div id="header"></div>
<h1>Customer Information</h1>
        <form action="basic.jsp" method="post">
        <h2>   Please click here to know customer information: </h2>
            <br />
            <div id = "ctr">
            	<input type="submit" value="Submit"/>
            </div>
        </form>
   <br />
  <div id="footer"></div>
</body>
</html>