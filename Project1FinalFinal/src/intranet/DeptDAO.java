package intranet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {
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

	public ArrayList<DeptVO> makeList(ResultSet rs) 
	throws SQLException
	{
		ArrayList<DeptVO> vo=new ArrayList<DeptVO>();
		while(rs.next()) {
			DeptVO voTemp=new DeptVO(rs.getInt("deptno"),
					rs.getString("dname"));
			vo.add(voTemp);
		}
		return vo;
	}//-------------------------------------

	public ArrayList<DeptVO> listDept(){
		try {
			con=DBUtil.getCon();
			// select�� �ۼ�
			// dept List ��������
			String sql="select deptno, dname from dept";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<DeptVO> vo=makeList(rs);
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;	// ���� �߻��ô� null�� ��ȯ
		} finally {
			close();
		}
	}//-----------------------------------
	
}
