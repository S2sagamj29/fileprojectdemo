package com.laptrinh.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinh.springboot.Service.IStudentservice;

@Controller
public class HomeController {

	@Autowired
	IStudentservice service;
	
	
	
	@RequestMapping(value ="/home", method = RequestMethod.GET )
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("list.html");
		mav.addObject("liststudent", service.findAll());
		return mav;
	}
	
	@RequestMapping(value = "/addmonhoc" , method = RequestMethod.GET)
	public ModelAndView addmon() {
		ModelAndView mav = new ModelAndView("themmonhoc.html");
		return mav;
	}
}
