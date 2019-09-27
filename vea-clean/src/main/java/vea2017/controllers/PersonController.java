package vea2017.controllers;

import java.util.List;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vea2017.dto.Person;

@Controller
public class PersonController {

	private List<Person> persons = new ArrayList<>();
	
	public PersonController() {
		persons.add(new Person("Marek", "Kneys", 50000));
		persons.add(new Person("David", "Kneys", 50000));
	}
	
	@RequestMapping("/personList")
	public String personList(Model model) {
		model.addAttribute("personList", persons);
		return "personPage";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginPage";
	}
	
	@RequestMapping("/editPersonPage")
	public String editPerson(Model model) {
		model.addAttribute("editedPerson", new Person());
		return "editPersonPage";
	}
	
	@RequestMapping("/savePerson")
	public String savePerson(@ModelAttribute Person editedPerson) {
		persons.add(editedPerson);
		return "redirect:/personList";
	}
}
