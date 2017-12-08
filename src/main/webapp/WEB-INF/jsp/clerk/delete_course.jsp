<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">University System</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="clerk_home" id="clerkHome">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<h1>Delete Course</h1>
		<c:if test="${!empty message}">
			<div id="message" class="alert alert-danger">${message}.</div>
		</c:if>
		<form:form method="POST" action="/delete_course">
			<table id="deleteCourseTable">
				<tr>
					<td><label for="code">Course Code</label></td>	
					<td><input type="text" id="code" name="code" value=""/></td>					
				</tr>
				<tr>
					<td><input type="submit" id="deleteCourseSubmit"
						value="Submit" /></td>
				</tr>
			</table>
			<button>
				<a href="login" id="logout">Log Out</a>
			</button>
		</form:form>

	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
