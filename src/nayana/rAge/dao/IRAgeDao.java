package nayana.rAge.dao;

import java.sql.SQLException;
import java.util.List;

import nayana.vo.RAgeVO;

public interface IRAgeDao {
	
	/**
	 * 맞춤식단에서 나이별 컬럼을 모두 가져오는 메서드
	 * @author 박서경
	 * @return RAgeVO 리스트
	 * @throws SQLException
	 */
	public List<RAgeVO> getAllList() throws SQLException;
	
	/**
	 * 나이 선택 메서드
	 * @author 박서경
	 * @param ra_code_age
	 * @return
	 * @throws SQLException
	 */
	public String ageCode(String ra_code_age) throws SQLException;

}
