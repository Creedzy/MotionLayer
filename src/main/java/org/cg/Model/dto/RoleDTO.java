package org.cg.Model.dto;

import java.util.List;

public class RoleDTO
{
	private Long id;
	private List<String> roleName;
	private String date;
	

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}
	
	public void addRole(String role) {
		if(role != null)
		this.roleName.add(role);
	}

	public void setRoleName(List<String> roleName)
	{
		this.roleName = roleName;
	}

	public List<String> getRoleName()
	{
		return roleName;
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
