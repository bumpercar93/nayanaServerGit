package nayana.rEResult.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.REResultVO;
import util.BuildedSqlMapClient;

public class REResultDaoImpl implements IREResultDao {
	
	private SqlMapClient smc;
	private static IREResultDao dao;
	
	public REResultDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IREResultDao getInstance() {
		if(dao == null) dao = new REResultDaoImpl();
		return dao;
	}

	@Override
	public List<REResultVO> getAllList() throws SQLException {
		return smc.queryForList("rEResult.getAllList");
	}

	@Override
	public int insertResult(REResultVO rerVo) throws SQLException {
		return (int) smc.insert("rEResult.insertExercise", rerVo);
	}

	@Override
	public List<REResultVO> reResult(Map<String, String> map) throws SQLException {
		return smc.queryForList("rEResult.reResult", map);
	}

	@Override
	public int updateExersize(REResultVO vo) throws SQLException {
		return smc.update("rEResult.updateExercise", vo);
	}

	@Override
	public int getSeq(Map<String, String> map) throws SQLException {
		int result = 0;
		result = (int) smc.queryForObject("rEResult.getSeq", map);
		return result;
	}
	
	
	
}
