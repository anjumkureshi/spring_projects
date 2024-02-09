<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
   <style type="text/css">
        form{
       
        border: 2px solid #333;
        width:550px;
        height:400px;
        margin-left:65px;
        margin-top:99px;
        align-items: center;
        background-color: white;
       
        }
      .form_elements{
       padding: 25px;
       }
        

</style>
<body>
<h1 >Management home page</h1>
<div>
	<form:form action="managementlogin" modelAttribute="login">
		<br>
		<br>
		<dl class="form_elements">
		
		<h2><span>Management Login</span></h2>
		
        <dt>User Name</dt>
        <dd><form:input path="username" class="form-control"/>
        </dd>
        <dt>Password</dt>
        <dd><form:input path="password" class="from-control"/></dd>
        <dd><button class="btn btn-success" type="submit">Login</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        &nbsp;<a href="/IndianRailways/management/signup"><span>New user&Register here...</span></a>
                &nbsp;<a href="/IndianRailways/management/trainsinformation"><span>Trains Info...</span></a>
        
        </dd>
        <dd><h5>${invalidmessage }</h5>
        </dd>
        </dl>
	</form:form>
</div>
</body>
</html>