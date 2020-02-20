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
	
	/* ��������� �޼ҵ� */
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
	
	
	/* �ݱ� �޼ҵ� */
	public void close()
	{
		if(sqlSession!=null) sqlSession.close();
	}
	
/*------------------------------------------------------------------------*/
	
	/* ��ü ȸ�� �� ��������(����¡ó����) */
	public int getTotalMember() {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			int n= sqlSession.selectOne(NS+".totalMember");
			return n;
		}
		finally {
			close();
		}
	}
	/* �˻��� ȸ�� �� ��������(����¡ó����) */
	public int getTotalSearchMember(String selectBox, String searchInput) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			Map<String,String> map= new HashMap<>();
			map.put("selectBox", selectBox);
			map.put("searchInput", searchInput);
			
			int n= sqlSession.selectOne(NS+".totalSearchMember", map);
			return n;
		}
		finally {
			close();
		}
	}
	
	/* ��üȸ����� ��Ÿ���� �޼ҵ� */
	public List<MemberVO> listMember(int start, int end)
	{
		try {
			sqlSession=this.getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("start",String.valueOf(start));
			map.put("end",String.valueOf(end));
			
			List<MemberVO> arr= sqlSession.selectList(NS+".listMember", map);
			
			return arr;
		}
		finally {
			close();
		}
	}
	
	
	/* �˻��� ȸ���� ��Ÿ���� �޼ҵ� */
	public List<MemberVO> searchMember(String selectBox, String searchInput, int start, int end) {
		try {
			if(searchInput==null || searchInput.trim().isEmpty()) {
				List<MemberVO> arr= listMember(start, end);
				
				return arr;
			}
			
			sqlSession=getSessionFactory().openSession(true);
			
			Map<String,String> map= new HashMap<>();
			map.put("selectBox",selectBox);
			map.put("searchInput",searchInput);
			map.put("start", String.valueOf(start));
			map.put("end", String.valueOf(end));
			
			List<MemberVO> arr= sqlSession.selectList(NS+".searchMember",map);
			
			return arr;
		}
		finally {
			close();
		}
	}

	/* ȸ�� �Ѹ��� ������ �������� �޼ҵ� */
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

	/* ȸ�������� �����ϴ� �޼ҵ� */
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
	
	/* ȸ������ */
	public int deleteMember(String email) {
		try {
			sqlSession= this.getSessionFactory().openSession(true);
			int n= sqlSession.delete(NS+".deleteMember", email);
			return n;
		}
		finally {
			close();
		}
	}


}
