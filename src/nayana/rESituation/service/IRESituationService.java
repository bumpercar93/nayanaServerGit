package nayana.rESituation.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.vo.RESituationVO;

public interface IRESituationService extends Remote{
	
	/**
	 * 추천운동 상황별 리스트를 가져오는 메서드
	 * @author 박서경 
	 * @return RESituationVO 리스트
	 * @throws SQLException
	 */
	public List<RESituationVO> getAllList() throws RemoteException;
}
