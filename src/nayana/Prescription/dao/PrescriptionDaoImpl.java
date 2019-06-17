package nayana.Prescription.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.PrescriptionVO;
import util.BuildedSqlMapClient;

public class PrescriptionDaoImpl implements IPrescriptionDao {
	
	private SqlMapClient smc;
	private static IPrescriptionDao dao;
	
	private PrescriptionDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IPrescriptionDao getInstance() {
		if(dao == null) dao = new PrescriptionDaoImpl();
		return dao;
	}

	@Override
	public int insertPrescription(PrescriptionVO pVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("Prescription.insertPrescription", pVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String getMedicine(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("Prescription.getMedicine", mem_id);
		return result;
	}

	@Override
	public String getDosesMedi(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("Prescription.getDosesMedi", mem_id);
		return result;
	}

	@Override
	public String getDosesNum(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("Prescription.getDosesNum", mem_id);
		return result;
	}

	@Override
	public String getAllDosesDay(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("Prescription.getAllDosesDay", mem_id);
		return result;
	}

	@Override
	public String getUsage(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("Prescription.getUsage", mem_id);
		return result;
	}

}
