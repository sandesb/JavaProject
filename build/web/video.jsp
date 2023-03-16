<%-- 
    Document   : video
    Created on : Mar 14, 2023, 8:48:21 AM
    Author     : home
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://vjs.zencdn.net/8.0.4/video-js.css" rel="stylesheet" />

    </head>
        
    <body>

        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/stream", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from movie WHERE movie_id=1");


                        while (rs.next()) {
        %>
        

  <video
    id="my-video"
    class="video-js"
    controls
    preload="auto"
    width="640"
    height="264"
    poster="<%=rs.getString(3)%> "
    data-setup="{}"
  >
    <source src="video/<%=rs.getString(4)%> " type="video/mp4" />
    <source src="MY_VIDEO.webm" type="video/webm" />
    <p class="vjs-no-js">
      To view this video please enable JavaScript, and consider upgrading to a
      web browser that
      <a href="https://videojs.com/html5-video-support/" target="_blank"
        >supports HTML5 video</a
      >
    </p>
    
    
  </video>
 <%
                            }
                            rs.close();
                            con.close();
                        %>
  <script src="https://vjs.zencdn.net/8.0.4/video.min.js"></script>
</body>
</html>
