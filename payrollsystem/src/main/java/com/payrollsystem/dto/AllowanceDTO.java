package com.payrollsystem.dto;

public class AllowanceDTO implements DTO {
	int allowanceId;
	String allowanceName;
	String allowanceDescription;
	String allowanceAmt;
	public int getAllowanceId() {
		return allowanceId;
	}
	public void setAllowanceId(int allowanceId) {
		this.allowanceId = allowanceId;
	}
	public String getAllowanceName() {
		return allowanceName;
	}
	public void setAllowanceName(String allowanceName) {
		this.allowanceName = allowanceName;
	}
	public String getAllowanceDescription() {
		return allowanceDescription;
	}
	public void setAllowanceDescription(String allowanceDescription) {
		this.allowanceDescription = allowanceDescription;
	}
	public String getAllowanceAmt() {
		return allowanceAmt;
	}
	public void setAllowanceAmt(String allowanceAmt) {
		this.allowanceAmt = allowanceAmt;
	}
	public AllowanceDTO() {
		super();
	}
	public AllowanceDTO(int allowanceId, String allowanceName, String allowanceDescription, String allowanceAmt) {
		super();
		this.allowanceId = allowanceId;
		this.allowanceName = allowanceName;
		this.allowanceDescription = allowanceDescription;
		this.allowanceAmt = allowanceAmt;
	}
	@Override
	public String toString() {
		return "AllowanceDTO [allowanceId=" + allowanceId + ", allowanceName=" + allowanceName
				+ ", allowanceDescription=" + allowanceDescription + ", allowanceAmt=" + allowanceAmt + "]";
	}
	

}
