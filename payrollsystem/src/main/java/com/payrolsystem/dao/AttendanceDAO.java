package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.AttendanceDTO;
import com.payrollsystem.util.PUtility;

public class AttendanceDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		AttendanceDTO adto = (AttendanceDTO) dto;
		
		System.out.println("in addDTO >> " + adto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblAttendance values (?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAttendanceId());
		pstmt.setString(2, adto.getAttendanceName());
		pstmt.setString(3, adto.getAttendanceStatus());
		pstmt.setInt(4, adto.getAttendancePercentage());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		AttendanceDTO adto = (AttendanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblAttendance where attendanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAttendanceId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		AttendanceDTO adto = (AttendanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblAttendance set attendanceName=?, attendanceStatus = ? , attendancePercentage = ? where attendanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, adto.getAttendanceName());
		pstmt.setString(2, adto.getAttendanceStatus());
		pstmt.setInt(3, adto.getAttendancePercentage());
		pstmt.setInt(4, adto.getAttendanceId());
		

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		AttendanceDTO adto = (AttendanceDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblAttendance where attendanceId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, adto.getAttendanceId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 adto.setAttendanceId(rs.getInt(1));
			 adto.setAttendanceName(rs.getString(2));
			 adto.setAttendanceStatus(rs.getString(3));
			 adto.setAttendancePercentage(rs.getInt(4));
		} 
		
		return adto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		AttendanceDTO adto=null;
		List<DTO> lstadto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblAttendance";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 adto = new AttendanceDTO();
			 adto.setAttendanceId(rs.getInt(1));
			 adto.setAttendanceName(rs.getString(2));
			 adto.setAttendanceStatus(rs.getString(3));
			 adto.setAttendancePercentage(rs.getInt(4));

			 lstadto.add(adto);
		} 
		
		return lstadto;
	}

}
