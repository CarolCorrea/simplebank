<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<div class="modal fade" id="user-modal" tabindex="-1" role="dialog"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">User Information</h4>
			</div>
			<div class="modal-body">
				<div id="messages-modal"></div>
				<form id="user-form">
					<label for="username">Username: </label> <input id="username"
						name="username" class="form-control" required> <label
						for="password">Password: </label> <input id="password"
						name="password" type="password" class="form-control" required>
					<label for="roles">Roles: </label> <select id="roles" name="roles"
						class="form-control" multiple>
						<c:forEach var="role" items="${roles}">
							<option value="${role.id}">${role.name}</option>
						</c:forEach>
					</select> <input id="user-id" type="hidden">
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button id="btn-save-user" type="button" class="btn btn-primary">Save
					changes</button>
			</div>
		</div>
	</div>
</div>