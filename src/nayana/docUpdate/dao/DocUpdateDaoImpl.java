package nayana.docUpdate.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.DocUpdateVO;
import util.BuildedSqlMapClient;

public class DocUpdateDaoImpl implements IDocUpdateDao {
	
	private SqlMapClient smc;
	private static IDocUpdateDao dao;
	
	private DocUpdateDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IDocUpdateDao getInstance() {
		if(dao == null) dao = new DocUpdateDaoImpl();
		return dao;
	}

	@Override
	public int insertDocUpdate(DocUpdateVO duVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("docUpdate.insertDocUpdate", duVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public int updateDocUpdate(String mem_id) throws SQLException {
		int cnt = smc.update("docUpdate.updateDocUpdate", mem_id);
		return cnt;
	}

	@Override
	public String selectDocUpdate(String mem_id) throws SQLException {
		String updateDay = (String) smc.queryForObject("docUpdate.selectDocUpdate", mem_id);
		return updateDay;
	}

}
