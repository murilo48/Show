package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<h1>Olá voce agora ira se cadastrar ou se desejar voce pode voltar!</h1>\n");
      out.write("    <a href=\"index.jsp\">Menu</a>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp\">\n");
      out.write("    <div class=\"mdl-card mdl-cell mdl-cell--12-col\">\n");
      out.write("\n");
      out.write("        <div class=\"mdl-card__supporting-text\">\n");
      out.write("\n");
      out.write("            <form action=\"cadastrarok.jsp\" method=\"post\">\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" name=\"txtLogin\" required  id=\"txtLogin\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtLogin\">Login</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"password\" name=\"txtSenha\" required  id=\"txtSenha\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtSenha\">Senha</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\">\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\">\n");
      out.write("                        Cadastrar\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <button type=\"reset\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\">\n");
      out.write("                        Limpar\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
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
