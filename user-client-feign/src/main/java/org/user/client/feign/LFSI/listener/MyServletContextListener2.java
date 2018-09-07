package org.user.client.feign.LFSI.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
*@author   created by hanzhuofan  2018.09.07
*/
@WebListener
public class MyServletContextListener2 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("MyServletContextListener2初始化");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		 System.out.println("MyServletContextListener2销毁");
	}

}
