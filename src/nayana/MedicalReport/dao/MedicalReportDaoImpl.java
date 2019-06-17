package nayana.MedicalReport.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.MedicalReportVO;
import util.BuildedSqlMapClient;

public class MedicalReportDaoImpl implements IMedicalReportDao {
	
	private SqlMapClient smc;
	private static IMedicalReportDao dao;
	
	private MedicalReportDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IMedicalReportDao getInstance() {
		if(dao == null) dao = new MedicalReportDaoImpl();
		return dao;
	}

	@Override
	public int insertMedicalReport(MedicalReportVO mrVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("MedicalReport.insertMedicalReport", mrVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String getRegNo(String mem_id) throws SQLException {
		String regNo = (String) smc.queryForObject("MedicalReport.getRegNo", mem_id);
		return regNo;
	}

}
