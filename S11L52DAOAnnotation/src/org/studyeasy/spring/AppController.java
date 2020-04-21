package org.studyeasy.spring;
 
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.studyeasy.spring.DAO.AppDAOImpl;
import org.studyeasy.spring.model.User;

 
@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView userList() {
		ModelAndView model = new ModelAndView("userList");
		List<User> users = new ArrayList<User>();
		
		//recuperer dao par le xml via le bean et on apl dao.listUsers()
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/studyeasy/spring/DAO/Spring-AppDAOConfig.xml");
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		model.addObject("users", users);
		context.close();
		return model;
	}
	
}