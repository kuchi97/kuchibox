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
	/* NameSpace ����� adminMapper.xml�� namespace�Ӽ����� ������*/
	
	private SqlSession sqlSession;			//sql���� ������ ������ ����
	
	//������ ����� �޼ҵ� ����
	public SqlSessionFactory getSessionFactory() {
		
		SqlSessionFactoryBuilder builder=null;			//�� ���డ ������
		
		String resource="common/config/mybatis-config.xml";		//���赵 mybatis�� �̿�
		
		try {
			
		InputStream is= Resources.getResourceAsStream(resource);	//���赵�� ���� inputstream
		builder= new SqlSessionFactoryBuilder();					//���డ ä����
		
		SqlSessionFactory factory=builder.build(is);			//builder�� is��� factory �Ǽ�
		
		//�ݱ�
		if(is!=null) is.close();
		
		return factory;			//�� ������ �����ȯ
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;		//���� �������� �� ��ȯ
		}
	}// ���弼����--------------------------------------------------
	
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
	
	
	
	/* �ݱ�޼ҵ� */
	public void close() {
		if(sqlSession!=null) sqlSession.close();
	}

}
