package com.payrollsystem.dto;

public class SalaryDTO implements DTO {
	
	int salaryId;
	int empId;
	String date;
	int allowanceId;
	int deductionId;
	int salary;
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAllowanceId() {
		return allowanceId;
	}
	public void setAllowanceId(int allowanceId) {
		this.allowanceId = allowanceId;
	}
	public int getDeductionId() {
		return deductionId;
	}
	public void setDeductionId(int deductionId) {
		this.deductionId = deductionId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public SalaryDTO() {
		super();
	}
	public SalaryDTO(int salaryId, int empId, String date, int allowanceId, int deductionid, int salary) {
		super();
		this.salaryId = salaryId;
		this.empId = empId;
		this.date = date;
		this.allowanceId = allowanceId;
		this.deductionId = deductionId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SalaryDTO [salaryId=" + salaryId + ", empId=" + empId + ", date=" + date + ", allowanceId="
				+ allowanceId + ", deductionid=" + deductionId + ", salary=" + salary + "]";
	} 

}
