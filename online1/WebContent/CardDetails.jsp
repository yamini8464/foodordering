<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Credit Card Validation Demo</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/styles.css">
<link rel="stylesheet" type="text/css" href="assets/css/demo.css">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="assets/js/jquery.payform.min.js" charset="utf-8"></script>
<script src="assets/js/script.js"></script>
</head>
<style>
.creditCardForm {
	max-width: 700px;
	background-color: #fff;
	margin: 100px auto;
	overflow: hidden;
	padding: 25px;
	color: #4c4e56;
}

.creditCardForm label {
	width: 100%;
	margin-bottom: 10px;
}

.creditCardForm .heading h1 {
	text-align: center;
	font-family: 'Open Sans', sans-serif;
	color: #4c4e56;
}

.creditCardForm .payment {
	float: left;
	font-size: 18px;
	padding: 10px 25px;
	margin-top: 20px;
	position: relative;
}

.creditCardForm .payment .form-group {
	float: left;
	margin-bottom: 15px;
}

.creditCardForm .payment .form-control {
	line-height: 40px;
	height: auto;
	padding: 0 16px;
}

.creditCardForm .owner {
	width: 63%;
	margin-right: 10px;
}

.creditCardForm .CVV {
	width: 35%;
}

.creditCardForm #card-number-field {
	width: 100%;
}

.creditCardForm #expiration-date {
	width: 49%;
}

.creditCardForm #credit_cards {
	width: 50%;
	margin-top: 25px;
	text-align: right;
}

.creditCardForm #pay-now {
	width: 100%;
	margin-top: 25px;
}

.creditCardForm .payment .btn {
	width: 100%;
	margin-top: 3px;
	font-size: 24px;
	background-color: #2ec4a5;
	color: white;
}

.creditCardForm .payment select {
	padding: 10px;
	margin-right: 15px;
}

.transparent {
	opacity: 0.2;
}

@media ( max-width : 650px) {
	.creditCardForm .owner, .creditCardForm .CVV, .creditCardForm #expiration-date,
		.creditCardForm #credit_cards {
		width: 100%;
	}
	.creditCardForm #credit_cards {
		text-align: left;
	}
}
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>


<body>
	<% int total=(Integer)session.getAttribute("tot"); %>
	<h1>
		total is:<%=total%></h1>


	<div class="creditCardForm">
		<div class="heading">
			<h1>Confirm Your Order</h1>
		</div>
		<div class="payment">

			<div class="form-group owner">
				<label for="owner">Card Holder Name</label> <input type="text"
					class="form-control" id="owner">
			</div>
			<div class="form-group CVV">
				<label for="cvv">CVV</label> <input type="text" class="form-control"
					id="cvv">
			</div>
			<div class="form-group" id="card-number-field">
				<label for="cardNumber">Card Number</label> <input type="text"
					class="form-control" id="cardNumber">
			</div>
			<div class="form-group" id="expiration-date">
				<label>Expiration Date</label> <select>
					<option value="01">January</option>
					<option value="02">February</option>
					<option value="03">March</option>
					<option value="04">April</option>
					<option value="05">May</option>
					<option value="06">June</option>
					<option value="07">July</option>
					<option value="08">August</option>
					<option value="09">September</option>
					<option value="10">October</option>
					<option value="11">November</option>
					<option value="12">December</option>
				</select> <select>
					<option value="16">2016</option>
					<option value="17">2017</option>
					<option value="18">2018</option>
					<option value="19">2019</option>
					<option value="20">2020</option>
					<option value="21">2021</option>
				</select>
			</div>
		<!--  	<button type="submit" class="btn btn-default" id="sub1">Confirm</button>-->
		

  
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Confrim</button>
</div>
	</div>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
         
        <!--   <h4 class="modal-title">Modal Header</h4>  -->
        <h3><center><b>Choose Delivery Address</b></center></h3>
         <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body">
        <div>
          Your Door.No:<input type="text" value="${dno}">
          </div>
          <br>
          Your Street:<input type="text" value="${street}">
        </div>
        <div class="modal-footer">
        
        <a href="ThankYou.jsp" class="button">OK</a>
		<!--  <button class="button">Button</button>
		<input type="button" class="button" value="Input Button">
        
        
        
        <form action="ThankYou.jsp" method="post">
          <center><input type="submit" value="OK"></center>-->
        </form>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</body>
</html>
