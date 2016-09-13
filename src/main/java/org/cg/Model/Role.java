package org.cg.Model;


@Entity
@Table(name = "REQUEST")
public class Role {

	private String id;
	private String roleName;
	private DateTime date;
	public RoleLevel roleLevel;

	public void setId(String id)
	{
		this.id = id;
	}

	@Id
    @GeneratedValue
    @Column(name = "ID")
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
