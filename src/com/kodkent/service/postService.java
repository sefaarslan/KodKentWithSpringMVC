package com.kodkent.service;

import java.util.List;

import com.kodkent.model.Post;

public interface postService {
	
	public void save(Post post);
    public void delete(Post post);
    public List<Post> list(Post post);   
    public Post find(int id, Post post);
    public List<Post> search(String column,String value,Post post);
    public List<Post> search(Post post);

}
