package com.kodkent.service;

import java.util.List;
import com.kodkent.model.User;

public interface userService {

	public void save(User user);
    public void delete(User user);
    public List<User> list(User user);   
    public User find(int id, User user);
    public List<User> search(String column,String value,User user);
    public List<User> search(User user);
}
