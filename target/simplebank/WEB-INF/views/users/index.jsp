<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath}"
	scope="request" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${path}/static/libs/jquery-2.1.3.min.js"></script>
<script src="${path}/static/libs/bootstrap/js/bootstrap.min.js"></script>
<script src="${path}/static/js/users.js"></script>
<style type="text/css">
@IMPORT url("${path}/static/libs/bootstrap/css/bootstrap.min.css");

@IMPORT url("${path}/static/libs/bootstrap/css/bootstrap-theme.min.css")
	;

@IMPORT url("${path}/static/css/style.css");
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
	<div class="container">
		<jsp:include page="../template/online/header.jsp" />
	</div>
	<section class="container users">
		<header>
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#user-modal">
				<i class="glyphicon glyphicon-plus"></i> New User
			</button>
		</header>
		<div id="users-container"></div>
	</section>
	<jsp:include page="_modal.jsp" />
</body>
</html>