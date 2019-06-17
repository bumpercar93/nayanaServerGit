package nayana.myFile.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.myFile.dao.IMyFileDao;
import nayana.myFile.dao.MyFileDaoImpl;
import nayana.vo.MyFileVO;

public class MyFileServiceImpl extends UnicastRemoteObject implements IMyFileService {

	private IMyFileDao dao;
	
	public MyFileServiceImpl() throws RemoteException {
		dao = MyFileDaoImpl.getInstance();
	}

	@Override
	public List<MyFileVO> getAllList() throws RemoteException {
		List<MyFileVO> list = null;
		try {
			list = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertFile(MyFileVO vo) throws RemoteException {
		int result = 0;
		try {
			result = dao.insertFile(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateFile(MyFileVO vo) throws RemoteException {
		int result = 0;
		try {
			result = dao.updateFile(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public MyFileVO getFileName(Map<String, Object> map) throws RemoteException {
		MyFileVO mfVO = null;
		try {
			mfVO = dao.getFileName(map);
		} catch (SQLException e) {
			mfVO = null;
			e.printStackTrace();
		}
		return mfVO;
	}

}
