package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.PublicHolidayDTO;
import com.payrollsystem.dto.DTO;
import com.payrollsystem.util.PUtility;

public class PublicHolidayDAO implements DAO {

public int addDTO(DTO dto) throws Exception {
		
		PublicHolidayDTO pdto = (PublicHolidayDTO) dto;
		
		System.out.println("in addDTO >> " + pdto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblpublicholiday values (?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, pdto.getPhId());
		pstmt.setString(2, pdto.getPhName());
		pstmt.setString(3, pdto.getPhDescription());

		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		PublicHolidayDTO pdto = (PublicHolidayDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblpublicholiday where phId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, pdto.getPhId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		PublicHolidayDTO pdto = (PublicHolidayDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblpublicholiday set phName=?, phDescription = ? where phId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, pdto.getPhName());
		pstmt.setString(2, pdto.getPhDescription());
		pstmt.setInt(3, pdto.getPhId());


		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		PublicHolidayDTO pdto = (PublicHolidayDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblpublicholiday where phId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, pdto.getPhId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 pdto.setPhId(rs.getInt(1));
			 pdto.setPhName(rs.getString(2));
			 pdto.setPhDescription(rs.getString(3));
			 
		} 
		
		return pdto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		PublicHolidayDTO pdto=null;
		List<DTO> lstpdto = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblpublicholiday";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 pdto = new PublicHolidayDTO();
			 pdto.setPhId(rs.getInt(1));
			 pdto.setPhName(rs.getString(2));
			 pdto.setPhDescription(rs.getString(3));
			 

			 lstpdto.add(pdto);
		} 
		
		return lstpdto;
	}

}
