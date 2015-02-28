var openModal = function() {
	$('#user-modal').modal('show');
};
var closeModal = function() {
	$('#user-modal').modal('hide');
};
var cleanModal = function() {
	$('#user-form').trigger('reset');
	$('#user-id').val('');
	$('#messages-modal').html('');
	$('#roles option').attr('selected', false);
};
var listUsers = function() {
	$.get('refresh.html').success(function(view) {
		$('#users-container').html(view);
		applyTableEvents();
	});
};
var setMessageModal = function(message) {
	$('#messages-modal').html(
			'<div class="alert alert-warning">' + message + '</div>');
};
var saveUser = function() {
	var data = $('#user-form').serialize();
	var userId = $('#user-id').val();
	var url = '../users';
	var type = 'POST';
	if (userId) {
		url += '/' + userId;
		type = 'PUT';
	}
	$.ajax({
		url : url,
		data : data,
		type : type
	}).success(function() {
		listUsers();
		closeModal();
	}).fail(function(response) {
		setMessageModal(response.responseText);
	});
};
var deleteUser = function() {
	var userId = $(this).parents('tr').data('id');
	$.ajax({
		url : '../users/' + userId,
		type : 'DELETE'
	}).success(listUsers).always(closeModal);
};
var selectUser = function() {
	var userId = $(this).parents('tr').data('id');
	$.get('../users/' + userId).success(function(user) {
		$('#username').val(user.username);
		$('#user-id').val(user.id);
		$.each(user.roles, function(index, role) {
			$("#roles option[value='" + role.id + "']").attr("selected", true);
		});
	}).always(openModal);
};
var applyTableEvents = function() {
	$('.btn-edit').on('click', selectUser);
	$('.btn-delete').on('click', deleteUser);
};
$(document).ready(function() {
	listUsers();
	$('#btn-save-user').on('click', saveUser);
	$('#user-modal').on('hide.bs.modal', cleanModal);
});