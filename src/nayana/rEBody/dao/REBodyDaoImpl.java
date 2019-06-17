package nayana.rEBody.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.REBodyVO;
import util.BuildedSqlMapClient;

public class REBodyDaoImpl implements IREBodyDao{

	private SqlMapClient smc;
	private static IREBodyDao dao;
	
	public REBodyDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IREBodyDao getInstance() {
		if(dao == null) dao = new REBodyDaoImpl();
		return dao;
	} 
	
	@Override
	public List<REBodyVO> getAllList() throws SQLException {
		return smc.queryForList("rEBody");
	}
}
