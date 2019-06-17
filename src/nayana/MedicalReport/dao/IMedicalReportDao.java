package nayana.MedicalReport.dao;

import java.sql.SQLException;

import nayana.vo.MedicalReportVO;

public interface IMedicalReportDao{
	
	/**
	 * 소견서 등록하는 메서드
	 * @author 김범휘
	 * @param 소견서VO
	 * @return 등록성공 : 1, 등록실패 : 2
	 * @throws SQLException
	 */
	public int insertMedicalReport(MedicalReportVO mrVO) throws SQLException;
	
	public String getRegNo(String mem_id) throws SQLException;
}
