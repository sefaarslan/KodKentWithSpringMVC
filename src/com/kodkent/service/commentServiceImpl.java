package com.kodkent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodkent.dal.commentDAO;
import com.kodkent.model.Comment;
@Service
public class commentServiceImpl implements commentService {

	@Autowired
	private commentDAO commentDao;
	
	@Override
	public void save(Comment comment) {
		commentDao.save(comment);
	}

	@Override
	public void delete(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> list(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment find(int id, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> search(String column, String value, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> search(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

}
