package com.blueyonder.freemaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import freemarker.ext.util.ModelFactory;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateModel;

@Controller
public class UserController {
	
	@GetMapping("/")
	public ModelAndView  getUsers(){
		List<User> userList = new ArrayList<>();
		User user1 = new User(1,"Harsha","HYD");
		User user2 = new User(2,"Vardhan","Bang");
		User user3 = new User(3,"Achary","Chennai");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		Map userMap = new HashMap<String, Object>();
		userMap.put("users", userList);
		return new ModelAndView("index",userMap);
	}
}
