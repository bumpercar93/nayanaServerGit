package nayana.rE.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rE.dao.IREDao;
import nayana.rE.dao.REDaoImpl;
import nayana.vo.REVO;

public class REServiceImpl extends UnicastRemoteObject implements IREService{
	
	private IREDao dao;
	
	public REServiceImpl() throws RemoteException {
		dao = REDaoImpl.getInstance();
	}

	@Override
	public List<REVO> getAllList() throws RemoteException {
		List<REVO> reList = null;
		try {
			reList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reList;
	}

}
