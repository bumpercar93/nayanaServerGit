package nayana.rDFood.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RDFoodVO;
import util.BuildedSqlMapClient;

public class RDFoodDaoImpl implements IRDFoodDao{
	
	private SqlMapClient smc;
	private static IRDFoodDao dao;
	
	public RDFoodDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IRDFoodDao getInstance() {
		if(dao == null) dao = new RDFoodDaoImpl();
		return dao;
	}

	@Override
	public List<RDFoodVO> getAllList() throws SQLException {
		return smc.queryForList("rDFood");
	}

}
