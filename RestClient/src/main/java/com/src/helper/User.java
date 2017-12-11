package com.src.helper;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Integer id;
	private String userName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static List<User> getTempUser(){
		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("User1");
		User user2 = new User();
		user2.setId(2);
		user2.setUserName("User2");
		list.add(user1);
		list.add(user2);
		return list;
	}
}
