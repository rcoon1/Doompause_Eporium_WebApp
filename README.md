<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <style>
    .container {  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-template-rows: 1fr;
  gap: 0px 0px;
  grid-auto-flow: row;
}

.Logo { grid-area: 1 / 1 / 2 / 2; }

.Assignment-members-and-details { grid-area: 1 / 3 / 2 / 4; }

    </style>
</head>
<body>
<div class="container">
  <div class="Logo">
    <img src="https://assets.codepen.io/10811741/Doompause_Emporium_Logo_Edit.png" alt="" />
  </div>
  <div class="Assignment-members-and-details" style="background-color:Tomato;">
    <strong>Software Functional Requirements Document 
For: Doompause Emporium Ecommerce Application
  Daniel Rumfelt, Ryan Coon, and Christa Moncrief 
Grand Canyon University: CST-326
09/17/2023

  </div>
</div>
</body>
</html>
