package nayana.docUpdate.dao;

import java.sql.SQLException;

import nayana.vo.DocUpdateVO;

public interface IDocUpdateDao {
	
	/**
	 * 최초 업데이트시 실행할 메서드
	 * @author 김범휘
	 * @param DocUpdateVO객체
	 * @return 성공하면 1 , 실패하면 0
	 * @throws SQLException
	 */
	public int insertDocUpdate(DocUpdateVO duVO) throws SQLException;
	
	/**
	 * 최초가 아닌 업데이트시 실행할 메서드
	 * @author 김범휘
	 * @param 업데이트 할 멤버 아이디
	 * @return 성공하면 1, 실패하면 0
	 * @throws SQLException
	 */
	public int updateDocUpdate(String mem_id) throws SQLException;
	
	/**
	 * 최근 업데이트 날짜 가져오는 메서드
	 * @author 김범휘
	 * @param 업데이트 날짜를 가져올 멤버ID
	 * @return 업데이트 날짜
	 * @throws SQLException
	 */
	public String selectDocUpdate(String mem_id) throws SQLException;
}
