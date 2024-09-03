package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.SalaryDTO;
import com.payrollsystem.util.PUtility;

public class SalaryDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		SalaryDTO sdto = (SalaryDTO) dto;
		
		System.out.println("in addDTO >> " + sdto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblsalary values (?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, sdto.getSalaryId());
		pstmt.setInt(2, sdto.getEmpId());
		pstmt.setString(3, sdto.getDate());
		pstmt.setInt(4, sdto.getAllowanceId());
		pstmt.setInt(5, sdto.getDeductionId());
		pstmt.setInt(6, sdto.getSalary());



		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		SalaryDTO sdto = (SalaryDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblsalary where salaryId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, sdto.getSalaryId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		SalaryDTO sdto = (SalaryDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblsalary set empId=?, date = ? , allowanceId = ? , deductionId = ?, salary = ? where salaryId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		
		pstmt.setInt(1, sdto.getEmpId());
		pstmt.setString(2, sdto.getDate());
		pstmt.setInt(3, sdto.getAllowanceId());
		pstmt.setInt(4, sdto.getDeductionId());
		pstmt.setInt(5, sdto.getSalary());
		pstmt.setInt(6, sdto.getSalaryId());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		SalaryDTO sdto = (SalaryDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblsalary where salaryId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, sdto.getSalaryId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 sdto.setSalaryId(rs.getInt(1));
			 sdto.setEmpId(rs.getInt(2));
			 sdto.setDate(rs.getString(3));
			 sdto.setAllowanceId(rs.getInt(4));
			 sdto.setDeductionId(rs.getInt(5));
			 sdto.setSalary(rs.getInt(6));


		} 
		
		return sdto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		SalaryDTO sdto=null;
		List<DTO> lstsdto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblsalary";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 sdto = new SalaryDTO();
			 sdto.setSalaryId(rs.getInt(1));
			 sdto.setEmpId(rs.getInt(2));
			 sdto.setDate(rs.getString(3));
			 sdto.setAllowanceId(rs.getInt(4));
			 sdto.setDeductionId(rs.getInt(5));
			 sdto.setSalary(rs.getInt(6));

			 lstsdto.add(sdto);
		} 
		
		return lstsdto;
	}

}
