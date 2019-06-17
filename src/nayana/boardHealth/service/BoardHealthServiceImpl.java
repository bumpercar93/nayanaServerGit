package nayana.boardHealth.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.boardHealth.dao.BoardHealthDaoImpl;
import nayana.boardHealth.dao.IBoardHealthDao;
import nayana.vo.BoardHealthVO;

public class BoardHealthServiceImpl extends UnicastRemoteObject implements IBoardHealthService{
	
	private IBoardHealthDao dao;

	public BoardHealthServiceImpl() throws RemoteException {
		dao = BoardHealthDaoImpl.getInstance();
	}

	@Override
	public List<BoardHealthVO> getAllBoard() throws RemoteException {
		List<BoardHealthVO> bhVo = null;
		try {
			bhVo = dao.getAllBoard();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bhVo;
	}

	@Override
	public int insertBoard(BoardHealthVO vo) throws RemoteException {
		int result = 0;
		try {
			result = dao.insertBoard(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public BoardHealthVO viewBoard(int bh_seq) throws RemoteException {
		BoardHealthVO bhVo = null;
		try {
			bhVo = dao.viewBoard(bh_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bhVo;
	}

	@Override
	public int boardCnt(int bh_seq) throws RemoteException {
		int cnt = 0;
		try {
			cnt = dao.boardCnt(bh_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateBoard(BoardHealthVO vo) throws RemoteException {
		int result = 0;
		try {
			result = dao.updateBoard(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteBoard(int bh_seq) throws RemoteException {
		int result = 0;
		try {
			result = dao.deleteBoard(bh_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<BoardHealthVO> searchBoard(String params) throws RemoteException {
		List<BoardHealthVO> bhList = null;
		try {
			bhList = dao.searchBoard(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bhList;
	}

	@Override
	public int getSeq(Map<String, String> params) throws RemoteException {
		int seq = 0;
		try {
			seq = dao.getSeq(params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return seq;
	}

	@Override
	public List<BoardHealthVO> recentData() throws RemoteException {
		List<BoardHealthVO> bhVo = null;
		try {
			bhVo = dao.recentData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bhVo;
	}

	
	
}
