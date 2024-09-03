package com.payrollsystem.dto;

public class PublicHolidayDTO implements DTO{
	
	int phId;
	String phName;
	String phDescription;
	public int getPhId() {
		return phId;
	}
	public void setPhId(int phId) {
		this.phId = phId;
	}
	public String getPhName() {
		return phName;
	}
	public void setPhName(String phName) {
		this.phName = phName;
	}
	public String getPhDescription() {
		return phDescription;
	}
	public void setPhDescription(String phDescription) {
		this.phDescription = phDescription;
	}
	public PublicHolidayDTO() {
		super();
	}
	public PublicHolidayDTO(int phId, String phName, String phDescription) {
		super();
		this.phId = phId;
		this.phName = phName;
		this.phDescription = phDescription;
	}
	@Override
	public String toString() {
		return "PublicHolidayMaster [phId=" + phId + ", phName=" + phName + ", phDescription=" + phDescription + "]";
	}
	
	

}
