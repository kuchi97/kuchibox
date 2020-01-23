package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<NoticeVO> getNoticeList() {
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			List<NoticeVO> arr= new ArrayList<>();
			arr= sqlSession.selectList("getNoticeList");
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	
	
	/* 닫기메소드 */
	public void close() {
		if(sqlSession!=null) sqlSession.close();
	}

}
