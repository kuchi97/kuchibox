package intranet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	private void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		} catch (Exception e) {}
	}//---------------------------------

	public ArrayList<EmpVO> makeList(ResultSet rs) 
	throws SQLException
	{
		ArrayList<EmpVO> vo=new ArrayList<EmpVO>();
		while(rs.next()) {
			EmpVO voTemp=new EmpVO(rs.getInt("empid"),rs.getString("ename"),
					rs.getInt("deptno"),rs.getString("dname"),rs.getString("rank"));
			vo.add(voTemp);

		}
		return vo;
	}//-------------------------------------

	public ArrayList<EmpVO> listEmp(){
		try {
			con=DBUtil.getCon();
			// select문 작성
			// emp List 가져오기
			String sql="select e.empid empid, ename, rank, d.deptno deptno, dname "
					+"from emp e, dept d where e.deptno=d.deptno";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<EmpVO> vo=makeList(rs);
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;	// 오류 발생시는 null을 반환
		} finally {
			close();
		}
	}//-----------------------------------
	
	public EmpVO findLoginEmp(int empID) {
		try {
			con = DBUtil.getCon();
			// where절을 갖는 select문 작성
			String sql = "select e.empid empid, ename, rank, d.deptno deptno, dname "
					+ "from emp e, dept d where e.deptno=d.deptno and empid =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empID);
			rs = ps.executeQuery();
			rs.next();
			EmpVO vo = new EmpVO(rs.getInt("empid"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("dname"),
					rs.getString("rank"));
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null; // 오류 발생시는 null을 반환
		} finally {
			close();
		}
	}// -------------------------------------
	
	public ArrayList<EmpVO> findEmp(int type, String keyword){
		// type(0: 부서명으로 검색, 2: 이름으로 검색)
		try{
			con=DBUtil.getCon();
			//where절을 갖는 select문 작성
			String sql="select e.empid empid, ename, rank, d.deptno deptno, dname "
					+"from emp e, dept d where e.deptno=d.deptno and ";
			String colName="";
			switch (type) {
			case 0:
				colName="dname";
				break;
			case 2:
				colName="ename";
				break;
			default:
				return null;
			}
			
			sql += colName + " like ? order by 1 asc";
			ps = con.prepareStatement(sql);
			keyword = "%" + keyword + "%";
			// System.out.println(sql);
			ps.setString(1, keyword);
			rs = ps.executeQuery();
			
			if(rs!=null) {
				ArrayList<EmpVO> vo = makeList(rs);
				return vo;
			} else return null;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;	// 오류 발생시는 null을 반환
		} finally {
			close();
		}
	}
	
	public ArrayList<EmpVO> findEmp(int empID){
		// type(1: empID 로 검색
		try{
			con=DBUtil.getCon();
			//where절을 갖는 select문 작성
			String sql="select e.empid empid, ename, rank, d.deptno deptno, dname "
					+"from emp e, dept d where e.deptno=d.deptno empid =?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, empID);
			rs=ps.executeQuery();
			ArrayList<EmpVO> vo=makeList(rs);
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;	// 오류 발생시는 null을 반환
		} finally {
			close();
		}
	}

}
	

