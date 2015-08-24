
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%--<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of teams</title>
</head>
<body>
<h1>List of teams</h1>
<p>Here you can see the list of the teams, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="10%">apellidos</th><th width="10%">telefono</th><th width="10%">direccion</th><th width="10%">Correo</th>
</tr>
</thead>
<tbody>
<c:forEach var="persona" items="${personas}">
<tr>
	<td>${persona.id}</td>
	<td>${persona.nombre}</td>
	<td>${persona.apellidos}</td>
	<td>${persona.telefono}</td>
	<td>${persona.direccion}</td>
	<td>${persona.correo}</td>
	<td>
		<a href="${pageContext.request.contextPath}/team/edit/${persona.id}.html">Edit</a><br/>
		<a href="${pageContext.request.contextPath}/team/delete/${persona.id}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>
<p><a href="${pageContext.request.contextPath}/">Home page</a></p>
</body>
</html> --%>









<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="${pageContext.request.contextPath}/persona/list.html">Team list</a><br/>
</body>
</html>
 --%>


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
<%-- <title>Insert title here</title>
</head>
<body class="metro">

<div>

Por favor, identifíquese.

</div>

<html:form action="identificar">

<div>

      <span style="text-aling:rigth">Identificador </span>

      <span>&nbsp;&nbsp;&nbsp;<html:text property="usuario.identificador" /></span>

</div>

<div>

      <span style="text-aling:rigth">Contraseña </span>

      <span>&nbsp;&nbsp;&nbsp;<html:password property="usuario.contrasenna" /></span>

</div>

<div>&nbsp;</div>

<div>

      <input type="button" value="Identificar" class="btn btn-primary" onclick="javascript:enviar();" />

</div>

</html:form>

<logic:present name="mensaje">

<div>

      <span style="color: red;">

            <fieldset>

                  <bean:write name="mensaje" />

            </fieldset>

      </span>

</div>

</logic:present>
</body>
</html> 

 --%>



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
				<a href="../" class="navbar-brand">>Hp - Challenge</a>
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

			</div>
		</div>
	</div>


	<div class="container">

		<div class="page-header" id="banner">
			<div class="row">
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h1>Game</h1>
				</div>
			</div>
		</div>


		<!--  <!-- Buttons
      ================================================== -->

		<form:form method="POST" commandName="persona"
			action="${pageContext.request.contextPath}/challenge/add.html">
			<table>
				<tbody>
					<tr>
						<td>ID:</td>
						<td><form:input path="id" /></td>
					</tr>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="nombre" /></td>
					</tr>
					<tr>
						<td>Apellidos:</td>
						<td><form:input path="apellidos" /></td>
					</tr>
					<tr>
						<td>Telefono:</td>
						<td><form:input path="telefono" /></td>
					</tr>
					<tr>
						<td>Direccion:</td>
						<td><form:input path="direccion" /></td>
					</tr>
					<tr>
						<td>Correo:</td>
						<td><form:input path="correo" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Agregar" /></td>
						<td></td>
					</tr>

				</tbody>
			</table>
		</form:form>


		<!-- Tables
      ================================================== -->
	</div>
	<!-- /example -->
	</div>
	</div>
	</div>




	<footer> </footer>


	</div>



</body>
</html>