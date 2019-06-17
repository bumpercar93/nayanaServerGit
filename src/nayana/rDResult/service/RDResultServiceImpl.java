package nayana.rDResult.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.rDResult.dao.IRDResultDao;
import nayana.rDResult.dao.RDResultDaoImpl;
import nayana.vo.RDResultVO;

public class RDResultServiceImpl extends UnicastRemoteObject implements IRDResultService {
	
	private IRDResultDao dao;

	public RDResultServiceImpl() throws RemoteException {
		dao = RDResultDaoImpl.getInstance();
	}

	@Override
	public List<RDResultVO> getAllList() throws RemoteException {
		List<RDResultVO> rdrList = null;
		try {
			rdrList = dao.getAllList();
		} catch (SQLException e) {
			rdrList = null;
			e.printStackTrace();
		}
		return rdrList;
	}

	@Override
	public int insertResult(RDResultVO rdrVo) throws RemoteException {
		int seq = 0;
		try {
			seq = dao.insertResult(rdrVo);
		} catch (SQLException e) {
			seq = 0;
			e.printStackTrace();
		}
		return seq;
	}

	@Override
	public List<RDResultVO> rdResult(Map<String, String> map) throws RemoteException {
		
		List<RDResultVO> result = null;
		try {
			result = dao.rdResult(map);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateResult(RDResultVO vo) throws RemoteException {
		int cnt=0;
		try {
			cnt = dao.updateResult(vo);
		} catch (SQLException e) {
			cnt=0;
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
