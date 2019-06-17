package nayana.rESituation.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rESituation.dao.IRESituationDao;
import nayana.rESituation.dao.RESituationDaoImpl;
import nayana.vo.RESituationVO;

public class RESituationServiceImpl extends UnicastRemoteObject implements IRESituationService{

	private IRESituationDao dao;
	
	public RESituationServiceImpl() throws RemoteException {
		dao = RESituationDaoImpl.getInstance();
	}

	@Override
	public List<RESituationVO> getAllList() throws RemoteException {
		
		List<RESituationVO> rESList = null;
		try {
			rESList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rESList;
	}

}
