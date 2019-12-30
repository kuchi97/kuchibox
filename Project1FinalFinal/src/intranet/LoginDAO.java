package intranet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO {

	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public ArrayList<LoginVO> makeList(ResultSet rs) 
	throws SQLException
	{
		ArrayList<LoginVO> vo=new ArrayList<LoginVO>();
		while(rs.next()) {
			LoginVO voTemp=new LoginVO(rs.getInt("empid"), rs.getString("ename"),
						rs.getString("pwd"));
			// System.out.println(voTemp.toString());
			vo.add(voTemp);
		}
		return vo;
	}//-------------------------------------

	// emp테이블 가져오기
	public ArrayList<LoginVO> listLoginEmp(){
		try {
			con=DBUtil.getCon();
			String sql="SELECT empid, ename, pwd FROM emp";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<LoginVO> vo=makeList(rs);
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}//-----------------------------------
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
