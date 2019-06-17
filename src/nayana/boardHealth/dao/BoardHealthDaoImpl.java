package nayana.boardHealth.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.BoardHealthVO;
import util.BuildedSqlMapClient;

public class BoardHealthDaoImpl implements IBoardHealthDao {
	
	private SqlMapClient smc;
	private static IBoardHealthDao dao;
	
	public BoardHealthDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IBoardHealthDao getInstance() {
		if(dao == null) dao = new BoardHealthDaoImpl();
		return dao;
	}

	@Override
	public List<BoardHealthVO> getAllBoard(){
		List<BoardHealthVO> list = null;
		try {
			list = smc.queryForList("boardHealth.getAllBoard");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertBoard(BoardHealthVO vo) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("boardHealth.insertBoard", vo);
		if(obj == null) {
			cnt = 1;
		}else{
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public BoardHealthVO viewBoard(int bh_seq) throws SQLException {
		return (BoardHealthVO) smc.queryForObject("boardHealth.getBoard", bh_seq);
	}

	@Override
	public int boardCnt(int bh_seq) throws SQLException {
		return (int) smc.update("boardHealth.boardCntUp", bh_seq);
	}

	@Override
	public int updateBoard(BoardHealthVO vo) throws SQLException {
		return (int) smc.update("boardHealth.updateBoard", vo);
	}

	@Override
	public int deleteBoard(int bh_seq) throws SQLException {
		return (int) smc.delete("boardHealth.deleteBoard", bh_seq);
	}

	@Override
	public List<BoardHealthVO> searchBoard(String params) throws SQLException {
		return smc.queryForList("boardHealth.getSearchTitle", params);
	}

	@Override
	public int getSeq(Map<String, String> params) throws SQLException {
		return (int) smc.queryForObject("boardHealth.getSeq", params);
	}

	@Override
	public List<BoardHealthVO> recentData() throws SQLException {
		List<BoardHealthVO> list = null;
		try {
			list = smc.queryForList("boardHealth.recentData");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
}
