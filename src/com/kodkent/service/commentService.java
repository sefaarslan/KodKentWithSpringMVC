package com.kodkent.service;

import java.util.List;

import com.kodkent.model.Comment;

public interface commentService {

	public void save(Comment comment);
    public void delete(Comment comment);
    public List<Comment> list(Comment comment);   
    public Comment find(int id, Comment comment);
    public List<Comment> search(String column,String value,Comment comment);
    public List<Comment> search(Comment comment);
}
