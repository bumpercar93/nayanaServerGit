package nayana.SelfTest.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nayana.SelfTest.dao.ISelfTestDao;
import nayana.SelfTest.dao.SelfTestDaoImpl;
import nayana.vo.SelfTestVO;

public class SelfTestServiceImpl extends UnicastRemoteObject implements ISelfTestService {
	
	private ISelfTestDao dao;
	
	public SelfTestServiceImpl() throws RemoteException {
		dao = SelfTestDaoImpl.getInstance();
	}

	@Override
	public int insertSelfTest(SelfTestVO stVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertSelfTest(stVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateSelfTest(Map<String, Object> map) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateSelfTest(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteSelfTest(int self_seq) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.deleteSelfTest(self_seq);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<SelfTestVO> getAllSelfTest() throws RemoteException {
		List<SelfTestVO> list = new ArrayList<SelfTestVO>();
		try {
			list = dao.getAllSelfTest();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public SelfTestVO getSelfTestVO(int self_seq) throws RemoteException {
		SelfTestVO stVO = new SelfTestVO();
		try {
			stVO = dao.getSelfTestVO(self_seq);
		} catch (SQLException e) {
			stVO = null;
			e.printStackTrace();
		}
		return stVO;
	}

	@Override
	public int getSeq(Map<String, String> map) throws RemoteException {
		int result = 0;
		try {
			result = dao.getSeq(map);
		} catch (SQLException e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

}
