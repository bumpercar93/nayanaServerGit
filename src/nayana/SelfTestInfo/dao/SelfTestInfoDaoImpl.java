package nayana.SelfTestInfo.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.SelfTestInfoVO;
import util.BuildedSqlMapClient;

public class SelfTestInfoDaoImpl implements ISelfTestInfoDao {
	
	private SqlMapClient smc;
	private static ISelfTestInfoDao dao;
	
	private SelfTestInfoDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static ISelfTestInfoDao getInstance() {
		if(dao == null) dao = new SelfTestInfoDaoImpl();
		return dao;
	}

	@Override
	public int insertSelfTestInfo(SelfTestInfoVO stiVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("SelfTestInfo.insertSelfTestInfo", stiVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public int updateSelfTestInfo(Map<String, Object> map) throws SQLException {
		int cnt = smc.update("SelfTestInfo.updateSelfTestInfo", map);
		return cnt;
	}

	@Override
	public int selectSelfTestInfo(Map<String, Object> map) throws SQLException {
		int score = (int) smc.queryForObject("SelfTestInfo.selectSelfTestInfo", map);
		return score;
	}

	@Override
	public String getMyTestDate(Map<String, Object> map) throws SQLException {
		String testDate = (String) smc.queryForObject("SelfTestInfo.getMyTestDate", map);
		return testDate;
	}

}
