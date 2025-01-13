<!-- Main page body template -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="/css/style.css" />
    	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body class="w-50 mx-auto my-5">
		<h2>Slavone Countries</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>Language</th>
					<th>Percentage</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="country" items="${sloveneCountries}">
					<tr>
						<td><c:out value="${country[0]}"></c:out></td>
						<td><c:out value="${country[1]}"></c:out></td>
						<td>
							<c:out value="${country[2] }"></c:out>
						</td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>City Count By Country</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>Number of Cities</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="country" items="${cityCountCountries}">
					<tr>
						<td><c:out value="${country[0]}"></c:out></td>
						<td><c:out value="${country[1]}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Mexico Cities Population Greater than 500000</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>City</th>
					<th>Population</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="city" items="${mexicoCities}">
					<tr>
						<td><c:out value="${city[0]}"></c:out></td>
						<td><c:out value="${city[1]}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Languages Greater than 89%</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>Language</th>
					<th>Percentage</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="language" items="${majorityLanguages}">
					<tr>
						<td><c:out value="${language[0]}"></c:out></td>
						<td><c:out value="${language[1]}"></c:out></td>
						<td><c:out value="${language[2]}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Small Countries Big Populace</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>Surface Area</th>
					<th>Population</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="country" items="${smallCountries}">
					<tr>
						<td><c:out value="${country.name}"></c:out></td>
						<td><c:out value="${country.surface_area}"></c:out></td>
						<td><c:out value="${country.population}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Big Monarchies</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>Surface Area</th>
					<th>Life Expectancy</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="country" items="${monarchies}">
					<tr>
						<td><c:out value="${country.name}"></c:out></td>
						<td><c:out value="${country.surface_area}"></c:out></td>
						<td><c:out value="${country.life_expectancy}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Argentina Specs</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Country</th>
					<th>City</th>
					<th>District</th>
					<th>City Population</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="city" items="${argentinaSpecs}">
					<tr>
						<td><c:out value="${city[0]}"></c:out></td>
						<td><c:out value="${city[1]}"></c:out></td>
						<td><c:out value="${city[2]}"></c:out></td>
						<td><c:out value="${city[3]}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
		<h2>Region Count</h2>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Region</th>
					<th>Number of Countries</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="region" items="${regionCount}">
					<tr>
						<td><c:out value="${region[0]}"></c:out></td>
						<td><c:out value="${region[1]}"></c:out></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
	</body>
</html>