package org.studyeasy.spring;
 
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;

 
@Controller
public class AppController {
	
	@GetMapping("/index")
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		modelAndView.addObject("user", user); //permet de lier le model au formulaire de la vue
		return modelAndView;
		
		/*Renvoie la vue d'une autre facon
		 * User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		map.addAttribute("genderMap", genderMap); //permet de passer les attributs dans la vue avec radiobuttonS 
		
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "Inde");
		countryMap.put("France", "France");
		map.addAttribute("countryMap", countryMap);
		
		map.addAttribute("user", user); //permet de lier le model au formulaire de la vue
		return "userFormView";
		 * */
		
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute("user") @Valid User user, BindingResult result) { //modelAttribute du form qui donne les caract des champs si error
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		
		// annotation valid et bindingResult permettent de valider les données par rapport aux info données par le model
		if(result.hasErrors()) {	
			ModelAndView repopulatingModelAndView = new ModelAndView("userFormView");
			repopulatingModelAndView.addObject("user", user);
			return  repopulatingModelAndView;
		}
		else {
			return modelAndView;
		}
		
	}
	
	@RequestMapping("/")
	public ModelAndView userList() {
		ModelAndView model = new ModelAndView("userList");
		return model;
	}

	
}