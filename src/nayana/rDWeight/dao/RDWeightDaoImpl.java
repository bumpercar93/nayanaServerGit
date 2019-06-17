package nayana.rDWeight.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RDWeightVO;
import util.BuildedSqlMapClient;

public class RDWeightDaoImpl implements IRDWeightDao{
	
	private SqlMapClient smc;
	private static IRDWeightDao dao;
	
	public RDWeightDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IRDWeightDao getInstance() {
		if(dao == null) dao = new RDWeightDaoImpl();
		return dao;
	}
	
	@Override
	public List<RDWeightVO> getAllList() throws SQLException {
		return smc.queryForList("rDWeight");
	}
	
}
