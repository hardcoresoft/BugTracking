<%@ include file="/WEB-INF/jsp/taglib_includes.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>:: Welcome ::</title>

<%-- 	<link href="<c:url value="web-resources/bootstrap/3.3.2/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<%-- 	<link href="<c:url value="web-resources/bootstrap/3.3.2/css/bootstrap-theme.min.css" />" rel="stylesheet"> --%>
	
<%-- 	<script src="<c:url value="web-resources/jquery/jquery-1.11.2.min.js" />"></script> --%>
<%-- 	<script src="<c:url value="web-resources/bootstrap/3.3.2/js/bootstrap.min.js" />"></script> --%>


<script type="text/javascript">
	$(document).ready(function(){
		$("#myModal").modal('show');
	});
</script>

</head>
<body>
	<h1>Welcome Index Page</h1>
	<div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Confirmation</h4>
            </div>
            <div class="modal-body">
                <p>Do you want to save changes you made to document before closing?</p>
                <p class="text-warning"><small>If you don't save, your changes will be lost.</small></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>