package nayana.SelfTest.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.SelfTestVO;
import util.BuildedSqlMapClient;

public class SelfTestDaoImpl implements ISelfTestDao {
	
	private SqlMapClient smc;
	private static ISelfTestDao dao;
	
	private SelfTestDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static ISelfTestDao getInstance() {
		if(dao == null) dao = new SelfTestDaoImpl();
		return dao;
	}

	@Override
	public int insertSelfTest(SelfTestVO stVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("selfTest.insertSelfTest", stVO);
		if(obj == null) {
			cnt = 0;
		}else {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public int updateSelfTest(Map<String, Object> map) throws SQLException {
		int cnt = smc.update("selfTest.updateSelfTest", map);
		return cnt;
	}

	@Override
	public int deleteSelfTest(int self_seq) throws SQLException {
		int cnt = smc.delete("selfTest.deleteSelfTest", self_seq);
		return cnt;
	}

	@Override
	public List<SelfTestVO> getAllSelfTest() throws SQLException {
		List<SelfTestVO> list = new ArrayList<SelfTestVO>();
		list = smc.queryForList("selfTest.getAllSelfTest");
		return list;
	}

	@Override
	public SelfTestVO getSelfTestVO(int self_seq) throws SQLException {
		SelfTestVO stVO = (SelfTestVO) smc.queryForObject("selfTest.getSelfTestVO", self_seq);
		return stVO;
	}

	@Override
	public int getSeq(Map<String, String> map) throws SQLException {
		int result = (int) smc.queryForObject("selfTest.getSeq", map);
		return result;
	}

}
