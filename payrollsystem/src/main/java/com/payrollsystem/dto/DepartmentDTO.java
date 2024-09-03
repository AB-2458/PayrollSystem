package com.payrollsystem.dto;

public class DepartmentDTO implements DTO {
	
	int deptId;
	String deptName;
	String deptDesc;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public DepartmentDTO() {
		super();
	}
	public DepartmentDTO(int deptId, String deptName, String deptDesc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptId=" + deptId + ", deptName=" + deptName + ", deptDesc=" + deptDesc + "]";
	}

}
