package jdbc.k20191122;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

import java.sql.*;
import java.util.Iterator;
import java.util.Vector;

import jdbc.util.DBUtil;



public class MyQuery extends JFrame implements ActionListener{

	JPanel bg;
	JTextArea ta= new JTextArea();
	JButton sal,info;
	Vector<String> v1= new Vector();
	Vector<String> v2= new Vector();
	ResultSet rs1, rs2;
	PreparedStatement ps1, ps2;
	Connection con;
	

	public MyQuery() throws Exception{
		super("MyQuery");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "North");
		bg.setBackground(Color.white);
		cp.add(new JScrollPane(ta),"Center");
		bg.add(info= new JButton("모든 사원 정보"));
		bg.add(sal= new JButton("부서별 급여통계"));
		
		ta.setBorder(new LineBorder(Color.blue,4));
		bg.setBorder(new TitledBorder("::인사관리정보::"));
		
		bt1();
		bt2();
		
		
		
		//add actionlistener
		info.addActionListener(this);
		sal.addActionListener(this);

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		if(obj==info)
		{
			ta.setText(null);
			Iterator<String> it= v1.iterator();
			
			ta.append("EMPNO\tENAME\tDNAME\tJOB\tSAL\tHIREDATE\tLOC\n");
			ta.append("=====\t=====\t=====\t===\t===\t========\t======\n");
			for(int i=0; i<v1.size(); i++)
			{
				if(it.hasNext())
				{
					String s= it.next();
					ta.append(s+"\n");
					System.out.println(s);
				}
			}
		}
		else if(obj==sal)
		{
			ta.setText(null);
			Iterator<String> it= v2.iterator();
			
			ta.append("DEPTNO\tDNAME\tSUM\tAVG\tMAX\tMIN\n");
			ta.append("======\t=====\t===\t===\t===\t===\n");
			for(int i=0; i<v2.size(); i++)
			{
				if(it.hasNext())
				{
					String s= it.next();
					ta.append(s+"\n");
					System.out.println(s);
				}
			}
		}
		close();	
	}
	public void bt1() throws Exception
	{
		// 1. 모든사원정보 클릭시
		// 사번 이름 소속부서명 업무 급여 입사일 근무지 ta에 출력

		// sql
		con = DBUtil.getCon();

		// 정보버튼내용
		String infoSQL = "SELECT E.EMPNO, E.ENAME, D.DNAME, E.JOB, E.SAL, E.HIREDATE, D.LOC" + " FROM EMP E JOIN DEPT D"
				+ " ON E.DEPTNO= D.DEPTNO ORDER BY 1";
		System.out.println(infoSQL);

		ps1 = con.prepareStatement(infoSQL);

		rs1 = ps1.executeQuery();

		while (rs1.next()) {
			int empno = rs1.getInt(1);
			String ename = rs1.getString(2);
			String dname = rs1.getString(3);
			String job = rs1.getString(4);
			int sal = rs1.getInt(5);
			Date hiredate = rs1.getDate(6);
			String loc = rs1.getString(7);

			v1.add(empno + "\t" + ename + "\t" + dname + "\t" + job + "\t" + sal + "\t" + hiredate + "\t" + loc);
		}
		close();
	}
	
	public void bt2 ()throws Exception
	{
		//2. 부서별 급여통계는
		//	부서번호 부서명 급여총합 평균급여 최대급여 최소급여
		//부서별급여통계
		con= DBUtil.getCon();	
		
		String salSQL="SELECT D.DEPTNO, DNAME,"
				+ " SUM(SAL), ROUND(AVG(SAL)), MAX(SAL), MIN(SAL)"
				+ " FROM EMP E JOIN DEPT D"
				+ " ON E.DEPTNO=D.DEPTNO"
				+ " GROUP BY D.DEPTNO, D.DNAME";
		System.out.println(salSQL);
		
		ps2= con.prepareStatement(salSQL);
		rs2= ps2.executeQuery();
		
		while (rs2.next()) {
			int deptno = rs2.getInt(1);
			String dname = rs2.getString(2);
			int sum = rs2.getInt(3);
			int avg = rs2.getInt(4);
			int max = rs2.getInt(5);
			int min = rs2.getInt(6);
	
			v2.add(deptno + "\t" + dname + "\t" + sum + "\t" + avg + "\t" + max + "\t" + min);
		}
		close();
		
	}
	
	public void close()
	{
		try {
			if(rs1!=null)
				rs1.close();
			if(ps1!=null)
				ps1.close();
			if(con!=null)
				con.close();
			if(rs2!=null)
				rs2.close();
			if(ps2!=null)
				ps2.close();
		} catch (SQLException e) {}
	}

	public static void main(String[] args) {
		try {
			MyQuery my = new MyQuery();
			
			my.setSize(800, 500);
			my.setVisible(true);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {}


	}


}