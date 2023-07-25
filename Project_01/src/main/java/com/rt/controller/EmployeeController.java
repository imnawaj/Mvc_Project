package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.entity.Employee;
import com.rt.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empServive;
	
	@RequestMapping("/")
	public String homepage(){
		
		return"home";
	}
	
	@RequestMapping("/registerForm")
	public String display(){
		return"register";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute Employee e,Model m){
		
		boolean isAdded= empServive.addData(e);
		
		if(isAdded){
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to Add...");
		}
		
		return"register";
		
	}
	
	@RequestMapping("/updateForm")
	public String update(){
		return"update";
	}
	
	@RequestMapping("/update")
	public void updateData(@ModelAttribute Employee e,Model m ){
	  boolean update=	empServive.updatedata(e);
	  
	  if(update){
			m.addAttribute("successMsg","Employee update Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to update...");
		}
	}
	
	@RequestMapping("/selectById")
	public String EmployeeById(){
		return"singledata";
	}
	
	@RequestMapping("/selectByEmployee")
	public String SingleId(@RequestParam int id,Model m){
		Employee e=empServive.singledata(id);
		
		m.addAttribute("empData",e);
		
		return"display";
	}
	
	@RequestMapping("/deleteForm")
	public String deleted(){
		return"delete";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deletedata(@RequestParam int id,Model m){
		
	boolean empdelete	=empServive.deletedata(id);
	
	 if(empdelete){
			m.addAttribute("successMsg","Employee delete Successfully...");
		}else{
			m.addAttribute("errMsg","Unable to deleted...");
		}
		
		return"delete";
	}
	
	@RequestMapping("/selectall")
	public String selectAll(Model m){
		
		List<Employee> list	=	empServive.selectAll();
		m.addAttribute("empList",list);
		return "selectall";
	}
}
