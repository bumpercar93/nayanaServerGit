package nayana.SelfTestQuestion.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nayana.SelfTestQuestion.dao.ISelfTestQuestionDao;
import nayana.SelfTestQuestion.dao.SelfTestQuestionDaoImpl;
import nayana.vo.SelfTestQuestionVO;

public class SelfTestQuestionServiceImpl extends UnicastRemoteObject implements ISelfTestQuestionService {
	
	private ISelfTestQuestionDao dao;

	public SelfTestQuestionServiceImpl() throws RemoteException{
		dao = SelfTestQuestionDaoImpl.getInstance();
	}
	
	@Override
	public int insertSelfTestQuestion(SelfTestQuestionVO stqVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertSelfTestQuestion(stqVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateSelfTestQuestion(Map<String, Object> map) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateSelfTestQuestion(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<String> getAllSelfTestQuestion(int self_seq) throws RemoteException {
		List<String> list = new ArrayList<String>();
		try {
			list = dao.getAllSelfTestQuestion(self_seq);
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		return list;
	}

}
