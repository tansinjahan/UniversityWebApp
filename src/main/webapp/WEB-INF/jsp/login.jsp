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
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<h1>
			<span id="test">Login Page</span>
		</h1>
		<c:if test="${!empty message}">
			<div id="messages" class="alert alert-danger">
				<strong>${message}</strong>
			</div>
		</c:if>
		<form:form method="POST" action="/login" modelAttribute="loginForm">
             <table id="login">
                <tr>
                    <td><form:label path="userName">Username</form:label></td>
                    <td><form:input path="userName" id="user"/></td>
                </tr>
                <tr>
                    <td><form:label path="passWord">Password</form:label></td>
                    <td><form:input path="passWord" id="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" id ="loginSubmit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
