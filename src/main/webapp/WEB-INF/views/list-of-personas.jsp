
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<script>
	function enviar() {

		//document.identificarForm.action="registrar.do";
		document.identificarForm.submit();

	}
</script>


<html lang="en">
<head>
<meta charset="utf-8">
	<title>Bootswatch: Superhero</title>
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
					<!--[if lt IE 9]>
      <script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
      <script src="../bower_components/respond/dest/respond.min.js"></script>
    <![endif]-->
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
				<a href="../" class="navbar-brand">Bootswatch</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						href="/challenge" id="themes">Home <span class="caret"></span></a></li>

				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="http://builtwithbootstrap.com/" target="_blank">Built
							With Bootstrap</a></li>
					<li><a href="https://wrapbootstrap.com/?ref=bsw"
						target="_blank">WrapBootstrap</a></li>
				</ul>

			</div>
		</div>
	</div>


	<div class="container">

		<div class="page-header" id="banner">
			<div class="row">
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h1>Superhero</h1>
					<p class="lead">The brave and the blue</p>
				</div>
			</div>
		</div>


		<!--  <!-- Buttons
      ================================================== -->




		<!-- Tables
      ================================================== -->
		<div class="bs-docs-section">

			<div class="row">
				<div class="col-lg-12">
					<div class="page-header">
						<h1 id="tables">Tables</h1>
					</div>

					<div class="bs-component">
						<table class="table table-striped table-hover ">
							<thead>
								<tr>
									<th>id</th>
									<th>name</th>
									<th>apellidos</th>
									<th>telefono</th>
									<th>direccion</th>
									<th>Correo</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="persona" items="${personas}">
									<tr>
										<td class="">${persona.id}</td>
										<td class="">${persona.nombre}</td>
										<td class="">${persona.apellidos}</td>
										<td class="">${persona.telefono}</td>
										<td class="">${persona.direccion}</td>
										<td class="">${persona.correo}</td>
										<td class="info"><a
											href="${pageContext.request.contextPath}/challenge/edit/${persona.id}.html">Edit</a><br />
											<a
											href="${pageContext.request.contextPath}/challenge/delete/${persona.id}.html">Delete</a><br />
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<!-- /example -->
				</div>
			</div>
		</div>




		<footer> </footer>


	</div>



</body>
</html>