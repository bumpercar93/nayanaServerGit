package nayana.SelfTestResult.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Map;

import nayana.SelfTestResult.dao.ISelfTestResultDao;
import nayana.SelfTestResult.dao.SelfTestResultDaoImpl;
import nayana.vo.SelfTestResultVO;

public class SelfTestResultServiceImpl extends UnicastRemoteObject implements ISelfTestResultService {
	
	private ISelfTestResultDao dao;
	
	public SelfTestResultServiceImpl() throws RemoteException {
		dao = SelfTestResultDaoImpl.getInstance();
	}
	
	@Override
	public int insertSelfTestResult(SelfTestResultVO strVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertSelfTestResult(strVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateSelfTestResult(Map<String, Object> map) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateSelfTestResult(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String selectSelfTestResult(Map<String, Integer> map) throws RemoteException {
		String result = null;
		try {
			result = dao.selectSelfTestResult(map);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

}
