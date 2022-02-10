<%-- 
    Document   : sidebar
    Created on : Feb 6, 2022, 2:21:16 PM
    Author     : Fahmi ZB 
--%>

<!--INCLUDE IN EACH JSP FILE-->
<head>
    <link rel="stylesheet" href="css/Dashboard2.css" />
</head>
 <div id="myDIV" class="sidebar">
  <a class="btns" href="CourseServletController?action=view">Courses</a>
  <a class="btns" href="Lecturer_ViewAssignment.jsp">Assignment</a>
  <a class="btns" href="CourseStud?action=studentlist">Student List</a>
  <a class="btns" href="ManageCourseGrade.jsp">Manage Grade</a>
  <a class="btns" href="logout.jsp">Logout</a>
</div>

<script>
    // Add active class to the current button (highlight it)
    var header = document.getElementById("myDIV");
    var btns = header.getElementsByClassName("btns");
    for (var i = 0; i < btns.length; i++) {
      btns[i].addEventListener("click", function() {
      var current = document.getElementsByClassName("active");
      current[0].className = current[0].className.replace(" active", "");
      this.className += " active";
      });
    }
</script>