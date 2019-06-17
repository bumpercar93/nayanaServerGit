package nayana.MedicalCertficate.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import nayana.MedicalCertficate.dao.IMedicalCertficateDao;
import nayana.MedicalCertficate.dao.MedicalCertficateDaoImpl;
import nayana.vo.MedicalCertificateVO;

public class MedicalCertficateServiceImpl extends UnicastRemoteObject implements IMedicalCertficateService {
	
	private IMedicalCertficateDao dao;
	
	public MedicalCertficateServiceImpl() throws RemoteException{
		dao = MedicalCertficateDaoImpl.getInstance();
	}
	
	
	@Override
	public int insertMedcalCertficate(MedicalCertificateVO mcVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertMedcalCertficate(mcVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}


	@Override
	public String getName(String mem_id) throws RemoteException {
		String name = "";
		try {
			name = dao.getName(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}


	@Override
	public String getGender(String mem_id) throws RemoteException {
		String gender = "";
		try {
			gender = dao.getGender(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gender;
	}


	@Override
	public String getAge(String mem_id) throws RemoteException {
		String age = "";
		try {
			age = dao.getAge(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return age;
	}


	@Override
	public String getAddr(String mem_id) throws RemoteException {
		String addr = "";
		try {
			addr = dao.getAddr(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addr;
	}


	@Override
	public String getTel(String mem_id) throws RemoteException {
		String tel = "";
		try {
			tel = dao.getTel(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tel;
	}


	@Override
	public String getDssName(String mem_id) throws RemoteException {
		String dssName = "";
		try {
			dssName = dao.getDssName(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dssName;
	}


	@Override
	public String getAfterOpinion(String mem_id) throws RemoteException {
		String afterOpinion = "";
		try {
			afterOpinion = dao.getAfterOpinion(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return afterOpinion;
	}


	@Override
	public String getOnsetDate(String mem_id) throws RemoteException {
		String onsetDate = "";
		try {
			onsetDate = dao.getOnsetDate(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return onsetDate;
	}

}
