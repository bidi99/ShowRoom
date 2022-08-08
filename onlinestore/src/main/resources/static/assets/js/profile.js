$('document').ready(function() {

	$('.table .btn-primary').on('click', function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(user, status) {
			$('#idEdit').val(user.id);
			$('#usernameEdit').val(user.username);
			$('#lastnameEdit').val(user.lastname);
			$('#firstnameEdit').val(user.firstname);
			$('#numberEdit').val(user.number);
			$('#emailEdit').val(user.email);
		});
		$('#editModal').modal();
	});
})