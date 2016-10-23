package org.cg.Model.dto;

import java.util.List;

public class RoleDTO
{
	private Long id;
	private String role;
	private String date;
		
	@Override
	public String toString() {
		return "Role: [id=" + id + " ,role=" + role + " ,date=" + date + "]";
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}
	
	

	public void setRoleName(String roleName)
	{
		this.role = roleName;
	}

	public String getRoleName()
	{
		return role;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getDate()
	{
		return date;
	}

	}
