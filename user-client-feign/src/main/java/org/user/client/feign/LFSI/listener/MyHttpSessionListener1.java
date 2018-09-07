package org.user.client.feign.LFSI.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
*@author   created by hanzhuofan  2018.09.07
*/
public class MyHttpSessionListener1 implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener1 被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("MyHttpSessionListener1 被销毁");
	}

}
