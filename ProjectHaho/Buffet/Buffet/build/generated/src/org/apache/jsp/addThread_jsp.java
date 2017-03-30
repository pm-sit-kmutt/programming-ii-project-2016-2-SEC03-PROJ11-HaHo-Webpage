package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;

public final class addThread_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Thread</title>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"li\").hover(function () {\n");
      out.write("                    var itemwidth = $(this).width();\n");
      out.write("                    $(this).prepend(\"<div class='hover'></div>\");\n");
      out.write("                    $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth});\n");
      out.write("                    $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("                }, function () {\n");
      out.write("\n");
      out.write("                    $(this).find(\"div\").slideUp('1000').fadeOut('1000');\n");
      out.write("                    $(this).find(\"div\").remove();\n");
      out.write("                    $(this).find(\"ul\").fadeOut('1000');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("         <script src=\"ckeditor/ckeditor.js\"></script>\n");
      out.write("         \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styleAddThread.css\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default2\">   \n");
      out.write("            <div class=\"navbar-header\" id=\"nav02\">\n");
      out.write("                <ul>\n");
      out.write("                    <div class=\"hover\" style=\"display:block; width:120px;\"></div>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"http://localhost:8080/Buffet/index.jsp\" class=\"dropdown-toggle\" \n");
      out.write("                           data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">H O M E </span></a> </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Promotion</a>\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                            <a href=\"#\">Food</a>\n");
      out.write("                            <a href=\"#\">Drink</a>\n");
      out.write("                            <a href=\"#\">Desert</a>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Food</a></li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Drink</a>    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Menu5 </a></li>\n");
      out.write("\n");
      out.write("                    <li></li>\n");
      out.write("                    <li class=\"login\"><a class=\"addthread\" href=\"#\" >Add Thread</a></li>\n");
      out.write("                    <li class=\"login\"><a class=\"edit\" href=\"#\" >Edit Profile</a></li>\n");
      out.write("                    <li class=\"login\"><a class=\"logout\" href=\"logout\" >Log out</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!--########################################################################-->\n");
      out.write("\n");
      out.write("        <div class=\"topic\">\n");
      out.write("            <h1>Add New Post\n");
      out.write("                <a href=\"http://localhost:8080/Buffet/addThread.jsp\" class=\"addnew-topic\">Add New</a> </h1>\n");
      out.write("            <div class=\"phase-text01\">\n");
      out.write("                \"Photograph\" is track #7 on the album X. It was written by Sheeran, Ed / Mcdaid, Johnny.\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"poststuff\">\n");
      out.write("                <form method=\"post\" action=\"testPost\" enctype=\"MULTIPART/FORM-DATA\" accept-charset=\"UTF-8\">\n");
      out.write("                    <div id=\"body-content\">\n");
      out.write("                        <h3>TOPIC</h3>\n");
      out.write("                        <input type=\"text\" placeholder=\"Name Topic\" name = \"header\"/><br>\n");
      out.write("\n");
      out.write("                        <h3 >Content</h3>\n");
      out.write("                        <button> <i class=\"fa fa-map-marker\"> Add Location </i></button>\n");
      out.write("                        <button> <i class=\"fa fa-bar-chart \">  Add Poll </i></button>\n");
      out.write("                        <button> <i class=\"fa fa-youtube-play\"> Add Video </i></button>\n");
      out.write("                        <input type=\"file\" name=\"imagepath\"  />\n");
      out.write("                        <br><br>\n");
      out.write("                        <textarea name=\"body\" id=\"editor1\" rows=\"15\" cols=\"40\">\n");
      out.write("              \n");
      out.write("                        </textarea>\n");
      out.write("                        <script>\n");
      out.write("            // Replace the <textarea id=\"editor1\"> with a CKEditor\n");
      out.write("            // instance, using default configuration.\n");
      out.write("            CKEDITOR.replace('body');\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"cate-content\">\n");
      out.write("                        <h3>Category</h3>\n");
      out.write("                        <div class=\"selected\">\n");
      out.write("                            <select name = \"tags\">\n");
      out.write("                                <option value=\"n\">--Select--</option>\n");
      out.write("                                <option value=\"food\">Food</option>\n");
      out.write("                                <option value=\"drink\">Drink</option>\n");
      out.write("                                <option value=\"desert\">Desert</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"posted\">\n");
      out.write("                        <input type=\"submit\" value=\"CREATE NEW TOPIC\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <br> <br> <br>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                        <i class=\"fa fa-facebook fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a> &emsp; &emsp;\n");
      out.write("\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                        <i class=\"fa fa-twitter fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a> &emsp; &emsp;\n");
      out.write("\n");
      out.write("                <a href=\"#\"><span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                        <i class=\"fa fa-instagram fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span></a><br>\n");
      out.write("\n");
      out.write("                <p style=\"color:white\">\n");
      out.write("                    <br>\n");
      out.write("                    © SIT KMUTT 2015 | Designed by group05 </p>\n");
      out.write("                \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
