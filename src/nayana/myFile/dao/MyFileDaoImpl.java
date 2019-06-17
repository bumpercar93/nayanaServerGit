package nayana.myFile.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.MyFileVO;
import util.BuildedSqlMapClient;

public class MyFileDaoImpl implements IMyFileDao {
	
	private SqlMapClient smc;
	private static IMyFileDao dao;
	
	public MyFileDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IMyFileDao getInstance() {
		if(dao == null) dao = new MyFileDaoImpl();
		return dao;
				
	}

	@Override
	public List<MyFileVO> getAllList() throws SQLException {
		return smc.queryForList("myFile.getAllList");
	}

	@Override
	public int insertFile(MyFileVO vo) throws SQLException {
		int result = 0;
		Object obj = smc.insert("myFile.insertFile", vo);
		if(obj == null) {
			result = 1;
		}else{
			result = 0;
		}
		return result;
	}

	@Override
	public int updateFile(MyFileVO vo) throws SQLException {
		return (int) smc.update("myFile.updateFile", vo);
	}

	@Override
	public MyFileVO getFileName(Map<String, Object> map) throws SQLException {
		MyFileVO mfVO = new MyFileVO();
		mfVO = (MyFileVO) smc.queryForObject("myFile.getFileName", map);
		return mfVO;
	}
	
}
