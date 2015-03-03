<%@ include file="../jsp/taglib_includes.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title><sitemesh:write property='title' /></title>
	
	<link href="<c:url value="web-resources/styles/jquery/ui/1.11.3/jquery-ui.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/jquery/ui/1.11.3/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/jquery/ui/1.11.3/jquery-ui.theme.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/bootstrap/3.3.2/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/bootstrap/3.3.2/css/bootstrap-theme.min.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/bootstrap/3.3.2/css/simple-sidebar.css" />" rel="stylesheet">
	<link href="<c:url value="web-resources/styles/css/boon.css" />" rel="stylesheet">
<%-- 	<link href="<c:url value="resources/styles/css/main.css" />" rel="stylesheet"> --%>
	
	<script src="<c:url value="web-resources/styles/bootstrap/3.3.2/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="web-resources/styles/jquery/jquery-1.11.2.min.js" />"></script>
	<script src="<c:url value="web-resources/styles/jquery/ui/1.11.3/jquery-ui.min.js" />"></script>
	<script src="<c:url value="web-resources/styles/js/common.js" />" ></script>
	
	<sitemesh:write property='head' />
</head>

<body>
	
	<div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Start Bootstrap
                    </a>
                </li>
                <li>
                    <a href="#">Dashboard</a>
                </li>
                <li>
                    <a href="#">Shortcuts</a>
                </li>
                <li>
                    <a href="#">Overview</a>
                </li>
                <li>
                    <a href="#">Events</a>
                </li>
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
        
        	<sitemesh:write property='body' />
        	<div style="clear:both"></div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Simple Sidebar</h1>
                        <p>This template has a responsive menu toggling system. The menu will appear collapsed on smaller screens, and will appear non-collapsed on larger screens. When toggled using the button below, the menu will appear/disappear. On small screens, the page content will be pushed off canvas.</p>
                        <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

	<!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
	
	
</body>
</html>