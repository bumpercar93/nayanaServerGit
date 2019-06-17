package nayana.rDResult.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RDResultVO;
import util.BuildedSqlMapClient;

public class RDResultDaoImpl implements IRDResultDao{
	
	private SqlMapClient smc;
	private static IRDResultDao dao;
	
	public RDResultDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}

	public static IRDResultDao getInstance() {
		if(dao == null) dao = new RDResultDaoImpl();
		return dao;
	}

	@Override
	public List<RDResultVO> getAllList() throws SQLException {
		return smc.queryForList("rDResult.getAllList");
	}

	@Override
	public int insertResult(RDResultVO rdrVo) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("rDResult.insertResult", rdrVo);
		if(obj == null) {
			cnt = 1;
		}else{
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public List<RDResultVO> rdResult(Map<String, String> map) throws SQLException {
		return smc.queryForList("rDResult.rdResult", map);
	}

	@Override
	public int updateResult(RDResultVO vo) throws SQLException {
		return smc.update("rDResult.updateRd",vo);
	}

	@Override
	public int getSeq(Map<String, String> map) throws SQLException {
		int result = 0;
		result = (int) smc.queryForObject("rDResult.getSeq", map);
		return result;
	}
	
	

}
