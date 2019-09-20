<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>


</head>

<body>


	<h3>Save Customer</h3>

	<form:form action="saveCustomer" modelAttribute="customer"
		method="POST">

		<!-- this customer id is for update and delete-->
		<form:hidden path="id" />

		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>



	</form:form>

	<div style=""></div>


	<p>
		<a href="${pageContext.request.contextPath}/list">Back to List</a>
	</p>













