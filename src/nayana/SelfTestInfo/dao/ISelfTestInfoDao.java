package nayana.SelfTestInfo.dao;

import java.sql.SQLException;
import java.util.Map;

import nayana.vo.SelfTestInfoVO;

public interface ISelfTestInfoDao {
	
	public int insertSelfTestInfo(SelfTestInfoVO stiVO) throws SQLException;
	
	public int updateSelfTestInfo(Map<String, Object> map) throws SQLException;
	
	public int selectSelfTestInfo(Map<String, Object> map) throws SQLException;
	
	public String getMyTestDate(Map<String, Object> map) throws SQLException;
}
