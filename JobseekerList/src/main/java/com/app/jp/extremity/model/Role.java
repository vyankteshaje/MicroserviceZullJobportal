package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{
		@Id
		private String roleId;
		private String roleName;
		public String getRoleId() {
			return roleId;
		}
		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}		
}
