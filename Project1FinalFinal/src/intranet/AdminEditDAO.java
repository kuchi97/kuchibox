package intranet;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class AdminEditDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	/**emp all list 출력하는 메소드*/
	public ArrayList<AdminRegisterVO> selectAll() {
		try {
			con=DBUtil.getCon();
			String sql=" SELECT e.*, d.dname AS dname FROM emp e JOIN dept d ON e.deptno=d.deptno ORDER BY empid ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<AdminRegisterVO> list=makeList(rs);
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			close();
		}
	}
	
	/**emp all list 만드는 메소드*/
	public ArrayList<AdminRegisterVO> makeList(ResultSet rs) throws SQLException {
		ArrayList<AdminRegisterVO> list=new ArrayList<>();
		while(rs.next()) {
			AdminRegisterVO emp=new AdminRegisterVO(rs.getInt("empid"),rs.getString("ename"),
					rs.getInt("deptno"),rs.getString("dname"),rs.getString("tel"),
					rs.getString("rank"),rs.getString("email"),rs.getString("hiredate"),
					rs.getString("sex"),rs.getString("pwd"));
			list.add(emp);
		}
		return list;
	}
	
	
	/**emp 1인 정보 검색*/
	public AdminRegisterVO selectEmp(int idx) {
		AdminRegisterVO emp=new AdminRegisterVO();
		try {
			con=DBUtil.getCon();
			String sql="SELECT e.*, d.dname AS dname FROM emp e JOIN dept d ON e.deptno=d.deptno WHERE empid=? ORDER BY empid ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			rs=ps.executeQuery();
			while(rs.next()) {
				int empid=rs.getInt("empid");
				String ename=rs.getString("ename");
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String tel=rs.getString("tel");
				String rank=rs.getString("rank");
				String email=rs.getString("email");
				String wdate=rs.getString("hiredate");
				String sex=rs.getString("sex");
				String pwd=rs.getString("pwd");
				emp=new AdminRegisterVO(empid,ename,deptno,dname,tel,rank,email,sex,wdate,pwd);
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally {
			close();
		}
		return emp;
	}
	
	/**사원 정보 update*/
	public int updateEmp(AdminRegisterVO vo) {
		int deptno;
		try {
			con=DBUtil.getCon();
			String sql="UPDATE emp SET empid=?,pwd=?,ename=?,sex=?,tel=?,email=?,deptno=?,rank=? WHERE empid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, vo.getEmpid());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getEname());
			ps.setString(4, vo.getSex());
			ps.setString(5, vo.getTel());
			ps.setString(6, vo.getEmail());
			if(vo.getDname().equals("인사부")) {
				deptno=100;
			}else if(vo.getDname().equals("연구소")) {
				deptno=200;
			}else if(vo.getDname().equals("영업부")) {
				deptno=300;
			}else{
				deptno=400;
			}
			ps.setInt(7, deptno);
			ps.setString(8, vo.getRank());
			ps.setInt(9, vo.getEmpid());
			int result=ps.executeUpdate();
			if(result>0) {
				return 1;
			}else {
				return -1;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return -1;			
		}finally {
			close();
		}
	}
	
	/**사원 정보 삭제*/
	public int deleteEmp(int idx) {
		try{
			con=DBUtil.getCon();
			String sql="DELETE FROM emp WHERE empid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			int cnt=ps.executeUpdate();
			return cnt;
		}catch(SQLException e) {
			e.printStackTrace();
			return -1;
		}finally {
			close();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(Exception e) {
			e.getMessage();
		}
	}

	
}
