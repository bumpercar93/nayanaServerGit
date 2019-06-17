package nayana.rEResult.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.vo.REResultVO;

public interface IREResultDao {
	
	/**
	 * 추천운동 전체 리스트를 가져오는 메서드
	 * @author 박서경
	 * @return REResultVO 리스트
	 * @throws SQLException
	 */
	public List<REResultVO> getAllList() throws SQLException;
	

	/**
	 * 관리자 페이지에서 추천 운동 정보를 등록할 수 있는 메서드
	 * @param rerVo
	 * @return 관리자 추천운동 등록창에서 입력한 정보들을 담은 REResultVO객체
	 * @return 현재 등록한 글의 시퀀스를 반환
	 * @throws SQLException
	 */
	public int insertResult(REResultVO rerVo) throws SQLException;
	
	/**
	 * 추천운동 결과를 가져오는 메서드
	 * @author 박서경
	 * @param map
	 * @return
	 * @throws SQLException
	 */
	public List<REResultVO> reResult(Map<String, String> map) throws SQLException;
	
	/**
	 * 추천운동 수정 메서드
	 * @param vo
	 * @return
	 * @throws SQLException
	 */
	public int updateExersize(REResultVO vo) throws SQLException;
	
	public int getSeq(Map<String, String> map) throws SQLException;
}


