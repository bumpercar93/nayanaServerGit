package nayana.rDFood.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rDFood.dao.IRDFoodDao;
import nayana.rDFood.dao.RDFoodDaoImpl;
import nayana.vo.RDFoodVO;

public class RDFoodServiceImpl extends UnicastRemoteObject implements IRDFoodService{

	private IRDFoodDao dao;
	
	public RDFoodServiceImpl() throws RemoteException {
		dao = RDFoodDaoImpl.getInstance();
	}

	@Override
	public List<RDFoodVO> getAllList() throws RemoteException {
		List<RDFoodVO> rDFList = null;
		try {
			rDFList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rDFList;
	}


}
