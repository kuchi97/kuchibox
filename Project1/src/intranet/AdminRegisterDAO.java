package intranet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRegisterDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	/**사원 정보 추가*/
	public int insertRegister(AdminRegisterVO vo) {
		try {
			con=DBUtil.getCon();
			String sql=" INSERT INTO emp VALUES(?,?,?,?,?,?,sysdate,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, vo.getEmpid());
			ps.setString(2, vo.getEname());
			ps.setInt(3, vo.getDeptno());
			ps.setString(4, vo.getTel());
			ps.setString(5, vo.getRank());
			ps.setString(6, vo.getEmail());
			ps.setString(7, vo.getSex());
			ps.setString(8, vo.getPwd());
			int n=ps.executeUpdate();
			System.out.println(n);
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}finally {
			close();
		}
	}
	
	/**DB 자료 반납*/
	public void close() {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}