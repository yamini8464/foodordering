<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"
	import="java.util.List"
	import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SelectItems</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
	float: left;
	width: 50%;
	padding: 10px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
/* Style the buttons */
.btn {
	border: none;
	outline: none;
	padding: 12px 16px;
	background-color: #f1f1f1;
	cursor: pointer;
}

.btn:hover {
	background-color: #ddd;
}

.btn.active {
	background-color: #666;
	color: white;
}

#mstyle {
	height: 500px;
}

.container {
	display: block;
	position: relative;
	padding-left: 35px;
	margin-bottom: 12px;
	cursor: pointer;
	font-size: 22px;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

/* Hide the browser's default checkbox */
.container input {
	position: absolute;
	opacity: 0;
	cursor: pointer;
	height: 0;
	width: 0;
}

/* Create a custom checkbox */
.checkmark {
	position: absolute;
	top: 0;
	left: 0;
	height: 0px;
	width: 0px;
	background-color: #eee;
}

/* On mouse-over, add a grey background color */
.container:hover input ~ .checkmark {
	background-color: #ccc;
}

/* When the checkbox is checked, add a blue background */
.container input:checked ~ .checkmark {
	background-color: #2196F3;
}

/* Create the checkmark/indicator (hidden when not checked) */
.checkmark:after {
	content: "";
	position: absolute;
	display: none;
}

/* Show the checkmark when checked */
.container input:checked ~ .checkmark:after {
	display: block;
}

/* Style the checkmark/indicator */
.container .checkmark:after {
	left: 9px;
	top: 5px;
	width: 5px;
	height: 10px;
	horizontal-align: middle;
	border: solid white;
	border-width: 0 3px 3px 0;
	-webkit-transform: rotate(45deg);
	-ms-transform: rotate(45deg);
	transform: rotate(45deg);
}
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: middle;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<form action="DisplayQuantity?name=${restId},${custId}" method="post">
     <%
		int custId = (int)session.getAttribute("custId");
     	int restId = (int)session.getAttribute("restId");
     	%>
	<h2>Select items from the menu..</h2>
	<c:forEach var="items" items="${itemsData}">
		<div class="row">
			<div class="column" style="background-color:#FFC0CB; width: 100%;">
			<center><h2>${items.itemName}</h2></center>
				<center><img id=""
					src="images/${items.itemImage}"
					alt="Italian Trulli" style="height:200px;width:30%"> 
					<br>
					<h3><b><center>price : ${items.price}</center></b></h3>
					<h2><input type="checkbox" name="names" id="termsChkbx " value="${items.itemId}" onclick="change_button(this,'sub1')"/> <span class="checkmark"></span>
					<b>select</b></h2>
					</center>
			</div>
		</div>
	</c:forEach>
<center><button id="sub1" class="button" disabled="disabled"/>Place your order</button>
</body>
<script>
    function manage(txt) {
        var bt = document.getElementById('btSubmit');
        if (txt.value != '') {
            bt.disabled = false;
        }
        else {
            bt.disabled = true;
        }
    }   
</script>
<script type = "text/javascript">
var selected = new Array();
function change_button(checkbx,button_id) {
    var btn = document.getElementById(button_id);
    if (checkbx.checked == true) {
        btn.disabled = "";
        
        selected.push($(checkbx).val());
    } else {
        btn.disabled = "disabled";
    }
   return selected;
}
</script>
<script>
function subForm(){
	$('#desc').val($('#org_com').val());
	$('#addrid').val($("input[name='addr']:checked").val());
	$('#id').val(val[0]);
	$('#myModal').modal('show');
}
</script>
</html>




