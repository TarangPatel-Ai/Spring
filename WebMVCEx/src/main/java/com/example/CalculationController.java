package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {
	
@ResponseBody
	@RequestMapping("/add")
	public ModelAndView addEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("emp", emp);
		return mv;
	}

@ResponseBody
	@RequestMapping("/sub")
	public ModelAndView displaysub(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		int result = Integer.parseInt(req.getParameter("no1")) - Integer.parseInt(req.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("sum",result);
		return mv;
	}

}
