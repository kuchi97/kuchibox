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
