package com.payrolsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.payrollsystem.dto.DTO;
import com.payrollsystem.dto.QualificationDTO;
import com.payrollsystem.util.PUtility;

public class QualificationDAO implements DAO{

	@Override
	public int addDTO(DTO dto) throws Exception {
		
		QualificationDTO qdto = (QualificationDTO) dto;
		
		System.out.println("in addDTO >> " + qdto.toString());
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "insert into tblqualification values (?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, qdto.getQualificationId());
		pstmt.setString(2, qdto.getQualificationName());
		pstmt.setString(3, qdto.getQualificationDesc());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int deleteDTO(DTO dto) throws Exception {
		QualificationDTO qdto = (QualificationDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "delete from tblqualification where qualificationId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, qdto.getQualificationId());
				
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int updateDTO(DTO dto) throws Exception {
		QualificationDTO qdto = (QualificationDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "update tblqualification set qualificationName=?, qualificationDesc = ? where qualificationId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		
		pstmt.setString(1, qdto.getQualificationName());
		pstmt.setString(2, qdto.getQualificationDesc());
		pstmt.setInt(3, qdto.getQualificationId());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public DTO getDTO(DTO dto) throws Exception {
		QualificationDTO qdto = (QualificationDTO) dto;
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblqualification where qualificationId=?";
		
		PreparedStatement pstmt = con.prepareStatement(strQuery);
		pstmt.setInt(1, qdto.getQualificationId());
				
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) 
		{
			 qdto.setQualificationId(rs.getInt(1));
			 qdto.setQualificationName(rs.getString(2));
			 qdto.setQualificationDesc(rs.getString(3));
			 
		} 
		
		return qdto;
	}

	@Override
	public List<DTO> getAllDTO() throws Exception {
		QualificationDTO qdto=null;
		List<DTO> lstUDTO = new ArrayList<DTO>(); 
		
		Connection con = PUtility.getMySQLConnection();
		String strQuery= "select * from tblqualification";
		
		Statement pstmt = con.createStatement();
				
		ResultSet rs = pstmt.executeQuery(strQuery);
		while(rs.next()) 
		{
			 qdto = new QualificationDTO();
			 qdto.setQualificationId(rs.getInt(1));
			 qdto.setQualificationName(rs.getString(2));
			 qdto.setQualificationDesc(rs.getString(3));
			 lstUDTO.add(qdto);
		} 
		
		return lstUDTO;
	}


}
