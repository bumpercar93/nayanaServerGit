package nayana.MedicalReport.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import nayana.MedicalReport.dao.IMedicalReportDao;
import nayana.MedicalReport.dao.MedicalReportDaoImpl;
import nayana.vo.MedicalReportVO;

public class MedicalReportServiceImpl extends UnicastRemoteObject implements IMedicalReportService {
	
	private IMedicalReportDao dao;
	
	public MedicalReportServiceImpl() throws RemoteException {
		dao = MedicalReportDaoImpl.getInstance();
	}
	
	@Override
	public int insertMedicalReport(MedicalReportVO mrVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertMedicalReport(mrVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String getRegNo(String mem_id) throws RemoteException {
		String regNo = null;
		try {
			regNo = dao.getRegNo(mem_id);
		} catch (SQLException e) {
			regNo = null;
			e.printStackTrace();
		}
		return regNo;
	}

}
