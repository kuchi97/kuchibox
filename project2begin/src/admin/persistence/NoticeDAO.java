package admin.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	/* �ݱ�޼ҵ� */
	public void close() {
		if(sqlSession!=null) sqlSession.close();
	}
	
	/* �������� �� ���� ��������(����¡) */
	public int getTotalNotice() {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.selectOne(NS+".totalNotice");
			
			return n;
		}
		finally {
			close();
		}
	}
	/* �˻��� �������� ��(����¡) */
	public int getTotalSearchNotice(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".totalSearchNotice", map);
			return n;
		}
		finally {
			close();
		}
	}
	
	/* ��� �������� �������� �޼ҵ� */
	public List<NoticeVO> getNoticeList(int start, int end) {
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			
			map.put("start",String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			List<NoticeVO> arr= new ArrayList<>();
			arr= sqlSession.selectList("getNoticeList", map);
			
			return arr;
		}
		finally {
			close();
		}
	}//--getNoticeList();
	
	/* �˻��� �������� ���� �������� */
	public int getSearchTotalCount(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".searchTotalCount", map);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* �˻��� �������׸���Ʈ �������� �޼ҵ� */
	public List<NoticeVO> selectNotice(String selectBox, String searchInput, int start, int end) {
		try {
			//�˻����� ������ ��ü�������׸���Ʈ ������
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<NoticeVO> arr= getNoticeList(start, end);
				return arr;
			}
			sqlSession= this.getSessionFactory().openSession(true);
			
			Map<String, String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			map.put("start", String.valueOf(start));
			map.put("end", String.valueOf(end));
			
			List<NoticeVO> arr= sqlSession.selectList(NS+".selectNotice", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	/* �������� �ϳ��� ���� �������� */
	public NoticeVO selectOneNotice(String idx) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			NoticeVO notice= sqlSession.selectOne(NS+".selectOneNotice",idx);
			
			return notice;
		}
		finally {
			close();
		}
	}
	
	/* �������� �ۼ� �޼ҵ� */
	public int insertNotice(NoticeVO vo) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.insert(NS+".insertNotice", vo);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* �������� ���� */
	public int updateNotice(NoticeVO vo) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.update(NS+".updateNotice",vo);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	/* �������� ���� */
	public int deleteNotice(String idx) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			
			int n= sqlSession.delete(NS+".deleteNotice", idx);
			
			return n;
		}
		finally {
			close();
		}
	}
	
	

}
