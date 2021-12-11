package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webcam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Created By CodingNepal - www.codingnepalweb.com -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Dropdown Menu with Search Box | CodingNepal</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    <nav>\n");
      out.write("      <input type=\"checkbox\" id=\"show-search\">\n");
      out.write("      <input type=\"checkbox\" id=\"show-menu\">\n");
      out.write("      <label for=\"show-menu\" class=\"menu-icon\"><i class=\"fas fa-bars\"></i></label>\n");
      out.write("      <div class=\"content\">\n");
      out.write("      <div class=\"logo\"><a href=\"#\">CodingNepal</a></div>\n");
      out.write("        <ul class=\"links\">\n");
      out.write("          <li><a href=\"#\">Home</a></li>\n");
      out.write("          <li><a href=\"#\">About</a></li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\" class=\"desktop-link\">Features</a>\n");
      out.write("            <input type=\"checkbox\" id=\"show-features\">\n");
      out.write("            <label for=\"show-features\">Features</label>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">Drop Menu 1</a></li>\n");
      out.write("              <li><a href=\"#\">Drop Menu 2</a></li>\n");
      out.write("              <li><a href=\"#\">Drop Menu 3</a></li>\n");
      out.write("              <li><a href=\"#\">Drop Menu 4</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\" class=\"desktop-link\">Services</a>\n");
      out.write("            <input type=\"checkbox\" id=\"show-services\">\n");
      out.write("            <label for=\"show-services\">Services</label>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">Drop Menu 1</a></li>\n");
      out.write("              <li><a href=\"#\">Drop Menu 2</a></li>\n");
      out.write("              <li><a href=\"#\">Drop Menu 3</a></li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#\" class=\"desktop-link\">More Items</a>\n");
      out.write("                <input type=\"checkbox\" id=\"show-items\">\n");
      out.write("                <label for=\"show-items\">More Items</label>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\">Sub Menu 1</a></li>\n");
      out.write("                  <li><a href=\"#\">Sub Menu 2</a></li>\n");
      out.write("                  <li><a href=\"#\">Sub Menu 3</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"#\">Feedback</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <label for=\"show-search\" class=\"search-icon\"><i class=\"fas fa-search\"></i></label>\n");
      out.write("      <form action=\"#\" class=\"search-box\">\n");
      out.write("        <input type=\"text\" placeholder=\"Type Something to Search...\" required>\n");
      out.write("        <button type=\"submit\" class=\"go-icon\"><i class=\"fas fa-long-arrow-alt-right\"></i></button>\n");
      out.write("      </form>\n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"dummy-text\">\n");
      out.write("    <h2>Responsive Dropdown Menu Bar with Searchbox</h2>\n");
      out.write("    <h2>using only HTML & CSS - Flexbox</h2>\n");
      out.write("  </div>\n");
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
