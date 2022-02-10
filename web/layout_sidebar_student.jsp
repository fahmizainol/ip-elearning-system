<%-- 
    Document   : layout_sidebar_student
    Created on : Feb 9, 2022, 10:19:08 PM
    Author     : muham
--%>

<head>
    <link rel="stylesheet" href="css/navbarStud.css" />
</head>
<!-- <div id="myDIV" class="sidebar">
  <a class="btns active" href="Student_Home.jsp">Courses</a>
  <a class="btns" href="Student_ViewAssignment.jsp">Assignment</a>
  <a class="btns" href="Student_RegisterCourse.jsp">Register Course</a>
  <a class="btns" href="">Course Grade</a>
  <a class="btns" href="logout.jsp">Logout</a>
</div>-->
<style>
    p{
        font-size:large;
    }
</style>

 <div id="myDIV" class="sidebar">
  <a class="btns" href="CourseStud?action=homepage">Courses</a>
  <a class="btns" href="Student_ViewAssignment.jsp">Assignment</a>
    <a class="btns" href="CourseStud?action=view">Register Course</a>
  <a class="btns" href="ViewCourseGrade.jsp">Course Grade</a>
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
