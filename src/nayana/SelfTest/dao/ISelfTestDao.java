package nayana.SelfTest.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.vo.SelfTestVO;

public interface ISelfTestDao {
	
	public int insertSelfTest(SelfTestVO stVO) throws SQLException;
	
	public int updateSelfTest(Map<String, Object> map) throws SQLException;
	
	public int deleteSelfTest(int self_seq) throws SQLException;
	
	public List<SelfTestVO> getAllSelfTest() throws SQLException;
	
	public SelfTestVO getSelfTestVO(int self_seq) throws SQLException;
	
	public int getSeq(Map<String, String> map) throws SQLException;
}
