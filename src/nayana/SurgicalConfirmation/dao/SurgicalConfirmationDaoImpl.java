package nayana.SurgicalConfirmation.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.SurgicalConfirmationVO;
import util.BuildedSqlMapClient;

public class SurgicalConfirmationDaoImpl implements ISurgicalConfirmationDao {
	
	private SqlMapClient smc;
	private static ISurgicalConfirmationDao dao;
	
	private SurgicalConfirmationDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static ISurgicalConfirmationDao getInstance() {
		if(dao == null) dao = new SurgicalConfirmationDaoImpl();
		return dao;
	}

	@Override
	public int insertSurgicalConfirmation(SurgicalConfirmationVO scVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("SurgicalConfirmation.insertSurgicalConfirmation", scVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String getHzPart(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getHzPart", mem_id);
		return result;
	}

	@Override
	public String getHzDate(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getHzDate", mem_id);
		return result;
	}

	@Override
	public String getDgsName(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getDgsName", mem_id);
		return result;
	}

	@Override
	public String getDgsCon(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getDgsCon", mem_id);
		return result;
	}

	@Override
	public String getOpDate(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getOpDate", mem_id);
		return result;
	}

	@Override
	public String getDrName(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("SurgicalConfirmation.getDrName", mem_id);
		return result;
	}

}
