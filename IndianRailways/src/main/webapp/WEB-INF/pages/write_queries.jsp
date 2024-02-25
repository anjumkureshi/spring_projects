<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ir.entity.UserDetails" %>
    
             <%@ page isELIgnored="false" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Queries page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<style type="text/css">
         .form_elements{
 padding:25px; 
 }
  .btn{
 margin-left:85%;
 }
 .btn:last-child{
 margin-left:0%;
 }
 
        

</style>
	<script type="text/javascript">
	function submitQuery(){
		if(document.getElementById("querytext").value.trim()==""){
			alert ("your query is Empty...Try again")

		}else
			{
	        alert("your query submitted Successfully...");

			}
	}
	</script>
</head>
<body>
<form:form action="submitquery" modelAttribute="query_attribute">

<dl class="form_elements">
		<p style="color:#f30c7d; font-size: 42px; font-family: serif;">Indian railways feels happy to assist you...</p>

<dt>Write your queries here</dt>
<dd>
<form:textarea path="query" class="form-control" id="querytext"/>
</dd>
<dt>Email Id </dt>
<dd>
<form:input path="useremailid" value="${email}" class="form-control" readonly="true"/>

</dd>
<dt></dt>
<dd><button type="submit" class="btn btn-success" onclick="submitQuery()">Submit Query</button>
&nbsp;
<button type="reset" class="btn btn-danger">Cancel</button></dd>
<dd><h3>${msg} </h3>
</dd>
</dl>
</form:form>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>