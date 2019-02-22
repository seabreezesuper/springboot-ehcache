package com.bill.service.impl;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bill.entity.User;
import com.bill.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	@Cacheable(value="demo",key="'user_'+#id")
	public User getUser(String id) {
		System.out.println("没有走缓存：" + id);
		
		User user = new User();
		user.setUserId("001");
		user.setUserName("zhangsan");

		return user;
	}

	@Override
	@CachePut(value="demo",key="'user_'+#user.getUserId()")
	public User saveUser(User user) {
		System.out.println("存入缓存：" + user.getUserId());
		return user;
	}

}
