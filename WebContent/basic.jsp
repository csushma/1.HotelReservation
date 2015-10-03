<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
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
table{
	align: center;
	color: white;
	 margin: 0 auto;
	 border: 2px solid white;
	font-size: medium;
}
h1{
	text-align: center;
}
</style>
</head>
<body>
<div id="header"></div>
<h1> Below are customers currently residing in our hotel</h1>
 <% 
            Connection connection = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/hibernatedb", "root", "");

            Statement statement = connection.createStatement();

            ResultSet resultset = 
                statement.executeQuery("select customer_name from customer") ; 

            if(!resultset.next()) {
                out.println("Sorry, could not find that publisher. ");
            } else {
        %>

        <table border="1">
            <tr>
               <th>Customer name</th>
           </tr>
           <tr>
				<td> <%= resultset.getString(1) %> </td>
			</tr>
			   <% while(resultset.next()){ %>
			<tr>
              <td>
            	   <%= resultset.getString(1) %>   
             </td>
           </tr>
            <% } %> 
       </table>
       <br />
       <% 
           } 
       %>
       
         <div id="footer"></div>
</body>
</html>