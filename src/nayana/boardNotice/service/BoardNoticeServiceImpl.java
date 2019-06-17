package nayana.boardNotice.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.boardNotice.dao.BoardNoticeDaoImpl;
import nayana.boardNotice.dao.IBoardNoticeDao;
import nayana.vo.BoardNoticeVO;

public class BoardNoticeServiceImpl extends UnicastRemoteObject implements IBoardNoticeService{

	private IBoardNoticeDao dao;
	
	public BoardNoticeServiceImpl() throws RemoteException{
		dao = BoardNoticeDaoImpl.getInstance();
	}

	@Override
	public int insertBoard(BoardNoticeVO noticevo) throws RemoteException {
		
		int vo = 0;
		
		try {
			vo = dao.insertBoard(noticevo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int deleteBoard(int bn_seq) throws RemoteException {
		
		int num = 0;
		
		try {
			num = dao.deleteBoard(bn_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return num;
	}

	@Override
	public int updateBoard(BoardNoticeVO noticevo) throws RemoteException {
		
		int vo = 0;
		
		try {
			vo = dao.updateBoard(noticevo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public List<BoardNoticeVO> getAllBoardList() throws RemoteException {
		
		List<BoardNoticeVO> list = null;
		
		try {
			list = dao.getAllBoardList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	@Override
	public List<BoardNoticeVO> getSearchBoardList(Map<String, String> bn_title) throws RemoteException {
		
		List<BoardNoticeVO> list = null;
		
		try {
			list = dao.getSearchBoardList(bn_title);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override // ??????????????????????
	public BoardNoticeVO getBoard(int bn_seq) throws RemoteException {
		
		BoardNoticeVO vo = null;
		
		try {
			vo = dao.getBoard(bn_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
		
		
	}

	@Override
	public int setCountIncrement(int bn_seq) throws RemoteException {
		
		int num = 0;
		
		try {
			num = dao.setCountIncrement(bn_seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return num;
	}


	
}
