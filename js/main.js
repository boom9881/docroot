function <portlet:namespace />onSub(url){
	alert(url);
	document.<portlet:namespace />fm.action = url;

	submitForm(document.<portlet:namespace />fm);
}