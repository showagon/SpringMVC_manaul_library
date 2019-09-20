package com.abd.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abd.entity.Customer;
import com.abd.services.CustServices;

@Controller
public class Customercontroller {

	@Autowired
	private CustServices custserimpl;
	
	@RequestMapping("/list")
	public String ListCustomer(Model theModel) {
		
		
		List<Customer> thecustomer = custserimpl.getCustomer();
		
		theModel.addAttribute("customer", thecustomer);
		
		
		return "list";
	}
	
	@RequestMapping("/showform")
	public String RegCustomer(Model theModel) {
		
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		
		
		return "custform";
	}
	
	
	
	@PostMapping("/saveCustomer")
	public String SaveCustomer2DB(@ModelAttribute("customer") Customer thecustomer) {
		
	
		custserimpl.saveCustomer(thecustomer);
		
		return "redirect:/list";
	}
	
	
	@GetMapping("/updateForm")
	public String updateCustomer2DB(@RequestParam("customerId") int theid, Model theModel) {
		
	
		Customer theCustomer = custserimpl.getcustomer(theid);
		
		theModel.addAttribute("customer", theCustomer);
		

		return "custform";
	}
	
	
	@GetMapping("/deleteCustomer")
	public String DeleteCustomer2DB(@RequestParam("customerId") int theid, Model theModel) {
		
	
		custserimpl.deleteCustomer(theid);
		

		return "redirect:/list";
	}
	
	
	
	
}
