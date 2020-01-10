package user.model;

//DAO - 영속성(persistence) 계층

//import common.db.DBUtil;
import java.sql.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;

public class UserDAO {
	
	private DataSource ds;		//커넥션풀을 이용하기 위한 프로퍼티(전역변수)
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
	
	
	//아이디 중복처리하는 메소드
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
			
			//검색결과는 1개이기때문에 while돌려서 찾고 할필요가 없음
			if(rs.next())
			{
				return false;
			}
			else
				return true;
//			return rs.next();
				//rs.next()가 boolean 반환 (결과가 없으면 false)
		}
		finally {
			close();
		}
	}
	
	
	//회원가입 처리하는 메소드
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
	
	//전체회원목록을 가져오는 메소드(관리자모드)
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
		
		//여기구현
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
	
	//회원번호로 회원정보 가져오는 메소드
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
	
	//검색유형에 따라 회원정보를 검색하는 메소드
	public List<UserVO> findUsers(String type, String keyword) throws SQLException
	{
		con=ds.getConnection();
		
		//타입에 따라 (1.이름 2.아이디 3.이메일
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
	
	
	//회원정보 수정하는 메소드 pwd 빼고
	public int updateUser(UserVO user) throws SQLException
	{
		con=ds.getConnection();
		try {
			//이름 아이디 이메일 연락처 우편번호 주소 회원상태 마일리지
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
	
	
	
	//회원번호로 회원정보 삭제하기
	//단, db에서 삭제가 아니라 탈퇴회원 상태로 전환해야하므로
	//update문을 이용할것 -1정지  -2탈퇴
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
	
	
	//userid(Unique)로 회원정보를 가져오는 메소드
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
				//예외발생
				//사용자정의예외를 발생시킬때는 throw를 쓴다
				//이때 throw는 반드시 throws를 동반하며 함께 던져줘야함
				throw new NotUserException(userid+" 라는 아이디는 존재하지 않습니다");
			}
		}
		finally {
			close();
		}
	}
	
	
	//로그인처리하는 메소드
	public UserVO loginCheck(String userid, String pwd) throws SQLException, NotUserException
	{
		con=ds.getConnection();
		
		try {
			//1. 아이디로 회원정보 가져오고
			UserVO user= selectByUserid(userid);
			
			if(user!=null)
			{
				//null이 아니면 해당user가 존재한다는 소리
				String dbPwd= user.getPwd();

				//3. 일치하면 uservo 반환
				if(dbPwd.equals(pwd))
				{
					return user;
				}
			}
			//2. db 비번과 사용자가 입력한 비번이 일치하지 않으면
			//예외발생
			throw new NotUserException("비밀번호가 틀렸어");
			
		}
		finally {
			close();
		}
	}
	
	
	//닫기 메소드
	public void close()
	{
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
			//con.close()는 이제 커넥션풀에 반환하는 역할을 합니다
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
