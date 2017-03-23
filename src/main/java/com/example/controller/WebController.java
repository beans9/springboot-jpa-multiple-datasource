package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.User;
import com.example.repo.alpha.UserRepoAlpha;
import com.example.repo.beta.UserRepoBeta;

@Controller
public class WebController {
	@Autowired
	UserRepoAlpha userRepoAlpha;  
	
	@Autowired
	UserRepoBeta userRepoBeta;
	
	@RequestMapping("/addAlpha")
	@ResponseBody
	public User addAlpha(User user){
		return userRepoAlpha.save(user);
	}
	
	@RequestMapping("/addBeta")
	@ResponseBody
	public User addBeta(User user){
		return userRepoBeta.save(user);
	}
}
