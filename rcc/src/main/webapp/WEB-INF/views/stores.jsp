<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>RCC</title>
</head>
<body>
	<h1>Store List</h1>

	<table class="table">
		<thead></thead>
		<tbody>
			<c:forEach items="${storesList}" var="store">
				<tr>
					<td><c:out value="${store.id}" /></td>
					<td><c:out value="${store.storeNumber}" /></td>
					<td><c:out value="${store.ipAddress}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>