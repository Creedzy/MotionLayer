package org.cg.Model.dto;

import java.util.List;

import org.cg.Model.Role;

public class UserDTO
{
	private Long userId;
	private String nickname;
	private List<Role> roles;
	private String name;
	private String email;
	private String password;
	private boolean activated;
	private String contactPreference;
	private boolean emailActive;
	private byte[] hashKey;
	
	
	@Override
	public String toString() {
		return "[ UserID:" + userId + ", Nickname:" + nickname + ", Roles:" + roles + ", Name:" + name + ", email:" + email + ", activated: "
				+ activated + ", contactPreference:" + contactPreference + ", emaiActive:" + emailActive + ", hashKey:" + hashKey + "]";
		
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setRoles(List<Role> roles)
	{
		this.roles = roles;
	}

	public List<Role> getRoles()
	{
		return roles;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	

	public void setActivated(boolean activated)
	{
		this.activated = activated;
	}

	public boolean isActivated()
	{
		return activated;
	}

	public void setContactPreference(String contactPreference)
	{
		this.contactPreference = contactPreference;
	}

	public String isContactPreference()
	{
		return contactPreference;
	}

	public void setEmailActive(boolean emailActive)
	{
		this.emailActive = emailActive;
	}

	public boolean isEmailActive()
	{
		return emailActive;
	}

	public void setHashKey(byte[] hashKey)
	{
		this.hashKey = hashKey;
	}

	public byte[] getHashKey()
	{
		return hashKey;
	}}
