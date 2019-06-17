package nayana.rDisease.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.vo.RDiseaseVO;

public interface IRDiseaseService extends Remote{
	
	/**
	 * 맞춤식단에서 질병 컬럼을 모두 가져오는 메서드
	 * @author 박서경
	 * @return
	 * @throws SQLException
	 */
	public List<RDiseaseVO> getAllList() throws RemoteException;
}
