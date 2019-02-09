package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login Page</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("\t<td valign=\"top\">\n");
      out.write("\t\t<html:form method=\"post\" action=\"/ValidateAction\">\n");
      out.write("\t<table cellspacing='10' align='center'>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><font color='darkblue' size='+2'>Login Form\t\t\t\n");
      out.write("\t\t</tr></td></font>\n");
      out.write("\t</table>\n");
      out.write("\t<table cellspacing='10' align='center'border='2' bordercolor='black'>\n");
      out.write("\t\t<tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'><html:text property=\"userid\"/>\n");
      out.write("\t\t<tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'><html:password property=\"password\"/>\n");
      out.write("\t\t<tr><td bordercolor='white'>Role:<td COLSPAN='2'bordercolor='white'><html:radio property='r1' value=\"Administrator\">Administrator<tml:radio>\n");
      out.write("\t\t<tr><td bordercolor='white'><html:radio property='r1' value=\"customer\">Customer<html:radio>\n");
      out.write("\t\t<tr><td bordercolor='white'></br>\n");
      out.write("\t\t<tr><td bordercolor='white'><input type=\"submit\" value=\"Submit\"/>\n");
      out.write("\t\t<td bordercolor='white'><input type=\"reset\" value=\"Reset\"/>\n");
      out.write("\t\t</table>\n");
      out.write("\t</td></html:form>\n");
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
