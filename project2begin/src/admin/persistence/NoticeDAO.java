package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import admin.domain.NoticeVO;

public class NoticeDAO {
	
	private final String NS="admin.persistence.adminMapper";
	/* NameSpace 상수값 adminMapper.xml의 namespace속성값과 같을것*/
	
	private SqlSession sqlSession;			//sql문을 실행할 세션을 생성
	
	//공장을 만드는 메소드 생성
	public SqlSessionFactory getSessionFactory() {
		
		SqlSessionFactoryBuilder builder=null;			//빈 건축가 슬롯임
		
		String resource="common/config/mybatis-config.xml";		//설계도 mybatis를 이용
		
		try {
			
		InputStream is= Resources.getResourceAsStream(resource);	//설계도를 읽을 inputstream
		builder= new SqlSessionFactoryBuilder();					//건축가 채용함
		
		SqlSessionFactory factory=builder.build(is);			//builder가 is들고 factory 건설
		
		//닫기
		if(is!=null) is.close();
		
		return factory;			//다 지으면 공장반환
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;		//공장 못지으면 널 반환
		}
	}// 공장세웠다--------------------------------------------------
	
	/* 닫기메소드 */
	public void close() {
		if(sqlSession!=null) sqlSession.close();
	}
	
	/* 공지사항 총 개수 가져오기(페이징) */
	public int getTotalNotice() {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.selectOne(NS+".totalNotice");
			
			return n;
		}
		finally {
			close();
		}
	}
	/* 검색한 공지사항 수(페이징) */
	public int getTotalSearchNotice(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".totalSearchNotice", map);
			return n;
		}
		finally {
			close();
		}
	}
	
	/* 모든 공지사항 가져오는 메소드 */
	public List<NoticeVO> getNoticeList(int start, int end) {
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			
			map.put("start",String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			List<NoticeVO> arr= new ArrayList<>();
			arr= sqlSession.selectList("getNoticeList", map);
			
			return arr;
		}
		finally {
			close();
		}
	}//--getNoticeList();
	
	/* 검색한 공지사항 개수 가져오기 */
	public int getSearchTotalCount(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".searchTotalCount", map);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* 검색한 공지사항리스트 가져오는 메소드 */
	public List<NoticeVO> selectNotice(String selectBox, String searchInput, int start, int end) {
		try {
			//검색값이 없으면 전체공지사항리스트 나오게
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<NoticeVO> arr= getNoticeList(start, end);
				return arr;
			}
			sqlSession= this.getSessionFactory().openSession(true);
			
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			map.put("start", String.valueOf(start));
			map.put("end", String.valueOf(end));
			
			List<NoticeVO> arr= sqlSession.selectList(NS+".selectNotice", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	/* 공지사항 하나의 내용 가져오기 */
	public NoticeVO selectOneNotice(String idx) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			NoticeVO notice= sqlSession.selectOne(NS+".selectOneNotice",idx);
			
			return notice;
		}
		finally {
			close();
		}
	}
	
	/* 공지사항 작성 메소드 */
	public int insertNotice(NoticeVO vo) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.insert(NS+".insertNotice", vo);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* 공지사항 수정 */
	public int updateNotice(NoticeVO vo) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.update(NS+".updateNotice",vo);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* 공지사항 삭제 */
	public int deleteNotice(String idx) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.delete(NS+".deleteNotice", idx);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	

}
