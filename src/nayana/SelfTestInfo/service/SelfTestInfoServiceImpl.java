package nayana.SelfTestInfo.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Map;

import nayana.SelfTestInfo.dao.ISelfTestInfoDao;
import nayana.SelfTestInfo.dao.SelfTestInfoDaoImpl;
import nayana.vo.SelfTestInfoVO;

public class SelfTestInfoServiceImpl extends UnicastRemoteObject implements ISelfTestInfoService {
	
	private ISelfTestInfoDao dao;
	
	public SelfTestInfoServiceImpl() throws RemoteException{
		dao = SelfTestInfoDaoImpl.getInstance();
	}
	
	@Override
	public int insertSelfTestInfo(SelfTestInfoVO stiVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertSelfTestInfo(stiVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateSelfTestInfo(Map<String, Object> map) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateSelfTestInfo(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int selectSelfTestInfo(Map<String, Object> map) throws RemoteException {
		int score = 0;
		try {
			score = dao.selectSelfTestInfo(map);
		} catch (SQLException e) {
			score = 0;
			e.printStackTrace();
		}
		return score;
	}

	@Override
	public String getMyTestDate(Map<String, Object> map) throws RemoteException {
		String testDate = null;
		try {
			testDate = dao.getMyTestDate(map);
		} catch (SQLException e) {
			testDate = null;
			e.printStackTrace();
		}
		return testDate;
	}

}
