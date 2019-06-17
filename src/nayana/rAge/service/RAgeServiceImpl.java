package nayana.rAge.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rAge.dao.IRAgeDao;
import nayana.rAge.dao.RAgeDaoImpl;
import nayana.vo.RAgeVO;

public class RAgeServiceImpl extends UnicastRemoteObject implements IRAgeService{
	
	private IRAgeDao dao;
	
	public RAgeServiceImpl() throws RemoteException{
		dao = RAgeDaoImpl.getInstance();
	}

	@Override
	public List<RAgeVO> getAllList() throws RemoteException {
		List<RAgeVO> rAgeList = null;
		try {
			rAgeList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rAgeList;
	}

	@Override
	public String ageCode(String ra_code_age) throws RemoteException {
		String code = null;
		try {
			code = dao.ageCode(ra_code_age);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return code;
	}

}
