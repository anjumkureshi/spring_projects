<%@ page language="java" contentType="text/html; charset=UTF-8"%>
            <%@ page isELIgnored="false" %>  
<%@ page import="com.ir.entity.UserDetails" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
<link rel="stylesheet" href="sample_style.css" type="text/css">

<script type="text/javascript">
	function viewprofile(){
		document.getElementById("user_profile").style.display="block";
	};
	function displayedit(){
		document.getElementById("edit_user").style.display="block";
		document.getElementById("user_profile").style.display="none";
	};
	
	function cancelclick()
	{
		document.getElementById("user_profile").style.display="block";

	}
		
</script>


 <style><%@include file="/WEB-INF/htmlfiles/sample_style.css"%>
</style>
</head>
<body class="container-fluid">
<header>
 <div class="image">
  <img src="/images/logo_one.jpg" >
  <span id="IR">Indian Railways</span>
 </div>
<div>
<nav>
<div>
          <div class="custom-dropdown">
    <p class="dropdown-toggle" id="dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      Trains
    </p>
    <div class="dropdown-menu" aria-labelledby="trains_dropdown">
      <a class="dropdown-item" href="home">Special Trains</a>
      <a class="dropdown-item" href="home">Holiday Trains</a>
      <a class="dropdown-item" href="home">Deccan Queen</a>
    </div>
  </div>
          <div class="custom-dropdown">
    <p class="dropdown-toggle" id="dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      Rail-Food
    </p>
    <div class="dropdown-menu" aria-labelledby="food_dropdown">
      <a class="dropdown-item" href="home">Order my food</a>
      <a class="dropdown-item" href="home">Food Available</a>
      <a class="dropdown-item" href="home">Complaints</a>
    </div>
  </div>
          <div class="custom-dropdown">
    <p class="dropdown-toggle" id="dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      Booking
    </p>
    <div class="dropdown-menu" aria-labelledby="booking_dropdown">
      <a class="dropdown-item" href="home">Book Train Tickets</a>
      <a class="dropdown-item" href="home">Book Flight Tickets</a>
      <a class="dropdown-item" href="home">Book Bus Tickets</a>
    </div>
  </div>
        
  <div class="custom-dropdown">
    <button class="btn btn-danger dropdown-toggle" id="view_profilebtn" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      <span class=" bi bi-person-circle">&nbsp;Profile</span>
    </button>
    <div class="dropdown-menu" aria-labelledby="profileDropdown">
      <button class="dropdown-item" onclick="viewprofile()" data-bs-target="#user_profile" data-bs-toggle="modal" >View Profile</button>
      <button class="dropdown-item" onclick="changePassword">Change Password</button>
      <a class="dropdown-item" href="home">Logout</a>
    </div>
  </div>
  
</div>
</nav>
</div>
</header>  
<div class="headdiv">
<!-- <p class="topp" id="fade-in-out1"> Welcome to Indian Railways","  भारतीय रेलवे में आपका स्वागत है" ," ভারতীয় রেলওয়েজে আপনাকে স্বাগতম"," భారతీయ రైల్వేస్‌కు స్వాగతం"," இந்திய ரயில்வேஸில் வருக"

," ಭಾರತೀಯ ರೈಲ್ವೆಯಲ್ಲಿ ಸ್ವಾಗತ"," ഇന്ത്യൻ റെയിൽവേയിൽ സ്വാഗതം"," भारतीय रेल्वेमध्ये आपले स्वागत आहे"," ਭਾਰਤੀ ਰੈਲਵੇ ਵਿੱਚ ਤੁਹਾਨੂੰ ਜੀ ਆਇਆਂ ਨੂੰ ਕਰਦੇ ਹਾਂ","ભારતીય રેલવેની સ્વાગતમ"
</p>
<p class="middlep"id="fade-in-out2">
,"ଇଣ୍ଡିଆନ୍ ରେଲୱେସ୍‌ରେ ଆପଣଙ୍କୁ ସ୍ୱାଗତମ" ,"       ভাৰতীয় ৰেলওয়েজত স্বাগত"," भारतीय रेलमा स्वागत छ" ,"इंडियन रेल्वे वच्चें स्वागत"," انڊين ريلويءَ ۾ خش آئين","بھارتی ریلوے چھ چھ چھ سلامات"
</p>
<p class="bottomp"id="fade-in-out3">" भारतीय रेलवे में आपका स्वागत है"," ᱵᱮᱢᱰᱟᱹ ᱪᱟᱭᱟᱜ ᱯᱟᱹᱨᱥᱤ ᱯᱟᱹᱨᱥᱤ","ভারতীয় রেলওয়ে দখু গুলিয়া","भारतीय रेलवे मुँ तुसीं स्वागत आहे"," इण्डियन रेल्वे खुनार बेञ्चिनाचिना"," भारतीय रेलवे बोर देँ
</p>
 -->
