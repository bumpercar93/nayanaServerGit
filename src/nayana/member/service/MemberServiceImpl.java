package nayana.member.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nayana.member.dao.IMemberDao;
import nayana.member.dao.MemberDaoImpl;
import nayana.vo.MemberVO;
import util.MySHA256;

public class MemberServiceImpl extends UnicastRemoteObject implements IMemberService {
	
	private IMemberDao dao;
	
	public MemberServiceImpl() throws RemoteException {
		dao = MemberDaoImpl.getInstance();
	}
	
	@Override
	public MemberVO login(Map<String, String> map) throws RemoteException {
		MemberVO memVO = null;
		String pw = map.get("mem_pw");
		String newPW = MySHA256.encrypt(pw);
		map.put("mem_pw", newPW);
		try {
			memVO = dao.login(map);
		} catch (SQLException e) {
			memVO = null;
			e.printStackTrace();
		}
		return memVO;
	}

	@Override
	public int signUp(MemberVO mVO) throws RemoteException {
		int cnt = 0;
		String pw = mVO.getMem_pw();
		String newPW = MySHA256.encrypt(pw);
		mVO.setMem_pw(newPW);
		
		try {
			cnt = dao.signUp(mVO);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String idCheck(String mem_id) throws RemoteException {
		String result = "";
		try {
			result = dao.idCheck(mem_id);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int genderCount(String gender) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = dao.genderCount(gender);
		} catch (SQLException e) {
			cnt=0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public String findID(Map<String, String> map) throws RemoteException {
		String mem_id = null;
		try {
			mem_id = dao.findID(map);
		} catch (SQLException e) {
			mem_id = null;
			e.printStackTrace();
		}
		return mem_id;
	}

	@Override
	public String findPW(Map<String, String> map) throws RemoteException {
		String mem_email = null;
		try {
			mem_email = dao.findPW(map);
		} catch (SQLException e) {
			mem_email = null;
			e.printStackTrace();
		}
		return mem_email;
	}

	@Override
	public int updatePW(Map<String, String> map) throws RemoteException {
		int cnt = 0;
		String pw = map.get("mem_pw");
		String newPW = MySHA256.encrypt(pw);
		map.put("mem_pw", newPW);
		try {
			cnt = dao.updatePW(map);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<MemberVO> getAllMember() {
		List<MemberVO> list = null;
		try {
			list = dao.getAllMember();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int updateMember(MemberVO memvo) throws RemoteException {
		int cnt=0;
		String pw = memvo.getMem_pw();
		String newPW = MySHA256.encrypt(pw);
		memvo.setMem_pw(newPW);
		try {
			cnt = dao.updateMember(memvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteMember(String memId) throws RemoteException {
		int cnt=0;
		try {
			cnt = dao.deleteMember(memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	
	@Override
	public int modifyMember(MemberVO memvo) throws RemoteException {
		int cnt=0;
		String pw = memvo.getMem_pw();
		String newPW = MySHA256.encrypt(pw);
		memvo.setMem_pw(newPW);
		try {
			cnt = dao.modifyMember(memvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	

}
