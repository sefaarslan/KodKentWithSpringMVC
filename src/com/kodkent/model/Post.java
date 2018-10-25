package com.kodkent.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="postname")
	private String postname;
	
	@Column(name="postexp")
	private String postexp;
	
	@Column(name="postname")
	private Date postdate;
	
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(fetch=FetchType.LAZY ,cascade=CascadeType.ALL)
	@JoinColumn(name="posts_id")
	
	private List<Comment> comment;
 	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostname() {
		return postname;
	}
	public void setPostname(String postname) {
		this.postname = postname;
	}
	public String getPostexp() {
		return postexp;
	}
	public void setPostexp(String postexp) {
		this.postexp = postexp;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public User getUsers() {
		return user;
	}
	public void setUsers(User user) {
		this.user = user;
	}
	
	public void add(Comment tempComment) {
		
		if (comment == null) {
			comment = new ArrayList<>();
		}
		
		comment.add(tempComment);		
		
	}
	
}
