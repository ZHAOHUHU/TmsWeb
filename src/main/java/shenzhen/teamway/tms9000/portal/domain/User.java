
package shenzhen.teamway.tms9000.portal.domain;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8562785097833703997L;
	private int id;
	private String userName;
	private String password;
	private int groupId;
	private int roleId;
	private String createTime;
	private String updateTime;
	private int passwordLevel;
	private String passwordBeginTime;
	private int status;
	private int passwordStatus;
	private int creator;

	private String verifyCode;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPasswordStatus() {
		return passwordStatus;
	}

	public void setPasswordStatus(int passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getPasswordLevel() {
		return passwordLevel;
	}

	public void setPasswordLevel(int passwordLevel) {
		this.passwordLevel = passwordLevel;
	}

	public String getPasswordBeginTime() {
		return passwordBeginTime;
	}

	public void setPasswordBeginTime(String passwordBeginTime) {
		this.passwordBeginTime = passwordBeginTime;
	}

	public int getCreator() {
		return creator;
	}

	public void setCreator(int creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", groupId=" + groupId
				+ ", roleId=" + roleId + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", passwordLevel=" + passwordLevel + ", passwordBeginTime=" + passwordBeginTime + ", status=" + status
				+ ", passwordStatus=" + passwordStatus + ", creator=" + creator + ", verifyCode=" + verifyCode + "]";
	}

}
