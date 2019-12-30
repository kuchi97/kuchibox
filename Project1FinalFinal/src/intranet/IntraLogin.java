package intranet;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class IntraLogin extends javax.swing.JFrame {

	Intra intra;
	Msg msg;
	ArrayList<LoginVO> empLoginList=null; 
	
	EmpVO empVo;
	LoginDAO loginDao=new LoginDAO();
	EmpDAO empDao=new EmpDAO();

	public IntraLogin() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		//emp테이블의 모든 사번, 이름, 비밀번호 호출
        empLoginList=loginDao.listLoginEmp();
    }//--------------------------------------------------------------------EO-IntraLogin

    @SuppressWarnings("unchecked")
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();			//라벨 : 기업로고 이미지
        lbEmpid = new javax.swing.JLabel();			//라벨 : "사번(ID)"
        tfEmpid = new javax.swing.JTextField();		//텍스트필드 : 아이디 입력란
        lbPwd = new javax.swing.JLabel();			//라벨 : "패스워드"
        tfPwd = new javax.swing.JPasswordField();	//패스워드필드 : 패스워드 입력란 
        lbInfo = new javax.swing.JLabel();			//라벨 : "비밀번호 분실시~문의" 안내 문구
        btLogin = new javax.swing.JButton();		//버튼 : "로그인", 로그인 및 권한 판별-메인페이지 진입 버튼
        
        //btLogin 엔터 단축키 처리--------------
        JRootPane rootPane=getRootPane();
        rootPane.setDefaultButton(btLogin);
        //---------------------------------

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        pnLogin.setBackground(new java.awt.Color(121, 176, 215));
        
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/companyLogo_L.jpg")));
        
        lbEmpid.setText("ID(사번)");
        
        lbPwd.setText("패스워드");
        
        tfPwd.setText("");
        
        btLogin.setText("로그인");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        lbInfo.setText("※비밀번호 분실 시 관리부(02-000-0000, admin@company.com)에 별도 문의※");

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addComponent(lbInfo)
                .addGap(323, 323, 323))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmpid)
                    .addComponent(lbPwd))
                .addGap(18, 18, 18)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(tfEmpid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                        .addComponent(lbLogo)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                        .addComponent(btLogin)
                        .addGap(494, 494, 494))))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addGap(57, 57, 57)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpid)
                    .addComponent(tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPwd))
                .addGap(34, 34, 34)
                .addComponent(btLogin)
                .addGap(35, 35, 35)
                .addComponent(lbInfo)
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }//--------------------------------------------------------------------EO-initComponents
	
    /**유효성 체크*/
    //유효성 체크(1): tfEmpid(사번), tfPwd(비밀번호) null 체크
    public boolean loginNullCheck(String id, String pwd) {
    	if(id==null||id.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "사번을 입력하세요");	//부모 컴포넌트를 null로 할당해 DialogBox를 닫을 때까지 기존 프레임 활성화 불가능하도록 설정
    		return false;
    	}
    	else if(pwd==null|pwd.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요");
    		return false;
    	}
    	return true;

    }
	//유효성 체크(2): 메뉴 허용 범위 판별(관리자모드)
	public int LoginCheck(int empId, String pwd) {
        for(int i=0;i<empLoginList.size();i++) {
        	LoginVO loginVo=empLoginList.get(i);
			if (loginVo.getEmpId() == empId) {
				if (pwd.equals(loginVo.getPwd())) {			//비밀번호 일치 확인
					empVo=empDao.findLoginEmp(empId);
					if (empVo.getDeptNo()==100) return 9; 	//관리자일 경우 
					else return 2;							//일반 사원일 경우
				}
				return 1;
			}
        }
        return 0;
	}	
    
	/**IntraNet 메인 창 띄우기*/
    public void popUp() {
    	this.dispose();
		intra.pack();
		intra.setLocation(0,0);
		intra.setVisible(true);
    }
    
    /**로그인 버튼*/
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	String inputtedEmpString=tfEmpid.getText();
    	char[] pwd=tfPwd.getPassword();
    	String inputtedPwd=new String(pwd);
    	int flag=-1;
    	
    	
    	boolean pp =loginNullCheck(inputtedEmpString, inputtedPwd);
    	if(pp)
    	{
    		int inputtedEmpId;
        	try {
        		inputtedEmpId=Integer.parseInt(inputtedEmpString.trim());
        		flag=LoginCheck(inputtedEmpId, inputtedPwd);
    		} catch (Exception e) {
    			e.getMessage();
    			e.printStackTrace();
    		}
    		if (flag > 1) {
    			JOptionPane.showMessageDialog(null, empVo.getEmpId() + "님, 환영합니다.");
    			if (flag == 9)
    				JOptionPane.showMessageDialog(null, "관리자 모드로 이용합니다");
    			if (msg==null) msg=new Msg(empVo);
    			intra=new Intra(empVo,msg);
    			popUp();
    		} else if (flag == 1) {
    			JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다");
    			return;
    		} else {
    			JOptionPane.showMessageDialog(null, "등록된 사번이 아닙니다");
    			return;
    		}
    	}
    	
		
    }//--------------------------------------------------------------------EO-event

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntraLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntraLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntraLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntraLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntraLogin().setVisible(true);
            }
        });
    }//--------------------------------------------------------------------EO-main

    private javax.swing.JButton btLogin;
    private javax.swing.JLabel lbEmpid;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPwd;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JTextField tfEmpid;
    private javax.swing.JPasswordField tfPwd;
    //--------------------------------------------------------------------EO-variables
}
