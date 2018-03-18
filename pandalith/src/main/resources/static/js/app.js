$(function() {
	$("#get-answer").on(
			"click",
			function(event) {
				event.preventDefault();
				$.ajax({
					url : "/api/answer",
					success : function(result) {
						$("#answer").html(result);
					}
				});
			});
});