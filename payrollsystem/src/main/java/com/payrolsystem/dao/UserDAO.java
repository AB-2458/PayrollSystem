package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.UserDTO;
import com.payrollsystem.util.PUtility;

public class UserDAO implements DAO{

	@Override
	public int addDTO(DTO dto) throws Exception {
		
		UserDTO udto = (UserDTO) dto;
		
		System.out.println("in addDTO >> " + udto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tbluser values (?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, udto.getUserId());
		pstmt.setString(2, udto.getUserName());
		pstmt.setString(3, udto.getUserPwd());
		pstmt.setString(4, udto.getUserAddress());
		pstmt.setString(5, udto.getUserMobile());
		pstmt.setString(6, udto.getUserEmail());
		pstmt.setString(7, udto.getUserStatus());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		UserDTO udto = (UserDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tbluser where userId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, udto.getUserId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		UserDTO udto = (UserDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tbluser set userName=?, userPwd = ?, userAddress=?, userMobile=?,userEmail=?,userStatus=? where userId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, udto.getUserName());
		pstmt.setString(2, udto.getUserPwd());
		pstmt.setString(3, udto.getUserAddress());
		pstmt.setString(4, udto.getUserMobile());
		pstmt.setString(5, udto.getUserEmail());
		pstmt.setString(6, udto.getUserStatus());
		pstmt.setInt(7, udto.getUserId());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		UserDTO udto = (UserDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbluser where userId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, udto.getUserId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 udto.setUserId(rs.getInt(1));
			 udto.setUserName(rs.getString(2));
			 udto.setUserPwd(rs.getString(3));
			 udto.setUserAddress(rs.getString(4));
			 udto.setUserMobile(rs.getString(5));
			 udto.setUserEmail(rs.getString(6));
			 udto.setUserStatus(rs.getString(7));
		} 
		
		return udto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		UserDTO udto=null;
		List<DTO> lstUDTO = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tbluser";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 udto = new UserDTO();
			 udto.setUserId(rs.getInt(1));
			 udto.setUserName(rs.getString(2));
			 udto.setUserPwd(rs.getString(3));
			 udto.setUserAddress(rs.getString(4));
			 udto.setUserMobile(rs.getString(5));
			 udto.setUserEmail(rs.getString(6));	
			 udto.setUserStatus(rs.getString(7));
			 lstUDTO.add(udto);
		} 
		
		return lstUDTO;
	}


}
