<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">  <!-- pointe vers la racine du projet, i.e., webapp -->
<title>Formulaire sociétés</title>
</head>

<body>
	<h2>Formulaire sociétés</h2>
	<div>
		<f:form modelAttribute="company" method="POST" action="saveCompany">
			<table>
				<tr>
					<td><f:hidden path="idSociete"/> </td>
				</tr>
				<tr>
					<td>Nom société :</td>
					<td><f:input path="nomSociete" /></td>
					<td><f:errors path="nomSociete" cssClass="error"/></td>
				</tr>
				<tr>
					<td>SIRET :</td>
					<td><f:input path="numSiret" /></td>
					<td><f:errors path="numSiret" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Date de création :</td>
					<td><f:input path="dateCreation" /></td>
					<td><f:errors path="dateCreation" cssClass="error"/></td>
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
				<th>NOM SOCIETE</th>
				<th>SIRET</th>
				<th>DATE CREATION</th>
				<th>MODIFIER</th>
				<th>SUPPRIMER</th>
			</tr>
			<c:forEach var="c" items="${companies}">
				<tr>
					<td>${c.idSociete}</td>
					<td>${c.nomSociete}</td>
					<td>${c.numSiret}</td>
					<td>${c.dateCreation}</td>
					<td><a href="editCompany?idSociete=${c.idSociete}">editer</a></td>
					<td><a href="deleteCompany?idSociete=${c.idSociete}">supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>