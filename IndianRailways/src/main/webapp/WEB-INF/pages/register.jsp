<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<style type="text/css">

form{
border: 3px solid orange;

width: 600px;
height: 800px;
margin-left: 300px;
margin-top: 20px;
}
.form_elements{
	padding: 15px;
}
.headingtext{
	font-family:monospace;
	font-size: 40px;
	padding: 5px;
	margin-left: 30px;
	
}
</style>
</head>
<body>
	<form:form action="userregister" modelAttribute="register_Mattribute">
		<br>
		<br>
		<span class="headingtext">User Registration</span>
		
		<dl class="form_elements">
        <dt>Enter FullName</dt>
        <dd><form:input path="fullname" class="form-control"/></dd>
        <dt>Enter your Email</dt>
        <dd><form:input path="email" class="form-control"/></dd>
		<dt>Enter your Address</dt>
        <dd><form:input path="address" class="form-control"/></dd>
       	<dt>Gender</dt>  <dd><select name="gender">
        	<option value="female">Female</option>
        	<option  value="male">Male</option>
        </select></dd>
        <dt>Enter your Contact Number</dt>
        <dd><form:input path="mobile" class="form-control"/></dd>
        <dt>Enter your DoB</dt>
        <dd><form:input path="dob" class="form-control" type="date"/></dd>
        <dt>Enter your username</dt>
        <dd><form:input path="username" class="form-control"/></dd>
        <dt>Enter your Password</dt>
        <dd><form:password path="password" class="form-control"/></dd>
       
        
        <dd><button class="btn btn-success" type="submit">Register</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        
        </dd>
        <dd>
        <a href="home">Login</a>
   <h4> ${registermsg }</h4>
        </dd>
        </dl>
        
	</form:form>

</body>
   
</html>
