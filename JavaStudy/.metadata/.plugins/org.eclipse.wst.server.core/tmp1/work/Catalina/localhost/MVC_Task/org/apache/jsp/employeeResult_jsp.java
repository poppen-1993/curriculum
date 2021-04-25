/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-03-02 06:21:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Objects;
import java.util.List;
import skillcheck.bean.ResponseBean;
import skillcheck.bean.EmployeeBean;
import skillcheck.logger.Logger;

public final class employeeResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Objects");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("skillcheck.bean.ResponseBean");
    _jspx_imports_classes.add("skillcheck.bean.EmployeeBean");
    _jspx_imports_classes.add("skillcheck.logger.Logger");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Java -->\n");

    String loginEmpId = "";
    ResponseBean responseBean = null;
    List<EmployeeBean> empResultList = null;
    int requestStatus = 0;
    String message = "";

    try {
        if (Objects.isNull(request.getSession()) || request.getSession().isNew()) {
            Logger.log(new Throwable(), "セッションなし");
        } else {
            // session: login
            loginEmpId = (String) session.getAttribute("login");
            Logger.log(new Throwable(), "セッションあり: loginEmpId = " + loginEmpId);
        }

        // FIXME Step-2-1: リクエストよりレスポンスBeanを取得しなさい。
        // Tips: 正確な型（クラス）でキャストすること
        //  ( Class ) request.getAttribute ("キー");getMessage
        responseBean = (ResponseBean) request.getAttribute("responseBean");
        empResultList = responseBean.getEmplyeeBeanList();
        requestStatus = responseBean.getRequestStaus();
        message = responseBean.getMessage();

        System.out.println("DebugMessage");
        System.out.println(responseBean.getMessage());
        System.out.println(empResultList.get(0).getEmpId());
        System.out.println("==========");

    } catch (Exception e) {
        Logger.log(new Throwable(), e);
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/employeeResult.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\" /></script>\n");
      out.write("<title>照会結果</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<input id=\"hiddenDialog\" type=\"hidden\"\n");
      out.write("\t\tvalue=\"");
      out.print(requestStatus == 2 ? message : "");
      out.write("\"></input>\n");
      out.write("\t<br>\n");
      out.write("\t");
 if (requestStatus < 2 && !message.isEmpty()) { 
      out.write("\n");
      out.write("\t<!-- FIXME Step-2-2: 式（Expression）を用いてメッセージ（message）を表示しなさい。 -->\n");
      out.write("\t<p> ");
      out.print( responseBean.getMessage() );
      out.write(" </p>\n");
      out.write("\t");
 } 
      out.write('\n');
      out.write('	');
 if (!empResultList.isEmpty()) { 
      out.write("\n");
      out.write("\t<div class=\"div-table-list\">\n");
      out.write("\t\t<table id=\"resultTable\" class=\"table-emp-list\" border=\"1\">\n");
      out.write("\t\t\t<caption class=\"\">【社員情報】</caption>\n");
      out.write("\t\t\t<tr class=\"th-last-two-obj\">\n");
      out.write("\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t<th>社員番号</th>\n");
      out.write("\t\t\t\t<th>氏名</th>\n");
      out.write("\t\t\t\t<th>メールアドレス</th>\n");
      out.write("\t\t\t\t<th>プログラミング言語</th>\n");
      out.write("\t\t\t\t<th>コメント</th>\n");
      out.write("\t\t\t\t<th>編集</th>\n");
      out.write("\t\t\t\t<th>削除</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
 for (EmployeeBean emp: empResultList) { 
      out.write("\n");
      out.write("\t\t\t<tr class=\"td-max-width td-last-btn td-last-checkbox\">\n");
      out.write("\t\t\t\t<td class=\"td-marker\"></td>\n");
      out.write("\t\t\t\t<!-- FIXME Step-2-3: 社員情報一覧に表示する内容を式（Expression）を用いて表示しなさい。 -->\n");
      out.write("\t\t\t\t<!-- Tips: ループにより取得したリスト内の社員情報Beanを使用すること -->\n");
      out.write("\t\t\t\t<td id=\"empId\">");
      out.print( empResultList.get(0).getEmpId() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td title=\"");
      out.print(emp.getName());
      out.write('"');
      out.write('>');
      out.print( empResultList.get(0).getName() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td title=\"");
      out.print(emp.getMail());
      out.write('"');
      out.write('>');
      out.print( empResultList.get(0).getMail() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td title=\"");
      out.print(emp.getProgramingLanguage());
      out.write('"');
      out.write('>');
      out.print( empResultList.get(0).getProgramingLanguage() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td title=\"");
      out.print(emp.getComment());
      out.write('"');
      out.write('>');
      out.print( empResultList.get(0).getComment() );
      out.write("</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<form action=\"/MVC_Task/employee\" method=\"get\">\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"sender\" value=\"/employeeResult.jsp\"></input>\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"empId\" value=\"");
      out.print(emp.getEmpId());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<label id=\"update\" class=\"btn-emp-regist\"> <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"underline\">編集</span>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td id=\"delete\"><input id=\"disabled\" type=\"hidden\"\n");
      out.write("\t\t\t\t\tname=\"rowDelCheckBox\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(emp.getEmpId().equals(loginEmpId));
      out.write("\"> <input\n");
      out.write("\t\t\t\t\tid=\"delCheckBox\" type=\"checkbox\" name=\"delCheckBox\" value=\"0\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t<tfoot align=\"right\" class=\"tfoot-td\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"8\">\n");
      out.write("\t\t\t\t\t\t<form action=\"/MVC_Task/employee\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"div-btn-delete-area\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"sender\" value=\"/employeeResult.jsp\"></input>\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"deleteEmpId\" type=\"hidden\" name=\"empId\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"btnDelete\" class=\"btn-delete common-btn-disabled\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"requestType\" value=\"delete\">削除</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tfoot>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\t<form action=\"/MVC_Task/employee\" method=\"get\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"sender\" value=\"/employeeResult.jsp\"></input>\n");
      out.write("\t\t<br> <label id=\"logout\" class=\"btn-logout\"\n");
      out.write("\t\t\tonclick=\"exeSubmit(this)\"> <span class=\"underline\">ログアウト</span>\n");
      out.write("\t\t</label>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
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