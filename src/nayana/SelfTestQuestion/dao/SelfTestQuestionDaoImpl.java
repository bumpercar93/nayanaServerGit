package nayana.SelfTestQuestion.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.SelfTestQuestionVO;
import util.BuildedSqlMapClient;

public class SelfTestQuestionDaoImpl implements ISelfTestQuestionDao {

	private SqlMapClient smc;
	private static ISelfTestQuestionDao dao;
	
	private SelfTestQuestionDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static ISelfTestQuestionDao getInstance() {
		if(dao == null) dao = new SelfTestQuestionDaoImpl();
		return dao;
	}
	
	@Override
	public int insertSelfTestQuestion(SelfTestQuestionVO stqVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("selfTestQuestion.insertSelfTestQuestion", stqVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public int updateSelfTestQuestion(Map<String, Object> map) throws SQLException {
		int cnt = smc.update("selfTestQuestion.updateSelfTestQuestion", map);
		return cnt;
	}

	@Override
	public List<String> getAllSelfTestQuestion(int self_seq) throws SQLException {
		List<String> list = new ArrayList<String>();
		list = smc.queryForList("selfTestQuestion.getAllSelfTestQuestion", self_seq);
		return list;
	}

}
