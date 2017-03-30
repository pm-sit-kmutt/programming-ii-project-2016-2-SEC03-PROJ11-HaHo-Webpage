package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.Comment;
import Model.Tread;

public final class showTread_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");

        Tread t = (Tread) request.getAttribute("tread");
        List<Comment> comments = (List) request.getAttribute("comments");
        int id = 0;
        if (t != null) {
            id = t.getThreadId();
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(t.getHeader());
      out.write("</title>\n");
      out.write("\n");
      out.write("        <!--tiny MCE-->\n");
      out.write("\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"tinymce/jscripts/tiny_mce/tiny_mce.js\"></script>\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            tinyMCE.init({\n");
      out.write("                // General options\n");
      out.write("                mode: \"textareas\",\n");
      out.write("                theme: \"advanced\",\n");
      out.write("                plugins: \"autolink,lists,spellchecker,pagebreak,style,layer,table,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template\",\n");
      out.write("                // Theme options\n");
      out.write("                theme_advanced_buttons1: \"save,newdocument,|,bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,|,styleselect,formatselect,fontselect,fontsizeselect\",\n");
      out.write("                theme_advanced_buttons2: \"cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,anchor,image,cleanup,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor\",\n");
      out.write("                theme_advanced_buttons3: \"\",\n");
      out.write("                theme_advanced_buttons4: \"insertlayer,moveforward,movebackward,absolute,|,styleprops,spellchecker,|,cite,abbr,acronym,del,ins,attribs,|,visualchars,nonbreaking,template,blockquote,pagebreak,|,insertfile,insertimage\",\n");
      out.write("                theme_advanced_toolbar_location: \"top\",\n");
      out.write("                theme_advanced_toolbar_align: \"left\",\n");
      out.write("                theme_advanced_statusbar_location: \"bottom\",\n");
      out.write("                theme_advanced_resizing: true,\n");
      out.write("                extended_valid_elements: \"a[name | href | target | title | onclick] img[class | src | border = 0 | alt | title | hspace | vspace | width | height | align | onmouseover | onmouseout | name] hr[class | width | size | noshade], font[face | size | color | style], span[class | align | style]\",\n");
      out.write("                // Skin options\n");
      out.write("                skin: \"o2k7\",\n");
      out.write("                skin_variant: \"silver\",\n");
      out.write("                // Example content CSS (should be your site CSS)\n");
      out.write("                content_css: \"css/example.css\",\n");
      out.write("                // Drop lists for link/image/media/template dialogs\n");
      out.write("                template_external_list_url: \"js/template_list.js\",\n");
      out.write("                external_link_list_url: \"js/link_list.js\",\n");
      out.write("                external_image_list_url: \"js/image_list.js\",\n");
      out.write("                media_external_list_url: \"js/media_list.js\",\n");
      out.write("                // Replace values for the template plugin\n");
      out.write("                template_replace_values: {\n");
      out.write("                    username: \"Some User\",\n");
      out.write("                    staffid: \"991234\"\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!----meta---->\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("\n");
      out.write("        <!----CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle2.css\">\n");
      out.write("        <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/tinymce.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--script--->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"li\").hover(function () {\n");
      out.write("                var itemwidth = $(this).width(); /* Getting the LI width */\n");
      out.write("                $(this).prepend(\"<div class='hover'></div>\"); /* Inserting a blank div into within li above the <a> tag*/\n");
      out.write("                $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/\n");
      out.write("                $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("            }, function () {\n");
      out.write("\n");
      out.write("                $(this).find(\"div\").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */\n");
      out.write("                $(this).find(\"div\").remove();/* removing the <div> code from html at every mouseout event*/\n");
      out.write("                $(this).find(\"ul\").fadeOut('1000'); /* fading out the sub menu */\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center><a href=\"http://localhost:8080/Buffet/index.jsp\"> <img src=\"images/12-1.jpg\" alt=\"head\"></a></center> \n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/include/pageHeader.jsp", out, false);
      out.write(" \n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"blog-header\">\n");
      out.write("            <h2>");
      out.print(t.getHeader());
      out.write("</h2>\n");
      out.write("            <div class=\"stripe-line\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"nav-tell\">\n");
      out.write("                <a href=\"#\">Food</a> >> <a href=\"#\">");
      out.print(t.getHeader());
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content-grid\">\n");
      out.write("\n");
      out.write("            ");
      out.print(t.getThreadBody());
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"comment\">\n");
      out.write("            <h3>comment</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
if (comments != null) {
                    for (Comment c : comments) {

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"stripe-line\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"content-coment\">\n");
      out.write("                ");
      out.print(c.getCommentBody());
      out.write("<br>\n");
      out.write("                ");
      out.print(c.getCommentTime());
      out.write("<br>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"post\" action=\"#\">\n");
      out.write("                <textarea name=\"content\" cols=\"80\" rows=\"15\" placeholder=\"This is some content that comment\">\n");
      out.write("                    \n");
      out.write("                </textarea>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->  \n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <hr>\n");
      out.write("        <center>\n");
      out.write("            <p style=\"color:white\">© SIT KMUTT 2015 | Designed by Project X </p>\n");
      out.write("            <a href=\"#\">About Us</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Contact Us</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Privacy Policy</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Terms & Condition</a>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
