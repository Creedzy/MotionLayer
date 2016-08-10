package org.cg.Model;

public class Role {

	private String roleName;
	private String date;
	public RoleLevel roleLevel;
	
	public RoleLevel getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(RoleLevel roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Role(){
		
	}
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
