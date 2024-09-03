package com.payrollsystem.dto;

public class LeaveDTO implements DTO {
	
	int leaveId;
	String leaveName;
	String leaveDate;
	String leaveReason;
	String leaveStatus;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public LeaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveDTO(int leaveId, String leaveName, String leaveDate, String leaveReason, String leaveStatus) {
		super();
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.leaveDate = leaveDate;
		this.leaveReason = leaveReason;
		this.leaveStatus = leaveStatus;
	}
	@Override
	public String toString() {
		return "LeaveDTO [leaveId=" + leaveId + ", leaveName=" + leaveName + ", leaveDate=" + leaveDate
				+ ", leaveReason=" + leaveReason + ", leaveStatus=" + leaveStatus + ", getLeaveId()=" + getLeaveId()
				+ ", getLeaveName()=" + getLeaveName() + ", getLeaveDate()=" + getLeaveDate() + ", getLeaveReason()="
				+ getLeaveReason() + ", getLeaveStatus()=" + getLeaveStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
