package user.model;

//DAO - ���Ӽ�(persistence) ����

//import common.db.DBUtil;
import java.sql.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;

public class UserDAO {
	
	private DataSource ds;		//Ŀ�ؼ�Ǯ�� �̿��ϱ� ���� ������Ƽ(��������)
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UserDAO()
	{
		try {
			Context ctx= new InitialContext();
			ds=(DataSource)ctx.lookup("java:comp/env/myoracle/myshop");
			System.out.println("ds lookup success");
			
		} 
		catch (NamingException e) {
			System.out.println("ds lookup failed");
			e.printStackTrace();
		}
	}
	
	
	//���̵� �ߺ�ó���ϴ� �޼ҵ�
	public boolean idCheck(String userid) throws SQLException
	{
		try {
//			con=DBUtil.getCon();
			con=ds.getConnection();
			String sql="SELECT IDX FROM MEMBER WHERE USERID=?";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			rs= ps.executeQuery();
//			System.out.println(rs.next());
			
			//�˻������ 1���̱⶧���� while������ ã�� ���ʿ䰡 ����
			if(rs.next())
			{
				return false;
			}
			else
				return true;
//			return rs.next();
				//rs.next()�� boolean ��ȯ (����� ������ false)
		}
		finally {
			close();
		}
	}
	
	
	//ȸ������ ó���ϴ� �޼ҵ�
	public int insertUser(UserVO user) throws SQLException
	{
		try {
			con=ds.getConnection();
			
			String sql="INSERT INTO MEMBER"
					+ " VALUES(MEMBER_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,SYSDATE,1000,0)";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPwd());
			ps.setString(5, user.getHp1());
			ps.setString(6, user.getHp2());
			ps.setString(7, user.getHp3());
			ps.setString(8, user.getPost());
			ps.setString(9, user.getAddr1());
			ps.setString(10, user.getAddr2());
			
			int n= ps.executeUpdate();
			
			return n;
		}
		finally {
			close();
		}
	}
	
	//��üȸ������� �������� �޼ҵ�(�����ڸ��)
	public List<UserVO> listUsers() throws SQLException
	{
		try {
			
			con=ds.getConnection();
			
			String sql="SELECT * FROM MEMBER ORDER BY IDX";
			
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			
			List<UserVO> arr= makeList(rs);
			
			return arr;
			
		}
		finally {
			close();
		}
		
		
	}//--listUsers()
	public List<UserVO> makeList(ResultSet rs) throws SQLException
	{
		List<UserVO> arr= new ArrayList<>();
		
		//���ⱸ��
		while(rs.next())
		{
			int idx=rs.getInt("idx");
			String name=rs.getString("name");
			String userid=rs.getString("userid");
			String email=rs.getString("email");
			String pwd=rs.getString("pwd");
			String hp1=rs.getString("hp1");
			String hp2=rs.getString("hp2");
			String hp3=rs.getString("hp3");
			String post=rs.getString("post");
			String addr1=rs.getString("addr1");
			String addr2=rs.getString("addr2");
			java.sql.Date indate=rs.getDate("indate");
			int mileage=rs.getInt("mileage");
			int m_state=rs.getInt("m_state");
			
			UserVO vo= new UserVO(idx,name,userid,email,pwd,hp1,hp2,hp3,
					post,addr1,addr2,indate,mileage,m_state);
			arr.add(vo);
		}
		
		return arr;
	}
	
	//ȸ����ȣ�� ȸ������ �������� �޼ҵ�
	public UserVO selectUser(int idx) throws SQLException
	{
		con=ds.getConnection();
		
		try {
			String sql="SELECT * FROM MEMBER WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, idx);
			
			rs= ps.executeQuery();
			
			List<UserVO> arr= makeList(rs);
			
			if(arr!=null && arr.size()==1)
			{
				UserVO user= arr.get(0);
				return user;
			}
			else
				return null;
			
		}
		finally {
			close();
		}
	}
	
	//�˻������� ���� ȸ�������� �˻��ϴ� �޼ҵ�
	public List<UserVO> findUsers(String type, String keyword) throws SQLException
	{
		con=ds.getConnection();
		
		//Ÿ�Կ� ���� (1.�̸� 2.���̵� 3.�̸���
		switch(type)
		{
		case "1":
			type="name";
			break;
		case "2":
			type="userid";
			break;
		case "3":
			type="email";
			break;
		default :
			return null;
		}
		
		try {
			String sql="SELECT * FROM MEMBER WHERE "+type+" like ? ORDER BY IDX";
			
			ps=con.prepareStatement(sql);
			
			ps.setString(1, "%"+keyword+"%");
			
			rs=ps.executeQuery();
			
			List<UserVO> arr= makeList(rs);
			
			return arr;
			
		}
		finally {
			close();
		}
	}
	
	
	//ȸ������ �����ϴ� �޼ҵ� pwd ����
	public int updateUser(UserVO user) throws SQLException
	{
		con=ds.getConnection();
		try {
			//�̸� ���̵� �̸��� ����ó �����ȣ �ּ� ȸ������ ���ϸ���
			String sql="UPDATE MEMBER SET NAME=?, USERID=?, EMAIL=?, HP1=?, HP2=?, HP3=?,"
					+ " POST=?, ADDR1=?, ADDR2=?, M_STATE=?, MILEAGE=?"
					+ " WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getHp1());
			ps.setString(5, user.getHp2());
			ps.setString(6, user.getHp3());
			ps.setString(7, user.getPost());
			ps.setString(8, user.getAddr1());
			ps.setString(9, user.getAddr2());
			ps.setInt(10, user.getM_state());
			ps.setInt(11, user.getMileage());
			ps.setInt(12, user.getIdx());
			
			int n=ps.executeUpdate();
			
			return n;
			
		}
		finally {
			close();
		}
	}
	
	
	
	//ȸ����ȣ�� ȸ������ �����ϱ�
	//��, db���� ������ �ƴ϶� Ż��ȸ�� ���·� ��ȯ�ؾ��ϹǷ�
	//update���� �̿��Ұ� -1����  -2Ż��
	public int updateUserMstate(int idx, int state) throws SQLException
	{
		try {
			con=ds.getConnection();
			
			String sql="UPDATE MEMBER SET M_STATE=? WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, state);
			ps.setInt(2, idx);
			
			int n= ps.executeUpdate();
			
			return n;
		}
		finally {
			close();
		}
	}
	
	
	//userid(Unique)�� ȸ�������� �������� �޼ҵ�
	public UserVO selectByUserid(String userid) throws SQLException, NotUserException
	{
		con=ds.getConnection();
		
		try {
			String sql="SELECT * FROM MEMBER WHERE USERID=?";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs=ps.executeQuery();
			
			List<UserVO> arr= makeList(rs);
			
			if(arr!=null && arr.size()==1)
			{
				return arr.get(0);
			}
			else
			{
				//���ܹ߻�
				//��������ǿ��ܸ� �߻���ų���� throw�� ����
				//�̶� throw�� �ݵ�� throws�� �����ϸ� �Բ� ���������
				throw new NotUserException(userid+" ��� ���̵�� �������� �ʽ��ϴ�");
			}
		}
		finally {
			close();
		}
	}
	
	
	//�α���ó���ϴ� �޼ҵ�
	public UserVO loginCheck(String userid, String pwd) throws SQLException, NotUserException
	{
		con=ds.getConnection();
		
		try {
			//1. ���̵�� ȸ������ ��������
			UserVO user= selectByUserid(userid);
			
			if(user!=null)
			{
				//null�� �ƴϸ� �ش�user�� �����Ѵٴ� �Ҹ�
				String dbPwd= user.getPwd();

				//3. ��ġ�ϸ� uservo ��ȯ
				if(dbPwd.equals(pwd))
				{
					return user;
				}
			}
			//2. db ����� ����ڰ� �Է��� ����� ��ġ���� ������
			//���ܹ߻�
			throw new NotUserException("��й�ȣ�� Ʋ�Ⱦ�");
			
		}
		finally {
			close();
		}
	}
	
	
	//�ݱ� �޼ҵ�
	public void close()
	{
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
			//con.close()�� ���� Ŀ�ؼ�Ǯ�� ��ȯ�ϴ� ������ �մϴ�
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
