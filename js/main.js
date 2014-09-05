AUI.add(
		'dhst-intranet',
		function(url) {
			alert(url);
			
			var form = this.getPrincipalForm();
			
			alert(form);
			form.action = url;
			
			alert(form.action);
			
			submitForm(form);
		},
		'',
		{
			requires: ['aui-base']
		}
	);