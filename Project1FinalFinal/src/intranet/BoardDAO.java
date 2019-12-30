package intranet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BoardDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//글 등록하는 메소드
	public int writeBoard(BoardVO board) throws Exception
	{
		try {
			con=DBUtil.getCon();
			
			String sql="INSERT INTO BOARD VALUES(BOARD_SEQ.NEXTVAL,?,?,SYSDATE)";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getName());
			ps.setString(2, "▶  "+board.getMsg());
			
			int n= ps.executeUpdate();
			
			return n;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;				//오류발생시 음수반환
		} finally {
			close();
		}
	}
	//reply write
	public int insertReply(ReplyVO reply,int boardID) throws Exception
	{
		try {
			con=DBUtil.getCon();
			
			String sql="INSERT INTO BOARD_REPLY (REREPLY, BDID, EMPID, RPTEXT, WDATE) VALUES('>>',?,?,?,SYSDATE)";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, boardID);
			ps.setString(2, reply.getName());
			ps.setString(3, "     ┗  "+reply.getMsg());
			
			int n=ps.executeUpdate();
			
			return n;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			close();
		}
	} 
	
//===========insert
	
	//검색 메소드
	public ArrayList<BoardVO> searchBoard(int type, String keyword)
	{
		try {
			con=DBUtil.getCon();
			
			String colName="";
			switch(type)
			{
			case 0:
				colName="BDID";
				break;
			case 1:
				colName="EMPID";
				break;
			case 2:
				colName="TEXT";
				break;
			}
			
			String sql="SELECT BDID, EMPID, TEXT, WDATE FROM BOARD"
					+ " WHERE "+colName+" LIKE ? ORDER BY 1 DESC";
			
			ps= con.prepareStatement(sql);
			ps.setString(1, "%"+keyword+"%");
			
			rs=ps.executeQuery();
			
			ArrayList<BoardVO> al= showBoard(rs);
			
			return al;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	public ArrayList<BoardVO> showBoard(ResultSet rs) throws SQLException
	{
		ArrayList<BoardVO> al= new ArrayList<>();
		while(rs.next())
		{
			BoardVO bVO= new BoardVO();			//반복문 돌때마다 객체를 생성해야 각각 저장
			bVO.setIdx(rs.getInt(1));			//mVO set으로 객체에 값을 할당해야한다
			bVO.setName(rs.getString(2));		//값은 ResultSet에서 get으로 가져온다
			bVO.setMsg(rs.getString(3));
			bVO.setWdate(rs.getDate(4));
			
			al.add(bVO);
		}
		return al;
	}
	public ArrayList<ReplyVO> selectReply(int bdid)
	{
		try {
			con=DBUtil.getCon();
			String sql="select r.rereply, r.empid, r.rptext, r.wdate" + 
					" from board b join board_reply r" + 
					" on b.bdid=r.bdid" +
					" where b.bdid=? order by wdate desc";
			
			ps= con.prepareStatement(sql);
			ps.setInt(1, bdid);
			
			rs=ps.executeQuery();
			
			ArrayList<ReplyVO> al= showReply(rs);
			
			return al;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	public ArrayList<ReplyVO> showReply(ResultSet rs) throws SQLException
	{
		ArrayList<ReplyVO> al= new ArrayList<>();
		while(rs.next())
		{
			ReplyVO rVO= new ReplyVO();
			rVO.setIdx(rs.getString(1));
			rVO.setName(rs.getString(2));
			rVO.setMsg(rs.getString(3));
			rVO.setWdate(rs.getDate(4));
			
			al.add(rVO);
		}
		return al;
	}
	
	public int delete(Integer idx)
	{
		try {
			con=DBUtil.getCon();
			
			String sql= "DELETE FROM BOARD WHERE BDID=?";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			int n= ps.executeUpdate();
			
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			close();
		}
	}
	
//=========select table show board n reply
	
	//closing method
	private void close()
	{
		try {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		} catch (Exception e) {
		}
	}
}
