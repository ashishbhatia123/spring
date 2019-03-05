package com.cg.springmvc.controller;
// in order to do validation we use this project 
import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvc.bean.Customer;

@Controller
public class HomeController {
	/*@RequestMapping("/homepage")
	public String displayHomePage(Model model) {
		LocalDate date= LocalDate.now();
		model.addAttribute("today", date);
		return "Home";
	}
	*/
	@RequestMapping(method=RequestMethod.GET,value="homepage")  // if request is coming from get not post and having value = homepage then
	// only ModelAndView displayHomePage() this method is running
	public ModelAndView displayHomePage() {
		LocalDate date= LocalDate.now();
		ModelAndView mv =new ModelAndView();
		mv.addObject("today",date);
		mv.setViewName("Home"); //logical view name
		
		// or ModelAndView mv = new ModelAndView("Home","today",date); // upeer 3 statement combine in one statement 
		return mv;
		
	}
	@RequestMapping("showRegistrationForm")
	public String showRegistrationForm(Model model)
	{
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		
		return "CustomerRegistration";
	}
	
	
	/*@RequestMapping("showRegistrationForm")
	public String showRegistrationForm()
	{
		return "CustomerRegistration";
	}*/
	/*@RequestMapping("/registerUserAction")*/
	/*public String RegisterCustomerDetails(@RequestParam("fname")String firstname,@RequestParam("lname")String LastName ,
		@RequestParam("age")int age ,
		@RequestParam("mobno") String mobNo,
		@RequestParam("email")String email,
		@RequestParam("city")String city,
		Model model)*/
	
	/*model.addAttribute("firstname", firstname);
	model.addAttribute("lastname", LastName);
	model.addAttribute("email",email);
	*/
	
/*	return "Success";
}*/
	// if we want upward code as short and want all value in just one object 
	@RequestMapping("/registerUserAction")
	public String RegisterCustomerDetails(@Valid @ModelAttribute("customer")Customer customer ,BindingResult result,Model model)
	{// code to process on customer Detail
		if(result.hasErrors())
		{
			System.out.println("error");
			return "CustomerRegistration";
		}
		model.addAttribute("customer", customer);
		
		return "Success";
	}

}
