<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="findtrains" modelAttribute="search_trains_attribute">
		<br>
		<br>
		<dl class="form_elements">
		<h2><span>Search Your Trains</span></h2>
        <dt>From</dt>
        <dd><form:input path="fromStation" class="form-control"/></dd>
        <dt>To</dt>
        <dd><form:input path="toStation" class="form-control"/></dd>
        <dd><button class="btn btn-success" type="submit">Submit</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        </dd>
        </dl>
	</form:form>
   <h4> ${search_train_msg }</h4>


</body>
</html>