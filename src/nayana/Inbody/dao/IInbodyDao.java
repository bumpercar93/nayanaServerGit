package nayana.Inbody.dao;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.vo.InbodyVO;

public interface IInbodyDao {

	/**
	 * 회원아이디에 맞는 인바디 정보 가져오기
	 * @param memId
	 * @return
	 * @throws SQLException
	 */
	public InbodyVO callData(String memId) throws SQLException;
	

	/**
	 * 인바디 등록하는 메서드
	 * @author 김범휘
	 * @param 인바디VO
	 * @return 등록성공 : 1, 등록실패 : 0
	 * @throws SQLException
	 */
	public int insertInbody(InbodyVO ibVO) throws SQLException;

	public String getHeight(String mem_id) throws SQLException;
	
	public String getWeight(String mem_id) throws SQLException;
	
	public String getMuscle(String mem_id) throws SQLException;
	
	public String getFat(String mem_id) throws SQLException;
	
	public String getBmi(String mem_id) throws SQLException;
	
	public String getFatRate(String mem_id) throws SQLException;
	
	public String getAbdRate(String mem_id) throws SQLException;
	
	public String getScore(String mem_id) throws SQLException;
	
	public String getMbRate(String mem_id) throws SQLException;
	
}
