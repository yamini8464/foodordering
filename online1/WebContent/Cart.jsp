<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List"
    import="java.util.ArrayList"
    import=" com.ts.dto.Items"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
</head>


<style>
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
<form action="PaymentTotal" method="post">
<%List<Items> itemNames=(ArrayList<Items>)session.getAttribute("items");
%>
<div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:80%"><h4><b>Selected Items</b></h4></th>
							<th style="width:10%"><h4><b>Price</b></h4></th>
							<th style="width:8%"><h4><b>Quantity</b></h4></th>
							<th></th>
							
						</tr>
					</thead>
					<tbody>
					<c:forEach var="item" items="${items}">
						<tr>
							<td data-th="${item.itemName}">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="images/${item.itemImage}" alt="..." class="img-responsive" style="width:100%;height:100px"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">${item.itemName}</h4>
										</div>
								</div>	
							</td>
							<td data-th="Price">${item.price}</td>
							<td data-th="Quantity">
								<input type="text" class="form-control text-center" name ="quantity" value="1">
							</td>
							<td>
							</td>
						</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<!--  <td><a href="SelectItems.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>-->
							<td colspan="2" class="hidden-xs"></td>
							        
							  
							<td><input type="submit" value="submit"> <i class="fa fa-angle-right"></i></td>
						</tr>
					</tfoot>
				</table>
				</form>
</div>
 
</body>
</html>