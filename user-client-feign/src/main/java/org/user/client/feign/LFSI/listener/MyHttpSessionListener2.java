package org.user.client.feign.LFSI.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
*@author   created by hanzhuofan  2018.09.07
*/
@WebListener
public class MyHttpSessionListener2 implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener2 被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener2 被销毁");
	}

}
