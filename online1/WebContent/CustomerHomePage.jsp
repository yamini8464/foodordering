<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Amatic+SC">
<style>
body, html {height: 100%}
body,h1,h2,h3,h4,h5,h6 {font-family: "Amatic SC", sans-serif}
.menu {display: none}
.bgimg {
background-repeat: no-repeat;
  background-size: cover;
  
  background-image:url("http://planmyhealth.in/Healthyblog/wp-content/uploads/2017/02/o-FAMILY-DINNER-facebook.jpg");
  min-height: 90%;
}
</style>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.topnav-right {
  float: right;
}

#mystyle{
background-color:teal;
}

</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

  <%
	String user = (String)session.getAttribute("user");
  %>
  
<body> 


<!-- Navbar (sit on top) -->
<div class="w3-top w3-hide-small">
<div class="topnav">
  <a href="Home.html">Home</a>
  <a href="#about">About Us</a>
  <a href="#contact">Contact Us</a>
  <div class="topnav-right">
    <a href="DisplayCustomerServlet">Display Profile</a>
    <a href="DisplayAllRestaurants">restaurants</a>
    <a href="Home.html">Log out</a>
  </div>
</div>
</div>

<!-- 
<div class="w3-top w3-hide-small">
  <div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off" id="myNavbar">
    <a href="#" class="w3-bar-item w3-button">HOME</a>
    <a href="#menu" class="w3-bar-item w3-button">MENU</a>
    <a href="#about" class="w3-bar-item w3-button">ABOUT</a>
    <a href="#contact" class="w3-bar-item w3-button">CONTACT</a>
  </div>
</div> -->
  
<!-- Header with image -->
<header class="bgimg w3-display-container" id="home">
  <div class="w3-display-bottomleft w3-padding">
    <span class="w3-tag w3-xlarge">Open from 8am to 9pm</span>
  </div>
  <div class="w3-display-middle w3-center"><br>
       <span class="w3-text-white w3-hide-small" style="font-size:50px;color:black";><b><br><br><br><br>Make your beloved happy...By ordering food online..</b></span> 
     <span class="w3-text-white w3-hide-large w3-hide-medium" style="font-size:60px"><b><br>Order food anytime..anywhere..</b></span>
    
  </div>
</header>

<!-- About Container -->
<div class="w3-container w3-padding-64 w3-hotpink  w3-xlarge" id="about">

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
body {
  background-color: #FFC0CB;
}
</style>
<center>
	<h1 style="color:#28B463;">About Us</h1>
	
	<img src="https://www.foodiesonline.co.uk/public/upload/1549522899-online-ordering-system-uk.jpg" width = "50%" alt="" >
	</center><br>
	<p>Since years we are taking the responsibility of providing our customers with fast and quality food delivery.We also provide offers during festivals and other auspicious events.We catch at your homes anytime or anywhere.Order food online and win the love of your family and friends.</p>
	<center><h2><b>Happy Eating..</b></h2></center>

<!-- Contact --><center>
<div class="w3-container w3-padding-64  w3-xlarge" id="contact">
  <div class="w3-content">
<h1 style="color:#28B463;">Contact Us</h1>
<div>
 <img src="https://ak0.picdn.net/shutterstock/videos/14346760/thumb/1.jpg" width = "50%" alt=""></div>
<h2>Email Id:onlinefood@gmail.com</h2>
<h2>Phone Number:9656123567</h2>
<h2>Office Address:</h2>
<h3>D.no:1-12/23,</h3>
<h3>park street,</h3>
<h3>Bhimavaram.</h3>
</center>
</div>
<script>
// Tabbed Menu
function openMenu(evt, menuName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("menu");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
     tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
  }
  document.getElementById(menuName).style.display = "block";
  evt.currentTarget.firstElementChild.className += " w3-red";
}
document.getElementById("myLink").click();
</script>
</body>
</html>
