package com.payrollsystem.dto;

public class AttendanceDTO implements DTO {
	int attendanceId;
	String attendanceName;
	String attendanceStatus;
	int attendancePercentage;
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getAttendanceName() {
		return attendanceName;
	}
	public void setAttendanceName(String attendanceName) {
		this.attendanceName = attendanceName;
	}
	public String getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	public int getAttendancePercentage() {
		return attendancePercentage;
	}
	public void setAttendancePercentage(int attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}
	public AttendanceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttendanceDTO(int attendanceId, String attendanceName, String attendanceStatus, int attendancePercentage) {
		super();
		this.attendanceId = attendanceId;
		this.attendanceName = attendanceName;
		this.attendanceStatus = attendanceStatus;
		this.attendancePercentage = attendancePercentage;
	}
	@Override
	public String toString() {
		return "AttendanceDTO [attendanceId=" + attendanceId + ", attendanceName=" + attendanceName
				+ ", attendanceStatus=" + attendanceStatus + ", attendancePercentage=" + attendancePercentage
				+ ", getAttendanceId()=" + getAttendanceId() + ", getAttendanceName()=" + getAttendanceName()
				+ ", getAttendanceStatus()=" + getAttendanceStatus() + ", getAttendancePercentage()="
				+ getAttendancePercentage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
