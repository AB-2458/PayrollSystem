package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.AllowanceDTO;
import com.payrollsystem.util.PUtility;

public class AllowanceDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		AllowanceDTO adto = (AllowanceDTO) dto;
		
		System.out.println("in addDTO >> " + adto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblallowance values (?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAllowanceId());
		pstmt.setString(2, adto.getAllowanceName());
		pstmt.setString(3, adto.getAllowanceDescription());
		pstmt.setString(4, adto.getAllowanceAmt());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		AllowanceDTO adto = (AllowanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblallowance where allowanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAllowanceId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		AllowanceDTO adto = (AllowanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblallowance set allowanceName=?, allowanceDescription = ? , allowanceAmt = ? where allowanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, adto.getAllowanceName());
		pstmt.setString(2, adto.getAllowanceDescription());
		pstmt.setString(3, adto.getAllowanceAmt());
		pstmt.setInt(4, adto.getAllowanceId());
		

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		AllowanceDTO adto = (AllowanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblallowance where allowanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAllowanceId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 adto.setAllowanceId(rs.getInt(1));
			 adto.setAllowanceName(rs.getString(2));
			 adto.setAllowanceDescription(rs.getString(3));
			 adto.setAllowanceAmt(rs.getString(4));
		} 
		
		return adto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		AllowanceDTO adto=null;
		List<DTO> lstadto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblallowance";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 adto = new AllowanceDTO();
			 adto.setAllowanceId(rs.getInt(1));
			 adto.setAllowanceName(rs.getString(2));
			 adto.setAllowanceDescription(rs.getString(3));
			 adto.setAllowanceAmt(rs.getString(4));

			 lstadto.add(adto);
		} 
		
		return lstadto;
	}

}
