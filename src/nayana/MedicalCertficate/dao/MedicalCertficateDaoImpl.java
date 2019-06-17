package nayana.MedicalCertficate.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.MedicalCertificateVO;
import util.BuildedSqlMapClient;

public class MedicalCertficateDaoImpl implements IMedicalCertficateDao {
	
	private SqlMapClient smc;
	private static IMedicalCertficateDao dao;
	
	private MedicalCertficateDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IMedicalCertficateDao getInstance() {
		if(dao == null) dao = new MedicalCertficateDaoImpl();
		return dao;
	}

	@Override
	public int insertMedcalCertficate(MedicalCertificateVO mcVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("MedicalCertficate.insertMedcalCertficate", mcVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String getName(String mem_id) throws SQLException {
		String name = (String) smc.queryForObject("MedicalCertficate.getName", mem_id);
		return name;
	}

	@Override
	public String getGender(String mem_id) throws SQLException {
		String gender = (String) smc.queryForObject("MedicalCertficate.getGender", mem_id);
		return gender;
	}

	@Override
	public String getAge(String mem_id) throws SQLException {
		String age = (String) smc.queryForObject("MedicalCertficate.getAge", mem_id);
		return age;
	}

	@Override
	public String getAddr(String mem_id) throws SQLException {
		String addr = (String) smc.queryForObject("MedicalCertficate.getAddr", mem_id);
		return addr;
	}

	@Override
	public String getTel(String mem_id) throws SQLException {
		String tel = (String) smc.queryForObject("MedicalCertficate.getTel", mem_id);
		return tel;
	}

	@Override
	public String getDssName(String mem_id) throws SQLException {
		String dssName = (String) smc.queryForObject("MedicalCertficate.getDssName", mem_id);
		return dssName;
	}

	@Override
	public String getAfterOpinion(String mem_id) throws SQLException {
		String atferOpinion = (String) smc.queryForObject("MedicalCertficate.getAfterOpinion", mem_id);
		return atferOpinion;
	}

	@Override
	public String getOnsetDate(String mem_id) throws SQLException {
		String onsetDate = (String) smc.queryForObject("MedicalCertficate.getOnsetDate", mem_id);
		return onsetDate;
	}

}
