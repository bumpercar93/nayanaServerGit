package nayana.rEBody.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rEBody.dao.IREBodyDao;
import nayana.rEBody.dao.REBodyDaoImpl;
import nayana.vo.REBodyVO;

public class REBodyServiceImpl extends UnicastRemoteObject implements IREBodyService{
	
	private IREBodyDao dao;
	
	public REBodyServiceImpl() throws RemoteException {
		dao = REBodyDaoImpl.getInstance();
	}

	@Override
	public List<REBodyVO> getAllList() throws RemoteException {
		List<REBodyVO> rEBodyList = null;
		try {
			rEBodyList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rEBodyList;
	}
	

}
