package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import admin.domain.ContentVO;

public class ContentDAO {
	
	private final String NS="admin.persistence.adminMapper";
	/* NameSpace값을 가질 상수: contentMapper.xml의 <namespace>속성값과 같아야 한다 */
	
	private SqlSession sqlSession;		//sql문을 실행할 세션 생성
	
	//공장만드는 메소드 생성
	public SqlSessionFactory getSessionFactory()
	{
		SqlSessionFactoryBuilder builder=null;		//빈 건축가 슬롯
		
		String resource="common/config/mybatis-config.xml";		//설계도 >> mybatis-config를 참고할거임
		
		try {
			
			InputStream is= Resources.getResourceAsStream(resource);	//설계도를 읽어들일 inputstream 생성
			builder= new SqlSessionFactoryBuilder();	//건축가 채용
			
			SqlSessionFactory factory= builder.build(is);		//건축가가 설계도 들고 공장터 잡았다
			
			if(is!=null) is.close();
			
			return factory;		//공장 세준다
		}
		catch(IOException e) {
			e.printStackTrace();
			return null;		//공장 못지으면 널
		}
	}//-- getSessionFactory();

	
/* 모든 컨텐츠를 보여주는 메소드 */
	public List<ContentVO> listContent() {
		
		try {
			
			sqlSession= this.getSessionFactory().openSession(true);
			List<ContentVO> arr= sqlSession.selectList(NS+".listContent");
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	

/* 닫기 메소드 */
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
	
	
}
