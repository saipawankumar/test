package com.stackroute.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.myapp.model.User;
import com.stackroute.myapp.repository.UserRepository;


@Controller
public class UserController {

    ApplicationContext context = 
            new ClassPathXmlApplicationContext("beans.xml");
    UserRepository userRepository = (UserRepository) context.getBean("userrepository");

     
	//UserRepository userRepository = new UserRepository();
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model) {
		List<User> userlist = userRepository.getAllUsers();
		model.addAttribute("userlist", userlist);
		return "index";
	}
	

	/*
	 * public String adduser(HttpServletRequest hreq, HttpServletResponse hresp) {
		String username = hreq.getParameter("username");
		String city=hreq.getParameter("city");
	 */
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public String adduser(@RequestParam("username") String username, @RequestParam("city") String city) {
        User user = (User) context.getBean("user");
	//	User user = new User();
		user.setUsername(username);
		user.setCity(city);
		userRepository.addUser(user);
		return "redirect:/";
	}
	
	
}
