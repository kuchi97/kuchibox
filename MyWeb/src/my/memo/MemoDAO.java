package my.memo;

import java.sql.*;
import java.util.*;			//ArrayList

/*
Persistenece object: 영속성 객체
	DB에 접근하여 CRUD등 biz logic을 수행하는 객체
	
	DAO: Data Access Object

*/

public class MemoDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	/* 한줄메모글을 등록하는 메소드: insert문을 수행 */
	public int insertMemo(MemoVO memo)
	{
		try {
			con= DBUtil.getCon();
			
			String sql="insert into memo values(memo_seq.nextval,?,?,sysdate)";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, memo.getName());
			ps.setString(2, memo.getMsg());
			
			int n= ps.executeUpdate();
			return n;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;				//오류발생시 음수 반환
		} finally {
			close();
		}
	}
	
	//ta에 memo나타내기
	public ArrayList<MemoVO> listMemo()
	{
		try {
			con= DBUtil.getCon();
			
			//statement set
			String sql="SELECT idx, name, rpad(msg,50,' ') msg, wdate FROM MEMO order by 1 desc";
			
			ps=con.prepareStatement(sql);
			
			//resultset set
			rs=ps.executeQuery();
			ArrayList<MemoVO> al= makeList(rs);
			return al;							//값이 제대로 저장됐을때 반환
		} catch (SQLException e) {
			e.printStackTrace();
			return null;							//저장되지 않고 오류가 나면 null 반환
		} finally {
			close();
		}
	}
	
	public ArrayList<MemoVO> makeList(ResultSet rs) throws SQLException
	{
		ArrayList<MemoVO> al= new ArrayList<MemoVO>();
		while(rs.next())
		{
			MemoVO mVO= new MemoVO();			//반복문 돌때마다 객체를 생성해야 각각 저장
			mVO.setIdx(rs.getInt(1));			//mVO set으로 객체에 값을 할당해야한다
			mVO.setName(rs.getString(2));		//값은 ResultSet에서 get으로 가져온다
			mVO.setMsg(rs.getString(3));
			mVO.setWdate(rs.getDate(4));
			
			al.add(mVO);
		}
		return al;
	}
	
	
//	where절을 갖는 select문
//		where절에서 like로 검색조건을 갖는다
	public ArrayList<MemoVO> findMemo(int type, String keyword)
	{
		//type: 검색타입. 0:작성자 1:메모내용 2:작성일
		try {
			con=DBUtil.getCon();
			
			String colName="";
			switch(type)
			{
			case 0:
				colName="name";
				break;
			case 1:
				colName="msg";
				break;
			case 2:
				colName="wdate";
				break;
			}
			
			String sql="select * from memo where "+colName+" like ? order by idx";
			//ps얻기
			ps= con.prepareStatement(sql);
			
			//?값 세팅
			
			ps.setString(1, "%"+keyword+"%");
			
			//execute
			rs=ps.executeQuery();
			
			//rs얻어서 출력
				//makelist 호출하면 편해
			ArrayList<MemoVO> al= makeList(rs);
			
			return al;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	
	public int deleteMemo(Integer idx) {
		try {
			con= DBUtil.getCon();
			
			String sql= "DELETE FROM MEMO WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			
			//execute
			int n= ps.executeUpdate();
			
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			close();
		}
	}
	
	//글번호(pk)로 해당 글을 가져오는 메소드
	public MemoVO selectMemo(Integer idx)
	{
		try {
			con=DBUtil.getCon();
			String sql="SELECT * FROM MEMO WHERE IDX= ?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,idx);
			
			rs= ps.executeQuery();
			
			ArrayList<MemoVO> al= makeList(rs);
			
			if(al!=null && al.size()==1)
			{
				MemoVO memo=al.get(0);
				return memo;
			}
			
			return null;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	//글 내용을 수정하는 메소드
	public int updateMemo(MemoVO memo)
	{
		try {
			con=DBUtil.getCon();
			String sql="UPDATE MEMO SET NAME=?, MSG=? WDATE=SYSDATE WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			
			ps.setString(1, memo.getName());
			ps.setString(2, memo.getMsg());
			ps.setInt(3, memo.getIdx());

			int n= ps.executeUpdate();
			
			return n;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			close();
		}
	}
	
	
	
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
