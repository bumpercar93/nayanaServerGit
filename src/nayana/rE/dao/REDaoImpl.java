package nayana.rE.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.REVO;
import util.BuildedSqlMapClient;

public class REDaoImpl implements IREDao{
	
	private SqlMapClient smc;
	private static IREDao dao;
	
	public REDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IREDao getInstance() {
		if(dao == null) dao = new REDaoImpl();
		return dao;
	}

	@Override
	public List<REVO> getAllList() throws SQLException {
		return smc.queryForList("rExercise");
	}

}
