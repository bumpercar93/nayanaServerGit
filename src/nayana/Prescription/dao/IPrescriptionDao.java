package nayana.Prescription.dao;

import java.sql.SQLException;

import nayana.vo.PrescriptionVO;

public interface IPrescriptionDao {
	
	/**
	 * 처방전 등록하는 메서드
	 * @author 김범휘
	 * @param 처방전VO
	 * @return 등록성공 : 1, 등록실패 : 0
	 * @throws SQLException
	 */
	public int insertPrescription(PrescriptionVO pVO) throws SQLException;
	
	public String getMedicine(String mem_id) throws SQLException;
	
	public String getDosesMedi(String mem_id) throws SQLException;
	
	public String getDosesNum(String mem_id) throws SQLException;
	
	public String getAllDosesDay(String mem_id) throws SQLException;
	
	public String getUsage(String mem_id) throws SQLException;
}
