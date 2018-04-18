package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloController extends ParameterizableViewController {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
	String s1 =	req.getParameter("name");
	Map m = new HashMap();
	m.put("msg","hello...."+s1);
	ModelAndView mav = new ModelAndView(getViewName(),m);
		
		return mav;
	}

}
