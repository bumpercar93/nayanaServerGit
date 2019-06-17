package nayana.rEBody.dao;

import java.sql.SQLException;
import java.util.List;

import nayana.vo.REBodyVO;

public interface IREBodyDao {
	
	/**
	 * 맞춤운동에서 부위별 리스트를 가져오는 메서드
	 * @author 박서경
	 * @return REBodyVO 리스트
	 * @throws SQLException
	 */
	public List<REBodyVO> getAllList() throws SQLException;
}
