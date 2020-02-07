package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import admin.domain.MemberVO;

public class MemberDAO {
	
	private final String NS="admin.persistence.adminMapper";
	/* NameSpace값을 가질 상수: adminMapper.xml의 <namespace> 속성값과 같아야한다 */
	
	private SqlSession sqlSession;
	
	/* 공장터잡는 메소드 */
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
	
	
	/* 닫기 메소드 */
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
	
/*------------------------------------------------------------------------*/
	
	
	/* 전체회원목록 나타내는 메소드 */
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
	
	
	/* 검색한 회원만 나타내는 메소드 */
	public List<MemberVO> searchMember(String selectBox, String searchInput) {
		try {
			sqlSession=getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("selectBox",selectBox);
			map.put("searchInput",searchInput);
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<MemberVO> arr= listMember();
				
				return arr;
			}
			
			List<MemberVO> arr= sqlSession.selectList(NS+".searchMember",map);
			
			return arr;
		}
		finally {
			close();
		}
	}

	/* 회원 한명의 정보를 가져오는 메소드 */
	public MemberVO listOneMember(String email) {
		try {
		sqlSession=this.getSessionFactory().openSession(true);
		
		MemberVO member =sqlSession.selectOne(NS+".listOneMember", email);
		
		return member;
		}
		finally {
			close();
		}
	}

	/* 회원정보를 수정하는 메소드 */
	public int updateMember(MemberVO member) {
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			int n= sqlSession.update(NS+".updateMember", member);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	


}
