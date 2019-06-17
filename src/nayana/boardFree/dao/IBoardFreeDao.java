package nayana.boardFree.dao;


import java.util.List;
import java.util.Map;

import nayana.vo.BoardFreeVO;

public interface IBoardFreeDao {
	
	

	/**
	 * 보드를 생성하는 메서드
	 * @param board 보드의 속성들을 담은 객체
	 * @return 1이상이면 insert성공 / 0 이면 insert 실패
	 */
	public int createBoard(BoardFreeVO  boardvo);

		
	/**
	 * 전체 게시물을 출력하기 위해서 게시글 리스트를 가져오는 메서드 
	 * @return 전체 게시물들의 리스트
	 */
	public List<BoardFreeVO> printAllBoard();
	
	
	/**
	 * 게시판에 목록에서 게시글 하나를 조회하기 위해 그것을 가져와주는 메서드
	 * @param bf_num 해당 게시글의 번호
	 * @return 해당 게시글의 객체
	 */
	public BoardFreeVO viewBoard(int bf_num);
	
	/**
	 * 게시판 조회시 조회수를 1씩 증가시키기 위한 메서드
	 * @param bf_num 조회를 하는 해당 게시글번호
	 * @return 1이상 : 조회수 + 1 성공 / 0 : 게시글 조회 불가
	 */
	public int boardCntUp(int bf_num);
	
	/**
	 * 게시글을 삭제하기 위한 메서드
	 * @param bf_num 해당 게시글의 번호
	 * @return 1이상 : 삭제성공 / 0 : 삭제 실패
	 */
	public int deleteBoard(int bf_num);

	
	/**
	 * 게시글의 제목과 내용을 수정하기 위한 메서드
	 * @param boarvo bf_num , bf_title , bf_content
	 * @return 1이상 : 수정 성공 / 0 : 수정 실패
	 */
	public int updateBoard(BoardFreeVO boardvo);
	
	
	/**
	 * 검색할 제목 키워드를 받으면 해당 키워드를 찾아 맞는 게시글의 리스트를 출력해주는 메서드
	 * @param  params 검색할 키워드 종류 / 키워드 값 
	 * @return 검색한 게시물들의 리스트
	 */
	public List<BoardFreeVO> searchTitleBoard(Map<String, String> params);
	
	/**
	 * 검색할 글쓴이 키워드를 받으면 해당 키워드를 찾아 맞는 게시글의 리스트를 출력해주는 메서드
	 * @param  params 검색할 키워드 종류 / 키워드 값 
	 * @return 검색한 게시물들의 리스트
	 */
	public List<BoardFreeVO> searchNameBoard(Map<String, String> params);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
