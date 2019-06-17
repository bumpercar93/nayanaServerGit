package nayana.docDown.dao;

import java.sql.SQLException;
import java.util.Map;

import nayana.vo.DocDownVO;

public interface IDocDownDao {
	
	public int insertDocDown(DocDownVO ddVO) throws SQLException;
	
	public int updateDocDown(Map<String, String> map) throws SQLException;
	
	public String selectDocDown(Map<String, String> map) throws SQLException;
}
