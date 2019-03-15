<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <div class="jumbotron">
   <div class = "page-header"><h2>WELCOME</h2></div>
 <div class="row">
 <div class="col-sm-6" style="background-color:lavender;">

<iframe width="400" height="300" src="https://www.youtube.com/embed/SQgRN5tu1f4" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
</iframe></div>

 <div class="col-sm-6" style="background-color:lavender;"><h3><b> Movie:TEMPER</b></h3>
 <h5><b><p class="text-primary">DERECTOR:</b></p></h5>Puri Jagannadh
 <h5><b><p class="text-primary">HERO:</b></p></h5>NTR
<h5><b> <p class="text-primary">HEROINE:</b></p></h5>Kajal Aggarwal
 <h5><b> <p class="text-primary">MUSIC:</b></p></h5> Anoop 
 </div>
 </div>
  </div>
  </div>
  </div></div>
   <h2>Rating</h2>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

				<span class="fa fa-star checked"></span>
				<span class="fa fa-star checked"></span> 
				<span class="fa fa-star checked"></span>
				<span class="fa fa-star"></span>
			    <span class="fa fa-star"></span><br>
			   <!--   <h3>Comments :</h3>
			    <textarea rows="4" cols="50" name="comment"></textarea>  -->
			    
			    <label for="comment" class="required"><h3>Write  Comment Here</h3></label>
 
  <input type="text"  data-toggle="modal" data-target="#myModal"></input> 
  
 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
           <div class="form-group">
  <p>Please Login First</p>
<form action="Servlet" method="post">
    <label for="email" class="required">Email address:</label>
    <input type="email" class="form-control"  placeholder="Enter your mail here" name="email"  class="required">
    
   <label for="pwd" class="required">Password:</label>
    <input type="password" class="form-control"  placeholder="Enter your password here"  name="password"  class="required">
    <input type ="submit" value="submit">
    </form>
        </div>
      </div>
  
 
 
</body>

</html>
    