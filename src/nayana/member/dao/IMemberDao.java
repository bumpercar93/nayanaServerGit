package nayana.member.dao;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.engine.execution.SqlExecutor;

import nayana.vo.MemberVO;

public interface IMemberDao {
	
	/**
	 * 로그인을 실행하는 메서드 
	 * @author 김범휘
	 * @param 로그인을 시도한 회원ID와 회원PW가 들어있는 Map객체
	 * @return 로그인 성공 : 성공한 회원VO, 로그인 실패 : Null
	 * @throws SQLException
	 */
	public MemberVO login(Map<String, String> map) throws SQLException;
	
	/**
	 * 회원가입 메서드
	 * @author 김범휘
	 * @param 회원가입창에 입력한 정보를 담은 MemberVO객체
	 * @return 회원가입 성공 : 1, 회원가입 실패 : 0
	 * @throws SQLException
	 */
	public int signUp(MemberVO mVO) throws SQLException;
	
	/**
	 * 아이디 중복확인 메서드
	 * @author 김범휘
	 * @param 회원가입 시 입력한 회원ID
	 * @return 중복 : 중복된 ID , 미중복 : Null
	 * @throws SQLException
	 */
	public String idCheck(String mem_id) throws SQLException;
	
	/**
	 * 남여 가입 회원 수
	 * @param gender
	 * @return
	 * @throws RemoteException
	 */
	public int genderCount(String gender) throws SQLException;
	
	public String findID(Map<String, String> map) throws SQLException;
	
	public String findPW(Map<String, String> map) throws SQLException;
	
	public int updatePW(Map<String, String> map) throws SQLException;
	
	/**
	 * 등록된 회원 전체 가져오기
	 * @return
	 */
	public List<MemberVO> getAllMember() throws SQLException;
	
	/**
	 * 회원 정보 수정
	 * @param memvo
	 * @return
	 * @throws SQLException
	 */
	public int updateMember(MemberVO memvo) throws SQLException;
	

	/**
	 * 회원 삭제
	 * @param memId
	 * @return
	 * @throws SQLException
	 */
	public int deleteMember(String memId) throws SQLException;

	/**
	 * 회원 정보 수정
	 * @author 김경호
	 * @param memvo
	 * @return
	 * @throws SQLException
	 */
	public int modifyMember(MemberVO memvo) throws SQLException;

}
