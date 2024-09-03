package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.DepartmentDTO;
import com.payrollsystem.util.PUtility;

public class DepartmentDAO implements DAO{

	@Override
	public int addDTO(DTO dto) throws Exception {
		
		DepartmentDTO ddto = (DepartmentDTO) dto;
		
		System.out.println("in addDTO >> " + ddto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tbldepartment values (?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ddto.getDeptId());
		pstmt.setString(2, ddto.getDeptName());
		pstmt.setString(3, ddto.getDeptDesc());
		
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		DepartmentDTO ddto = (DepartmentDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tbldepartment where deptId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ddto.getDeptId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		DepartmentDTO ddto = (DepartmentDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tbldepartment set deptName=?, deptDesc = ? where deptId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, ddto.getDeptName());
		pstmt.setString(2, ddto.getDeptDesc());
		pstmt.setInt(3, ddto.getDeptId());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		DepartmentDTO ddto = (DepartmentDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbldepartment where deptId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ddto.getDeptId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 ddto.setDeptId(rs.getInt(1));
			 ddto.setDeptName(rs.getString(2));
			 ddto.setDeptDesc(rs.getString(3));
		
		} 
		
		return ddto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		DepartmentDTO ddto=null;
		List<DTO> lstDDTO = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbldepartment";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 ddto = new DepartmentDTO();
			 ddto.setDeptId(rs.getInt(1));
			 ddto.setDeptName(rs.getString(2));
			 ddto.setDeptDesc(rs.getString(3));
			 lstDDTO.add(ddto);
		} 
		
		return lstDDTO;
	}


}
