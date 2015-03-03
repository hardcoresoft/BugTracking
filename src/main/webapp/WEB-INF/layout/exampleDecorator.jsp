<%@ include file="../jsp/taglib_includes.jsp" %>

<!DOCTYPE>
<html>
<head>
	<title><sitemesh:write property='title' /></title>
	
	<link href="resources/jquery/ui/1.11.3/jquery-ui.min.css" rel="stylesheet">
	<link href="<c:url value="resources/jquery/ui/1.11.3/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="resources/jquery/ui/1.11.3/jquery-ui.theme.css" />" rel="stylesheet">
	<link href="<c:url value="resources/css/boon.css" />" rel="stylesheet">
	<link href="<c:url value="resources/css/main.css" />" rel="stylesheet">
	
	<script src="<c:url value="resources/jquery/jquery-1.11.2.min.js" />"></script>
	<script src="<c:url value="resources/jquery/ui/1.11.3/jquery-ui.min.js" />"></script>
	<script src="<c:url value="resources/js/common.js" />" ></script>
	
	<sitemesh:write property='head' />
</head>

<body>
	This is the decorator body in contact:
	<sitemesh:write property='body' />
</body>
</html>