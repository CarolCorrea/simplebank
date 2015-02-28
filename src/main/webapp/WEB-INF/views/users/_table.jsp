<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<table class="table table-condensed table-striped table-bordered">
	<thead>
		<tr>
			<td style="width: 10%">#</td>
			<td style="width: 20%">Name</td>
			<td style="width: 50%">Roles</td>
			<td class="center" style="width: 10%">Edit</td>
			<td class="center" style="width: 10%">Delete</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr data-id="${user.id}">
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td><c:forEach var="role" items="${user.roles}">
${role.name} <br />
					</c:forEach></td>
				<td class="center">
					<button type="button" class="btn btn-warning btn-edit">
						<i class="glyphicon glyphicon-pencil"></i>
					</button>
				</td>
				<td class="center">
					<button type="button" class="btn btn-danger btn-delete">
						<i class="glyphicon glyphicon-trash"></i>
					</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>