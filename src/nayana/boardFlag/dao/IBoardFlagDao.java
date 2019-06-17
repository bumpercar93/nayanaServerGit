package nayana.boardFlag.dao;

import java.sql.SQLException;
import java.util.List;

import nayana.vo.BoardFlagVO;

public interface IBoardFlagDao {
	
	/**
	 * 게시판 구분할 수 있는 리스트를 가져오는 메서드
	 * @author 박서경
	 * @return 게시판 구분을 할수 있는 리스트
	 */
	public List<BoardFlagVO> getAllList() throws SQLException;
}
