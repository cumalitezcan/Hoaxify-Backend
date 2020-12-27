package com.hoaxify.ws.user;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private Long id;
	
	private String username;
	
	private String displayName;
	
	private String password;

	@Override
	public String toString() {
		return "User [username=" + username + ", displayName=" + displayName + ", password=" + password + "]";
	}
	
	
	
	

}
