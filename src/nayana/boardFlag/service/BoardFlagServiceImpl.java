package nayana.boardFlag.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

import nayana.boardFlag.dao.BoardFlagDaoImpl;
import nayana.boardFlag.dao.IBoardFlagDao;
import nayana.vo.BoardFlagVO;

public class BoardFlagServiceImpl extends UnicastRemoteObject implements IBoardFlagService {

	private IBoardFlagDao dao;
	
	public BoardFlagServiceImpl() throws RemoteException {
		dao = BoardFlagDaoImpl.getInstance();
	}

	@Override
	public List<BoardFlagVO> getAllList() throws RemoteException {
		List<BoardFlagVO> list = null;
		try {
			list = dao.getAllList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
