package com.kodkent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodkent.dal.userDAO;
import com.kodkent.model.User;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userDAO userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> list(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User find(int id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(String column, String value, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
