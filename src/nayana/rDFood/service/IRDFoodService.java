package nayana.rDFood.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.vo.RDFoodVO;

public interface IRDFoodService extends Remote{
	
	/**
	 * 맞춤식단에서 음식 컬럼을 모두 가져오는 메서드
	 * @author 박서경
	 * @return RDFoodVO 리스트
	 * @throws SQLException
	 */
	public List<RDFoodVO> getAllList() throws RemoteException;
}
