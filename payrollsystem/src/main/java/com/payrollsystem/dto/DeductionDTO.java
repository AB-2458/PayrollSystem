package com.payrollsystem.dto;

public class DeductionDTO implements DTO {
	int deductionId;
	String deductionName;
	String deductionDescription;
	String deductionAmt;
	public int getDeductionId() {
		return deductionId;
	}
	public void setDeductionId(int deductionId) {
		this.deductionId = deductionId;
	}
	public String getDeductionName() {
		return deductionName;
	}
	public void setDeductionName(String deductionName) {
		this.deductionName = deductionName;
	}
	public String getDeductionDescription() {
		return deductionDescription;
	}
	public void setDeductionDescription(String deductionDescription) {
		this.deductionDescription = deductionDescription;
	}
	public String getDeductionAmt() {
		return deductionAmt;
	}
	public void setDeductionAmt(String deductionAmt) {
		this.deductionAmt = deductionAmt;
	}
	public DeductionDTO() {
		super();
	}
	public DeductionDTO(int deductionId, String deductionName, String deductionDescription, String deductionAmt) {
		super();
		this.deductionId = deductionId;
		this.deductionName = deductionName;
		this.deductionDescription = deductionDescription;
		this.deductionAmt = deductionAmt;
	}
	@Override
	public String toString() {
		return "DeductionDTO [deductionId=" + deductionId + ", deductionName=" + deductionName
				+ ", deductionDescription=" + deductionDescription + ", deductionAmt=" + deductionAmt + "]";
	}
	

}
