package nayana.SelfTestQuestion.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.vo.SelfTestQuestionVO;

public interface ISelfTestQuestionDao {
	
	public int insertSelfTestQuestion(SelfTestQuestionVO stqVO) throws SQLException;
	
	public int updateSelfTestQuestion(Map<String, Object> map) throws SQLException;
	
	public List<String> getAllSelfTestQuestion(int self_seq) throws SQLException;
	
}
