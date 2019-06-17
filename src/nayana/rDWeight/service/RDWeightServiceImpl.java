package nayana.rDWeight.service;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import nayana.rDWeight.dao.IRDWeightDao;
import nayana.rDWeight.dao.RDWeightDaoImpl;
import nayana.vo.RDWeightVO;

public class RDWeightServiceImpl implements IRDWeightService{
	
	private IRDWeightDao dao;
	
	public RDWeightServiceImpl() {
		dao = RDWeightDaoImpl.getInstance();
	}
	
	@Override
	public List<RDWeightVO> getAllList() throws RemoteException {
		List<RDWeightVO> rDWList = null;
		try {
			rDWList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rDWList;
	}

}
