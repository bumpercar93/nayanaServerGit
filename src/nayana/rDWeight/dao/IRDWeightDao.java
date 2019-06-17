package nayana.rDWeight.dao;

import java.sql.SQLException;
import java.util.List;

import nayana.vo.RDWeightVO;

public interface IRDWeightDao {

	/**
	 * 추천음식에서 체중 컬럼을 가져오는 메서드
	 * @author 박서경
	 * @return RDWeightVO 리스트
	 * @throws SQLException
	 */
	public List<RDWeightVO> getAllList() throws SQLException;
}
