package org.user.client.feign.LFSI.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
*@author   created by hanzhuofan  2018.09.07
*/
public class MyServletContextListener1 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("MyServletContextListener1初始化");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		 System.out.println("MyServletContextListener1销毁");
	}

}
