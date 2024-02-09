<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@ page isELIgnored="false" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<style type="text/css">
        form1{
border: 3px solid Black;
border-radius:10px;
        width:550px;
        height:600px;
        margin-left:65px;
        margin-top:99px;
        align-items: center;
        background-color: white;
        }

       .form_elements{
       padding: 25px;
       }

</style>
</head>

<body>
<form:form action="add_stations" modelAttribute="addstations">
		<br>
		<br>
		<dl class="form_elements">
		<h2><span>Add Stations</span></h2>
		<dt>
        <dt>Enter new Station Name</dt>
        <dd><form:input path="stationName" class="form-control"></form:input>
        </dd>
        <dt>Enter State Name</dt>
        <dd><form:input path="stateName" class="form-control"></form:input>
 		</dd>
 		<dt>Enter Station Code</dt>
        <dd><form:input path="stdCode" class="form-control"></form:input>
 		</dd>
 <dt>Select the trains Passing by this Station</dt>
<dd><form:checkboxes items="${train_names}" path="passByStations"/> </dd>
        <dd><button class="btn btn-warning" type="submit">Add Station</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        </dd>
        </dl>
		<h4>${msg}</h4>
	</form:form>

</body>
</html>