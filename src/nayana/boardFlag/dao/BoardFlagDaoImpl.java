package nayana.boardFlag.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.BoardFlagVO;
import util.BuildedSqlMapClient;

public class BoardFlagDaoImpl implements IBoardFlagDao {
	
	private SqlMapClient smc;
	private static IBoardFlagDao dao;
	
	public BoardFlagDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IBoardFlagDao getInstance() {
		if(dao == null) dao = new BoardFlagDaoImpl();
		return dao;
	}

	@Override
	public List<BoardFlagVO> getAllList(){
		List<BoardFlagVO> list = null;
		try {
			list = smc.queryForList("boardFlag.getAllList");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


}
