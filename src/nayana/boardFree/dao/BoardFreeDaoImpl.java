package nayana.boardFree.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.BoardFreeVO;
import util.BuildedSqlMapClient;

public class BoardFreeDaoImpl implements IBoardFreeDao{

	private static BoardFreeDaoImpl dao;
	private SqlMapClient smc;
	
	public BoardFreeDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	
	public static BoardFreeDaoImpl getInstance() {
		
		if(dao == null) {
			dao = new BoardFreeDaoImpl();
		}
		return dao;
	}


	@Override
	public int createBoard(BoardFreeVO boardvo) {
		int result = 0;
		
		try {
			Object obj = smc.insert("");
			
			if(obj == null) {
				result = 1;
			}else {
				result = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public List<BoardFreeVO> printAllBoard() {
		List<BoardFreeVO> list = new ArrayList<BoardFreeVO>();
		
		try {
			list = smc.queryForList("");
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public BoardFreeVO viewBoard(int bf_num) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int boardCntUp(int bf_num) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int deleteBoard(int bf_num) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int updateBoard(BoardFreeVO boardvo) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<BoardFreeVO> searchTitleBoard(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<BoardFreeVO> searchNameBoard(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
