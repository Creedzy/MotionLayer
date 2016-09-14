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
	private String role;
	private boolean activated;
	private boolean contactPreference;
	private boolean emailActive;
	private byte[] hashKey;
	
	


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

	public void setRole(String role)
	{
		this.role = role;
	}

	public String getRole()
	{
		return role;
	}

	public void setActivated(boolean activated)
	{
		this.activated = activated;
	}

	public boolean isActivated()
	{
		return activated;
	}

	public void setContactPreference(boolean contactPreference)
	{
		this.contactPreference = contactPreference;
	}

	public boolean isContactPreference()
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
