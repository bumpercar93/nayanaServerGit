package nayana.Inbody.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.InbodyVO;
import util.BuildedSqlMapClient;

public class InbodyDaoImpl implements IInbodyDao{

	private SqlMapClient smc;
	private static IInbodyDao dao;
	
	private InbodyDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IInbodyDao getInstance() {
		if(dao == null) dao = new InbodyDaoImpl();
		return dao;
	}

	@Override
	public InbodyVO callData(String memId) throws SQLException {
		InbodyVO ibvo = null;
		try {
			ibvo = new InbodyVO();
		ibvo = (InbodyVO) smc.queryForObject("inbody.callData", memId);
		}catch (SQLException ee) {
			ee.printStackTrace();
		}
		return ibvo;
	}

	@Override
	public int insertInbody(InbodyVO ibVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("inbody.insertInbody", ibVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String getHeight(String mem_id) throws SQLException {
		String height = (String) smc.queryForObject("inbody.getHeight", mem_id);
		return height;
	}

	@Override
	public String getWeight(String mem_id) throws SQLException {
		String weight = (String) smc.queryForObject("inbody.getWeight", mem_id);
		return weight;
	}

	@Override
	public String getMuscle(String mem_id) throws SQLException {
		String muscle = (String) smc.queryForObject("inbody.getMuscle", mem_id);
		return muscle;
	}

	@Override
	public String getFat(String mem_id) throws SQLException {
		String fat = (String) smc.queryForObject("inbody.getFat", mem_id);
		return fat;
	}

	@Override
	public String getBmi(String mem_id) throws SQLException {
		String bmi = (String) smc.queryForObject("inbody.getBmi", mem_id);
		return bmi;
	}

	@Override
	public String getFatRate(String mem_id) throws SQLException {
		String fatRate = (String) smc.queryForObject("inbody.getFatRate", mem_id);
		return fatRate;
	}

	@Override
	public String getAbdRate(String mem_id) throws SQLException {
		String abdRate = (String) smc.queryForObject("inbody.getAbdRate", mem_id);
		return abdRate;
	}

	@Override
	public String getScore(String mem_id) throws SQLException {
		String score = (String) smc.queryForObject("inbody.getScore", mem_id);
		return score;
	}

	@Override
	public String getMbRate(String mem_id) throws SQLException {
		String mbRate = (String) smc.queryForObject("inbody.getMbRate", mem_id);
		return mbRate;
	}
	
	
	
	
	
	
}
