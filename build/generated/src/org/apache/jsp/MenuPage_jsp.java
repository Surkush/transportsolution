package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<style>\n");
      out.write("    .imageandtexttheme\n");
      out.write("    {\n");
      out.write("        width:100%;\n");
      out.write("        height:200px;\n");
      out.write("        background: url('flash.jpg');\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        padding-bottom: 120px;\n");
      out.write("     }\n");
      out.write("    .headtheme\n");
      out.write("    {\n");
      out.write("        font-size:40px;\n");
      out.write("        color:orange;\n");
      out.write("        \n");
      out.write("        text-align: left;\n");
      out.write("     }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"imageandtexttheme\">\n");
      out.write("       \n");
      out.write("            \n");
      out.write("            <h3 align=\"right\"><font color=\"red\"><b>welcome  ");
      out.print(session.getAttribute("ANYTHING"));
      out.write("</b></font></h3>\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("<h1  class=\"headtheme\">PACKERS &nbsp;&&nbsp; MOVERS</h1>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <table WIDTH=\"100%\"> \n");
      out.write("            <tr ALIGN=\"CENTER\" bgcolor=\"#F0E68C\">\n");
      out.write("                <td><a href=\"HomePage.html\">HOME</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">MANAGE SERVICES</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">MANAGE CITY</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">VIEW REVIEWS</a></td>\n");
      out.write("                <td><a href=\"HomePage.jsp\">LOGOUT</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("<br><br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    </html>");
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
