<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 body{
     
     background: url(image/add.jpg);
     background-size: cover;
     background-position: center;
     width: 200px;
     height: 20px;
     top: 20%;
     left: 47%;
     position: absolute;
     font-size: 20px; 
     font-weight: bold;
 }
 
</style>
</head>
<body>
<form action ="addlaptop" method ="get">
Enter LaptopId:<input type = "text" name ="lid"><br>
Enter LaptopName:<input type = "text" name ="lname"><br>
Enter LaptopColor:<input type = "text" name ="lcolor"><br>
Enter LaptopCost:<input type = "text" name ="lcost"><br>
<input type ="submit" value ="ADDLAPTOP">
</form>


</body>
</html>