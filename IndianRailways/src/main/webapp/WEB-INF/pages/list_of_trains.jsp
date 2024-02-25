<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css" type="text/css">

 <style><%@include file="/WEB-INF/htmlfiles/style.css"%>
</style>

<script type="text/javascript">
	
<%@include file="/WEB-INF/htmlfiles/listoftrainsJS.js" %>

	
</script>
</head>
<body>
	<c:choose>
		<c:when test="${!empty train_details }">

			<c:forEach var="train" items="${train_details }">

				<div class="card_trains">
					<div class="container_trains">
						<h4>
							<b>Train Information</b>
						</h4>
						<table>
							<tr>
								<th>Train ID</th>
								<th>Train Name</th>
								<th>Train Number</th>
							</tr>
							<tr>
								<td>${train.trainId }</td>
								<td>${train.trainname}</td>
								<td>${train.trainnumber }</td>
							</tr>
							<tr>
								<td>
								<a href="booktickets" style="text-decoration: none" color="white"><button class="btn btn-danger" align="right"
										onclick="bookticket()" type="submit">Book Ticket</button></a>
										</td>

							</tr>
						</table>

					</div>

				</div>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<h2>${search_train_msg}</h2>
			<h1>No Record found.....</h1>
		</c:otherwise>
	</c:choose>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>