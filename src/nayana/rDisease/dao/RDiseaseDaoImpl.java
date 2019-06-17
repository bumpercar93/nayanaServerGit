package nayana.rDisease.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.RDiseaseVO;
import util.BuildedSqlMapClient;

public class RDiseaseDaoImpl implements IRDiseaseDao{
	
	private SqlMapClient smc;
	private static IRDiseaseDao dao;
	
	public RDiseaseDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IRDiseaseDao getInstance() {
		if(dao == null) dao = new RDiseaseDaoImpl();
		return dao;
	}
	
	@Override
	public List<RDiseaseVO> getAllList() throws SQLException {
		return smc.queryForList("rDisease");
	}
	
}
