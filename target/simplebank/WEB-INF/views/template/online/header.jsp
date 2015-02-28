<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<nav class="navbar navbar-default">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
			data-toggle="collapse" data-target="#header-navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#">SimpleBank</a>
	</div>
	<div class="collapse navbar-collapse" id="header-navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="${path}/app/users/index.html">Users</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-expanded="false"> Hey,
					you! <span class="caret"></span>
			</a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="#">Help</a></li>
					<li class="divider"></li>
					<li><a href="#">Logout</a></li>
				</ul></li>
		</ul>
	</div>
</nav>