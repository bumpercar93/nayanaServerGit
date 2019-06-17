package nayana.SurgicalConfirmation.dao;

import java.sql.SQLException;

import nayana.vo.SurgicalConfirmationVO;

public interface ISurgicalConfirmationDao {
	
	/**
	 * 수술확인서 등록하는 메서드
	 * @author 김범휘
	 * @param 수술확인서VO
	 * @return 등록완료 : 1, 등록실패 : 0
	 * @throws SQLException
	 */
	public int insertSurgicalConfirmation(SurgicalConfirmationVO scVO) throws SQLException;

	public String getHzPart(String mem_id) throws SQLException;
	
	public String getHzDate(String mem_id) throws SQLException;
	
	public String getDgsName(String mem_id) throws SQLException;
	
	public String getDgsCon(String mem_id) throws SQLException;
	
	public String getOpDate(String mem_id) throws SQLException;
	
	public String getDrName(String mem_id) throws SQLException;
	
}
