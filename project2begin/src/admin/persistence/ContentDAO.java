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

import admin.domain.ContentVO;
import admin.domain.MemberContentVO;

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
	
/* ��� ������������ �����ִ� �޼ҵ� */
	public List<MemberContentVO> listAllMemberContent(){
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			List<MemberContentVO> arr= sqlSession.selectList(NS+".listAllMemberContent");
			
			return arr;
		}
		finally {
			close();
		}
	}
	
/* ������ ����ڰ� �ø� �������� �����ִ� �޼ҵ� */
	public List<MemberContentVO> listMemberContent(String email) {
		
		try {
			
			sqlSession= this.getSessionFactory().openSession(true);
			
			List<MemberContentVO> arr= sqlSession.selectList(NS+".listMemberContent", email);
			
			return arr;
		}
		finally {
			close();
		}
		
		
	}
	
	
	/* �˻����� �����ִ� �޼ҵ� */
	public List<ContentVO> searchContent(String selectBox, String searchInput) {
		
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			//�Ű����� �����ص� ��
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<ContentVO> arr= listContent();
				
				return arr;
			}
			
			List<ContentVO> arr= sqlSession.selectList(NS+".searchContent", map);
			
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
