<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.ts.dto.Customer" session ="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <%
		Customer customer = (Customer)session.getAttribute("customerData");
	   %>
 <div class="well">
    <ul class="nav nav-tabs">
      <li class="active">Profile</a></li>
    </ul>
    <form id="home" action="UpdateServlet" method="post">
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
            <label>CustId</label>
            <input type="text" value="${customerData.custId}" name = "custId" readonly="true"  class="input-xlarge" >
            <label>Name</label>
            <input type="text" value="${customerData.custName}" name = "name" class="input-xlarge" >
            <label>UserId</label>
            <input type="text" value="${customerData.userId}" name = "userId" class="input-xlarge">
            <label>Phone Number</label>
            <input type="text" value="${customerData.phno}"  name = "phno" class="input-xlarge">
            <label>Door NO</label>
            <input type="text" value="${customerData.dno}" name = "dno" class="input-xlarge">
            <label>Street</label>
            <input type="text" value="${customerData.street}" name = "street" class="input-xlarge">
            <label>password</label>
            <input type="text" value="${customerData.password}"  name = "password" class="input-xlarge">
            <div>
        	    <button class="btn btn-primary">Update</button>
        	    
        	</div>
      </div>
      </div>
      </form>
      </div>
      
</body>
</html>