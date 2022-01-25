package com.multiclient.website.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Role {
	
	
	private Long roleId;
	
	@Enumerated(EnumType.STRING)
	private ERole roleName;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public ERole getRoleName() {
		return roleName;
	}

	public void setRoleName(ERole roleName) {
		this.roleName = roleName;
	}

	public Role(Long roleId, ERole roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	public Role() {
		
	}
	
	
	

}
