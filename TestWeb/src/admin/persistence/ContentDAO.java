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
	/* NameSpace���� ���� ���: contentMapper.xml�� <namespace>�Ӽ����� ���ƾ� �Ѵ� */
	
	private SqlSession sqlSession;		//sql���� ������ ���� ����
	
	//���常��� �޼ҵ� ����
	public SqlSessionFactory getSessionFactory()
	{
		SqlSessionFactoryBuilder builder=null;		//�� ���డ ����
		
		String resource="common/config/mybatis-config.xml";		//���赵 >> mybatis-config�� �����Ұ���
		
		try {
			
			InputStream is= Resources.getResourceAsStream(resource);	//���赵�� �о���� inputstream ����
			builder= new SqlSessionFactoryBuilder();	//���డ ä��
			
			SqlSessionFactory factory= builder.build(is);		//���డ�� ���赵 ��� ������ ��Ҵ�
			
			if(is!=null) is.close();
			
			return factory;		//���� ���ش�
		}
		catch(IOException e) {
			e.printStackTrace();
			return null;		//���� �������� ��
		}
	}//-- getSessionFactory();

	
/* ��� �������� �����ִ� �޼ҵ� */
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
	
	

/* �ݱ� �޼ҵ� */
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
	
	
}
