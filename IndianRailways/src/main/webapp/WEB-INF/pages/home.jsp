<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring with Bootstrap</title>
<!-- Replace with the following CDN links -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
   <style type="text/css">
   .images{
   width:"100px";
    height:"35px;
   }
           header{
            background-color: rgb(17, 56, 85);
            color:white;
            font-size: 20px;
            justify-content: space-around;
            display: flex;
            padding: 15px;
            font-family: Arial, Helvetica, sans-serif;
            align-items: center;
            opacity:0.5;

        }
        nav span{
            margin-left: 15px;            
        }
        .image {
            position: relative;
            left: -100px;
        }
        #IR{
        font-weight: bold;
        position: relative;
        font-size: 20px;
        }
        form{
       
        border: 2px solid #333;
        width:550px;
        height:400px;
        margin-left:65px;
        margin-top:99px;
        align-items: center;
        background-color: white;
       
        }
        .parentdiv{
        display:flex;
        
        }
   body {
             margin: auto;
            font-family: -apple-system, BlinkMacSystemFont, sans-serif;
            overflow: auto;
            background: linear-gradient(
                315deg,
                rgba(101, 0, 94, 1) 3%,
                rgba(60, 132, 206, 1) 38%,
                rgba(48, 238, 226, 1) 68%,
                rgba(255, 25, 25, 1) 98%
            );
            animation: gradient 15s ease infinite;
            background-size: 400% 400%;
            background-attachment: fixed;
            }

            @keyframes gradient {
            0% {
                background-position: 0% 0%;
            }
            50% {
                background-position: 100% 100%;
            }
            100% {
                background-position: 0% 0%;
            }
            }

            .wave {
            background: rgb(255 255 255 / 25%);
            border-radius: 1000% 1000% 0 0;
            position: fixed;
            width: 200%;
            height: 12em;
            animation: wave 10s -3s linear infinite;
            transform: translate3d(0, 0, 0);
            opacity: 0.8;
            bottom: 0;
            left: 0;
            z-index: -1;
            }

            .wave:nth-of-type(2) {
            bottom: -1.25em;
            animation: wave 18s linear reverse infinite;
            opacity: 0.8;
            }

            .wave:nth-of-type(3) {
            bottom: -2.5em;
            animation: wave 20s -1s reverse infinite;
            opacity: 0.9;
            }

            @keyframes wave {
            2% {
                transform: translateX(1);
            }

            25% {
                transform: translateX(-25%);
            }

            50% {
                transform: translateX(-50%);
            }

            75% {
                transform: translateX(-25%);
            }

            100% {
                transform: translateX(1);
            }
            }
       .form_elements{
       padding: 25px;
       }
   
   </style>
</head>
<body>
<header>
 <div class="image">
  <img src="images/secondry.png" >
  <span id="IR">Indian Railways</span>
 </div>
<div>
<nav>
<span>Login </span>
<span>Register </span>
<span>Trains </span>
<span>Buses </span>
<span>Flights </span>
<span>Daily Deals </span>
<span>Contact us </span>
</nav>
</div>
</header>  

<div class="parentdiv">
	<form:form action="login" modelAttribute="login_Mattribute">
		<br>
		<br>
		<dl class="form_elements">
		<h2><span>User Login</span></h2>
        <dt>User Name</dt>
        <dd><form:input path="username" class="form-control"/></dd>
        <dt>Password</dt>
        <dd><form:input path="password" class="form-control"/></dd>
        
        <dd><button class="btn btn-success" type="submit">Login</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        &nbsp;<a href="register"><span>New user?Register here...</span></a>
        </dd>
   <h4> ${loginmsg }</h4>
        </dl>
	</form:form>

</div>
<div>
           <div class="wave"></div>
           <div class="wave"></div>
           <div class="wave"></div>
        </div>



</body>
</html>
