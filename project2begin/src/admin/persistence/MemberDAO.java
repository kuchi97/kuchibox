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
	/* NameSpace���� ���� ���: adminMapper.xml�� <namespace> �Ӽ����� ���ƾ��Ѵ� */
	
	private SqlSession sqlSession;
	
	public SqlSessionFactory getSessionFactory()
	{
		SqlSessionFactoryBuilder builder=null; 		//���డ
		
		String resource="common/config/mybatis-config.xml";	//���赵
		
		try {
			InputStream is= Resources.getResourceAsStream(resource);
			builder= new SqlSessionFactoryBuilder();		//���డ ����
			
			SqlSessionFactory factory= builder.build(is);	//���డ�� ������ ����
			
			if(is!=null) is.close();
			return factory;		//������
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;		//���峵���� null ��ȯ
		}
	}//-- SqlSessionFactory ��������Ҵ�
	
	/* ��üȸ����� ��Ÿ���� �޼ҵ� */
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
	
	
	/* �˻��� ȸ���� ��Ÿ���� �޼ҵ� */
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

	
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}

}
