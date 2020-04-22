package org.studyeasy.spring;
 
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.studyeasy.spring.DAO.AppDAOImpl;
import org.studyeasy.spring.config.AppConfig;
import org.studyeasy.spring.model.User;

 
@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView userList() {
		ModelAndView model = new ModelAndView("userList");
		List<User> users = new ArrayList<User>();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		model.addObject("users", users);
		context.close();
		return model;
	}
	
	@RequestMapping("/addUser")
	public String addUser(Model model,@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("user", user);
			System.out.println("if");
			return "addUser";
		}else {
			if(user.getName() != null && user.getEmail() !=null) { //and not blanck
				
				return "forward:/"; //renvoie à l'url /
			}else {
				System.out.println("esle else");
				return "addUser";
			}
			
		}
		
		
	}
	
}