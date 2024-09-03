package com.payrollsystem.dto;

public class QualificationDTO implements DTO {
	int qualificationId;
	String qualificationName;
	String qualificationDesc;
	public int getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	public String getQualificationDesc() {
		return qualificationDesc;
	}
	public void setQualificationDesc(String qualificationDesc) {
		this.qualificationDesc = qualificationDesc;
	}
	public QualificationDTO() {
		super();
	}
	public QualificationDTO(int qualificationId, String qualificationName, String qualificationDesc) {
		super();
		this.qualificationId = qualificationId;
		this.qualificationName = qualificationName;
		this.qualificationDesc = qualificationDesc;
	}
	@Override
	public String toString() {
		return "QualificationDTO [qualificationId=" + qualificationId + ", qualificationName=" + qualificationName
				+ ", qualificationDesc=" + qualificationDesc + "]";
	}
	

}
