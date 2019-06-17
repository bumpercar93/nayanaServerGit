package nayana.docDown.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Map;

import nayana.docDown.dao.DocDownDaoImpl;
import nayana.docDown.dao.IDocDownDao;
import nayana.vo.DocDownVO;

public class DocDownServiceImpl extends UnicastRemoteObject implements IDocDownService {

	private IDocDownDao dao;
	
	public DocDownServiceImpl() throws RemoteException {
		dao = DocDownDaoImpl.getInstance();
	}
	
	@Override
	public int insertDocDown(DocDownVO ddVO) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.insertDocDown(ddVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateDocDown(Map<String, String> map) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.updateDocDown(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String selectDocDown(Map<String, String> map) throws RemoteException {
		String downDay = null;
		try {
			downDay = dao.selectDocDown(map);
		} catch (SQLException e) {
			downDay = null;
			e.printStackTrace();
		}
		return downDay;
	}

}
