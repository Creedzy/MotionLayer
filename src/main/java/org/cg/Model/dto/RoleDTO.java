package org.cg.Model.dto;

public class RoleDTO
{
	private String id;
	private String roleName;
	private String date;
	public RoleLevel roleLevel;

	public void setId(String id)
	{
		this.id = id;
	}

	public String getId()
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
