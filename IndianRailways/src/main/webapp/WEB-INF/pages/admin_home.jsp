<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">

<style type="text/css">
           header{
            background-color: rgb(17, 56, 85);
            color:white;
            font-size: 20px;
            justify-content: space-around;
            display: flex;
            padding: 15px;
            font-family: Arial, Helvetica, sans-serif;
            align-items: center;

        }
        #logout{
        position: relative;
        margin-left: 100px;
        }

</style>
</head>
<body>
<header>
<h1> Admin Homepage</h1>
<button type="submit"  class="btn btn-danger" id="logout">Logout</button>
</header>

<div>
<a href="addtrains">Add new Trains</a>
</div>
<div>
<a href="addstations">Add new Stations</a>
</div>
<div>
<a href="view_queries">View Passengers Queries</a>
</div>
<div>
<a href="emergency">Emergency</a>
</div>
<div>
<a href="helpdesk">Help Desk</a>
</div>
<div>
<a href="setprices_listofTrains">Set Ticket price for Trains</a>
</div>
</body>
</html>