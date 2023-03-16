<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.http.Cookie" %>


<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="initial-scale=1, width=device-width" />
    <link rel="stylesheet" href="nav.js">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!--    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>    
<!--<link rel="stylesheet" href="bootstrap/js/bootstrap.css">-->
    <link rel="stylesheet" href="css/global1.css" />
    <link rel="stylesheet" href="css/index.css" />
    <link rel="icon" href="img/icons/ico.ico"/>
    <style>
 
 .sticky {
  position: fixed;
  top: 0;
  width: 100%;
}

    #navbar {
      position: absolute;
      top:700px;
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      justify-content: space-between;
      padding-top: 0.5rem;
      padding-bottom: 0.5rem;
      z-index:6;
    }
     .rectangle-parent {
    position: absolute;
    top: 407px;
    left: 63px;
    width:600px;
    height: 67px;
    font-size: var(--font-size-sm);
    color: #13366c;
    box-shadow: 20px 4px 2px 0 rgba(0, 0, 0, 0.2), 10px 6px 2px 0 rgba(0, 0, 0, 0.19);

  }
  .login3 {
    border: 0;
    background-color: #13366c;
    top: 0px;
    left: 390px;
    border-radius: 12px;
    width: 132px;
    height: 67px;
    box-shadow: 20px 4px 2px 0 rgba(0, 0, 0, 0.2), 10px 6px 2px 0 rgba(0, 0, 0, 0.19);
    z-index: 3;
  }
  </style>
    <title>StreamHome</title>
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Jaldi:wght@400;700&display=swap"
    />

      <!-- Vendor CSS Files -->

  </head>
  <body>
    <div class="tv-1">
       
        <div class="bg"></div>
         <div class="logo">
                        <!-- <img src="up.png" style="width:150px; position: absolute; left:60px; top:50px;"> -->
                        <img src="img/up2.png" style="width:150px; position: absolute; left:60px; top:60px; ">
                        </div>
        <img class="original-1-icon" alt="" src="img/original.jfif" />
            
                        <div class="login">
                        <a href="register.jsp"> <div class="login1">LOG IN</div></a> 
                        </div>
     
           
                           
                            
        <b class="stream-all-your-container">
            <li><a> <%String email = request.getParameter("email");%>
                Welcome <%= email %>  </a></li>
            <p class="stream-all-your">Stream all your</p>
            <p class="stream-all-your">favorites and more.</p></b>
            
            <b class="enter-your-email-container">
                <p class="stream-all-your1">
                  <span>Enter your email address to set up </span> </p>
                    <p class="stream-all-your1"> 
                    <span>or restart your subscription</span></p>
                    </b>
            
                    <div class="rectangle-parent">
                        <form action="/Stream/LoginServ?page=fav" method="POST">
                            <input class="group-child" type="text" name="email" placeholder="Enter Your Email..."/>
                             <button class="login3" style="color:white; font-size: 20px;">Continue</button>

                        </form> 
                        
                                    
                      </div>
                     
                    
            
                       
                        <b class="save-15-get-container"
        ><p class="stream-all-your2">
          Save 15%: get 12 months for the price of 10 when you sign up for an
          annual Disney+ subscription, compared to paying monthly
        </p></b>
        

        <nav id="navbar" class="navbar-expand-lg navbar-light bg-sh">
          <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  
                  <a class="nav-link active" aria-current="page" href="#"><img style="margin-left: 20px; width: 60px;"src="img/up.png"></a>
                </li>              
               <p style="padding-left: 15px; padding-top: 20px; font-size: 20px;">Stream-Home</p>
               <li></li>
              </ul>
                
                <a href="login.jsp?id=<%
         Cookie cookie = null;
         Cookie[] cookies = null;
         
         // Get an array of Cookies associated with the this domain
         cookies = request.getCookies();
         
         if( cookies != null ) {
            
            for (int i = 0; i < cookies.length; i++) {
               cookie = cookies[i];
               if(cookie.getName().equalsIgnoreCase("favmovie")){
               out.print(cookie.getValue());}
            }
         } 
      %>"<button class="btn btn-outline-light" type="submit">Log In</button></a>
             
            </div>
          </div>
        </nav>

      <div class="card-1">        
        <div class="card-1-child"></div>
        <img class="card-1-item" alt="" src="img/roll.png" />
        <div class="entertainment-for-everyone-container">
          <p class="entertainment-for-everyone">Entertainment for everyone</p>
        </div>

        <div class="get-access-to-container">
          <ul class="get-access-to-hit-movies-new">
            <li class="get-access-to">
              Get access to hit movies, new originals and series. From recent
              hits to unforgettable classics, there's always something new to
              discover.
            </li>
          </ul>
        </div>
      </div>

      <div class="card-2">
        <div class="card-2-child"></div>
        <img class="card-2-item" alt="" src="img/cam.png" />
        <div class="entertainment-for-everyone-container1">
          <p class="entertainment-for-everyone">Entertainment for everyone</p>
        </div>
        <div class="get-access-to-container1">
          <ul class="get-access-to-hit-movies-new">
            <li class="get-access-to">
              Get access to hit movies, new originals and series. From recent
              hits to unforgettable classics, there's always something new to
              discover.
            </li>
          </ul>
        </div>
      </div>

      <div class="card-3">
        <div class="card-2-child"></div>
        <img class="card-3-item" alt="" src="img/act.svg" />
        <div class="entertainment-for-everyone-container1">
          <p class="entertainment-for-everyone">Entertainment for everyone</p>
        </div>
        <div class="get-access-to-container1">
          <ul class="get-access-to-hit-movies-new">
            <li class="get-access-to">
              Get access to hit movies, new originals and series. From recent
              hits to unforgettable classics, there's always something new to
              discover.
            </li>
          </ul>
        </div>
      </div>
      <div class="card-4">
        <div class="card-2-child"></div>
        <div class="entertainment-for-every-container">
          <p class="entertainment-for-every">Entertainment for every mood.</p>
          <p class="entertainment-for-every">All in one place.</p>
        </div>
        <div class="disney-brings-together-container">
          <ul class="get-access-to-hit-movies-new">
            <li class="get-access-to">
              Disney+ brings together the best stories from Disney, Pixar,
              Marvel, Star Wars, National Geographic and Star. Plus, you can
              stream your favourite films and series on up to 4 screens at once,
              so everyone's happy.
            </li>
          </ul>
        </div>
        <img class="vector-icon" alt="" src="img/4.png" />
      </div>
      <div class="card-11">
        <div class="card-1-inner"></div>
        <div class="apple-tv-chromecast-container">
          <p class="entertainment-for-everyone">Apple TV</p>
          <p class="entertainment-for-everyone">Chromecast</p>
          <p class="entertainment-for-everyone">Google TV and other Android</p>
          <p class="entertainment-for-everyone">TV OS</p>
          <p class="entertainment-for-everyone">LG TV</p>
          <p class="entertainment-for-everyone">Samsung</p>
          <p class="entertainment-for-everyone">Panasonic TV</p>
          <p class="entertainment-for-everyone">Hisense TV</p>
        </div>
        <b class="tv"
          ><p class="entertainment-for-everyone"><span>TV</span></p>
          <p class="blank-line"><span>&nbsp;</span></p></b
        ><img class="rectangle-icon" alt="" src="img/1.png" />
      </div>
      <div class="card-21">
        <div class="card-2-inner"></div>
        <div class="chrome-edge-firefox-container">
          <p class="entertainment-for-everyone">Chrome</p>
          <p class="entertainment-for-everyone">Edge</p>
          <p class="entertainment-for-everyone">Firefox</p>
          <p class="entertainment-for-everyone">Safari</p>
        </div>
        <b class="computer">
          Computer</b
        ><img class="card-2-child1" alt="" src="img/2.png" />
      </div>
      <div class="card-31">
        <div class="card-3-inner"></div>
        <div class="android-phones-and-container">
          <p class="entertainment-for-everyone">Android phones and tablets</p>
          <p class="entertainment-for-everyone">Apple iPhones,</p>
          <p class="entertainment-for-everyone">iPads and iPod Touch</p>
        </div>
        <b class="mobile-tablet-container"
          ><p class="mob">Mobile & Tablet</p></b
        ><img class="card-3-child1" alt="" src="img/3.png" />
      </div>
      <div class="available-on-your-container">
        <p class="entertainment-for-every">
          Available on your favorite devices
        </p>
      </div>
      <img src="img/up2.png" style="width:150px; position: absolute; left:570px; top:3680px; ">

      <b class="english"
        ><ul class="english1">
          English
        </ul></b
      ><b class="subscriber-agreement"
        ><ul class="english1">
          Subscriber </a
          >Agreement
        </ul></b
      ><b class="privacy-policy"
        ><ul class="english1">
          Privacy Policy
        </ul></b
      ><b class="help-centre"
        ><ul class="english1">
          Help Centre
        </ul></b
      ><b class="supported-devices"
        ><ul class="english1">
          Supported Devices
        </ul></b
      ><b class="about-us"
        ><ul class="english1">
          About Us
        </ul></b
      ><b class="faqs"
        ><ul class="english1">
          FAQs
        </ul></b
      ><b class="content-on-streamheim-container"
        ><p class="entertainment-for-everyone">
          Content on StreamHeim is subject to availability.
        </p>
        <p class="hisense-tv">
          © 2023 StreamHeim and its related entities. All Rights Reserved.
        </p></b
      >
      <div class="frequently-asked-questions">Frequently Asked Questions</div>
      <div class="drop1">
        <div class="drop1-child"></div>
        <div class="what-is-streamheim">What is StreamHeim?</div>
        
      </div>
      <div class="drop11">
        <div class="drop1-child"></div>
        <div class="what-is-streamheim">What can I watch on StreamHeim?</div>
        
      </div>
      <div class="drop12">
        <div class="drop1-child"></div>
        <label class="how-much-does">How much does StreamHeim cost?</label
        >
      </div>
      <div class="drop13">
        <div class="drop1-child"></div>
        <div class="what-is-streamheim">Where can I watch StreamHeim?</div>
      
      </div>
    </div>
    <script>
      window.onscroll = function () { myFunction() };
      var navbar = document.getElementById("navbar");
      var sticky = navbar.offsetTop;
      function myFunction() {
       
        if (window.pageYOffset >= sticky) {
          navbar.style.position = "fixed"
          navbar.style.top = 0
          navbar.style.width = 100 + "%"
        } else {
          navbar.style.position = "relative"
          navbar.style.top = 680 + "px"

          
        }
      }
    </script>
    
  </body>
</html>
