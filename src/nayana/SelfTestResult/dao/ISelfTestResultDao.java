package nayana.SelfTestResult.dao;

import java.sql.SQLException;
import java.util.Map;

import nayana.vo.SelfTestResultVO;

public interface ISelfTestResultDao {
	
	public int insertSelfTestResult(SelfTestResultVO strVO) throws SQLException;
	
	public int updateSelfTestResult(Map<String, Object> map) throws SQLException;
	
	public String selectSelfTestResult(Map<String, Integer> map) throws SQLException;
	
}
