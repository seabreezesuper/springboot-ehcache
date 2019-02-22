package com.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.entity.User;
import com.bill.service.UserService;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
    CacheManager cacheManager;
	
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable("id")String id){
		User user = userService.getUser(id);
		return user;
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(User user){
		userService.saveUser(user);
		return "success";
	}
	
	@RequestMapping("/showCache")
	public void showCache(){

		//获取Cache
		Cache cache=cacheManager.getCache("demo");

		System.out.println(cache.get("user_001").getObjectValue());

	}
}
