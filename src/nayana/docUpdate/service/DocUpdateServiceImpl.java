package nayana.docUpdate.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import nayana.docUpdate.dao.DocUpdateDaoImpl;
import nayana.docUpdate.dao.IDocUpdateDao;
import nayana.vo.DocUpdateVO;

public class DocUpdateServiceImpl extends UnicastRemoteObject implements IDocUpdateService {
	
	private IDocUpdateDao dao;
	
	public DocUpdateServiceImpl() throws RemoteException {
		dao = DocUpdateDaoImpl.getInstance();
	}
	
	@Override
	public int insertDocUpdate(DocUpdateVO duVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertDocUpdate(duVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateDocUpdate(String mem_id) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateDocUpdate(mem_id);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String selectDocUpdate(String mem_id) throws RemoteException {
		String updateDay = null;
		try {
			updateDay = dao.selectDocUpdate(mem_id);
		} catch (SQLException e) {
			updateDay = null;
			e.printStackTrace();
		}
		return updateDay;
	}

}
