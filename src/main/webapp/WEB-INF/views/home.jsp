<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%--<!DOCTYPE htmlPUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-responsive.css">
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css"

      <title>Identificación</title>
--%>
<script>
	function enviar() {

		//document.identificarForm.action="registrar.do";
		document.identificarForm.submit();

	}
</script>

<html lang="en">
<head>
<meta charset="utf-8">
<title>Challenge</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--   <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-responsive.css">
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css"> -->
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
<script src="../bower_components/respond/dest/respond.min.js"></script>

<script type="text/javascript"
	src="http://www.google-analytics.com/ga.js"></script>
<script>
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-23019901-1' ]);
	_gaq.push([ '_setDomainName', "bootswatch.com" ]);
	_gaq.push([ '_setAllowLinker', true ]);
	_gaq.push([ '_trackPageview' ]);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>
</head>
<body>
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a href="../" class="navbar-brand">Hp - Challenge</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown"
						href="${pageContext.request.contextPath}/challenge/list.html"
						id="themes">Listar<span class="caret"></span></a></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown"
						href="${pageContext.request.contextPath}/challenge/add.html"
						id="themes">Agregar<span class="caret"></span></a></li>

				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="page-header" id="banner">
			<div class="row">
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h1>HP Challenge - Rock, Paper, Scissors</h1>
					<h2>David Alexander Artavia Cerdas</h1>
					<h13>dalexander1992@gmail.com</h3>
					<h13>87872624</h3>
				</div>
			</div>
		</div>

	</div>
</body>
</html>