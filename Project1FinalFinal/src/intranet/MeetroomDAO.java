package intranet;

import java.util.*;
import java.sql.*;
import java.sql.Date;

public class MeetroomDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	//사번, 예약순번, 회의실번호, 예약시작시간, 예약종료시간, 예약부서, 예약자이름
	
	//예약리스트 select
	public ArrayList<MeetroomVO> meetroomList() {
		try {
			con = DBUtil.getCon();
			String sql = "select emp.empid, idx, roomnum, to_date(starttime, 'yy/mm/dd hh24:mi:ss'), to_date(endtime, 'yy/mm/dd hh24:mi:ss'), dname, ename "
						+ "from meetroom  join (select empid, ename, dname from emp join dept on emp.deptno=dept.deptno) emp "
						+ "on meetroom.empid=emp.empid order by idx asc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			ArrayList<MeetroomVO> arr = makeList(rs);
			return arr;
		} catch (Exception e) {
			System.out.println("DAO.noticeList에서 Exception");
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	public ArrayList<MeetroomVO> makeList(ResultSet rs) throws SQLException {
		ArrayList<MeetroomVO> arr = new ArrayList();
		while (rs.next()) {
			int empid = rs.getInt("empid");
			int idx = rs.getInt("idx");
			String roomNum = rs.getString("roomnum");
			Date start = rs.getDate("starttime");
			Date end = rs.getDate("endtime");
			String dname = rs.getString("dname");
			String ename = rs.getString("ename");

			MeetroomVO vo = new MeetroomVO(empid, idx, roomNum, start, end, dname, ename);
			arr.add(vo);
		}
		return arr;
	}

	// 검색
//	public ArrayList<NoticeVO> searchNotice(int priority, String keyword) {
//		try {
//			con = DBUtil.getCon();
//			// 전체, 인사부, 연구소, 영업부, 생산부
//			String sql = "select * from (select * from notice where priority=?)" + " where title like ? or text like ?";
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, priority);
//			ps.setString(2, "%" + keyword + "%");
//			ps.setString(3, "%" + keyword + "%");
//			rs = ps.executeQuery();
//
//			return makeList(rs);
//		} catch (SQLException e) {
//			System.out.println("DAO.searchNotice에서 SQL에러");
//			e.printStackTrace();
//			return null;
//		} finally {
//			close();
//		}
//	}
//
//	// 작성
//	public int insertNotice(NoticeVO notice) {
//		try {
//			con = DBUtil.getCon();
//
//			// 글번호, 사번, 공지대상, 제목, 작성글, 작성일, 마감일
//			// int noticeid, int priority, String title, String text, int empid, Date wdate
//			String sql = "INSERT INTO notice VALUES(notice_seq.nextval, ?, ?, ?, ?, sysdate)";
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, notice.getPriority());
//			ps.setString(2, notice.getTitle());
//			ps.setString(3, notice.getText());
//			ps.setInt(4, notice.getEmpId());
//			int n = ps.executeUpdate();
//			return n;
//		} catch (SQLException e) {
//			System.out.println("DAO.insertNotice에서 SQL에러");
//			e.printStackTrace();
//			return -1;
//		} finally {
//			close();
//		}
//	}
//
//	// 읽기창-기존정보 내보내기
//	public NoticeVO readNotice(int idx) {
//		NoticeVO noticeRead = new NoticeVO();
//		try {
//			con = DBUtil.getCon();
//			String sql = "select noticeid, priority, empid, wdate, title, text from notice where noticeid=?";
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, idx);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				int noticeid = rs.getInt("noticeid");
//				int priority = rs.getInt("priority");
//				String title = rs.getString("title");
//				String text = rs.getString("text");
//				int empid = rs.getInt("empid");
//				Date wdate = rs.getDate("wdate");
//				noticeRead = new NoticeVO(noticeid, priority, title, text, empid, wdate);
//			}
//		} catch (SQLException e) {
//			System.out.println("DAO.editNotice에서 SQL에러");
//			e.printStackTrace();
//			return null;
//		} finally {
//			close();
//		}
//		return noticeRead;
//	}
//
//	// 읽기창-수정
//	public int editNotice(NoticeVO vo) {
//		try {
//			con=DBUtil.getCon();
//			String sqlEdit = "update notice set" 
//					+ " priority=?," 
//					+ " title=?," 
//					+ " text=?" 
//					+ " where noticeid=?";
//			ps = con.prepareStatement(sqlEdit);
//			ps.setInt(1, vo.getPriority());
//			ps.setString(2, vo.getTitle());
//			ps.setString(3, vo.getText());
//			ps.setInt(4, vo.getNoticeId());
//			int n = ps.executeUpdate();
//			return n;
//		} catch (SQLException e) {
//			System.out.println("DAO.editNotice에서 SQL에러");
//			e.printStackTrace();
//			return -1;
//		} finally {
//			close();
//		}
//	}
//	
//	//삭제
//	public int deleteNotice(int idx) {
//		try {
//			con=DBUtil.getCon();
//			String sql="DELETE FROM notice WHERE noticeid=?";
//			ps=con.prepareStatement(sql);
//			ps.setInt(1, idx);
//			int n=ps.executeUpdate();
//			return n;
//		} catch(SQLException e) {
//			System.out.println("DAO.deleteNotice에서 SQL에러");
//			e.printStackTrace();
//			return -1;
//		} finally {
//			close();
//		}
//	}

	// 자원반납 메소드
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
	}

}
