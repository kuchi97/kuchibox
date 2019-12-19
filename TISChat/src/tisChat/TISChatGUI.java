/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisChat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class TISChatGUI extends javax.swing.JFrame implements Runnable{

	//member var.
	Socket sock;
	String id,chatName, host;
	final int port= 7777;
	boolean isStop=false;			//스레드 멈추기용
	ObjectOutputStream out;
	ObjectInputStream in;
	
	boolean isSendOne=false;		//귓속말 보내기라면 true값을 가질것
	Color fontCr=Color.black;
	
	DefaultTableModel userModel;
	String[] colHeader= {"아이디","대화명","성   별"};
	
	StyledDocument doc;
	SimpleAttributeSet attr;
	
	public static final int LOGOUT= 1;
	public static final int EXIT= 0;
	
	
    //constructor
    public TISChatGUI() {
    	super("::TIS Chatting App v1.0::");
        initComponents();
        
        doc= tpMsg.getStyledDocument();
        
        
    }//--constructor
    
    
    
    //Runnable override
    @Override
    public void run()
    {
//    	서버가 보내오는 메시지를 계속 듣고 파싱한다
    	
    	try {
	    	while(!isStop)
	    	{
	    		String serverMsg= (String)in.readObject();
	    		System.out.println("serverMsg: "+serverMsg);
	    		if(serverMsg==null) return;
	    		
	    		//서버가 보내오는 메시지를 분석(파싱)하는 메소드를 호출
	    		// 파싱이 핵심!!!!
	    		parsing(serverMsg);
	    	}
    	} catch (Exception e) {
    		System.out.println("클라이언트의 run()예외: "+e);
    	}
    }//--run
    
    //서버의 메시지를 분석하여 프로토콜별로 로직을 처리하는 메소드
    private void parsing(String msg)
    {
    	//'|' 구분자를 기준으로 문자열을 쪼개어 토큰으로 만든다 (배열)
    	String tokens[]= msg.split("\\|");
    	String protocol= tokens[0];
    	
    	switch(protocol)
    	{
	    	case "100":
	    	{
	    		//서버 >> 클라이언트에게 "100|아이디|대화명|성별"
	    		String rowData[]= {tokens[1],tokens[2],tokens[3]};
	    		userModel= (DefaultTableModel)this.userTable.getModel();
	    		userModel.addRow(rowData);
	    	} break;
	    	
	    	case "400":
	    	{
	    		//서버 >> 클라이언트에게 "400|대화명|글꼴색|메시지"
	    		String fromChatName=tokens[1];
	    		String fntRGB= tokens[2];
	    		String fromMsg= tokens[3];
//	    		showChat(fromChatName,fntRGB,fromMsg);
	    		showCacaoStyle(fromChatName, fntRGB, fromMsg);
	    	} break;
	    	
	    	case "500":
	    	{
	    		//서버 >> 클라이언트 "500|보낸사람대화명|메시지"
	    		String from=tokens[1];
	    		String oneMsg=tokens[2];
	    		String str="★ ["+from+"] 님의 귓속말: "+oneMsg+"\r\n";
//	    		showChatOne(Color.cyan, new Color(255,232,100), str);
	    		showCacaoStyle(from, Color.cyan, Color.red, str);
	    	} break;
	    	
	    	case "700":			//대화명 중복일경우 "700|"
	    	{
	    		showMsg(chatName+"이라는 이름은 있읍니다 ^^;");
	    		exitChat(LOGOUT);
	    	} break;
	    	
	    	case "800":
	    	{
	    		String logoutChatName=tokens[1];
	    		logout(logoutChatName, LOGOUT);				//0: 종료 1: 퇴장
	    	} break;
	    	
	    	case "900":
	    	{
	    		String exitChatName= tokens[1];
	    		logout(exitChatName, EXIT);
	    		
	    	} break;
	    	
    	}//--switch
    	
    }
    
    
    private void logout(String logoutChatName, int mode)
    {
    	//1. 퇴장하는 클이 본인이 아닐경우
    	// userModel에서 퇴장하는 고객의 정보를 제거하고
    	// tpMsg에 ㅇㅇㅇ가 퇴장했습니다 출력
    	int rowCnt= this.userModel.getRowCount();
    	String cname="";
    	
    	for(int i=0; i<rowCnt; i++)
    	{
    		cname= userModel.getValueAt(i, 1).toString();
    		
    		if(cname.equals(logoutChatName))
    		{
    			userModel.removeRow(i);
    			break;
    		}
    	}
    	
    	//mode매개변수가 로그아웃/퇴장 일때
    	if(mode==LOGOUT)
    	{
    		String str="["+cname+"] 님이 퇴장하였읍니다...\r\n";
    		showChatOne(Color.red, Color.green, str);
    	}
    	else if(mode==EXIT)
    	{
    		String str="["+cname+"] 님이 접속을 종료하였읍니다...\r\n";
    		showChatOne(Color.darkGray, Color.white, str);
    	}
    	
    	//2. 퇴장하는 클이 본인일 경우 >> 채팅방에서 로그인방으로 전환
    	if(cname.equals(this.chatName))
    	{
//    		isStop=true;
    		exitChat(mode);
    	}
    }
    
    private void exitChat(int mode)
    {
    	isStop=true;
    	lbID.setText(null);
    	lbChatName.setText(null);
    	lbGender.setText(null);
    	
    	try {
    		if(out!=null) out.close();
    		if(in!=null) in.close();
    		if(sock!=null) 
    		{
    			sock.close();
    			sock=null;
    		}
    		
		} catch (Exception e) {
			System.out.println("exitChat()에서 예외: "+e);
		}
    	
    	//mode 매개변수가 퇴장/종료 일때
    	if(mode==LOGOUT)
    	{
    		this.tabEnabled(0, 1);		//로그인탭 활성화하고 채팅방탭을 비활성화한다
    		userModel.setDataVector(null, this.colHeader);
    	}
    	else if(mode==EXIT)
    	{
    		//프레임닫기
    		this.dispose();			//프레임창 닫힘
    		System.exit(0);
    	}
    }
    

	//클라이언트가 전달한 메시지를 TextPane에 출력해주는 메소드		//동기화 필요
    private synchronized void showChat(String fromChatName, String fntRGB, String fromMsg)
    {
    	int rgb= Integer.parseInt(fntRGB);
    	Color foCr= new Color(rgb);				//글자색
    	
    	//스타일 세팅
    	attr= new SimpleAttributeSet();
    	StyleConstants.setForeground(attr, foCr);
    	StyleConstants.setFontSize(attr, 16);
    	StyleConstants.setFontFamily(attr, "궁서체");
    	
    	int caretPos= doc.getEndPosition().getOffset()-1;			//커서위치 파악
    	String msg= fromChatName+" >> "+fromMsg+"\r\n";
    	
    	try {
			doc.insertString(caretPos, msg, attr);
			
		} catch (BadLocationException e) {
			System.out.println("TISChatGUI.showChat()에서 예외"+e);
		}
    	
    }
    
    //귓속말 메시지를 JTextPane에 스타일 적용하여 표현하는 메소드		//동기화 필요
    private synchronized void showChatOne(Color bgCr, Color fgCr, String str)
    {
    	//스타일세팅
    	attr= new SimpleAttributeSet();
    	StyleConstants.setBackground(attr, bgCr);
    	StyleConstants.setForeground(attr, fgCr);
    	StyleConstants.setFontSize(attr, 16);
    	StyleConstants.setItalic(attr, true);
    	
    	int offset=doc.getEndPosition().getOffset()-1;
    	
    	try {
			doc.insertString(offset, str, attr);
			
		} catch (BadLocationException e) {
			System.out.println("TISChatGUI.showChatOne의 예외: "+e);
		}
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfChatName = new javax.swing.JTextField();
        tfHost = new javax.swing.JTextField();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        btCon = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpMsg = new javax.swing.JTextPane();
        tfInput = new javax.swing.JTextField();
        chkSendOne = new javax.swing.JCheckBox();
        comboColor = new javax.swing.JComboBox<>();
        lb = new javax.swing.JLabel();
        btEmo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbChatName = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        btOut = new javax.swing.JButton();
        btRename = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        //창닫기 이벤트처리
        addWindowListener(new WindowAdapter() {
        	
        	@Override
        	public void windowClosing(WindowEvent e)
        	{
        		setTitle("eeeeeee");
        		exitProcess();
        	}
        });
        
        

        jTabbedPane1.setFont(new java.awt.Font("궁서", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("궁서", 0, 18)); // NOI18N
        jLabel1.setText("아이디 :");

        jLabel2.setFont(new java.awt.Font("궁서", 0, 18)); // NOI18N
        jLabel2.setText("대화명 :");

        jLabel3.setFont(new java.awt.Font("궁서", 0, 18)); // NOI18N
        jLabel3.setText("성   별 :");

        jLabel4.setFont(new java.awt.Font("궁서", 0, 18)); // NOI18N
        jLabel4.setText("호스트 :");

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        tfChatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChatNameActionPerformed(evt);
            }
        });

        tfHost.setText("192.168.0.91");
        tfHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHostActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbM);
        rbM.setFont(new java.awt.Font("궁서", 1, 12)); // NOI18N
        rbM.setText(" 남 자");

        buttonGroup1.add(rbF);
        rbF.setFont(new java.awt.Font("궁서", 1, 12)); // NOI18N
        rbF.setText(" 여 자");

        btCon.setText("연 결");
        btCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConActionPerformed(evt);
            }
        });

        btCancel.setText("취 소");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(rbM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(rbF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfChatName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfChatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbM)
                    .addComponent(rbF))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(255, 204, 204));
        jLabel11.setFont(new java.awt.Font("궁서", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("동 년 배  채 팅");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bonobono.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("로그인", jPanel1);

        tpMsg.setEditable(false);
        tpMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(tpMsg);

        tfInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputActionPerformed(evt);
            }
        });

        chkSendOne.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        chkSendOne.setText(" 귓속말");
        chkSendOne.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSendOneItemStateChanged(evt);
            }
        });

        comboColor.setFont(new java.awt.Font("궁서", 1, 14)); // NOI18N
        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "검정색", "빨간색", "주황색", "파란색", "초록색", "곤   색", " " }));
        comboColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboColorItemStateChanged(evt);
            }
        });

        lb.setFont(new java.awt.Font("궁서", 1, 14)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("가");
        lb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));

        btEmo.setFont(new java.awt.Font("궁서", 0, 12)); // NOI18N
        btEmo.setText("그림문자");
        btEmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chkSendOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btEmo)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addComponent(tfInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSendOne, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb)
                    .addComponent(btEmo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btEmo, comboColor, lb});

        jTabbedPane1.addTab("채팅방", jPanel2);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "아이디", "대화명", "성   별"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("My Info"));

        jLabel5.setFont(new java.awt.Font("궁서", 1, 14)); // NOI18N
        jLabel5.setText("[아 이 디]");

        jLabel6.setFont(new java.awt.Font("궁서", 1, 14)); // NOI18N
        jLabel6.setText("[대 화 명]");

        jLabel7.setFont(new java.awt.Font("궁서", 1, 14)); // NOI18N
        jLabel7.setText("[성     별]");

        lbID.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        lbID.setText("[아 이 디]");

        lbChatName.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        lbChatName.setText("[대 화 명]");

        lbGender.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        lbGender.setText("[성     별]");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(lbChatName)
                    .addComponent(lbGender))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChatName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btOut.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        btOut.setText("퇴 장");
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });

        btRename.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        btRename.setText("대화명 변경");
        btRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRenameActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("궁서", 0, 14)); // NOI18N
        btExit.setText("종 료");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRename)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btExit, btOut});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRename)
                            .addComponent(btExit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btExit, btOut, btRename});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfChatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChatNameActionPerformed

    private void tfHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHostActionPerformed

    String gender;
    private void btConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConActionPerformed
    	//1.사용자가 입력한 값 받기
    	id=tfID.getText();
    	chatName=tfChatName.getText();
    	host=tfHost.getText();
    	
    	ButtonModel btnModel=this.buttonGroup1.getSelection();		//성별체크박스
    	if(btnModel==rbM.getModel())
    	{
    		gender="남자";
    	}
    	else
    	{
    		gender="여자";
    	}
    	if(id==null || chatName==null || host==null
    			|| id.trim().isEmpty() || chatName.trim().isEmpty() || host.trim().isEmpty())
    	{
    		showMsg("모든값을 입력하시오 횐님^^");
    		tfID.requestFocus();
    		return;
    	}
    	if(rbM.isSelected()==false && rbF.isSelected()==false)
    	{
    		showMsg("성별을 선택하십시오 횐님^^");
    		return;
    	}
    	chatEnter();		//채팅 시작
    	tabEnabled(1, 0);
    	//채팅방(1) 탭을 선택하고 활성화한다
    	//로그인(0) 탭은 비활성화한다
    	
    	//입장한 사람들의 정보세팅
    	lbID.setText(id);
    	lbChatName.setText(chatName);
    	lbGender.setText(gender);

    	
    }//GEN-LAST:event_btConActionPerformed
    public void tabEnabled(int enableIdx, int disableIdx)
    {
    	this.jTabbedPane1.setEnabledAt(enableIdx, true);	//활성화
    	this.jTabbedPane1.setEnabledAt(disableIdx, false);	//비활성화
    	this.jTabbedPane1.setSelectedIndex(enableIdx);
    }


	private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        tfID.setText(null);
        tfChatName.setText(null);
        tfHost.setText("127.0.0.1");
        
    }//GEN-LAST:event_btCancelActionPerformed

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
   
    	int yn= showConfirm("이만 나가보시겠읍니까?");
    	
    	if(yn==JOptionPane.YES_OPTION)
    	{
    		//800 : 로그아웃-퇴장 처리(800|대화명)
    		try {
	    		out.writeObject("800|"+this.chatName);
	    		out.flush();
	    		
    		} catch (IOException e) {
    			System.out.println("채팅방 퇴장중 예외: "+e);
    			showMsg("입장을 하셔야 퇴장을 하지않습니까 ^^...");
    		} catch (NullPointerException e) {
    			showMsg("서버에 연결이 안됐읍니다;;\n로그인은 하셨읍니까?");
    		}
    		
    	}
    
    }//GEN-LAST:event_btOutActionPerformed

    private void btRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRenameActionPerformed

    	
    	
    }//GEN-LAST:event_btRenameActionPerformed

    
    private void exitProcess()
    {
    	int yn= showConfirm("종료하시겠읍니까...?");
    	
    	if(yn==JOptionPane.YES_OPTION)
    	{
    		//1. 채팅서버에 접속하고 종료하는경우
    		if(sock!=null && out!=null)
    		{
    			try {
    				out.writeObject("900|"+this.chatName);
    				out.flush();
    				System.exit(0);
    				
    			} catch (Exception e) {
    				System.out.println("접속 종료시 예외: "+e);
    			}
    		}
    		
    		//2. 채팅서버에 접속하지 않고 종료하는경우
    		else
    		{
    			System.exit(0);
    		}
    	}
    }
    
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
    	
    	exitProcess();
    	
    }//GEN-LAST:event_btExitActionPerformed

    private void tfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputActionPerformed
        //tfInput에 입력한 값을 얻어오기
    	String sendMsg= tfInput.getText();
    	
    	//대화메시지중 '|' 가 포함되어있다면,,
    	//현재 프로토콜의 구분자를 | 로 쓰고있기 때문에 프로토콜이 망가지게 된다
    	//이를 해결하려면
    	//'|' 를 'l'로 바꾼다
    	sendMsg= sendMsg.replace('|', 'l');
    	
    	//유효성
    	if(sendMsg.trim().isEmpty())
    	{
    		showMsg("내용을 입력해");
    		return;
    	}
    	
    	try {
    		sendMessage(sendMsg);
    		tfInput.setText(null);
    		tfInput.requestFocus();
    		
    	} catch (IOException e) {
    		System.out.println("sendMessage()의 예외: "+e);
    	}

    	
    }//GEN-LAST:event_tfInputActionPerformed
    
    //서버에 메시지를 보내는 메소드
    private void sendMessage(String msg) throws IOException
    {
    	//1. 일반대화메시지
    	//프로토콜 400: 일반 대화 메시지(400|글꼴색|메시지)
    	if(!isSendOne)
    	{
    		int rgb= this.fontCr.getRGB();			//글자색 rgb를 int값으로 가져와
    		String str="400|"+rgb+"|"+msg;
    		System.out.println(str);
			out.writeObject(str);
			out.flush();
			
    	}
    	else
    	{
    	//2. 귓속말이라면
    	//userTable에서 누구에게 보낼건지 선택해야함
    		
    		//userTable에서 선택한 행 얻어오기
    		int row= userTable.getSelectedRow();
    		//선택한 행의 대화명 얻기
    		String toChatName= userTable.getValueAt(row, 1).toString();
    		
    		//유효성
    		if(row==-1)	//선택 안했을때
    		{
    			showMsg("귓속말 하고싶은 사람을 선택해주시오 횐님 ^^");
    			return;
    		}
    		if(toChatName.equals(this.chatName))	//본인에게 귓말하려할때
    		{
    			showMsg("자신과의 대화를 즐기시려 하는구려 ㅎㅎ");
    			return;
    		}
    		
    		//500|받을사람 대화명|귓말메시지
    		String sendMsg="500|"+toChatName+"|"+msg;
    		
    		out.writeObject(sendMsg);
    		out.flush();
    		
    		String str="["+toChatName+"] 에게 >> "+msg+"\r\n";	//내가 누구에게 귓말을 보내면 나에게 출력되는 창
//    		showChatOne(Color.cyan, new Color(255,0,255), str);
    		showCacaoStyle("Me", Color.magenta, Color.yellow, str);
    		
    		
    		
    	}
    	
    }

    
    private void chkSendOneItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSendOneItemStateChanged

    	//귓속말보내기에 체크가 되어있다면 isSendOne변수를 true로 바꾸어주어야함
    	int mode= evt.getStateChange();
    	if(mode==ItemEvent.SELECTED)
    	{
    		isSendOne=true;
    	}
    	else
    	{
    		isSendOne=false;
    	}
    }//GEN-LAST:event_chkSendOneItemStateChanged

    private void comboColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColarItemStateChanged

    	//선택한 색상값을 얻기
    	int idx= comboColor.getSelectedIndex();
    	
    	switch(idx)
    	{
    	case 0:	fontCr= Color.black; break;
    	case 1: fontCr= Color.red; break;
    	case 2: fontCr= Color.orange; break;
    	case 3: fontCr= Color.blue; break;
    	case 4: fontCr= Color.green; break;
    	case 5: fontCr= Color.MAGENTA; break;
    	case 6: fontCr= Color.white; break;
    	}
    	lb.setForeground(fontCr);
    	
    }//GEN-LAST:event_comboColarItemStateChanged

    private void btEmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEmoActionPerformed

    
    //채팅방에 들어가는 메소드
    private void chatEnter()
    {
    	try {
    		isStop= false;				//listener 스레드 동작을 위해 false값 할당
			sock= new Socket(host,port);
			tpMsg.setText("채팅서버와 연결됨\r\n");
			out= new ObjectOutputStream(sock.getOutputStream());
			in= new ObjectInputStream(sock.getInputStream());
			//out을 먼저 생성해야함: server에서 in을 먼저 생성했으므로
			
			//서버메시지를 먼저 리스닝하는 스레드를 생성/동작
			Thread listener= new Thread(this);
			listener.start();
			
			//서버에 아이디,대화명,성별 을 전송
			out.writeObject(id+"|"+chatName+"|"+gender);
			out.flush();
			
			
		} catch (IOException e) {
			System.out.println("chatEnter()에서 예외: "+e);
		}
    }
    
    //퇴장할때 확인하는 메소드
    private int showConfirm(String msg)
    {
    	int yn= JOptionPane.showConfirmDialog(this, msg,"확인", JOptionPane.YES_NO_OPTION);

    	return yn;
    }
    
    private void showMsg(String str) {

    	JOptionPane.showMessageDialog(this, str);
    }
    
