package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import admin.domain.MemberVO;

public class MemberDAO {
	
	private final String NS="admin.persistence.adminMapper";
	/* NameSpace값을 가질 상수: adminMapper.xml의 <namespace> 속성값과 같아야한다 */
	
	private SqlSession sqlSession;
	
	public SqlSessionFactory getSessionFactory()
	{
		SqlSessionFactoryBuilder builder=null; 		//건축가
		
		String resource="common/config/mybatis-config.xml";	//설계도
		
		try {
			InputStream is= Resources.getResourceAsStream(resource);
			builder= new SqlSessionFactoryBuilder();		//건축가 구함
			
			SqlSessionFactory factory= builder.build(is);	//건축가가 공장터 잡음
			
			if(is!=null) is.close();
			return factory;		//정상동작
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;		//고장났을때 null 반환
		}
	}//-- SqlSessionFactory 공장터잡았다
	
	public List<MemberVO> listMember()
	{
		try {
			
			sqlSession=this.getSessionFactory().openSession(true);
			
			List<MemberVO> arr= sqlSession.selectList(NS+".listMember");
			
			return arr;
		}
		finally {
			close();
		}
	}

	
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
}
