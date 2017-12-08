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

		<h1>Create course</h1>

		<c:if test="${!empty message}">
			<div id="message" class="alert alert-danger">${message}.</div>
		</c:if>

		<form:form method="POST" action="/create_course"
			modelAttribute="createCourseForm">
			<table id="createCourseTable">
				<tr>
					<td><form:label path="title">Course Title</form:label></td>
					<td><form:input path="title" /></td>
				</tr>
				<tr>
					<td><form:label path="code">Course Code</form:label></td>
					<td><form:input path="code" /></td>
				</tr>
				<tr>
					<td><form:label path="capacity">capacity</form:label></td>
					<td><form:input path="capacity" /></td>
				</tr>
				<tr>
					<td><form:label path="finalExam">Final</form:label></td>
					<td><form:input path="finalExam" /></td>
				</tr>
				<tr>
					<td><form:label path="assignment">Assignment</form:label></td>
					<td><form:input path="assignment" /></td>
				</tr>
				<tr>
					<td><form:label path="midterm">Midterm</form:label></td>
					<td><form:input path="midterm" /></td>
				</tr>
				<tr>
					<td><form:label path="prerequisite">prerequisite</form:label></td>
					<td><form:input path="prerequisite" /></td>
				</tr>
				<tr>
					<td><form:label path="project">Project</form:label></td>
					<td><form:input path="project" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="courseSubmit" value="Submit" /></td>
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
