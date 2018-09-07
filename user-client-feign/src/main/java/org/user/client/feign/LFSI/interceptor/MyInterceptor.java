package org.user.client.feign.LFSI.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
*@author   created by hanzhuofan  2018.09.07
*Interceptor拦截器执行顺序
*1、单个实现类的执行顺序
*preHandler -> Controller -> postHandler -> model渲染-> afterCompletion
*2、多个实现类的执行顺序
*———————preHandler——————- 
*———————preHandler1——————- 
*———————preHandler2——————- 
*———————–Controller——————— 
*———————postHandler2—————— 
*———————postHandler1—————— 
*———————postHandler—————— 
*———————model渲染——————
*——————afterCompletion2—————- 
*——————afterCompletion1—————- 
*——————afterCompletion—————-
*只有经过DispatcherServlet 的请求，才会走拦截器链，我们自定义的Servlet 请求是不会被拦截的，
*比如我们自定义的Servlet地址http://localhost:8080/myServlet1 是不会被拦截器拦截的。
*并且不管是属于哪个Servlet 只要复合过滤器的过滤规则，过滤器都会拦截。
*/
@Component
public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/**
		 * 该方法将在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller，
		 * 当返回值为true 时就会继续调用下一个Interceptor的preHandle 方法，如果已经是最后一个Interceptor的时候
		 * 就会是调用当前请求的Controller方法；
		 */
		System.out.println(">>>MyInterceptor1>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
		return HandlerInterceptor.super.preHandle(request, response, handler);// 只有返回true才会继续向下执行，返回false取消当前请求
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		/**
		 * 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行，该方法将在整个请求结束之后，
		 * 也就是在DispatcherServlet 渲染了对应的视图之后执行。用于进行资源清理。
		 */
		System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		/**
		 * 该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用，可以在这个方法中对Controller 处理之后
		 * 的ModelAndView 对象进行操作。
		 */
		System.out.println(">>>MyInterceptor1>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
