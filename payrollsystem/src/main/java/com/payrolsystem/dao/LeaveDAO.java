package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.LeaveDTO;
import com.payrollsystem.dto.DTO;
import com.payrollsystem.util.PUtility;

public class LeaveDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		LeaveDTO ldto = (LeaveDTO) dto;
		
		System.out.println("in addDTO >> " + ldto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblleave values (?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ldto.getLeaveId());
		pstmt.setString(2, ldto.getLeaveName());
		pstmt.setString(3, ldto.getLeaveDate());
		pstmt.setString(4, ldto.getLeaveReason());
		pstmt.setString(5, ldto.getLeaveStatus());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		LeaveDTO ldto = (LeaveDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblleave where leaveId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ldto.getLeaveId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		LeaveDTO ldto = (LeaveDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblleave set leaveName=?, leaveDate = ? , leaveReason = ?, leaveStatus = ? where leaveId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, ldto.getLeaveName());
		pstmt.setString(2, ldto.getLeaveDate());
		pstmt.setString(3, ldto.getLeaveReason());
		pstmt.setString(4, ldto.getLeaveStatus());
		
		pstmt.setInt(5, ldto.getLeaveId());


		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		LeaveDTO ldto = (LeaveDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblleave where leaveId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, ldto.getLeaveId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 ldto.setLeaveId(rs.getInt(1));
			 ldto.setLeaveName(rs.getString(2));
			 ldto.setLeaveDate(rs.getString(3));
			 ldto.setLeaveReason(rs.getString(4));
			 ldto.setLeaveStatus(rs.getString(5));
			 
		} 
		
		return ldto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		LeaveDTO ldto=null;
		List<DTO> lstldto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblleave";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 ldto = new LeaveDTO();
			 ldto.setLeaveId(rs.getInt(1));
			 ldto.setLeaveName(rs.getString(2));
			 ldto.setLeaveDate(rs.getString(3));
			 ldto.setLeaveReason(rs.getString(4));
			 ldto.setLeaveStatus(rs.getString(5));
			 

			 lstldto.add(ldto);
		} 
		
		return lstldto;
	}

}
