<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
/* General styles */
body {
    font-family: Arial, sans-serif;
    background-color: black;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-image: url('https://as1.ftcdn.net/v2/jpg/02/11/07/58/1000_F_211075851_gSKybVNvDWgZnrIaleNsQfIz2mqPKaor.jpg');
}

form {
    background-color: transparent;
    padding: 20px;
    border-radius: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    width: 300px;
}

input.form-control {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 14px;
}

input.form-control:focus {
    border-color: #007bff;
    box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
    outline: none;
}

button.btn-primary {
    width: 100%;
    padding: 10px;
    border: none;
    border-radius: 4px;
    background-color: #007bff;
    color: white;
    font-size: 16px;
    cursor: pointer;
}

button.btn-primary:hover {
    background-color: #0056b3;
}

</style>
<%@include file="bootstrap.jsp"%>
</head>
<body>
<form action="register" method="post">
 <input type="text" placeholder="rollnumber" class="form-control" name="rollnumber">
  <input type="text" placeholder="Full name" class="form-control" name="name">
   
    <input type="email" placeholder="Email" class="form-control" name="email">
    <input type="text" placeholder="branch" class="form-control" name="branch">
     <input type="text" placeholder="Section" class="form-control" name="section">
     <button class="btn btn-primary">Register</button>
</form>
</body>
</html>