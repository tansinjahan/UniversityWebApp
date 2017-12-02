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
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

	<h1>
		Create course
	</h1>
		<form:form method="POST" action="/create_student" modelAttribute="createStudentForm">
             <table id="createStudentTable">
                <tr>
                    <td><form:label path="studentName">Student Name</form:label></td>
                    <td><form:input path="studentName"/></td>
                </tr>
                <tr>
                    <td><form:label path="studentNumber">Student Number</form:label></td>
                    <td><form:input path="studentNumber"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Student email</form:label></td>
                    <td><form:input path="email"/></td>
                    <td><form:errors path="email" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Student password</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="studentStatus">Student status</form:label></td>
                    <td><form:input path="studentStatus"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
