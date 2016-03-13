package org.crce.interns.view;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	private String userName;
	private String password;
	private boolean accountActive;
	private boolean currentState;
	private long lastLogin;
	private int roleId;
	private Date createdDate;
	private Date modifiedDate;
	private String modifiedBy;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccountActive() {
		return accountActive;
	}
	public void setAccountActive(boolean accountActive) {
		this.accountActive = accountActive;
	}
	public boolean isCurrentState() {
		return currentState;
	}
	public void setCurrentState(boolean currentState) {
		this.currentState = currentState;
	}
	public long getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(long lastLogin) {
		this.lastLogin = lastLogin;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	

}
