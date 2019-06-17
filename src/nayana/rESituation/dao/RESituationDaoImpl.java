package nayana.rESituation.dao;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RESituationVO;
import util.BuildedSqlMapClient;

public class RESituationDaoImpl implements IRESituationDao {
	
	private SqlMapClient smc;
	private static IRESituationDao dao;
	
	public RESituationDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IRESituationDao getInstance() {
		if(dao == null) dao = new RESituationDaoImpl();
		return dao;
	}

	@Override
	public List<RESituationVO> getAllList() throws SQLException {
		return smc.queryForList("rESituation");
	}
	
}
