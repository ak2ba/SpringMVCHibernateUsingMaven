<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="dataInsert">
		<table>
			<tr>
				<td>Employee Id </td>
				<td><input type="number" name="empid">
			</tr>
			<tr>
				<td>Employee Name </td>
				<td><input type="text" name="ename">
			</tr>
			<tr>
				<td>Job Role</td>
				<td><input type="text" name="jobrole">
			</tr>
			<tr>
				<td>Department </td>
				<td><input type="text" name="dept">
			</tr>
			<tr>
				<td>Department Id </td>
				<td><input type="number" name="deptid">
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Insert Data">
			</tr>
		</table>
	</form>
	
	<br>
	<br>
	<br>
	<hr>
	<h1>Delete using Id</h1>
	<form action="delete">
		<table>
			<tr>
				<td>Enter ID of user to be deleted</td>
				<td><input type="number" name="empid"></td>
				<td></td><td><input type="submit" value="Delete"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<br>
</body>
</html>






