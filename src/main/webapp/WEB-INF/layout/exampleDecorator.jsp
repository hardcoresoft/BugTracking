<%@ include file="../jsp/taglib_includes.jsp" %>

<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<title><sitemesh:write property='title' /></title>
	
	<link href="<c:url value="web-resources/jquery/ui/1.11.3/jquery-ui.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/jquery/ui/1.11.3/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/jquery/ui/1.11.3/jquery-ui.theme.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/bootstrap/3.3.2/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/bootstrap/3.3.2/css/bootstrap-theme.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/bootstrap/3.3.2/css/simple-sidebar.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/css/boon.css" />" rel="stylesheet">
	
	<!-- Custom Fonts -->
	<link href="<c:url value="web-resources/font-awesome/css/font-awesome.min.css" />" rel="stylesheet">
	
	<script src="<c:url value="web-resources/bootstrap/3.3.2/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="web-resources/jquery/jquery-1.11.2.min.js" />"></script>
	<script src="<c:url value="web-resources/jquery/ui/1.11.3/jquery-ui.min.js" />"></script>
	<script src="<c:url value="web-resources/js/common.js" />" ></script>
	
	<sitemesh:write property='head' />
</head>

<body>
	This is the decorator body in contact:
	<sitemesh:write property='body' />
</body>
</html>