package nayana.Prescription.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import nayana.Prescription.dao.IPrescriptionDao;
import nayana.Prescription.dao.PrescriptionDaoImpl;
import nayana.vo.PrescriptionVO;

public class PrescriptionServiceImpl extends UnicastRemoteObject implements IPrescriptionService {
	
	private IPrescriptionDao dao;
	
	public PrescriptionServiceImpl() throws RemoteException {
		dao = PrescriptionDaoImpl.getInstance();
	}
	
	@Override
	public int insertPrescription(PrescriptionVO pVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertPrescription(pVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String getMedicine(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getMedicine(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getDosesMedi(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getDosesMedi(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getDosesNum(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getDosesNum(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getAllDosesDay(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getAllDosesDay(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getUsage(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getUsage(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

}
