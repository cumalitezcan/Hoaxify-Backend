package com.hoaxify.ws.user;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String username;
	
	private String displayName;
	
	private String password;

	@Override
	public String toString() {
		return "User [username=" + username + ", displayName=" + displayName + ", password=" + password + "]";
	}
	
	
	
	

}
