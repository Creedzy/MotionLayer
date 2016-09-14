package org.cg.Model.dto;

import org.cg.Model.RoleLevel;

public class RoleDTO
{
	private Long id;
	private String roleName;
	private String date;
	public RoleLevel roleLevel;

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
		this.roleName = roleName;
	}

	public String getRoleName()
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

	public void setRoleLevel(RoleLevel roleLevel)
	{
		this.roleLevel = roleLevel;
	}

	public RoleLevel getRoleLevel()
	{
		return roleLevel;
	}}
