package org.user.client.feign.LFSI.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*@author   created by hanzhuofan  2018.09.07
*第一种：在启动类中，以@Bean的形式注入，代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。 
*也可以通过实现 ServletContextInitializer 接口直接注册。
*/
public class MyServlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println(">>>>>>>>>>MyServlet1 doGet()<<<<<<<<<<<");
			doPost(req, resp);
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>MyServlet1 doPost()<<<<<<<<<<<");
        resp.setContentType("text/html"); 
        PrintWriter out = resp.getWriter(); 
        out.println("<html>"); 
        out.println("<head>"); 
        out.println("<title>Hello World</title>"); 
        out.println("</head>"); 
        out.println("<body>"); 
        out.println("<h1>这是：MyServlet1</h1>"); 
        out.println("</body>"); 
        out.println("</html>");
	}
}
