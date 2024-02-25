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

        form
        {
        border: 2px solid #333;
        width:550px;
        height:400px;
        margin-left:65px;
        margin-top:99px;
        align-items: center;
        background-color: white;
        }
        #form1{
        border: 2px solid #333;
        width:550px;
        height:600px;
        margin-left:65px;
        margin-top:99px;
        align-items: center;
        background-color: white;
        }
        .parentdiv{
        display:flex;
        }
       .form_elements{
       padding: 25px;
       }
</style>
</head>
<body>
<div class="parentdiv">

<form:form action="trainsinfo"  modelAttribute="trains_info" id="form1">
<h2><span>Add New Train Details</span></h2>
<dl class="form_elements">
<dt>Enter Train Name</dt>
<dd><form:input path="trainName" class="form-control"/></dd>
<dt>Enter Train No.</dt>
<dd><form:input path="trainNo" class="form-control"/></dd>
<dt>Enter Train Starts From</dt>
<dd><form:select path="start" class="form-control">
      <form:options items="${stations_names }"/>
      </form:select>
      </dd>
<dt>Enter Train Ends At</dt>
<dd><form:select path="end" class="form-control">
     <form:options items="${stations_names}"/>
     </form:select>
 </dd>
  <dd><button class="btn btn-success" type="submit">Add Trains</button>&nbsp;
 <button class="btn btn-danger" type="reset">Cancel</button></dd>
</dl>
</form:form> 
</div>
</body>
</html>