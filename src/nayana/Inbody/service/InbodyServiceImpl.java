package nayana.Inbody.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.Inbody.dao.IInbodyDao;
import nayana.Inbody.dao.InbodyDaoImpl;
import nayana.vo.InbodyVO;

public class InbodyServiceImpl extends UnicastRemoteObject implements IInbodyService{

	private IInbodyDao dao;
	
	public InbodyServiceImpl() throws RemoteException{
		dao = InbodyDaoImpl.getInstance();
	}

	@Override
	public InbodyVO callData(String memId) throws RemoteException {
		InbodyVO inbodyvo = null;
		try {
			inbodyvo = dao.callData(memId);
		} catch (SQLException e) {
			inbodyvo = null;
			e.printStackTrace();
		}
		
		return inbodyvo;
	}


	@Override
	public int insertInbody(InbodyVO ibVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertInbody(ibVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String getHeight(String mem_id) throws RemoteException {
		String height = null;
		try {
			height = dao.getHeight(mem_id);
		} catch (SQLException e) {
			height = null;
			e.printStackTrace();
		}
		return height;
	}

	@Override
	public String getWeight(String mem_id) throws RemoteException {
		String weight = null;
		try {
			weight = dao.getWeight(mem_id);
		} catch (SQLException e) {
			weight = null;
			e.printStackTrace();
		}
		return weight;
	}

	@Override
	public String getMuscle(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getMuscle(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getFat(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getFat(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getBmi(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getBmi(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getFatRate(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getFatRate(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getAbdRate(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getAbdRate(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getScore(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getScore(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String getMbRate(String mem_id) throws RemoteException {
		String result = null;
		try {
			result = dao.getMbRate(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}
	
}
