<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>







body{
	background-image:url("docs/homeimg/homepick.jpg");
	background-attachment: fixed;
    background-size: cover;
    font-family: Arial;
}

.line1{
	color:black;
	text-align:center;
}

.hr1{
  display: block;
  margin-top: 0.5em;
  margin-bottom: 0.5em;
  margin-left: auto;
  margin-right: auto;
  border-style: inset;
  border-width: 1px;
  border-color: #45a049;
}

.image{
	margin-left: 50px;
	border-radius: 10px;
}

.img1{
	margin-left: 100px;
	margin-top:30px;
	margin-bottom:15px;
	box-shadow: 10px 10px 5px grey;
}

.img2{
	margin-left: 100px;
	margin-top:25px;
	box-shadow: 10px 10px 5px grey;
}

.img3{
	margin-left: 100px;
	margin-top:50px;
	box-shadow: 10px 10px 5px grey;
}

.img4{
	border-radius: 100px;
	margin-left:50px; 
	margin-right:50px;
	margin-top:80px;
	margin-bottom:50px;
	position:center;
}

.hr2{
  display: block;
  margin-top: 0.5em;
  margin-bottom: 0.5em;
  margin-left: auto;
  margin-right: fixed;
  border-style: inset;
  border-width: 2px;
  border-color: #45a049;
}

.btn1{
  border: thick;
  background-color: #04AA6D;
  padding: 10px 30px;
  font-size: 20px;
  margin: 4px 2px;
  cursor: pointer;
  font-family: times new roman;
  position: relative;
  border-radius: 25px;
  bottom:0;
}

.btn2{
  border: thick;
  background-color: #04AA6D;
  padding: 10px 30px;
  font-size: 20px;
  margin: 4px 2px;
  cursor: pointer;
  font-family: times new roman;
  position: relative;
  border-radius: 25px;
}

* {
  box-sizing: border-box;
}

.box2 {
  float: left;
  width: 50%;
  padding: 10px;
  height: 575px; 
}

.box1:after {
  content: "";
  display: table;
  clear: both;
}

.dropbtn {
  background-color: #04AA6D;
  color: white;
  padding: 10px 30px;
  font-size: 16px;
  border: none;
  margin: 4px 2px;
  border-radius: 25px;
  align:left;
  bottom:0;
  margin-left:10px;
}

.dropdown {
  position: relative;
  display: inline-block;
  margin-bottom:6px;
  
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}

.container {
  padding : 16px;
  background-color:transparent;
  border-radius:32px;
  margin-right:40px;
  margin-left:20px;
  height:750px;

}

hr {
  border: 1px solid rgb(128, 128, 128);
  margin-bottom: 25px;
}

 input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0 22px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 8px;
  box-sizing: border-box;
}

