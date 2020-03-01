<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Insert title here</title>
<style type="text/css">
	<%@ include file="bootstrap-4.4.1-dist/css/bootstrap.min.css"%>
</style>
</head>
<body>
<div class="container">
	<form action="" method="post">
	  <div class="form-group">
	    <label for="inputFirstName">First Name</label>
	    <input type="text" class="form-control" id="inputFirstName"  aria-describedby="emailHelp" name="first-name" placeholder="Enter First Name">	    
	  </div>
	   <div class="form-group">
	    <label for="inputlastName">Last Name</label>
	    <input type="text" class="form-control" id="inputlastName" aria-describedby="emailHelp" name="last-name" placeholder="Enter Last Name">	   
	  </div>
	   <div class="form-group">
	    <label for="inputMobileNo">Mobile No</label>
	    <input type="number" class="form-control" id="inputMobileNo" aria-describedby="emailHelp" name="mobile-no" placeholder="Mobile No">
	    <small id="emailHelp" class="form-text text-muted">Enter Mobile No in 10 digit format</small>
	  </div>
	  <div class="form-group">
	    <label for="inputEmailId">EmailId</label>
	    <input type="email" class="form-control" id="inputEmailId" name="email-id" placeholder="Enter email">
	    <small id="emailHelp" class="form-text text-muted">Enter email format as somename@example.com</small>
	  </div>	 
	  <button type="submit" class="btn btn-primary">Add Customer</button>
	</form>
	
</div>


<script type="text/javascript">
	<%@include file="jquery/jquery.min.js"%>
</script>
<script type="text/javascript">
	<%@include file="bootstrap-4.4.1-dist/js/bootstrap.min.js"%>
</script>
<script type="text/javascript">
	<%@include file="jquery/popper.min.js"%>
</script>
</body>
</html>