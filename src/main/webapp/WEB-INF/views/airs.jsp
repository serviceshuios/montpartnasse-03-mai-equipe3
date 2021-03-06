<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">  <!-- pointe vers la racine du projet, i.e., webapp -->
<title>Formulaire carg. aériennes</title>
</head>

<body>
	<h2>Formulaire cargaisons aériennes</h2>
	<div>
		<f:form modelAttribute="air" method="POST" action="saveAir">
			<table>
				<tr>
					<td><f:hidden path="idCargaison"/> </td>
				</tr>
				<tr>
					<td>Nom cargaison : </td>
					<td><f:input path="nomCargaison" /></td>
					<td><f:errors path="nomCargaison" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Lieu de départ : </td>
					<td><f:input path="depart" /></td>
					<td><f:errors path="depart" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Destination :</td>
					<td><f:input path="destination" /></td>
					<td><f:errors path="destination" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Numéro de vol :</td>
					<td><f:input path="numVol" /></td>
					<td><f:errors path="numVol" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Taxe (€) :</td>
					<td><f:input path="taxe" /></td>
					<td><f:errors path="taxe" cssClass="error"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="enregistrer" /></td>
				</tr>
			</table>
		</f:form>
	</div>
	
	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID</th>
				<th>Nom cargaison</th>
				<th>Départ</th>
				<th>Destination</th>
				<th>Numéro de vol</th>
				<th>Taxe (€)</th>
				<th>Modifier</th>
				<th>Supprimer</th>
			</tr>
			<c:forEach var="a" items="${airs}">
				<tr>
					<td>${a.idCargaison}</td>
					<td>${a.nomCargaison}</td>
					<td>${a.depart}</td>
					<td>${a.destination}</td>
					<td>${a.numVol}</td>
					<td>${a.taxe}</td>
					<td><a href="editAir?idCargaison=${a.idCargaison}">éditer</a></td>
					<td><a href="deleteAir?idCargaison=${a.idCargaison}">supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>