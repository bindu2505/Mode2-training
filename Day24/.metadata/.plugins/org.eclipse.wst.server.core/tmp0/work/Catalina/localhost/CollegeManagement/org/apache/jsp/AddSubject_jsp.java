/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-09-04 04:59:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"get\" action=\"AddSubject.jsp\" >\r\n");
      out.write("\t<select id=\"sub\">\r\n");
      out.write("  <option value=\"C#\">C#</option>\r\n");
      out.write("  <option value=\"Microprocessor\">Microprocessor</option>\r\n");
      out.write("  <option value=\"Java\">Java</option>\r\n");
      out.write("  <option value=\"C++\">C++</option>\r\n");
      out.write("  <option value=\"PC Architecture\">PC Architecture</option>\r\n");
      out.write("  <option value=\"Networks\">Networks</option>\r\n");
      out.write("  <option value=\"Signals\">Signals</option>\r\n");
      out.write("   </select>\r\n");
      out.write("   <br/><br/>\r\n");
      out.write("   \r\n");
      out.write("   Theory:\r\n");
      out.write("  <input type=\"text\" id=\"theory\" name=\"theory\" readonly=\"readonly\" /><br/><br/>\r\n");
      out.write("  Practical:\r\n");
      out.write("   <input type=\"text\" id=\"practical\" name=\"practical\" readonly=\"readonly\" /><br/><br/>\r\n");
      out.write("   \r\n");
      out.write("   <script>\r\n");
      out.write("   while(1){\r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"Microprocessor\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=45;\r\n");
      out.write("\t   document.getElementById(\"practical\").value=65;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"C#\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=23;\r\n");
      out.write("\t   document.getElementById(\"practical\").value=12;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"Java\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=14;\r\n");
      out.write("\t   document.getElementById(\"practical\").value=100;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"C++\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=45;\r\n");
      out.write("\t   document.getElementById(\"practical\").value=75;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"PC Architecture\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=78;\r\n");
      out.write("\t   document.getElementById(\"practical\").value=65;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"Signals\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=\"18\";\r\n");
      out.write("\t   document.getElementById(\"practical\").value=\"65\";\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if(document.getElementById(\"sub\").value=\"Networks\"){\r\n");
      out.write("\t   document.getElementById(\"theory\").value=\"99\";\r\n");
      out.write("\t   document.getElementById(\"practical\").value=\"65\";\r\n");
      out.write("   }\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("   </script>\r\n");
      out.write("   Year:\r\n");
      out.write("    <input type=\"text\" name=\"year\" /><br/><br/>\r\n");
      out.write("  \r\n");
      out.write("   Instructor:\r\n");
      out.write("    <input type=\"text\" name=\"instructor\" /><br/><br/>\r\n");
      out.write("    <input type=\"submit\" value=\"Click\"/>\r\n");
      out.write("  \r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
