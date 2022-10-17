package com.sboot.laptopManagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sboot.laptopManagement.entity.Laptop;
import com.sboot.laptopManagement.service.LaptopService;

@Controller
public class LaptopController {
	
	@Autowired
	private LaptopService ls;
	
	@RequestMapping("addlaptop")
	@ResponseBody
	public String addLaptop( Laptop l)
	{
		
		
		return ls.addLaptop(l);
	}
	
	@RequestMapping("index")
	
	public String getLaptopHome(){
		return "login.jsp";
	}
	
	@RequestMapping("viewlaptop")
	@ResponseBody
	public String viewBook( int lid){
		return ls.viewLaptop(lid);
	}
	
	@RequestMapping("viewalllaptop")
	@ResponseBody
	public String viewAllLaptop(){
		return ls.viewAllLaptop();
	}
	
	@RequestMapping("updatelaptop")
	@ResponseBody
	public String updateLaptop( Laptop l)
	{
		return ls.updateLaptop(l);
	}
	
	@RequestMapping("deletelaptop")
	
	public String deleteLapto( int lid){
		return ls.deleteLaptop(lid);
	}
	
}