//JTextPane에 이모티콘넣기--------------------------------------------------------------------------------------------------------------------
    public void setStyle(JLabel lb, String msg, SimpleAttributeSet attr){
    	int caretPos=doc.getEndPosition().getOffset()-1;    	
    	tpMsg.setCaretPosition(caretPos);
    	int offset=tpMsg.getCaretPosition();

    	//텍스트페인에 라벨 끼워넣기
	   //(JLabel은 문자열형태,아이콘 형태등 다양하게 표현 가능.)
    	tpMsg.insertComponent(lb);
    	try {
    		String sg="\r\n";//엔터값 끼워넣기(줄바꿈하도록)
    		
			doc.insertString(offset, sg, attr);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
    	//정렬방식 문단속성 적용
    	doc.setParagraphAttributes(offset+2,msg.length() , attr, true);
    	tpMsg.setCaretPosition(offset+2);
    	//커릿의 위치를 엔터값 2바이트 더해서 위치시킴

	}
    
    public synchronized void showCacaoStyle(String who,Color bgCr, Color fgCr, String msg) {
    	JLabel lb=new JLabel(msg);
    	lb.setOpaque(true);//라벨 배경색이 적용되려면 투명하게
    	lb.setPreferredSize(new Dimension(700,50)); 
    	//lb의 높이를 50으로 줌. 폭은 문자열 내용만큼 차지함
    	lb.setForeground(fgCr);
    	lb.setBackground(bgCr);
    	
    	if(who.equals("Me")) {
    		//내가 귓속말 보낼 경우
    		//보낸이가 나라면 오른쪽에 라벨 보여주기(노란색)
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
    	}else {
    		//내가 귓속말을 받을 경우
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
    	}
    	
    	setStyle(lb,msg,attr);	
    }
    public synchronized void showCacaoStyle(String chatName, String foRgb,String msg) {
    	
    	String msg2="   "+chatName+">>"+msg+"  \n";
    	JLabel lb=new JLabel(msg2);
    	lb.setOpaque(true);//라벨 배경색이 적용되려면 투명하게
    	lb.setPreferredSize(new Dimension(700,50)); 
    	//lb의 높이를 40으로 줌. 폭은 문자열 내용만큼 차지함
    	lb.setForeground(new Color(Integer.parseInt(foRgb)));
    	
    	if(chatName.equals(this.chatName)) {
    		//보낸이가 나라면 오른쪽에 라벨 보여주기(노란색)
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
    		lb.setBackground(Color.YELLOW);
    	}else {
    		//보낸이가 다른이라면 왼쪽에 라벨 보여주기(핑크색)
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
    		lb.setBackground(Color.pink);
    	}
    	setStyle(lb,msg2,attr);
    	
    }//-------------------------------

    public synchronized void showEmoticon(String chatName, ImageIcon icon) {
        tpMsg.setCaretPosition(doc.getEndPosition().getOffset() - 1);
        int end = tpMsg.getCaretPosition();

        String msg2 = "[" + chatName + "]님" + "\r\n";
        
        JLabel lb=new JLabel(msg2,icon,JLabel.CENTER);
        
    	//lb.setOpaque(true);
        //라벨 배경색이 적용되려면 투명하게 true준다.
        //이모티콘 보낼 때는 불투명하게 false
    	lb.setPreferredSize(new Dimension(700,90)); 
    	//lb의 높이를 90으로 줌. 폭은 문자열 내용만큼 차지함
    	lb.setHorizontalTextPosition(JLabel.CENTER);
    	lb.setVerticalTextPosition(JLabel.BOTTOM);
    	
    	if(chatName.equals(this.chatName)) {
    		//보낸이가 나라면 오른쪽에 라벨 보여주기(노란색)
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
    		
    	}else {
    		//보낸이가 다른이라면 왼쪽에 라벨 보여주기(핑크색)
    		attr=new SimpleAttributeSet();
    		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
    		
    	}
    	setStyle(lb,msg2,attr);
    }
//---------------------------------------------------------------------------------------------------------------
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TISChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TISChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TISChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TISChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TISChatGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCon;
    private javax.swing.JButton btEmo;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btRename;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkSendOne;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbChatName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbID;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField tfChatName;
    private javax.swing.JTextField tfHost;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTextPane tpMsg;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
