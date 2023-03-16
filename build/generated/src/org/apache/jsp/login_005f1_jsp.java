package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, width=device-width\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/global1.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\" />\n");
      out.write("    <link rel=\"icon\" href=\"img/icons/ico.ico\"/>\n");
      out.write("    <title>StreamHome</title>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Jaldi:wght@400;700&display=swap\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("      <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\" vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\" vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\" vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\" vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"tv-1\">\n");
      out.write("      \n");
      out.write("        <div class=\"bg\"></div>\n");
      out.write("        \n");
      out.write("        <img class=\"original-1-icon\" alt=\"\" src=\"img/original.jfif\" />\n");
      out.write("        <div class=\"glassmorphism1\"s></div>\n");
      out.write("        <div class=\"welcome-to-screenhome1\">Edit Profile<a style=\"color: inherit;\"href=\"index.html\">\n");
      out.write("      <div class=\"dont-have-an-container1\">\n");
      out.write("        <p class=\"dont-have-an-account-yet1\">Don?t have an account yet?</p>\n");
      out.write("        <p class=\"get-your-subscription2\">\n");
      out.write("          <span class=\"get-your-subscription3\">Get Your Subscription</span>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("        <form action=\"LoginServ?page=existing\" method=\"POST\">\n");
      out.write("      <div class=\"E\">Email-ID :</div>\n");
      out.write("      <div class=\"P\">Password :</div>\n");
      out.write("      \n");
      out.write("      <input class=\"input-box-email1\" type=\"text\" placeholder=\"Enter Your Email\" />\n");
      out.write("      <input\n");
      out.write("        class=\"input-box-password1\"\n");
      out.write("        placeholder=\"Enter Your Password\"\n");
      out.write("        type=\"password\"\n");
      out.write("      />\n");
      out.write("      <div class=\"frame-item\"></div>\n");
      out.write("    </div>\n");
      out.write("    <button class=\"button-login1\">\n");
      out.write("      <button class=\"login-label1\"></button><b class=\"log-in1\">Log In</b>\n");
      out.write("    </button>\n");
      out.write("  </button>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
