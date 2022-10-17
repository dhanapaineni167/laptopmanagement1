<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 body{
     
     background: url(image/delete.jpg);
     background-size: cover;
     background-position: center;
     width: 200px;
     height: 20px;
     top: 40%;
     left: 45%;
     position: absolute;
     font-size: 20px; 
     font-weight: bold;
 }
 
</style>
</head>
<body>
<form action ="deletelaptop" method ="get">
Enter LaptopId:<input type = "text" name ="lid"><br>
<input type ="submit" value ="DELETELAPTOP">
</form>

</body>
</html>