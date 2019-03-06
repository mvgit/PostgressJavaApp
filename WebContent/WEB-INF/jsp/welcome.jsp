<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>
<title>Spring MVC Tutorial by Adiva - Hello World Spring MVC
	Example</title>
<style type="text/css">

</style>
</head>
<body>
 
	<br>
	<br>
	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
 
		Spring MCV Tutorial by <a href="https://adiva.com">Adiva</a>.
		Click <a href="https://adiva.com/category/java-tutorials/"
			target="_blank">here</a> for all Java and <a
			href='https://adiva.com/category/spring-mvc/' target='_blank'>here</a>
			<c:forEach var="counter" begin="1" end="10">
				<c:out value="${counter}" />
			</c:forEach>
			Students Details
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td align="center">${student.age}</td>
				</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>