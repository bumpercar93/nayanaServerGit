package nayana.rEResult.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.rDResult.dao.IRDResultDao;
import nayana.rDResult.dao.RDResultDaoImpl;
import nayana.rEResult.dao.IREResultDao;
import nayana.rEResult.dao.REResultDaoImpl;
import nayana.vo.REResultVO;

public class REResultServiceImpl extends UnicastRemoteObject implements IREResultService {
	
	private IREResultDao dao;

	public REResultServiceImpl() throws RemoteException {
		dao = REResultDaoImpl.getInstance();
	}

	@Override
	public List<REResultVO> getAllList() throws RemoteException {
		List<REResultVO> listVo = null;
		try {
			listVo = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listVo;
	}

	@Override
	public int insertResult(REResultVO rerVo) throws RemoteException {
		int seq = 0;
		try {
			seq = dao.insertResult(rerVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return seq;
	}

	@Override
	public List<REResultVO> reResult(Map<String, String> map) throws RemoteException {
		List<REResultVO> rerVo = null;
		try {
			rerVo = dao.reResult(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rerVo;
	}

	@Override
	public int updateExersize(REResultVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = dao.updateExersize(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int getSeq(Map<String, String> map) throws RemoteException {
		int seq = 0;
		try {
			seq = dao.getSeq(map);
		} catch (SQLException e) {
			seq = 0;
			e.printStackTrace();
		}
		return seq;
	}
	
	
}
