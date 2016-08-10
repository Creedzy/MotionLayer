package org.cg.Model;

import java.util.List;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "usr_reg")
public class User {
	
	private String userId;
	private String nickname;
	private List<Role> roles;
	private String name;
	private String email;
	private String password;
	private String role;
	private boolean activated;
	private boolean contactPreference;
	private boolean emailActive;
	private byte[] hashKey;
	
	public User(){
		
	}
@DynamoDBHashKey	
public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
@DynamoDBAttribute
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
@DynamoDBAttribute
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
@DynamoDBAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
@DynamoDBAttribute
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
@DynamoDBAttribute
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@DynamoDBAttribute
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@DynamoDBAttribute
	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	@DynamoDBAttribute
	public boolean isContactPreference() {
		return contactPreference;
	}

	public void setContactPreference(boolean contactPreference) {
		this.contactPreference = contactPreference;
	}
	@DynamoDBAttribute
	public boolean isEmailActive() {
		return emailActive;
	}

	public void setEmailActive(boolean emailActive) {
		this.emailActive = emailActive;
	}
	@DynamoDBAttribute
	public byte[] getHashKey() {
		return hashKey;
	}

	public void setHashKey(byte[] hashKey) {
		this.hashKey = hashKey;
	}



	
	
}
