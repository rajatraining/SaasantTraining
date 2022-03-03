<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

${insertStatus }

<table>
<h1>Student Information</h1>
<tr>
<th>  ID </th>
<th>  Name </th>
<th>  Mark 1 </th>
<th>  Mark 2 </th>
<th>  Mark 3 </th>
<th>  Total </th>
<th>  Average </th>
</tr>

<c:forEach var="s" items="${stuList }">
<tr>
<td> ${s.stuId }</td>
<td> ${s.stuName }</td>
<td> ${s.mark1 }</td>
<td> ${s.mark2 }</td>
<td> ${s.mark3 }</td>
<td> ${s.total }</td>
<td> ${s.average }</td>
</tr>
</c:forEach>

</table>

<div>

 <a href="/StudentMvcApplication"> <button>Add New Student</button> </a> 

</div>




<%-- 
<c:forEach var="s" items="${stuList }">
<div>
  ${s.stuId }
</div>


</c:forEach>
 --%>
 




</body>
</html>