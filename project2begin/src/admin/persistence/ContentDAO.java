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

	/* �ݱ� �޼ҵ� */
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
	
	/* �� ������ ��(����¡ó����) */
	public int getTotalContent() {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.selectOne(NS+".totalContent");
			
			return n;
		}
		finally {
			close();
		}
	}

	/* �˻��� ������ ��(����¡) */
	public int getTotalSearchContent(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			map.put("selectBox",selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".totalSearchContent",map);
			
			return n;
		}
		finally {
			close();
		}
	}
	/* �� ��������� ��(����¡ó����) */
	public int getTotalMemberAllContent() {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.selectOne(NS+".totalMemberAllContent");
			
			return n;
		}
		finally {
			close();
		}
	}
	/* �˻��� ��������� ��(����¡) */
	public int getTotalSearchMemberContent(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".totalSearchMemberContent", map);
			return n;
		}
		finally {
			close();
		}
	}
	/* Ư�� ����� �� ������ ��(����¡ó����) */
	public int getTotalMemberContent(String email) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.selectOne(NS+".totalMemberContent", email);
			
			return n;
		}
		finally {
			close();
		}
	}
	
/* ��� �������� �����ִ� �޼ҵ� */
	public List<ContentVO> listContent(int start, int end) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("start", String.valueOf(start));
			map.put("end", String.valueOf(end));
			
			List<ContentVO> arr= sqlSession.selectList(NS+".listContent", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	/* Ư�� ������ ������ �������� �޼ҵ� (�����Ҷ�) */
	public ContentVO selectOneContent(String idx) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			ContentVO content= sqlSession.selectOne(NS+".selectOneContent", idx);
			
			return content;
		}
		finally {
			close();
		}
	}
	
	/* �˻��� ������ �����ִ� �޼ҵ� */
	public List<ContentVO> searchContent(String selectBox,String searchInput,int start,int end) {
		
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			//�Ű����� �����ص� ��
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			map.put("start", String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			//�˻��� �����̸� ��ü����Ʈ ��ȯ
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<ContentVO> arr= listContent(start, end);
				return arr;
			}
			
			List<ContentVO> arr= sqlSession.selectList(NS+".searchContent", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
/* ��� ������������ �����ִ� �޼ҵ� */
	public List<MemberContentVO> listAllMemberContent(int start, int end){
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("start", String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			List<MemberContentVO> arr= sqlSession.selectList(NS+".listAllMemberContent", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
/* ������ ����ڰ� �ø� �������� �����ִ� �޼ҵ� */
	public List<MemberContentVO> listMemberContent(String email, int start, int end) {
		
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("email", email);
			map.put("start", String.valueOf(start));
			map.put("end", String.valueOf(end));
			
			List<MemberContentVO> arr= sqlSession.selectList(NS+".listMemberContent", map);
			
			return arr;
		}
		finally {
			close();
		}
		
		
	}
	
	/* �˻��� ����������� �����ִ� �޼ҵ� */
	public List<MemberContentVO> searchMemberContent(String selectBox, String searchInput, int start, int end) {
		try {
			//�˻�� �������- ��ü����Ʈ ��������
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<MemberContentVO> arr= listAllMemberContent(start, end);
				return arr;
			}
			sqlSession= this.getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			map.put("start",String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			List<MemberContentVO> arr= sqlSession.selectList(NS+".searchMemberContent", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	/* ������ ����(idx) */
	public int updateContent(ContentVO content) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			int n= sqlSession.update(NS+".updateContent", content);
			return n;
		}
		finally {
			close();
		}
	}
	
	

	




	
	
}
