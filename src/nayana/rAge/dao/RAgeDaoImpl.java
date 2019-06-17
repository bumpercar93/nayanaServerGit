package nayana.rAge.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RAgeVO;
import util.BuildedSqlMapClient;

public class RAgeDaoImpl implements IRAgeDao{
	
	private SqlMapClient smc;
	private static IRAgeDao dao;
	
	public RAgeDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}

	public static IRAgeDao getInstance() {
		if(dao == null) dao = new RAgeDaoImpl();
		return dao;
	}

	@Override
	public List<RAgeVO> getAllList() throws SQLException {
		return smc.queryForList("rAge");
	}

	@Override
	public String ageCode(String ra_code_age) throws SQLException {
		return (String) smc.queryForObject("rAge.ageCode", ra_code_age);
	}

}
