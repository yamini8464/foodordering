<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.ArrayList,com.ts.dto.Restaurant"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
	content: "";
	clear: both;
	display: table;
}
ul {
  white-space: nowrap;
}

ul, li {
  list-style: none;
  display: inline;
}</style>

</head>
<body style="background-color:#FFC0CB">

	<h1 style="color: green">Select your restaurant..</h1>

	  
		<c:forEach var="restaurant" items="${restData}">
		<center>
			<img src="images/${restaurant.restImage}" alt="Grotto" style="width:25%"
				style="height:25%">
			<h2>
				<a href='SelectItems?id=${restaurant.restId}'><center>${restaurant.restName}</center></a></h2>
	     </center>
		</c:forEach>
		
     
</body>
</html>