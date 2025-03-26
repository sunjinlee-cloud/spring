package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//컨트롤러로 이용하려면 다양한 컨트롤러를 상속받아야 한다
public class MainController extends MultiActionController {
	
	
	@Override //
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		
		System.out.println(path);
		
		if(path.equals("/test/aaa")) {
			//뷰와 데이터에 대한 정보를 반환함
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "hello world");
			mv.setViewName("aaa");
			return mv;
			
		} else if (path.equals("/test/bbb")) {
			
			return new ModelAndView("bbb");
		}
 		
		return super.handleRequestInternal(request, response);
	}
	
}
