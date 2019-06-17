package nayana.rE.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.vo.REVO;

public interface IREService extends Remote{
	
	/**
	 * 추천운동에서 운동종류 리스트를 가져오는 메서드
	 * @author 박서경
	 * @return REVO 리스트
	 * @throws SQLException
	 */
	public List<REVO> getAllList() throws RemoteException;
}
