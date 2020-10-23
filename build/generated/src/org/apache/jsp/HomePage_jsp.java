package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    .style1 {color: #993366\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            Cookie ck[]=request.getCookies();
            String cookieKaJunoon="";
            
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getName().equals("KUCHBHI"))
                    cookieKaJunoon=ck[i].getValue();
            }
        
      out.write("\n");
      out.write("        <form action=\"LogiNCode.jsp\"  method=\"post\">\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr  bgcolor=\"black\">\n");
      out.write("                <td><font color=\"white\">Id</font></td>\n");
      out.write("                \n");
      out.write("                <td><input type=\"text\" name=\"uId\"  value=\"");
      out.print(cookieKaJunoon);
      out.write("\"></td>\n");
      out.write("                \n");
      out.write("                <td><font color=\"white\">Password</font></td>\n");
      out.write("                <td><input type=\"password\" name=\"pwd\"></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Login\"></td>\n");
      out.write("            </tr>\n");
      out.write("    </form>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div  class=\"imageandtexttheme\">\n");
      out.write("            <br><br><br>\n");
      out.write("<h1  class=\"headtheme\">PACKERS &nbsp;&&nbsp; MOVERS</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <table WIDTH=\"100%\"> \n");
      out.write("            <tr ALIGN=\"CENTER\" bgcolor=\"#F0E68C\">\n");
      out.write("                <td><a href=\"HomePage.html\">HOME</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">SERVICES</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">CITY</a></td>\n");
      out.write("                <td><a href=\"HomePage.html\">CUSTOMER CARE</a> </td>\n");
      out.write("                <td><a href=\"HomePage.html\">REVIEWS</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<table width=\"429\" height=\"449\" border=\"2\"  align=\"center\"   style=\"border-color:red\">         \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("\n");
      out.write("                <form  action=\"InsertRecord.jsp\"   method=\"post\">\n");
      out.write("                <table  cellspacing=\"20\" align=\"center\"  border=\"0\">\n");
      out.write("            <tr align=\"center\" bgcolor=\"red\">\n");
      out.write("                <td colspan=\"2\"><font color=\"white\">SUBMIT QUOTATION</font></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td><input type=\"text\" name=\"nm\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Contact No</td>\n");
      out.write("                <td><input type=\"text\" name=\"contact\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    From :Address\n");
      out.write("                </td>\n");
      out.write("                <td><textarea name=\"frmaddress\"></textarea></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Select City</td>\n");
      out.write("                <td><select  name=\"frmcity\">\n");
      out.write("                        <option>select</option>\n");
      out.write("                        <option>indore</option>\n");
      out.write("                        <option>pune</option>\n");
      out.write("                        <option>bhopal</option>\n");
      out.write("                        <option>bombay</option>\n");
      out.write("                        </select></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("            To:Address\n");
      out.write("                </td>\n");
      out.write("                <td><textarea name=\"toaddress\"></textarea></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Select City</td>\n");
      out.write("                <td><select  name=\"tocity\">\n");
      out.write("                        <option>select</option>\n");
      out.write("                        <option>indore</option>\n");
      out.write("                        <option>pune</option>\n");
      out.write("                        <option>bhopal</option>\n");
      out.write("                        <option>bombay</option>\n");
      out.write("                        </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("            Transport way\n");
      out.write("                </td>\n");
      out.write("                <td><select  name=\"trans\">\n");
      out.write("                        <option>select</option>\n");
      out.write("                        <option>Railway</option>\n");
      out.write("                        <option>Airline</option>\n");
      out.write("                        <option>Roadway</option>\n");
      out.write("                        <option>Cargo</option>\n");
      out.write("                        </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("                    <input type=\"reset\" value=\"Clear\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("                </form>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p><span class=\"style1\">asdfafasgd hgsajhggsa hfsadf asdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasd</span>fafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadf</p>\n");
      out.write("    asdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadf\n");
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
