package nayana.SelfTestResult.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.SelfTestResultVO;
import util.BuildedSqlMapClient;

public class SelfTestResultDaoImpl implements ISelfTestResultDao {
	
	private SqlMapClient smc;
	private static ISelfTestResultDao dao;
	
	private SelfTestResultDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}

	public static ISelfTestResultDao getInstance() {
		if(dao == null) dao = new SelfTestResultDaoImpl();
		return dao;
	}
	
	@Override
	public int insertSelfTestResult(SelfTestResultVO strVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("SelfTestResult.insertSelfTestResult", strVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public int updateSelfTestResult(Map<String, Object> map) throws SQLException {
		int cnt = smc.update("SelfTestResult.updateSelfTestResult", map);
		return cnt;
	}

	@Override
	public String selectSelfTestResult(Map<String, Integer> map) throws SQLException {
		String result = (String) smc.queryForObject("SelfTestResult.selectSelfTestResult", map);
		return result;
	}

}
