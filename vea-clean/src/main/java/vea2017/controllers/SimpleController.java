package vea2017.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@ModelAttribute("name")
	public String getName() {
		return "David";
	}
}
