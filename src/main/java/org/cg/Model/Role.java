package org.cg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "REQUEST")
public class Role {
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
	private String id;
	private String roleName;
	private DateTime date;
	public RoleLevel roleLevel;

	public void setId(String id)
	{
		this.id = id;
	}

	
	public String getId()
	{
		return id;
	}
	
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
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	
	
}
