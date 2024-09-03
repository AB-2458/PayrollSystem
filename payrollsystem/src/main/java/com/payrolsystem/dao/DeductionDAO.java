package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.DeductionDTO;
import com.payrollsystem.util.PUtility;

public class DeductionDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		DeductionDTO adto = (DeductionDTO) dto;
		
		System.out.println("in addDTO >> " + adto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tbldeduction values (?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getDeductionId());
		pstmt.setString(2, adto.getDeductionName());
		pstmt.setString(3, adto.getDeductionDescription());
		pstmt.setString(4, adto.getDeductionAmt());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		DeductionDTO adto = (DeductionDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tbldeduction where deductionId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getDeductionId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		DeductionDTO adto = (DeductionDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tbldeduction set deductionName=?, deductionDescription = ? , deductionAmt = ? where deductionId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, adto.getDeductionName());
		pstmt.setString(2, adto.getDeductionDescription());
		pstmt.setString(3, adto.getDeductionAmt());
		pstmt.setInt(4, adto.getDeductionId());
		

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		DeductionDTO adto = (DeductionDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbldeduction where deductionId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getDeductionId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 adto.setDeductionId(rs.getInt(1));
			 adto.setDeductionName(rs.getString(2));
			 adto.setDeductionDescription(rs.getString(3));
			 adto.setDeductionAmt(rs.getString(4));
		} 
		
		return adto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		DeductionDTO adto=null;
		List<DTO> lstadto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbldeduction";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 adto = new DeductionDTO();
			 adto.setDeductionId(rs.getInt(1));
			 adto.setDeductionName(rs.getString(2));
			 adto.setDeductionDescription(rs.getString(3));
			 adto.setDeductionAmt(rs.getString(4));

			 lstadto.add(adto);
		} 
		
		return lstadto;
	}

}
