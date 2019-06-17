package nayana.member.dao;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import nayana.vo.MemberVO;
import util.BuildedSqlMapClient;

public class MemberDaoImpl implements IMemberDao {
	
	private SqlMapClient smc;
	private static IMemberDao dao;
	
	private MemberDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static IMemberDao getInstance() {
		if(dao == null) dao = new MemberDaoImpl();
		return dao;
	}

	@Override
	public MemberVO login(Map<String, String> map) throws SQLException {
		MemberVO mvo = (MemberVO) smc.queryForObject("member.login", map);
		return mvo;
	}

	@Override
	public int signUp(MemberVO mVO) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("member.signup", mVO);
		if(obj == null) {
			cnt = 1;
		}else {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public String idCheck(String mem_id) throws SQLException {
		String result = (String) smc.queryForObject("member.idCheck", mem_id);
		return result;
	}

	@Override
	public int genderCount(String gender) throws SQLException {
		int result = (int) smc.queryForObject("member.genderCount",gender);
		return result;
	}

	@Override
	public String findID(Map<String, String> map) throws SQLException {
		String mem_id = (String) smc.queryForObject("member.findID", map);
		return mem_id;
	}

	@Override
	public String findPW(Map<String, String> map) throws SQLException {
		String mem_email = (String) smc.queryForObject("member.findPW", map);
		return mem_email;
	}

	@Override
	public int updatePW(Map<String, String> map) throws SQLException {
		int cnt = smc.update("member.updatePW", map);
		return cnt;
	}

	@Override
	public List<MemberVO> getAllMember() {
		
		List<MemberVO> list= null;
		
		try {
			list = smc.queryForList("member.getAllMember");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return list;
	}

	@Override
	public int updateMember(MemberVO memvo) throws SQLException {
		int cnt = smc.update("member.updateMember",memvo);
		return cnt;
	}

	@Override
	public int deleteMember(String memId) throws SQLException {
		int cnt = smc.delete("member.deleteMember",memId);
		return cnt;
	}

	@Override
	public int modifyMember(MemberVO memvo) throws SQLException {
		int cnt = smc.update("member.modifyMember",memvo);
		return cnt;
	}
	
	
	
	
	

}
