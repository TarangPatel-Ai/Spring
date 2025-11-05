package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculationController {
@ResponseBody
	@RequestMapping("/add")
	public String displayadd(HttpServletRequest req, HttpServletResponse res) {
		int result = Integer.parseInt(req.getParameter("no1")) + Integer.parseInt(req.getParameter("no2"));
		return "Sum of the number is " + result;
	}
}
