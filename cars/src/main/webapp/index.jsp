<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Button Styling</title>
    <style >
    
    div{
             background-image:url("file:///D:/spring/cars/src/main/webapp/cr.jpg");
             height: 800px;
             background-size: cover;
             background-repeat: no-repeat;
             
        }
        button{
            border-radius: 35%;
             width: 100px;
             height: 100px;
             text-align: center;
             align-items: center;
             margin-top: 80px;
             margin-left: 150px;
             font-size: medium;
        }
        .save
        {
            background-color: #dd0c0c81;


        }
        .find
        {
            background-color: #82dd0c81;
        }
        .update
        {
            background-color: #370bfae7;
        }
        .delete{
            background-color: #e9006de8;
        }
        .c{
            border:  solid none;
            background-color: #1b3791da;
            margin-top: 120px;
            text-align: center;
        }
        button:hover{
            opacity:0.8;
        }
    
    
    </style>
      
   </head>
    <body>
    <div>
     ${msg}
    <a href="save"><button class="save">CREATE</button></a>
     <a href="find"><button class="find">FIND</button></a>
     <a href="update"><button class="update">UPDATE</button></a>
    <a href="delete"><button class="delete">DELETE</button></a>
    
     <h3 class="c"><marquee>WELCOME TO THE CAR WORLD !!!!!!</marquee></h3>
    </div>
   
    
    
    
    
    </body>
    
    </html>
    