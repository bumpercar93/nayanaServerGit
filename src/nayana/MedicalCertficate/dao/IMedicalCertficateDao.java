package nayana.MedicalCertficate.dao;

import java.sql.SQLException;

import nayana.vo.MedicalCertificateVO;

public interface IMedicalCertficateDao {
	
	/**
	 * 진단서 등록하는 메서드
	 * @author 김범휘
	 * @param 진단서VO
	 * @return 등록 성공 : 1, 등록 실패 : null;
	 * @throws SQLException
	 */
	public int insertMedcalCertficate(MedicalCertificateVO mcVO) throws SQLException;
	
	public String getName(String mem_id) throws SQLException;
	
	public String getGender(String mem_id) throws SQLException;
	
	public String getAge(String mem_id) throws SQLException;
	
	public String getAddr(String mem_id) throws SQLException;
	
	public String getTel(String mem_id) throws SQLException;
	
	public String getDssName(String mem_id) throws SQLException;
	
	public String getAfterOpinion(String mem_id) throws SQLException;
	
	public String getOnsetDate(String mem_id) throws SQLException;
	
}
