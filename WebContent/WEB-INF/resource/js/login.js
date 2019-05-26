$( "#loginOut" ).on( "click", function() {

	if ( window.confirm( "您确定要退出系统吗?" ) ) {
		window.top.location.href = "sys/loginout";
	}
} );
