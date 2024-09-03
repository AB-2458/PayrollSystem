package com.payrollsystem.dto;

public class UserDTO implements DTO {
	
	int userId; 
	String userName;
	String userPwd;
	String userAddress;
	String userMobile;
	String userEmail;
	String userStatus;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int userId, String userName, String userPwd, String userAddress, String userMobile, String userEmail,
			String userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAddress = userAddress;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userAddress="
				+ userAddress + ", userMobile=" + userMobile + ", userEmail=" + userEmail + ", userStatus=" + userStatus
				+ "]";
	}
	
	


}
