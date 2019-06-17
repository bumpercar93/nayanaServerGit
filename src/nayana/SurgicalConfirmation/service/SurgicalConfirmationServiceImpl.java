package nayana.SurgicalConfirmation.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import nayana.SurgicalConfirmation.dao.ISurgicalConfirmationDao;
import nayana.SurgicalConfirmation.dao.SurgicalConfirmationDaoImpl;
import nayana.vo.SurgicalConfirmationVO;

public class SurgicalConfirmationServiceImpl extends UnicastRemoteObject implements ISurgicalConfirmationService {
	
	private ISurgicalConfirmationDao dao;
	
	public SurgicalConfirmationServiceImpl() throws RemoteException {
		dao = SurgicalConfirmationDaoImpl.getInstance();
	}
	
	@Override
	public int insertSurgicalConfirmation(SurgicalConfirmationVO scVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertSurgicalConfirmation(scVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String getHzPart(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getHzPart(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getHzDate(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getHzDate(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getDgsName(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getDgsName(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getDgsCon(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getDgsCon(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getOpDate(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getOpDate(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getDrName(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getDrName(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

}
