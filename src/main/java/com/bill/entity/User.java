package com.bill.entity;

/*
 * 用户权限类。
 * 
 * @author Xuyh
 */
public class User {

	private String objectNo;
	private String userId;
	private String userName;
	private String password;

	private int authorityType;

	private int isAvailable;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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



	public String getObjectNo() {
		return objectNo;
	}

	public void setObjectNo(String objectNo) {
		this.objectNo = objectNo;
	}

	public int getAuthorityType() {
		return authorityType;
	}

	public void setAuthorityType(int authorityType) {
		this.authorityType = authorityType;
	}

	public int getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}

}