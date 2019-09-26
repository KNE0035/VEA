package vea2017.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vea2017.dto.Person;

@Controller
public class PersonController {

	private List<Person> persons = new ArrayList<>();
	
	@PostConstruct
	public void postConstructor() {
		persons.add(new Person("kneys"));
		persons.add(new Person("trol"));
	}
	
	
	@RequestMapping("/personPage")
	public String personList(Model model) {
		model.addAttribute("personList", persons);
		return "personPage";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginPage";
	}
	
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "registerPage";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Model model) {
		model.addAttribute("newPerson", new Person());
		return "registerPage";
	}
	
	@RequestMapping("/register")
	public String registerPerson(@ModelAttribute Person newPerson, Model model) {
		persons.add(newPerson);
		return "personPage";
	}
	
	
}
