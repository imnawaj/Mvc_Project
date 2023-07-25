<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>

<table class="table">
<tr>

<th class="table-dark">id</th>
<th class="table-dark">First Name</th>
<th class="table-dark">Last Name</th>
<th class="table-dark">Birth of Date</th>
<th class="table-dark">Gender</th>
<th class="table-dark">Email</th>  
<th class="table-dark">Mobile Number</th>
<th class="table-dark">Country</th>
<th class="table-dark">Edit</th>
<th class="table-dark">Delete</th>

</tr>

<c:forEach var="empData" items="${empList }">

<tr>
<td>${empData.id }</td>
<td>${empData.fname }</td>
<td>${empData.lname }</td>
<td>${empData.birthdate }</td>
<td>${empData.gender }</td>
<td>${empData.email }</td>
<td>${empData.number }</td>
<td>${empData.country }</td>
<td><a href="#">Edit</a></td>
<td><a href="#">Delete</a></td>

</tr>
</c:forEach>

</table>

</body>
</html>