package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("        \n");
      out.write("        <!----meta---->\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!----CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle2.css\">\n");
      out.write("        <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                font-family: Century Gothic;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!--script--->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"li\").hover(function () {\n");
      out.write("                    var itemwidth = $(this).width(); /* Getting the LI width */\n");
      out.write("                    $(this).prepend(\"<div class='hover'></div>\"); /* Inserting a blank div into within li above the <a> tag*/\n");
      out.write("                    $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/\n");
      out.write("                    $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("                }, function () {\n");
      out.write("\n");
      out.write("                    $(this).find(\"div\").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */\n");
      out.write("                    $(this).find(\"div\").remove();/* removing the <div> code from html at every mouseout event*/\n");
      out.write("                    $(this).find(\"ul\").fadeOut('1000'); /* fading out the sub menu */\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(document).scroll(function (e) {\n");
      out.write("                var scrollTop = $(document).scrollTop();\n");
      out.write("                if (scrollTop > 200) {\n");
      out.write("                    console.log(scrollTop);\n");
      out.write("                    $('.navbar-default2').removeClass('navbar-static-top').addClass('navbar-fixed-top');\n");
      out.write("                } else {\n");
      out.write("                    $('.navbar-default2').removeClass('navbar-fixed-top').addClass('navbar-static-top');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center><a href=\"http://localhost:8080/Buffet/index.jsp\"> <img src=\"images/12-1.jpg\" alt=\"head\"></a></center> \n");
      out.write("        \n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/include/pageHeader.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!----##########################################################################################--->\n");
      out.write("            <div class=\"col-md-8 top-heading\">     \n");
      out.write("                <h1>--cat_name}</h1><br>  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!----##########################################################################################--->               \n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("           <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food_array}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"food\">\n");
      out.write("            <div class=\"col-md-4 top-post\">\n");
      out.write("                <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"http://localhost:8080/Buffet/showThread?threadId=1\"><img class=\"img-responsive\" src=\"images/pi5.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"http://localhost:8080/Buffet/showThread?threadId=1\">ชื่อเรื่อง</a></h4><p>\n");
      out.write("                            รายละเอียด\n");
      out.write("                        </p>\n");
      out.write("                        <span>08 October.2014</span>\n");
      out.write("                        <a href=\"http://localhost:8080/Buffet/showThread?threadId=1\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div><!---book--->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div><!--top book-->    \n");
      out.write("               </c:forEach>\n");
      out.write("                \n");
      out.write("       \n");
      out.write("       <div class=\"footer\">\n");
      out.write("        <hr>\n");
      out.write("\t<center>\n");
      out.write("        <p style=\"color:white\">© SIT KMUTT 2015 | Designed by Project X </p>\n");
      out.write("        <a href=\"#\">About Us</a> &emsp; &emsp;\n");
      out.write("        <a href=\"#\">Contact Us</a> &emsp; &emsp;\n");
      out.write("        <a href=\"#\">Privacy Policy</a> &emsp; &emsp;\n");
      out.write("        <a href=\"#\">Terms & Condition</a>\n");
      out.write("    </center>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </body>\n");
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
