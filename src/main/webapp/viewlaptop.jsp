	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Laptop</title>
</head>
<style>
 body{
     
     background: url(image/view.jpg);
     background-size: cover;
     background-position: center;
     width: 200px;
     height: 20px;
     top: 20%;
     left: 55%;
     position: absolute;
     font-size: 20px; 
     font-weight: bold;
     font-color: white;
 }
 
</style>
<body>
<form action ="viewlaptop" method ="get">
Enter LaptopId:<input type = "text" name ="lid"><br>
<input type ="submit" value ="VIEWLAPTOP">
</form><br>
<form action ="viewalllaptop" method ="get">
<input type ="submit" value ="VIEWALLLAPTOP">
</form>

</body>
</htm>