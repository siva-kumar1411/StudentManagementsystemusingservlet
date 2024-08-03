<%@page import="models.student"%>
<%@page import="java.util.List"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="services.studentservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="bootstrap.jsp" %>
<body>
<h1>welcome</h1>
<table>
<thead>
<tr>
<th>id<th>
<th>roll number<th>
<th>name</th>
<th>email</th>
<th>branch</th>
<th>section</th>

<th>Actions</th>
</tr>
</thead>
<tbody>
<%
studentservice ss = new studentservice(studentdb.getConn());
List<student> ls = ss.getall();
for(student s:ls){
%>
<tr>
   <td><%=s.getId()%></td>
   <td><%=s.getRollnumber()%></td>
   <td><%=s.getName()%></td>
   <td><%=s.getEmail()%></td>
   <td><%=s.getBranch()%></td>
    <td><%=s.getSection()%></td>
    <td>
    <button>update</button>
    <a href="delete?id=<%=s.getId()%>">
    <button>delete</button>
    </a>
    </td>
   <%
}
%> 
</tr>

</tbody>
</table>
</body>
</html>