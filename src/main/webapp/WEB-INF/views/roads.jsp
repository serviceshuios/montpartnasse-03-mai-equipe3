<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">  <!-- pointe vers la racine du projet, i.e., webapp -->
<title>Formulaire carg. routières</title>
</head>

<body>
	<h2>CRUD cargaisons routières</h2>
	<div>
		<f:form modelAttribute="roads" method="POST" action="saveRoad">
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
					<td><f:errors path="destnation" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Immatriculation :</td>
					<td><f:input path="immatriculation" /></td>
					<td><f:errors path="immatriculation" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Péage (€) :</td>
					<td><f:input path="peage" /></td>
					<td><f:errors path="peage" cssClass="error"/></td>
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
				<th>Immatriculation</th>
				<th>Péage (€)</th>
				<th>Modifier</th>
				<th>Supprimer</th>
			</tr>
			<c:forEach var="r" items="${roads}">
				<tr>
					<td>${r.idCargaison}</td>
					<td>${r.nomCargaison}</td>
					<td>${r.depart}</td>
					<td>${r.destination}</td>
					<td>${r.immatriculation}</td>
					<td>${r.peage}</td>
					<td><a href="editAdresse?id=${r.idCargaison}">éditer</a></td>
					<td><a href="deleteAdresse?id=${r.idCargaison}">supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>