package nayana.boardNotice.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.BoardNoticeVO;
import util.BuildedSqlMapClient;

public class BoardNoticeDaoImpl implements IBoardNoticeDao{
	
	private SqlMapClient smc;
	
	private static BoardNoticeDaoImpl dao;
	
	public static BoardNoticeDaoImpl getInstance() {
		if(dao==null) dao = new BoardNoticeDaoImpl();
		return dao;
	}
	
	public BoardNoticeDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}

	@Override
	public int insertBoard(BoardNoticeVO noticevo) throws SQLException {
		
		int cnt = 0;
		
		Object obj = smc.insert("noticeboard.insertBoard",noticevo);
		
		if(obj==null) {
			cnt = 1;
		}else{
			cnt = 0;
		}
		
		return cnt;
	}

	@Override
	public int deleteBoard(int bn_seq) throws SQLException {
		
		int cnt = 0;
		
		cnt = smc.delete("noticeboard.deleteBoard",bn_seq);
		
		return cnt;
		
	}

	@Override
	public int updateBoard(BoardNoticeVO noticevo) throws SQLException {
		
		int cnt = 0;
		
		cnt = smc.update("noticeboard.updateBoard",noticevo);
		
		return cnt;
	}

	@Override
	public List<BoardNoticeVO> getAllBoardList() throws SQLException {
		
		List<BoardNoticeVO> boardList = null;
		
		boardList = smc.queryForList("noticeboard.getAllBoardList");
		
		return boardList;
	}
	
	@Override
	public List<BoardNoticeVO> getSearchBoardList(Map<String, String> bn_title) throws SQLException {
		
		List<BoardNoticeVO> boardList = null;
		
		String keyword = bn_title.get("keyword");
		String value = bn_title.get("value");
		
		keyword = keyword.trim();
		value = value.trim();
		
		try {
			if(keyword.equals("작성자")) {
				boardList = smc.queryForList("noticeboard.getSearchWriter",value);
			}else if(keyword.equals("제목")) {
				boardList = smc.queryForList("noticeboard.getSearchTitle",value);
			}else if(keyword.equals("내용")){
				boardList = smc.queryForList("noticeboard.getSearchContent",value);
			}
		} catch (SQLException e) {
			boardList = null;
			e.printStackTrace();
		}
		
//		boardList = smc.queryForList("noticeboard.getSearchBoardList",bn_title);
		
		return boardList;
	}	
	
	@Override
	public BoardNoticeVO getBoard(int bn_seq) throws SQLException {
		
		BoardNoticeVO noticevo = null;
		
		noticevo = (BoardNoticeVO) smc.queryForList("noticeboard.getBoard",bn_seq);
		
		return noticevo;
	}

	@Override
	public int setCountIncrement(int bn_seq) throws SQLException {
		
		int cnt = 0;
		
		cnt = smc.update("noticeboard.setCountIncrement",bn_seq);
		
		return cnt;
	}


	
}
