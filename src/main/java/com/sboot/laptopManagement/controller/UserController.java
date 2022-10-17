package com.sboot.laptopManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sboot.laptopManagement.entity.User;
import com.sboot.laptopManagement.service.LaptopService;
import com.sboot.laptopManagement.service.UserService;
@Controller
public class UserController {
	@Autowired
    UserService us; 
	
	@Autowired
	LaptopService ls;
	
	@RequestMapping("userregister")
	@ResponseBody
	public String addLaptop(User u)
	{
		return us.registerUser(u);
	}
	
	@RequestMapping("signin")
	public ModelAndView signIn(Integer userId, String password)
	{
		ModelAndView mvc = new ModelAndView();
		if(userId == 1234 && password.equals("admin")) {
			mvc.setViewName("laptopmanagement.jsp");
		}
		else if(us.checkUserLogin(userId, password)) {
			mvc.setViewName("dashboard.jsp");
			mvc.addObject("list", ls.getAllLaptop());
		}
		else {
			mvc.setViewName("login.jsp");
		}
			
		return mvc ;
	}
	
	@RequestMapping("purchaseLaptop")
	@ResponseBody
	public String purchase(int userId, int lid) {
		return us.purchaseLaptop(lid, userId);
	}
	
	@RequestMapping("getinvoice")
	public ModelAndView getinvoice(int uid) {
		ModelAndView mvc = new ModelAndView("purchaselist.jsp");
		 mvc.addObject("list", us.getinvoice(uid));
		 return mvc;
	}
	
	@RequestMapping("buyLaptop")
	public ModelAndView getpurchaselist() {
		ModelAndView mav = new ModelAndView("dashboard.jsp");
		mav.addObject("list", us.viewPurchaseList());
		return mav;
	}
	
}
