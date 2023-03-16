<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="initial-scale=1, width=device-width" />
    <link rel="stylesheet" href="nav.js">
<!--    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/js/bootstrap.css">-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
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
      top:0px;
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      justify-content: space-between;
      padding-top: 0.5rem;
      padding-bottom: 0.5rem;
      z-index:6;
    }

    .gradient-custom-3 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5))
}
.gradient-custom-4 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1))
}
.tv-2 {
    position: relative;
    background-color: var(--color-gray);
    width: 100%;
    overflow: hidden;
    text-align: left;
    font-size: var(--font-inherit);
    color: var(--color-white);
    font-family: var(--font-jaldi);
  }
  </style>
    <title>Streamly</title>
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Jaldi:wght@400;700&display=swap"
    />

      <!-- Vendor CSS Files -->

  </head>
  <body>
    <div class="tv-2">
      
       
        
        <section >
            <div class="row d-flex justify-content-center align-items-center h-100">
              <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                  <div class="card-body p-5">
                             
                    <h2 class="text-uppercase text-center mb-5">Create an account</h2>
      
                    <form action="/Stream/LoginServ?page=signUp" method="POST">
      
                      <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1cg">Your Name</label>

                        <input type="text" id="form3Example1cg" name="fullname" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline mb-4">
                        <label class="form-label"  for="form3Example3cg">Your Email</label>

                        <input type="email"  name="email" value="<%
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
         } else {
            out.println("<h2>No cookies founds</h2>");
         }
      %>" id="form3Example3cg" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example4cg">Password</label>

                        <input type="password" name="password" name="password" id="form3Example4cg" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example4cdg">Repeat your password</label>

                        <input type="password" id="form3Example4cdg" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-check d-flex justify-content-center mb-5">
                        <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3cg" />
                        <label class="form-check-label" for="form2Example3g">
                          I agree all statements in <a href="#!" class="text-body"><u style="color: white;">Terms of service</u></a>
                        </label>
                      </div>
      
                      <div class="d-flex justify-content-center">
                        <button type="submit" 
                          class="btn btn-block btn-lg btn-outline-light " >Register</button>
                      </div>
      </form>
                      <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="#!"
                          class="fw-bold text-body" ><u style="color: white;">Login here</u></a></p>
      
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </section>
        

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
               <p style="padding-left: 15px; padding-top: 20px; font-size: 20px; color: white;">Stream-Home</p>
               <li></li>
              </ul>
             
            </div>
          </div>
        </nav>

      </div>
    </div>
  
  </body>
</html>
