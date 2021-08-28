package spring.mvc.collegemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
//@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		System.out.println("Insider controller");
		model.addAttribute("MSG", "This is String MVC Practice\n");
		model.addAttribute("PAN", "This is String MVC Practice");
		return "welcome";
		
	}
	
	
}
