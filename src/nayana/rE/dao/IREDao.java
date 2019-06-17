package nayana.rE.dao;

import java.sql.SQLException;
import java.util.List;

import nayana.vo.REVO;

public interface IREDao {
	/**
	 * 추천운동에서 운동종류 리스트를 가져오는 메서드
	 * @author 박서경
	 * @return REVO 리스트
	 * @throws SQLException
	 */
	public List<REVO> getAllList() throws SQLException;
}
