package nayana.rDisease.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.rDisease.dao.IRDiseaseDao;
import nayana.rDisease.dao.RDiseaseDaoImpl;
import nayana.vo.RDiseaseVO;

public class RDiseaseServiceImpl extends UnicastRemoteObject implements IRDiseaseService{
	
	private IRDiseaseDao dao;
	
	public RDiseaseServiceImpl() throws RemoteException {
		dao = RDiseaseDaoImpl.getInstance();
	}
	
	@Override
	public List<RDiseaseVO> getAllList() throws RemoteException {
		List<RDiseaseVO> rdiList = null;
		try {
			rdiList = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rdiList;
	}

}
