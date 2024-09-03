package com.payrolsystem.dao;

import java.util.List;

import com.payrollsystem.dto.DTO;

public interface DAO {
	
	public int addDTO(DTO dto) throws Exception; 
	public int deleteDTO(DTO dto) throws Exception;
	public int updateDTO(DTO dto) throws Exception;
	public DTO getDTO(DTO dto) throws Exception;
	public List<DTO>  getAllDTO() throws Exception;


}
