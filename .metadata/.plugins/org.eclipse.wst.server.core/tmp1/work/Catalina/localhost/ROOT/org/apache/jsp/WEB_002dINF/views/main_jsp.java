/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2020-04-28 04:15:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/tripProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/tripProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/includes/footer.jsp", Long.valueOf(1588046697441L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1587267457084L));
    _jspx_dependants.put("jar:file:/C:/tripProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/tripProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/includes/header.jsp", Long.valueOf(1588046697471L));
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>MY TRIP</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"resources/main/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"resources/main/css/modern-business.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navigation -->\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"/main\">MY TRIP</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler navbar-toggler-right\" type=\"button\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbarResponsive\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/board\">게시판</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/phto\">갤러리</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a id=\"login\" class=\"nav-link\" href=\"#\">로그인</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/insertMember\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("<div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\tMY TRIP\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-signin\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"form-signin-heading\" style='text-align: center;'>로\r\n");
      out.write("\t\t\t\t\t\t\t\t그 인</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail\" class=\"sr-only\">Email address</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"inputEmail\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Email address\" required autofocus> <label\r\n");
      out.write("\t\t\t\t\t\t\t\tfor=\"inputPassword\" class=\"sr-only\">Password</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" id=\"inputPassword\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label> <input type=\"checkbox\" value=\"remember-me\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t아이디 기억하기\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" id=\"btnLogin\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"naverIdLogin\"></div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"btnJoin\" class=\"btn btn-primary\">회원가입</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">닫기</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".card-img-top {\n");
      out.write("\theight: 168.57px;\n");
      out.write("}\n");
      out.write("</style>\t\n");
      out.write("\t<header>\n");
      out.write("\t\t<div id=\"carouselExampleIndicators\" class=\"carousel slide\"\n");
      out.write("\t\t\tdata-ride=\"carousel\">\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\n");
      out.write("\t\t\t\t\tclass=\"active\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\t\t\t\t<!-- Slide One - Set the background image for this slide in the line below -->\n");
      out.write("\t\t\t\t<div class=\"carousel-item active\"\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url('https://cdn.pixabay.com/photo/2017/11/08/08/07/gyeongbok-palace-2929520_960_720.jpg')\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Slide Two - Set the background image for this slide in the line below -->\n");
      out.write("\t\t\t\t<div class=\"carousel-item\"\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url(https://newsimg.sedaily.com/2018/11/18/1S78LAW6SL_1.jpg)\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Slide Three - Set the background image for this slide in the line below -->\n");
      out.write("\t\t\t\t<div class=\"carousel-item\"\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url('https://www.walkerhillstory.com/wp-content/uploads/2018/11/%EC%84%9C%EC%9A%B8%EC%88%B21.jpg')\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\n");
      out.write("\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\n");
      out.write("\t\t\t\tclass=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("\t\t\t\tclass=\"sr-only\">Previous</span>\n");
      out.write("\t\t\t</a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\n");
      out.write("\t\t\t\trole=\"button\" data-slide=\"next\"> <span\n");
      out.write("\t\t\t\tclass=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("\t\t\t\tclass=\"sr-only\">Next</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- Page Content -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<h1 class=\"my-4\">Welcome to Modern Business</h1>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/svg/1885/1885090.svg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/board\">게시판</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\" style=\"text-align: center;\">관광명소! 관광지!\n");
      out.write("\t\t\t\t\t\t\t여행스팟! 몰라 여기 게시판의</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/svg/856/856293.svg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">갤러리</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\" style=\"text-align: center;\">관광명소! 관광지!\n");
      out.write("\t\t\t\t\t\t\t여행스팟! 몰라 여기 게시판의 사진을 모아볼수 있는 공간</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t<p></p><p></p>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/svg/2747/2747327.svg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">서울특별시</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipisicing elit. Amet numquam aspernatur eum quasi sapiente\n");
      out.write("\t\t\t\t\t\t\tnesciunt? Voluptatibus sit, repellat sequi itaque deserunt,\n");
      out.write("\t\t\t\t\t\t\tdolores in, nesciunt, illum tempora ex quae? Nihil, dolorem!</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t<p></p><p></p>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/svg/623/623133.svg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">강원도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipisicing elit. Amet numquam aspernatur eum quasi sapiente\n");
      out.write("\t\t\t\t\t\t\tnesciunt? Voluptatibus sit, repellat sequi itaque deserunt,\n");
      out.write("\t\t\t\t\t\t\tdolores in, nesciunt, illum tempora ex quae? Nihil, dolorem!</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">경기도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipiscing elit. Nam viverra euismod odio, gravida pellentesque\n");
      out.write("\t\t\t\t\t\t\turna varius vitae.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">경상도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipisicing elit. Quos quisquam, error quod sed cumque, odio\n");
      out.write("\t\t\t\t\t\t\tdistinctio velit nostrum temporibus necessitatibus et facere\n");
      out.write("\t\t\t\t\t\t\tatque iure perspiciatis mollitia recusandae vero vel quam!</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">충정도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipiscing elit. Nam viverra euismod odio, gravida pellentesque\n");
      out.write("\t\t\t\t\t\t\turna varius vitae.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">전라도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\"></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6 portfolio-item\">\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"card-img-top\"\n");
      out.write("\t\t\t\t\t\tsrc=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/information\">제주도</a>\n");
      out.write("\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur\n");
      out.write("\t\t\t\t\t\t\tadipisicing elit. Itaque earum nostrum suscipit ducimus nihil\n");
      out.write("\t\t\t\t\t\t\tprovident, perferendis rem illo, voluptate atque, sit eius in\n");
      out.write("\t\t\t\t\t\t\tvoluptates, nemo repellat fugiat excepturi! Nemo, esse.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t<!-- Features Section -->\n");
      out.write("\n");
      out.write("\t\t<!-- Call to Action Section -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.container -->\n");
      out.write("\t<!-- modal -->\n");
      out.write("\t\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=5790ffcae216e6b5e39c5b5e79de8f5b\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t//로그인 클릭시 모달화면을 보여준다 \r\n");
      out.write("\t\t$(\"#login\").on(\"click\", function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t$(\"#loginModal\").modal(\"show\");\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\"#addr\").on(\"click\", function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t$(\"#komap\").modal(\"show\");\r\n");
      out.write("\t\t\t$('#komap').on('shown.bs.modal', function (e) {\r\n");
      out.write("\t\t\t\tvar mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("\t\t\t\tmapOption = {\r\n");
      out.write("\t\t\t\t\tcenter : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("\t\t\t\t\tlevel : 3\r\n");
      out.write("\t\t\t\t// 지도의 확대 레벨\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tvar map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\r\n");
      out.write("\t\t\t\t// 마커가 표시될 위치입니다 \r\n");
      out.write("\t\t\t\tvar markerPosition = new kakao.maps.LatLng(33.450701, 126.570667);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 마커를 생성합니다\r\n");
      out.write("\t\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\t\tposition : markerPosition\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// 마커가 지도 위에 표시되도록 설정합니다\r\n");
      out.write("\t\t\t\tmarker.setMap(map);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tvar naverLogin = new naver.LoginWithNaverId({\r\n");
      out.write("\t\t\tclientId : \"EKiDjT4kUdP1IUtlpmKj\",\r\n");
      out.write("\t\t\tcallbackUrl : \"http://localhost:8099/main\",\r\n");
      out.write("\t\t\tisPopup : false, /* 팝업을 통한 연동처리 여부 */\r\n");
      out.write("\t\t\tloginButton : {\r\n");
      out.write("\t\t\t\tcolor : \"green\",\r\n");
      out.write("\t\t\t\ttype : 3,\r\n");
      out.write("\t\t\t\theight : 40\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t/* 로그인 버튼의 타입을 지정 */\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/* 설정정보를 초기화하고 연동을 준비 */\r\n");
      out.write("\t\tnaverLogin.init();\r\n");
      out.write("\t\t//로그인화면 창 보여주기 끝\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer class=\"py-5 bg-dark\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p class=\"m-0 text-center text-white\">Copyright &copy; Your\r\n");
      out.write("\t\t\t\tWebsite 2019</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.container -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("\t<script src=\"resources/main/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"resources/main/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write('\n');
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
