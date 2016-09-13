package org.cg.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
	
	@Id
    @GeneratedValue
    @Column(name = "USER_ID")
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
	
	
	

	
public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	public boolean isContactPreference() {
		return contactPreference;
	}

	public void setContactPreference(boolean contactPreference) {
		this.contactPreference = contactPreference;
	}
	
	public boolean isEmailActive() {
		return emailActive;
	}

	public void setEmailActive(boolean emailActive) {
		this.emailActive = emailActive;
	}
	
	public byte[] getHashKey() {
		return hashKey;
	}

	public void setHashKey(byte[] hashKey) {
		this.hashKey = hashKey;
	}



	
	
}