<h2>${msg}</h2>
</div>
<section>
<div class="main_content">

<div class="searchTrainsdiv">
	<form:form action="findtrains" modelAttribute="search_trains_attribute">
		<br>
		<br>
		<dl class="form_elements">
		<dd><font color="#091760" size="15px">Search Your Trains</font></dd>
        <dt>From</dt>
        <dd><form:input path="fromStation" class="form-control"/></dd>
        <dt>To</dt> 
        <dd><form:input path="toStation" class="form-control"/></dd>
        
        <dd><button class="btn btn-success" type="submit">Search Trains</button>&nbsp;
        <button class="btn btn-danger" type="reset">Cancel</button>
        </dd>
        </dl>
	</form:form>

	<div>
	
	</div>
</div>
</div>

 <div class="modal fade" id="user_profile" tabindex="-1" role="dialog" aria-labelledby="userDetailsModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-fullscreen">
        <div class="modal-content">
            <div class="modal-header">
                <h3>User Account</h3>
                <button class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <div class="modal-body">
                    
        <dl class="row">
            <dt class="col-2">FullName</dt>
            <dd class="col-10" >${user_details.fullname}</dd>
            <dt class="col-2">Address</dt>
            <dd class="col-10" >${user_details.address }</dd>
            <dt class="col-2">Gender</dt>
            <dd class="col-10">${user_details.gender }</dd>
            <dt class="col-2">Mobile</dt>
            <dd class="col-10">${user_details.mobile }</dd>
            <dt class="col-2">Date of Birth</dt>
            <dd class="col-10">${user_details.dob}</dd>
            <dt class="col-2">Email</dt>
            <dd class="col-10">${user_details.email }</dd>
            <dd><button class="btn btn-warning" onclick="displayedit()" data-bs-target="#edit_user" data-bs-toggle="modal">Edit Profile</button></dd>
            
            
            
         </dl>
    </div>
    </div>
    </div>
    </div>
<div class="modal fade" id="edit_user" tabindex="-1" role="dialog" aria-labelledby="Edit_userDetails" aria-hidden="true">
    <div class="modal-dialog modal-fullscreen">
        <div class="modal-content">
            <div class="modal-header">
                <h3>Modify Account</h3>
                <button class="btn-close" data-bs-dismiss="modal" onclick="cancelclick()"></button>
            </div>
            <div class="modal-body">
                <form:form action="update_user" modelAttribute="modify">
                    <dl>
                      <dt>FullName</dt>
                        <dd><form:input path="fullname" class="form-control"></form:input></dd>
                        <dt>Email</dt>
                        <dd><form:input path="email" class="form-control" readonly="true"></form:input></dd>
                        <dt>Address</dt>
                        <dd><form:input path="address" class="form-control"></form:input></dd>
                        <dt>Gender</dt>
                        <dd><form:input path="gender" class="form-control"></form:input></dd>
                        <dt>Contact Number</dt>
                        <dd><form:input path="mobile" class="form-control"></form:input></dd>
                        <dt>Date of Birth</dt>
                        <dd><form:input path="dob" class="form-control"></form:input></dd> 
                    </dl>
                                <div class="modal-footer">
                        <button class="btn btn-success" type="submit" id="modalupdate">Update Profile</button>
                        <button class="btn btn-danger" type="reset" data-bs-dismiss="modal" onclick="cancelclick()">Cancel</button>
                    </div>
                    
                </form:form>
            </div>
        </div>
    </div>
</div>
<div class="cardflex">
<div class="row-1">
<div class="card" id="animate__animated_flip" style="width:175px; height:175px">
<div class="card-body">
<p class="animate__animated animate__bounce"><a href ="tickets"id="anchor">view my tickets</a></p>
</div>
</div>
<div><br><br> </div>
<div class="card"  id="animate__animated_flip"style="width:175px; height:175px">
<div class="card-body">
<p class="animate__animated animate__bounce"><a href="writequeries?email=${user_details.email}" id="anchor">Inquiry/Write Queries</a></p>
</div>

</div>
</div>
<div class="row-2" style="display:inline block">
<div class="card" id="animate__animated_flip" style="width:175px; height:175px">
<div class="card-body">
<p class="animate__animated animate__bounce"><a href="touristpage" id="anchor">Tourist Trains/Tour packages</a></p>
</div>

</div>
<div><br><br> </div>
<div class="card" id="animate__animated_flip" style="width:175px; height:175px">
<div class="card-body">
<p class="animate__animated animate__bounce"><a href ="holidays" id="anchor">Holidays</a></p>
</div>

</div>
</div>
</div>
</section>
<div>
  <p>Scroll back up to remove the sticky effect.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p><p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p><p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p><p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p><p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Some text to enable scrolling.. Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>

</div>
<footer>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>
<div>
</div>

</footer>

<div>
           <div class="wave"></div>
           <div class="wave"></div>
           <div class="wave"></div>
        </div>
    
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
 

</body>
</html>