package nayana.docDown.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.DocDownVO;
import util.BuildedSqlMapClient;

public class DocDownDaoImpl implements IDocDownDao {
	
	private SqlMapClient smc;
	private static IDocDownDao dao;
	
	private DocDownDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IDocDownDao getInstance() {
		if(dao == null) dao = new DocDownDaoImpl();
		return dao;
	}

	@Override
	public int insertDocDown(DocDownVO ddVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("docDown.insertDocDown", ddVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public int updateDocDown(Map<String, String> map) throws SQLException {
		int cnt = smc.update("docDown.updateDocDown", map);
		return cnt;
	}

	@Override
	public String selectDocDown(Map<String, String> map) throws SQLException {
		String downDay = (String) smc.queryForObject("docDown.selectDocDown", map);
		return downDay;
	}

}