/* Style the submit button */
input[type=submit] {
  width: 100%;
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

/* Add a background color to the submit button on mouse-over */
input[type=submit]:hover {
  background-color: #45a049;
}

.box3{
	background-color:#45a049;
    width: 100%;
    left: 0;
    color: black;
    text-align: center;
    padding: 0px;
	padding-bottom: 5px;
    text-align: bottom;
    opacity:3;
    content: "";
    display: table;
    clear: both;
    margin-top:90px;
}

.box4{
	float: left;
    width: 30%;
    padding: 10px;
    height: 250px; 
}

.column {
  float: left;
  padding: 10px;
  height: 975px;
}

.left {
  width: 40%;
}

.right {
  width:60%;
}

.row{
  border-radius:32px;
  margin-left:100px;
  margin-right:100px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

.row1 {
  display: -ms-flexbox; 
  display: flex;
  -ms-flex-wrap: wrap; 
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-50 {
  -ms-flex: 30%;
  flex: 30%;
  padding: 0 16px;
}

.btn {
  background-color: #04AA6D;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.mid{
	background-color:black;
	height:100px;
	color:white;
}

.mid:after{
	content: "";
    display: table;
    clear: both;
}

.mid1{
	padding:10px;
	width:50%;
	flex:0;
	display:inline;
	float: left;
}
 
.row2 {
  display: -ms-flexbox; 
  display: flex;
  -ms-flex-wrap: wrap; 
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-30 {
  -ms-flex: 50%;
  flex: 50%;
  padding: 0 16px;
}













</style>

</head>
<body>
<header> 
       <h4 style="font-family:Sofia;" class = "line1"><i>DocSKG</i></h4>
       <p style="text-align:center;">Channel your doctor</p>
       <hr class = "hr1"></hr>
         <img align="left" class="image" src="docs/homeimg/stethoscope.jpg" width="100px" height="100px">
            <div class="dropdown">
             <button class="dropbtn">Menu</button>
       <div class="dropdown-content">
           <a href="http://localhost:8090/online_channeling/Home.jsp">Home</a>
           <a href="#">Login</a>
           <a href="#">Sign Up</a>
           <a href="#">Search Doctor</a>
           <a href="http://localhost:8090/Patient_appo/Apoointment.jsp">Get Appointments</a>
           <a href="http://localhost:8090/online_channeling/Payment.jsp">Make Payment</a>
           <a href="http://localhost:8090/Patient_appo/about.jsp">About Us</a>
           <a href="http://localhost:8090/online_channeling/about.jsp">Our Service</a>
           <a href="#">Contact Us</a>
        </div>
           </div>
       <div align="right">
           <button name ="Login" class ="btn1">Login</button>
           <button name ="Signin" class ="btn2">Sign Up</button>
       </div>
       <hr class = "hr2"></hr>
    </header>
    
    <div class ="box1">
     <div class ="box2">
      <img class = "img1" src="docs/homeimg/doc.jpg" width="400px" height="150px">
      <img class = "img2" src="docs/homeimg/cover1.jpg" width="400px" height="150px">
      <img class = "img3" src="docs/homeimg/cover2.jpg" width="400px" height="200px">   
      </div>
    <div class="box2">
    <div class ="container">
    <h3 class = "line2">Search Hospital</h3><br>
    <hr>
    
    <form class = "form" action="hminsert" method ="post">
    <div class="row1">
              <div class="col-50">
                <label>User ID</label>
                <input type="text" name="id" placeholder="Your ID..">
                
              </div>
              <div class="col-50">
                <label>Full Name</label>
                <input type="text" id="fname" name="fname" placeholder="Your name.."><br><br>
              </div>
            </div>
   
    <label>Hospital</label>
    <select id="hospital" name="hospital">
    <option value="any">Any</option>
    <option value="city_medical">City Medical Service</option>
    <option value="lanka">Lanka Hospital</option>
    <option value="lady">Lady Ridgeway</option>
    <option value="people">Peoples Hospital</option>
    <option value="nawa">Nawaloka Hospital</option>
    <option value="sethma">Sethma Hospital</option>
    <option value="asiri">Asiri Hospital</option>
    </select><br><br>
    
    <label>Province</label>
    <select id="province" name="province">
    <option value="western">Western Province</option>
    <option value="Central">Central Province</option>
    <option value="north">North Central Province</option>
    <option value="northern">Northern Province</option>
    <option value="northw">North Western Province</option>
    <option value="sabara">Sabaragamuwa Province</option>
    <option value="uwa">Uwa Province</option>
    <option value="southern">Southern Province</option>
    <option value="eastern">Eastern Province</option>
    </select><br><br>
    
    <label>City</label>
    <select id="city" name="city">
    <option value="colombo">Colombo</option>
    <option value="ragama">Ragama</option>
    <option value="maharagama">Maharagama</option>
    <option value="gampaha">Gampaha</option>
    <option value="minu">Minuwangoda</option>
    </select><br><br>
    <hr>

   <input type="submit" value="Submit">
   <div class="row2">
     <div class="col-30">
        <a style="color:red; margin-left:70px;" href="http://localhost:8090/online_channeling/Validate.jsp">Update Details</a>
     </div>
     <div class="col-30">
        <a style="color:red; margin-left:80px;" href="http://localhost:8090/online_channeling/Validate.jsp">Delete Details</a>
     </div>
   </div>
   </div>
   </form>
    </div> 
    </div>
    
    <footer>
     <div class="box3">
     <div class="mid">
     <div style="align:left;" class="mid1">
     <h2>Need Help?</h2>
     </div>
     <div style="align:right;" class="mid1">
     <h2>info@docskg.com</h2>
     </div>
     </div>
      <div style="align:left; margin-left:25px;" class ="box4">
         <h4><b>FOLLOW DocSKG</b></h4>
         <ul>
         <a href="http://facebook.com">Facebook</a><br><br>
         <a href="http://twitter.com">Twitter</a><br><br>
         <a href="http://google.com">Google</a><br>
         </ul>
         <h4>Call 0112568965 for Agent Assistance</h4>
      </div>
      <div style="align:center;" class="box4">
       <h4><b>SERVICES</b></h4>
       <ul>
         <a href="http://localhost:8090/online_channeling/Home.jsp">Visit your hospital</a></br></br>
         <a href="http://localhost:8090/online_channeling/Apoointment.jsp">Channel your doctor</a></br></br>
         <a href="http://localhost:8090/online_channeling/Payment.jsp">Make payments online</a></br></br>
       </ul>
       </br>
       <p><i>Copyright © 2021 docskg.com. All Rights Reserved</i></p>
       </div>
       <div style="align:right; margin-right:25px;" class="box4">
       <h4><b>DocSKG</b></h4>
       <ul>
         <a href="http://localhost:8090/Patient_appo/about.jsp">About Us</a></br></br>
         <a href="#">Contact Us</a></br></br>
       </ul>
       </div>
       </div>
    </footer>
</body>
</html>