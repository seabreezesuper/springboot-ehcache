package com.bill.service;

import com.bill.entity.User;

public interface UserService {
	public User getUser(String id);
	public User saveUser(User user);
}
