package org.studyeasy.spring;
 

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;

 
@Controller
public class HelloController {
	
	@GetMapping("/")
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		modelAndView.addObject("genderMap", genderMap); //permet de passer les attributs dans la vue avec radiobuttonS 
		
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "Inde");
		countryMap.put("France", "France");
		modelAndView.addObject("countryMap", countryMap);
		
		modelAndView.addObject("user", user); //permet de lier le model au formulaire de la vue
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		
		// annotation valid et bindingResult permettent de valider les données par rapport aux info données par le model
		if(result.hasErrors()) {
			System.out.println("Has errors !");
		}
		
		return modelAndView;
	}

	
}