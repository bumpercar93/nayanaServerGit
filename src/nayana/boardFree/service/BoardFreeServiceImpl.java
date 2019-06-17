package nayana.boardFree.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.boardFree.dao.BoardFreeDaoImpl;
import nayana.boardFree.dao.IBoardFreeDao;
import nayana.vo.BoardFreeVO;

public class BoardFreeServiceImpl extends  UnicastRemoteObject implements IBoardFreeService{

	private IBoardFreeDao dao;
	
	public BoardFreeServiceImpl() throws RemoteException{
		dao = BoardFreeDaoImpl.getInstance();
	}
	
	
	@Override
	public int createBoard(BoardFreeVO boardvo) throws RemoteException {
		
		return  dao.createBoard(boardvo);
	}

	@Override
	public List<BoardFreeVO> printAllBoard() throws RemoteException {
		List<BoardFreeVO> list = null;
		try {
			list = dao.printAllBoard();
			
		} catch (Exception e) {
			list = null;
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BoardFreeVO viewBoard(int bf_num) throws RemoteException {
		BoardFreeVO board = dao.viewBoard(bf_num);
		return board;
	}

	@Override
	public int boardCntUp(int bf_num) throws RemoteException {
		int result = dao.boardCntUp(bf_num);
		return result;
	}

	@Override
	public int deleteBoard(int bf_num) throws RemoteException {
		int result = dao.deleteBoard(bf_num);
		return result;
	}

	@Override
	public int updateBoard(BoardFreeVO boardvo) throws RemoteException {
		int result = dao.updateBoard(boardvo);
		return result;
	}

	@Override
	public List<BoardFreeVO> searchTitleBoard(Map<String, String> params) throws RemoteException {
		List<BoardFreeVO> list = dao.searchTitleBoard(params);
		return list;
	}

	@Override
	public List<BoardFreeVO> searchNameBoard(Map<String, String> params) throws RemoteException {
		List<BoardFreeVO> list = dao.searchNameBoard(params);
		return list;
	}
	
	
	
	
	
	
	
}
