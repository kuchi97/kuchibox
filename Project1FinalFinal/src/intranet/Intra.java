package intranet;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class Intra extends JFrame {

    CardLayout card=new CardLayout();
    int idx;							//게시판 글 번호
    int empid;							//사번
    int selectedRow=-1, selectedCol=-1;	//관리자모드-테이블 행열 색인 변수
    
    AdminEdit edit;						//관리자모드-수정
    AdminRegister register;				//관리자모드-등록
    Color cr;							//테이블 컬러 설정 변수
    Msg msg;							//쪽지

    AdminRegisterVO emp;				//관리자모드-
    BoardDAO bDAO= new BoardDAO();		//한줄게시판-
    
    DefaultTableModel model;

    public Intra(EmpVO owner, Msg msg){
    	empid=owner.getEmpId();
    	this.msg=msg;
    	edit=new AdminEdit(this);
    	register=new AdminRegister();
    	
        initComponents();
        
        //첫화면 공지사항 패널로 설정 
        showNotice();
        
        //화면 전환 CardLayout
        card=(CardLayout)pCenter.getLayout();

        //한 줄 게시판 이벤트 처리----------------------------------------------------
        //좌측 한 줄 게시판 라벨 클릭시
        lbBoard.addMouseListener((new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
        		repaint();
        		card.show(pCenter, "pBoard");
        	}
        }));
        
        //정식 사번가져옴
        lbEmpno.setText(String.valueOf(empid));
        
        //검색
        tfSearch.addActionListener((new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		showAll();
        	}
        }));
        
        //작성
        tfWrite.addActionListener((new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String name= lbEmpno.getText();
		    	String msg= tfWrite.getText();
		    	
		    	//유효성체크(텍스트필드 입력시 null체크)
		    	if(msg.trim().isEmpty())
		    	{
		    		showMessage("내용을 입력하세요");
		    		tfWrite.setText("");
		    		tfWrite.requestFocus();
		    		return;
		    	}
		    	
		    	BoardVO bVO= new BoardVO();
		    	bVO.setName(name);
		    	bVO.setMsg(msg);
		    	
		    	try {
		    		String regCheck=(bDAO.writeBoard(bVO)>0?"글이 등록되었습니다":"등록 실패");
		    		showMessage(regCheck);
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		    	
		    	tfWrite.setText("");
		    	
		    	showAll();
		    	boardEnable();
			} 
        }));

        tbBoard.setSelectionBackground(cr= new Color(150,150,150));
        tbBoard.setShowGrid(false);
        tbBoard.setRowHeight(20);
        
        showAll();
        showReply();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	//상단 고정 레이아웃
        pTop = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();		//라벨: 로고 이미지
        lbMypage = new javax.swing.JLabel();	//라벨: 마이페이지
        lbMsg = new javax.swing.JLabel();		//라벨: 쪽지
        lbLogout = new javax.swing.JLabel();	//라벨: 로그아웃
        
        //좌측 고정 레이아웃
        pLeft = new javax.swing.JPanel();
        lbNotice = new javax.swing.JLabel();	//라벨: 공지사항
        lbBoard = new javax.swing.JLabel();		//라벨: 한 줄 게시판
        lbMeetroom = new javax.swing.JLabel();	//라벨: 회의실 예약
        lbAdmin = new javax.swing.JLabel();		//라벨: 관리자모드

        //중앙 레이아웃============================================
        pCenter = new javax.swing.JPanel();
        
        //공지사항-메인
        pNoticeMain = new javax.swing.JPanel();
        nm_lbHeader = new javax.swing.JLabel();
        nm_cbPriority = new javax.swing.JComboBox<>();	//콤보박스: 공지 대상
        nm_tfSearch = new javax.swing.JTextField();		//텍스트필드: 글검색
        nm_btSearch = new javax.swing.JButton();		//버튼: 글검색
        nm_spList = new javax.swing.JScrollPane();
        nm_tabList = new javax.swing.JTable();			//테이블: 글목록
        nm_btWrite = new javax.swing.JButton();			//버튼: 글쓰기
        //공지사항-글 읽기
        pNoticeRead = new javax.swing.JPanel();
        nr_lbHeader = new javax.swing.JLabel();
        nr_lbPriority = new javax.swing.JLabel();
        nr_tfPriority = new javax.swing.JTextField();	//텍스트필드: 공지대상
        nr_lbTitle = new javax.swing.JLabel();
        nr_tfTitle = new javax.swing.JTextField();		//텍스트필드: 제목
        nr_spText = new javax.swing.JScrollPane();
        nr_taText = new javax.swing.JTextArea();		//텍스트area: 본문
        nr_btList = new javax.swing.JButton();			//버튼: 글목록 되돌아가기
        nr_btEdit = new javax.swing.JButton();			//버튼: 수정
        nr_btDel = new javax.swing.JButton();			//버튼: 삭제
        nr_tfEmpid = new javax.swing.JTextField();		//텍스트필드: 사번
        nr_lbEmpid = new javax.swing.JLabel();
        nr_lbWdate = new javax.swing.JLabel();
        nr_tfWdate = new javax.swing.JTextField();		//텍스트필드: 작성일
        //공지사항-글쓰기
        pNoticeWrite = new javax.swing.JPanel();
        nw_lbHeader = new javax.swing.JLabel();
        nw_lbPriority = new javax.swing.JLabel();
        nw_cbPriority = new javax.swing.JComboBox<>();	//콤보박스: 공지대상 선택
        nw_lbTitle = new javax.swing.JLabel();
        nw_tfTitle = new javax.swing.JTextField();		//텍스트필드: 제목 작성
        nw_spText = new javax.swing.JScrollPane();
        nw_taText = new javax.swing.JTextArea();		//텍스트area: 본문 작성
        nw_btWrite = new javax.swing.JButton();			//버튼: 글등록
        nw_btCancle = new javax.swing.JButton();		//버튼: 취소
        nw_lbEmpid = new javax.swing.JLabel();
        
        //한 줄 게시판
        pBoard = new javax.swing.JPanel();
        bd_lbHeader = new javax.swing.JLabel();
        cbSearch = new javax.swing.JComboBox<>();		//콤보박스: 글검색
        tfWrite = new javax.swing.JTextField();			//텍스트필드: 원글 작성
        btWrite = new javax.swing.JButton();			//버튼: 원글 작성
        bd_spList = new javax.swing.JScrollPane();
        tbBoard = new javax.swing.JTable();				//테이블: 글목록
        lbWriter = new javax.swing.JLabel();
        lbEmpno = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();			//버튼: 글검색
        tfSearch = new javax.swing.JTextField();		//텍스트필드: 글검색
        btDelete = new javax.swing.JButton();			//버튼: 삭제
        btReply = new javax.swing.JButton();			//버튼: 댓글
        
        //마이페이지
        pMypage = new javax.swing.JPanel();
//        lbMypageHeader = new javax.swing.JLabel();
        
        //관리자모드
        pAdmin = new javax.swing.JPanel();
        lbAdminHeader = new javax.swing.JLabel();
        lbEmpList = new javax.swing.JLabel();
        spEmpList = new javax.swing.JScrollPane();
        tabEmpList = new javax.swing.JTable();			//테이블: 사원목록
        btEmpAdd = new javax.swing.JButton();			//버튼: 입사자 등록
        btEmpEdit = new javax.swing.JButton();			//버튼: 사원 정보 편집
        btEmpDel = new javax.swing.JButton();			//버튼: 퇴사자 삭제
//        lbEmpid = new javax.swing.JLabel();
//        tfEmpid = new javax.swing.JTextField();
//        lbPwd = new javax.swing.JLabel();
//        tfPwd = new javax.swing.JTextField();
//        lbPwdConfirm = new javax.swing.JLabel();
//        tfPwdConfirm = new javax.swing.JTextField();
//        lbEname = new javax.swing.JLabel();
//        tfEname = new javax.swing.JTextField();
//        lbSex = new javax.swing.JLabel();
//        btSexM = new javax.swing.JRadioButton();
//        btSexF = new javax.swing.JRadioButton();
//        lbTel = new javax.swing.JLabel();
//        tfTel = new javax.swing.JTextField();
//        lbEmail = new javax.swing.JLabel();
//        tfEmail = new javax.swing.JTextField();
//        lbDept = new javax.swing.JLabel();
//        tfDept = new javax.swing.JTextField();
//        lbRank = new javax.swing.JLabel();
//        tfRank = new javax.swing.JTextField();
//        btEditOk = new javax.swing.JButton();
//        btCancle = new javax.swing.JButton();

        
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 620));

        //상단 패널================================================================
        pTop.setBackground(new java.awt.Color(121, 176, 215));

//        lbMypage.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
//        lbMypage.setForeground(new java.awt.Color(255, 255, 255));
//        lbMypage.setText("마이페이지");

        //쪽지 메뉴-----------------------------------------------------------------
        lbMsg.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbMsg.setForeground(new java.awt.Color(255, 255, 255));
        lbMsg.setText("쪽지함");
        lbMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMsgMouseClicked(evt);
            }
        });
        
        //로그아웃 메뉴--------------------------------------------------------------
        lbLogout.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("로그아웃");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        //창끄기 버튼(X) 클릭시 로그아웃 확인
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		logoutConfirm();
        	}
        });

        //기업 로고-----------------------------------------------------------------
        lbLogo.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbLogo.setForeground(new java.awt.Color(255, 255, 255));
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/companyLogo_S.jpg")));
        lbLogo.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		lbLogoMouseClicked(evt);
        	}
        });

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMypage)
                .addGap(18, 18, 18)
                .addComponent(lbMsg)
                .addGap(18, 18, 18)
                .addComponent(lbLogout)
                .addGap(26, 26, 26))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                        .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMypage)
                            .addComponent(lbMsg)
                            .addComponent(lbLogout))
                        .addGap(30, 30, 30))))
        );

        //좌측 메뉴 패널==========================================================
        pLeft.setBackground(new java.awt.Color(204, 204, 204));

        lbNotice.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbNotice.setText("◎ 공지사항");
        lbNotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbNoticeMousePressed(evt);
            }
        });

        lbBoard.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbBoard.setText("◎ 한 줄 게시판");

//        lbMeetroom.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
//        lbMeetroom.setText("◎ 회의실 예약");

        lbAdmin.setFont(new java.awt.Font("맑은 고딕", 1, 14));  
        lbAdmin.setForeground(new java.awt.Color(102, 102, 102));
        lbAdmin.setText("관리자 모드");
        lbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdmin)
                    .addComponent(lbMeetroom)
                    .addComponent(lbBoard)
                    .addComponent(lbNotice))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLeftLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbNotice)
                .addGap(18, 18, 18)
                .addComponent(lbBoard)
                .addGap(18, 18, 18)
                .addComponent(lbMeetroom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAdmin)
                .addGap(30, 30, 30))
        );

        //공지사항===========================================================
        pCenter.setLayout(new java.awt.CardLayout());

        pNoticeMain.setBackground(new java.awt.Color(255, 255, 255));

        nm_lbHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18));  
        nm_lbHeader.setText("::: 공지사항 :::");

        nm_cbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체 대상", "인사부 대상", "연구소 대상", "영업부 대상", "생산부 대상" }));
        nm_cbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_cbPriorityActionPerformed(evt);
            }
        });

        nm_btSearch.setText("검색");
        nm_btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_btSearchActionPerformed(evt);
            }
        });

        nm_tabList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "번호", "공지 대상", "제목", "작성자", "작성일"
            }
        ));
        nm_tabList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nm_tabListMouseClicked(evt);
            }
        });
        nm_spList.setViewportView(nm_tabList);

        nm_btWrite.setText("글쓰기");
        nm_btWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_btWriteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pNoticeMainLayout = new javax.swing.GroupLayout(pNoticeMain);
        pNoticeMain.setLayout(pNoticeMainLayout);
        pNoticeMainLayout.setHorizontalGroup(
            pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNoticeMainLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nm_btWrite, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nm_spList, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nm_lbHeader))
                    .addGroup(pNoticeMainLayout.createSequentialGroup()
                        .addComponent(nm_cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nm_tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nm_btSearch)))
                .addGap(53, 53, 53))
        );
        pNoticeMainLayout.setVerticalGroup(
            pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNoticeMainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(nm_lbHeader)
                .addGap(18, 18, 18)
                .addGroup(pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm_btSearch)
                    .addGroup(pNoticeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nm_tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nm_cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nm_spList, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nm_btWrite)
                .addGap(36, 36, 36))
        );

        pNoticeMainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nm_btSearch, nm_cbPriority, nm_tfSearch});

        pCenter.add(pNoticeMain, "pNoticeMain");

        pNoticeRead.setBackground(new java.awt.Color(255, 255, 255));

        nr_lbHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18)); 
        nr_lbHeader.setText("::: 공지사항 :::");

        nr_lbPriority.setText("공지 대상");

        nr_lbTitle.setText("제       목");

        nr_tfTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_tfTitleActionPerformed(evt);
            }
        });

        nr_taText.setColumns(20);
        nr_taText.setRows(5);
        nr_spText.setViewportView(nr_taText);

        nr_btList.setText("글목록");
        nr_btList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_btListActionPerformed(evt);
            }
        });

        nr_btEdit.setText("수정");
        nr_btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_btEditActionPerformed(evt);
            }
        });

        nr_btDel.setText("삭제");
        nr_btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_btDelActionPerformed(evt);
            }
        });

        nr_lbEmpid.setText("작성자");

        nr_lbWdate.setText("작성일");

        nr_tfWdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_tfWdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pNoticeReadLayout = new javax.swing.GroupLayout(pNoticeRead);
        pNoticeRead.setLayout(pNoticeReadLayout);
        pNoticeReadLayout.setHorizontalGroup(
            pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNoticeReadLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNoticeReadLayout.createSequentialGroup()
                        .addComponent(nr_lbHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pNoticeReadLayout.createSequentialGroup()
                        .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pNoticeReadLayout.createSequentialGroup()
                                .addComponent(nr_lbTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nr_tfTitle))
                            .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pNoticeReadLayout.createSequentialGroup()
                                    .addComponent(nr_lbPriority)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nr_tfPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nr_lbEmpid)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nr_tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nr_lbWdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nr_tfWdate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nr_spText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pNoticeReadLayout.createSequentialGroup()
                                .addComponent(nr_btList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nr_btEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nr_btDel)))
                        .addGap(53, 53, 53))))
        );
        pNoticeReadLayout.setVerticalGroup(
            pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNoticeReadLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(nr_lbHeader)
                .addGap(18, 18, 18)
                .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nr_tfPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nr_lbPriority)
                    .addComponent(nr_tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nr_lbEmpid)
                    .addComponent(nr_tfWdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nr_lbWdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nr_lbTitle)
                    .addComponent(nr_tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nr_spText, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pNoticeReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nr_btDel)
                    .addComponent(nr_btList)
                    .addComponent(nr_btEdit))
                .addGap(40, 40, 40))
        );

        pCenter.add(pNoticeRead, "pNoticeRead");

        pNoticeWrite.setBackground(new java.awt.Color(255, 255, 255));

        nw_lbHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18)); 
        nw_lbHeader.setText("::: 공지사항 :::");

        nw_lbPriority.setText("공지 대상");

        nw_cbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체 대상", "인사부 대상", "연구소 대상", "영업부 대상", "생산부 대상" }));
        nw_cbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nw_cbPriorityActionPerformed(evt);
            }
        });

        nw_lbTitle.setText("제목");

        nw_taText.setColumns(20);
        nw_taText.setRows(5);
        nw_spText.setViewportView(nw_taText);

        nw_btWrite.setText("등록");
        nw_btWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nw_btWriteActionPerformed(evt);
            }
        });

        nw_btCancle.setText("취소");
        nw_btCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nw_btCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pNoticeWriteLayout = new javax.swing.GroupLayout(pNoticeWrite);
        pNoticeWrite.setLayout(pNoticeWriteLayout);
        pNoticeWriteLayout.setHorizontalGroup(
            pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNoticeWriteLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nw_lbHeader)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNoticeWriteLayout.createSequentialGroup()
                        .addComponent(nw_btWrite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nw_btCancle))
                    .addComponent(nw_spText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pNoticeWriteLayout.createSequentialGroup()
                        .addComponent(nw_lbPriority)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nw_cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nw_lbTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nw_tfTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nw_lbEmpid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(53, 53, 53))
        );
        
        pNoticeWriteLayout.setVerticalGroup(
            pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNoticeWriteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(nw_lbHeader)
                .addGap(18, 18, 18)
                .addGroup(pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nw_cbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nw_tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nw_lbPriority)
                        .addComponent(nw_lbTitle)
                        .addComponent(nw_lbEmpid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nw_spText, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNoticeWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nw_btCancle)
                    .addComponent(nw_btWrite))
                .addGap(36, 36, 36))
        );

        pCenter.add(pNoticeWrite, "pNoticeWrite");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        
        
        
        
        //게시판===============================================================
        pBoard.setBackground(new java.awt.Color(255, 255, 255));

        bd_lbHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18)); 
        bd_lbHeader.setText("::: 한 줄 게시판 :::");

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "글번호", "작성자", "내용" }));
        

        btWrite.setText("등록");
        btWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
            		btWriteActionPerformed(evt);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });

        tbBoard.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "글번호", "내용", "작성자", "작성일"
                }
            ));

        bd_spList.setViewportView(tbBoard);

        lbWriter.setFont(new java.awt.Font("맑은 고딕", 0, 14));  
        lbWriter.setText("작성자 :");

        btSearch.setText("검색");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					
            		btSearchActionPerformed(evt);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });

        btDelete.setText("삭제");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        
        btReply.setText("답글");
        btReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
            		btReplyActionPerformed(evt);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
        

        javax.swing.GroupLayout pBoardLayout = new javax.swing.GroupLayout(pBoard);
        pBoard.setLayout(pBoardLayout);
        pBoardLayout.setHorizontalGroup(
            pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBoardLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pBoardLayout.createSequentialGroup()
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btReply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch))
                    .addGroup(pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bd_spList, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pBoardLayout.createSequentialGroup()
                            .addComponent(lbWriter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btWrite))
                        .addComponent(bd_lbHeader)))
                .addGap(53, 53, 53))
        );
        pBoardLayout.setVerticalGroup(
            pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBoardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bd_lbHeader)
                .addGap(18, 18, 18)
                .addGroup(pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btWrite)
                        .addComponent(tfWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbEmpno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbWriter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bd_spList, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete)
                	.addComponent(btReply))
                .addGap(36, 36, 36))
        );

        pCenter.add(pBoard, "pBoard");

        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        
        
        
        //관리자모드===============================================================
        pCenter.add(pMypage, "card2");

        pAdmin.setBackground(new java.awt.Color(255, 255, 255));

        lbAdminHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18));  
        lbAdminHeader.setText("::: 관리자 모드 :::");

        lbEmpList.setFont(new java.awt.Font("맑은 고딕", 0, 14));  
        lbEmpList.setText("사원 정보");

        tabEmpList.setModel(new javax.swing.table.DefaultTableModel( 
        		new Object[][]{
        			
        		},
        		new String [] {
        				"사원번호","이름","부서번호","전화번호","직위","이메일","입사일","성별","비밀번호"
        		}
        ));
        spEmpList.setViewportView(tabEmpList);
        tabEmpList.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		selectedRow=tabEmpList.getSelectedRow();
        		selectedCol=tabEmpList.getSelectedColumn();
        	}
		});
        tabEmpList.getTableHeader().setReorderingAllowed(false); // 컬럼들 이동 불가
        tabEmpList.getTableHeader().setResizingAllowed(false); //컬럼 크기 수정 불가
        
        btEmpAdd.setText("추가");
        btEmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpAddActionPerformed(evt);
            }
        });

        btEmpEdit.setText("변경");
        btEmpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpEditActionPerformed(evt);
            }
        });

        btEmpDel.setText("삭제");
        btEmpDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAdminLayout = new javax.swing.GroupLayout(pAdmin);
        pAdmin.setLayout(pAdminLayout);
        pAdminLayout.setHorizontalGroup(
            pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdminLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmpList)
                    .addGroup(pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spEmpList, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAdminHeader))
                        .addGroup(pAdminLayout.createSequentialGroup()
                            .addComponent(btEmpAdd)
                            .addGap(18, 18, 18)
                            .addComponent(btEmpEdit)
                            .addGap(18, 18, 18)
                            .addComponent(btEmpDel)
                            .addGap(289, 289, 289))))
                .addGap(46, 46, 46))
        );
        pAdminLayout.setVerticalGroup(
            pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbAdminHeader)
                .addGap(18, 18, 18)
                .addComponent(lbEmpList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spEmpList, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmpDel)
                    .addComponent(btEmpEdit)
                    .addComponent(btEmpAdd))
                .addGap(65, 65, 65))
        );

        pCenter.add(pAdmin, "pAdmin");

        javax.swing.GroupLayout layout5 = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        
        

        pack();
    }//==========================================================================EO-initComponents()
    
    //공지사항-------------------------------------------------------------------
    NoticeDAO nDao=new NoticeDAO();
    /**좌측 공지사항 라벨: 클릭시 공지사항 메인으로 이동*/
    private void lbNoticeMousePressed(java.awt.event.MouseEvent evt) {
    	card.show(pCenter, "pNoticeMain");
    	showNotice();
    }
    /**공지사항 메인: 글목록 테이블 디자인 세팅*/
    public void setNotice() {
        JTableHeader header=nm_tabList.getTableHeader();
        header.getColumnModel().getColumn(0).setPreferredWidth((int)(nm_tabList.getWidth()*0.05));
        header.getColumnModel().getColumn(1).setPreferredWidth((int)(nm_tabList.getWidth()*0.1));
        header.getColumnModel().getColumn(2).setPreferredWidth((int)(nm_tabList.getWidth()*0.7));
        header.getColumnModel().getColumn(3).setPreferredWidth((int)(nm_tabList.getWidth()*0.1));
        header.getColumnModel().getColumn(4).setPreferredWidth((int)(nm_tabList.getWidth()*0.15));

    	DefaultTableCellRenderer col1= new DefaultTableCellRenderer();
    	col1.setHorizontalAlignment(SwingConstants.CENTER);
    	col1.setBackground(Color.lightGray);
    	DefaultTableCellRenderer col2= new DefaultTableCellRenderer();
    	col2.setHorizontalAlignment(SwingConstants.CENTER);
    	col2.setBackground(cr= new Color(207,222,238));
    	DefaultTableCellRenderer col3= new DefaultTableCellRenderer();
    	col3.setHorizontalAlignment(SwingConstants.LEFT);
    	col3.setBackground(Color.white);
    	DefaultTableCellRenderer col4= new DefaultTableCellRenderer();
    	col4.setHorizontalAlignment(SwingConstants.CENTER);
    	col4.setBackground(cr= new Color(207,222,238));
    	DefaultTableCellRenderer col5= new DefaultTableCellRenderer();
    	col5.setHorizontalAlignment(SwingConstants.CENTER);
    	col5.setBackground(Color.lightGray);

    	
    	TableColumnModel tcm= nm_tabList.getColumnModel();
    	tcm.getColumn(0).setCellRenderer(col1);
    	tcm.getColumn(1).setCellRenderer(col2);
    	tcm.getColumn(2).setCellRenderer(col3);
    	tcm.getColumn(3).setCellRenderer(col4);
    	tcm.getColumn(4).setCellRenderer(col5);
    }
    /**공지사항 메인: 글목록 표시*/
    String []colHeader= {"번호","공지 대상","제목","작성자","작성일"};
    public void showNotice() {
    	ArrayList<NoticeVO> arrList=nDao.noticeList();
    	showNoticeList(arrList);
    }
    //글목록 리스트 얻어오는 메소드
    public void showNoticeList(ArrayList<NoticeVO> arr) {
    	if(arr==null) {
    		System.out.println("Intra.showNoticeList()에서 SQL오류");
    		return;
    	}
    	if(arr.size()==0) {
    		System.out.println("데이터가 존재하지 않습니다");
    	}
    	else {
    		Object [][]data=new Object[arr.size()][5];
    		
    		for(int i=0; i<data.length; i++) {
    			NoticeVO vo=arr.get(i);
    			data[i][0]=vo.getNoticeId();
    			data[i][1]=vo.getPriority_txt();
    			data[i][2]=vo.getTitle();
    			data[i][3]=vo.getEname();
    			data[i][4]=vo.getWdate();
    		}
    		DefaultTableModel modelNotice=new DefaultTableModel(data, colHeader);
    		nm_tabList.setModel(modelNotice);
    		setNotice();
    	}
    }
    /**공지사항 메인: 글 검색*/
    private void nm_btSearchActionPerformed(java.awt.event.ActionEvent evt) {
    	search();
    }
    //공지글 검색 메소드
    public void search() {
    	//[1]검색유형 얻어오기
    	int priority=nm_cbPriority.getSelectedIndex();
//    	System.out.println("priority="+priority);
    	
    	//[2]검색어 얻어오기
    	String keyword=nm_tfSearch.getText();
//    	System.out.println("keyword="+keyword);
    	
    	//[3]유효성체크(검색어 입력 안했을 경우)
    	if(keyword==null || keyword.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
    		nm_tfSearch.requestFocus();
    		return;
    	}
    	
    	//[4]검색어 dao로 보내기
    	ArrayList<NoticeVO> arrSearch=nDao.searchNotice(priority, keyword);
    	showNoticeList(arrSearch);
    }
    private void nm_cbPriorityActionPerformed(java.awt.event.ActionEvent evt) {
    }
    /**공지사항 글쓰기*/
    private void nm_btWriteActionPerformed(java.awt.event.ActionEvent evt) {
    	card.show(pCenter, "pNoticeWrite");
    }
    //공지사항 글작성+등록
    private void nw_btWriteActionPerformed(java.awt.event.ActionEvent evt) {
    	Object obj=evt.getSource();
    	String titleStr=nw_tfTitle.getText();
    	String textStr=nw_taText.getText();
    	int priorityIdx=nw_cbPriority.getSelectedIndex();

    	if(obj==nw_btWrite) {
    		if(titleStr==null || titleStr.trim().isEmpty()) {
    			JOptionPane.showMessageDialog(this, "제목을 입력하세요");
    			nw_tfTitle.requestFocus();
    			return;
    		}
    		else if(textStr==null || textStr.trim().isEmpty()) {
    			JOptionPane.showMessageDialog(this, "내용을 입력하세요");
    			nw_taText.requestFocus();
    			return;
    		}

    		NoticeVO notice=new NoticeVO();
    		notice.setPriority(priorityIdx);
    		notice.setTitle(titleStr);
    		notice.setText(textStr);
    		notice.setEmpId(empid);			//로그인 empid(전역변수)로 전달
    		int cnt=nDao.insertNotice(notice);
    		String str=(cnt>0)? "등록 성공":"등록 실패";
    		
    		JOptionPane.showMessageDialog(this, str);
    		if(cnt>0) {
    			card.show(pCenter, "pNoticeMain");
    			showNotice();
    		}
    	}
    }
    //글쓰기 취소
    private void nw_btCancleActionPerformed(java.awt.event.ActionEvent evt) {
    	Object obj=evt.getSource();
    	if(obj==nw_btCancle) {
    		card.show(pCenter, "pNoticeMain");
    	}
    }
    private void nw_cbPriorityActionPerformed(java.awt.event.ActionEvent evt) {
    }
    /**공지사항 본문 읽기*/
    //공지사항 메인: 글목록 클릭시 본문(읽기)창으로 전환
    private void nm_tabListMouseClicked(java.awt.event.MouseEvent evt) {
    	showNoticeRead();
    	setEdit(false,false,false,false,false);
    }
    //클릭한 글목록에 해당하는 내용 읽기창에 보여주기
    public void showNoticeRead() {
    	nm_tabList.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent evt) {
    			//[1]클릭 지점의 행번호 찾음
    			int row=nm_tabList.getSelectedRow();
    			Object objIdx=nm_tabList.getValueAt(row, 0);
    			idx=(Integer)objIdx;
    			
    			//[2]클릭시 읽기 패널로 전환
    			card.show(pCenter, "pNoticeRead");
    			
    			//[3]전환한 읽기 패널에 인덱스와 일치하는 정보 붙임
    			NoticeVO noticeRead=nDao.readNotice(idx);
    			nr_tfPriority.setText(noticeRead.getPriority_txt()+"");
    			nr_tfEmpid.setText(noticeRead.getEname()+"");
    			nr_tfWdate.setText(noticeRead.getWdate()+"");
    			nr_tfTitle.setText(noticeRead.getTitle());
    			nr_taText.setText(noticeRead.getText());
    		}
    	});
    }
    //읽기창에서 수정버튼 클릭시 필드 색 전환: 흰색-->회색
    public void setTaBgColor() {
    	nr_tfPriority.setBackground(Color.white);
    	nr_tfTitle.setBackground(Color.white);
    	nr_taText.setBackground(Color.white);
    }
    public void setEdit(boolean priority, boolean empid, boolean wdate, boolean title, boolean text) {
    	nr_tfPriority.setEditable(priority);
    	nr_tfEmpid.setEditable(empid);
    	nr_tfWdate.setEditable(wdate);
    	nr_tfTitle.setEditable(title);
    	nr_taText.setEditable(text);
    }
    /**공지사항 수정*/
    private void nr_tfTitleActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void nr_btEditActionPerformed(java.awt.event.ActionEvent evt) {
    	Object obj=evt.getSource();
    	String titleStr=nr_tfTitle.getText();
    	String textStr=nr_taText.getText();
    	NoticeVO noticeRead=nDao.readNotice(idx);	//priority는 인덱스 값으로 가져옴
    	int priority=noticeRead.getPriority();
    	
    	//[1]선택한 글 수정창에 보여주는 메소드 호출
    	showNoticeRead();
    	
    	//[2]편집가능 여부 설정
    	if(nr_taText.isEditable()==false) {
    		if(obj==nr_btEdit) {
    			setEdit(true,false,false,true,true);
    			nr_tfPriority.setBackground(Color.LIGHT_GRAY);
    	    	nr_tfTitle.setBackground(Color.LIGHT_GRAY);
    	    	nr_taText.setBackground(Color.LIGHT_GRAY);
    		}
    	}
    	else if(nr_taText.isEditable()==true) {
    		//[3]유효성 체크
    		if(titleStr==null || titleStr.trim().isEmpty()) {
    			JOptionPane.showMessageDialog(this, "제목을 입력하세요");
    			nw_tfTitle.requestFocus();
    			return;
    		}
    		if(textStr==null || textStr.trim().isEmpty()) {
    			JOptionPane.showMessageDialog(this, "내용을 입력하세요");
    			nw_taText.requestFocus();
    			return;
    		}
    		//[4]수정 내용 전달
    		if(obj==nr_btEdit) {
    			NoticeVO noticeEdit=new NoticeVO();
    			noticeEdit.setPriority(priority);
    			noticeEdit.setTitle(titleStr);
    			noticeEdit.setText(textStr);
    			noticeEdit.setNoticeId(idx);
    			int cnt=nDao.editNotice(noticeEdit);
    			String str=(cnt>0)? "수정 성공":"수정 실패";
    			
    			JOptionPane.showMessageDialog(this, str);
    			if(cnt>0) {
    				card.show(pCenter, "pNoticeMain");
    				showNotice();
    			}
    			setTaBgColor();
    		}
    	}
    	
    }
    //글목록 버튼 클릭시 공지사항 메인패널로 전환
    private void nr_btListActionPerformed(java.awt.event.ActionEvent evt) {
    	Object obj=evt.getSource();
    	if(obj==nr_btList) {
    		card.show(pCenter, "pNoticeMain");
    		showNotice();
    		setTaBgColor();
    	}
    }
    /**공지사항 삭제*/
    private void nr_btDelActionPerformed(java.awt.event.ActionEvent evt) {
    	Object obj=evt.getSource();
    	int yn=-1;
    	if(obj==nr_btDel) {
    		//[1]확인메세지
    		yn=JOptionPane.showConfirmDialog(this, idx+"번 글을 삭제하시겠습니까?");
    		if(yn==JOptionPane.YES_OPTION) {
    			//[2]승인시 글번호 전달
    			int cnt=nDao.deleteNotice(idx);
    			String str=(cnt>0)? "삭제 성공":"삭제 실패";
    			JOptionPane.showMessageDialog(this, str);
    			//[3]삭제 성공시 메인으로 돌아감
    			if(cnt>0) {
    				card.show(pCenter, "pNoticeMain");
    				showNotice();
    			}
    		}
    	}
    }
    private void nr_tfWdateActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }
    
    //게시판---------------------------------------------------------------------------------
    public void setTableHeader()
    {
        //테이블 헤더 간격
        JTableHeader header=tbBoard.getTableHeader();
        header.getColumnModel().getColumn(0).setPreferredWidth((int)(tbBoard.getWidth()*0.05));
        header.getColumnModel().getColumn(1).setPreferredWidth((int)(tbBoard.getWidth()*0.1));
        header.getColumnModel().getColumn(2).setPreferredWidth((int)(tbBoard.getWidth()*0.7));
        header.getColumnModel().getColumn(3).setPreferredWidth((int)(tbBoard.getWidth()*0.15));

        DefaultTableCellRenderer align= new DefaultTableCellRenderer();
    	align.setHorizontalAlignment(SwingConstants.CENTER);
    	align.setBackground(cr= new Color(230,230,230));
    	header.getColumnModel().getColumn(0).setHeaderRenderer(align);
    	header.getColumnModel().getColumn(1).setHeaderRenderer(align);
    	header.getColumnModel().getColumn(2).setHeaderRenderer(align);
    	header.getColumnModel().getColumn(3).setHeaderRenderer(align);

        header.setResizingAllowed(false);
        header.setEnabled(false);
        
    }
    //테이블 리스트업
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) throws Exception{
    	showAll();
    }
    public void showAll()
    {

    	//1. 검색유형 알아내기
    	int index= cbSearch.getSelectedIndex();
    	//2. 검색어 얻어오기
    	String keyword= tfSearch.getText();
    	ArrayList<BoardVO> al= bDAO.searchBoard(index, keyword);
    	
    	//3. 유효성체크
//    	if(keyword.trim().isEmpty())
//    	{
//    		showMessage("검색어를 입력하세요");
//    		return;
//    	}
//    	
    	//4. search 받기
    	showTable(al);
 	
    }
    String boardColHeader[]= {"NO","작성자","내  용","작성일"};
    public void showTable(ArrayList<BoardVO> arr)
    {
    	Object board[][]= new Object[arr.size()][4];
   	
    	//ArrayList 의 내용을 data에 옮기기
    	for(int i=0; i<board.length; i++)
    	{
    		BoardVO bVO= arr.get(i);		//행하나
    		board[i][0]= bVO.getIdx();
    		board[i][1]= bVO.getName();
    		board[i][2]= bVO.getMsg();
    		board[i][3]= bVO.getWdate();
    		
    	}
    	//5. create DefaultTableModel object
    	model=(DefaultTableModel)this.tbBoard.getModel();
    		//new defaulttablemodel이 아니라 세팅한 테이블모델을 가져와야 하므로
    	model.setDataVector(board, boardColHeader);
    		//new DefaultTableModel(data, colHeader) 해주던게 getModel()에서 없으니까
    		//값을 넣어줘야함
    		//public void setDataVector(Object[][] dataVector, Object[] columnIdentifiers)
    	//6. table model 설정
    	tbBoard.setModel(model);

    	//셀 가운데정렬
    	DefaultTableCellRenderer col1= new DefaultTableCellRenderer();
    	col1.setHorizontalAlignment(SwingConstants.CENTER);
    	col1.setBackground(Color.lightGray);
    	DefaultTableCellRenderer col2= new DefaultTableCellRenderer();
    	col2.setHorizontalAlignment(SwingConstants.CENTER);
    	col2.setBackground(cr= new Color(207,222,238));
    	DefaultTableCellRenderer col3= new DefaultTableCellRenderer();
    	col3.setHorizontalAlignment(SwingConstants.LEFT);
    	col3.setBackground(Color.white);
    	DefaultTableCellRenderer col4= new DefaultTableCellRenderer();
    	col4.setHorizontalAlignment(SwingConstants.CENTER);
    	col4.setBackground(cr= new Color(207,222,238));
    	
    	TableColumnModel tcm= tbBoard.getColumnModel();
    	tcm.getColumn(0).setCellRenderer(col1);
    	tcm.getColumn(1).setCellRenderer(col2);
    	tcm.getColumn(2).setCellRenderer(col3);
    	tcm.getColumn(3).setCellRenderer(col4);
    	
    	setTableHeader();
		
    }
    //버튼
    private void btWriteActionPerformed(java.awt.event.ActionEvent evt) throws Exception{                                        
        
    	String name= lbEmpno.getText();
    	String msg= tfWrite.getText();
    	
    	//무결성
    	if(msg.trim().isEmpty())
    	{
    		showMessage("내용을 입력하세요");
    		tfWrite.setText("");
    		tfWrite.requestFocus();
    		return;
    	}
    	if(name.trim().isEmpty())
    	{
    		showMessage("사용자가 존재하지 않습니다");
    		return;
    	}
    	
    	BoardVO bVO= new BoardVO();
    	bVO.setName(name);
    	bVO.setMsg(msg);
    	String regCheck=(bDAO.writeBoard(bVO)>0?"글이 등록되었습니다":"등록 실패");
    	
    	showMessage(regCheck);
    	tfWrite.setText("");
    	
//    	작업끝나고 테이블 리프레쉬
    	showAll();
    	boardEnable();
    }                                       
    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //get id
    	String empno= lbEmpno.getText();
    	//get row
    	int row=tbBoard.getSelectedRow();
//    	System.out.println(tbBoard.isRowSelected(row));
    	
    	//유효성: 라벨사번과 작성자 사번이 맞지않으면 에러메시지
    	if(tbBoard.isRowSelected(row)==false)
    	{
    		showMessage("삭제할 글을 선택하세요");
    		System.out.println("selection error");
    		return;
    	}
    	Object objWrt= tbBoard.getValueAt(row, 1);
    	String writer= (String)objWrt;
    	if(!empno.trim().equals(writer)||empno==null)
    	{
    		showMessage("지울수 있는 권한이 없습니다");
    		System.out.println("access error");
    		return;
    	}
    	
    	Object objIdx= tbBoard.getValueAt(row, 0);
    	Integer idx=(Integer)objIdx;

    	int yn=JOptionPane.showConfirmDialog(tbBoard, idx+"번 글을 삭제할까요?");
    	
    	if(yn==JOptionPane.YES_OPTION)
    	{
    		int r=bDAO.delete(idx);
    		String str=(r>0?"글이 삭제되었습니다":"삭제실패");
    		showMessage(str);
    	}
    	
    	//작업끝나고 테이블 리프레쉬
    	showAll();
    	boardEnable();
    	
    }                  
    private void btReplyActionPerformed(java.awt.event.ActionEvent evt) throws Exception{
    	
    	String empno= lbEmpno.getText();
    	int row=tbBoard.getSelectedRow();
    	
    	//유효성 체크
    	if(tbBoard.isRowSelected(row)==false)	//항목선택 안됐을때
    	{
    		showMessage("댓글을 달고자하는 항목을 선택하세요");
    		return;
    	}
    	if(lbEmpno.getText().trim().isEmpty())	//사번이 없을때
    	{
    		showMessage("로그인되지 않았습니다");
    		return;
    	}
    	
    	//bdid 연동시키기?
    	Object objIdx= tbBoard.getValueAt(row, 0);
    	Integer boardID= (Integer)objIdx;
    	if(row==99)
    	{
    		showMessage("댓글에는 또다른 댓글을 달 수 없습니다");
    		return;
    	}

    	try {
    		String reply=JOptionPane.showInputDialog("답글을 입력하세요");	//reply msg			
    		if(reply.trim().isEmpty())
    		{
    			showMessage("내용을 입력해주세요");
    			return;
    		}
    		ReplyVO rVO= new ReplyVO();
    		rVO.setName(empno);
    		rVO.setMsg(reply);
    		String regCheck=(bDAO.insertReply(rVO,boardID)>0? "성공":"실패");
    		System.out.println(rVO.getName());		//테스트용
    		showMessage(regCheck);
		} catch (NullPointerException e) {
			System.out.println("댓글달기 취소");
			showMessage("댓글달기를 취소했습니다");
		}
    	
    	showAll();
    	boardEnable();
    }
    //댓글
    public void showReply()
    {
        tbBoard.addMouseListener(new MouseAdapter() {
        	int count=0;
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
        		int row= tbBoard.getSelectedRow();
        		if(tbBoard.isEnabled()==true) {
        			
        			Object objIdx= tbBoard.getValueAt(row,0);
        			Integer idx=(Integer)objIdx;
        			
        			int bdid= (int)tbBoard.getValueAt(row, 0);		//선택된 행의 bdid값 가져옴
        			ArrayList<ReplyVO> alR= bDAO.selectReply(bdid);
        			
        			for(count=0; count<alR.size(); count++)
        			{
        				Object data[]= new Object[4];
        				ReplyVO rp= alR.get(count);
        				data[0]=rp.getIdx();
        				data[1]=rp.getName();
        				data[2]=rp.getMsg();
        				data[3]=rp.getWdate();
        				model.insertRow(row+1,data);

        			}
        			tbBoard.setSelectionBackground(cr= new Color(100,100,240));
        			tbBoard.setEnabled(false);
        			System.out.println("댓글창 열림");
        		}//--if
        		else
        		{
        			for(int i=0; i<count; i++)
        			{
        				model.removeRow(row+1);
        			}

        			tbBoard.setEnabled(true);
        			System.out.println("board enabled");
        			tbBoard.setSelectionBackground(cr= new Color(150,150,150));
        		}
        	}
        });
    }

    public void showMessage(String msg) {
    	JOptionPane.showMessageDialog(this, msg);
    }
    public void boardEnable() 
    {
		if(tbBoard.isEnabled()==false) {
			tbBoard.setEnabled(true);
		}
    }
    
    //쪽지---------------------------------------------------------------------------------
    private void lbMsgMouseClicked(java.awt.event.MouseEvent evt) {
    	msg.setVisible(true);
    }

    //관리자모드---------------------------------------------------------------------------------
    private void lbAdminMouseClicked(java.awt.event.MouseEvent evt) {
    	// System.out.println("Intra.empid="+empid);
    	AdminRegisterVO loginCheck=aDao.selectEmp(empid);
    	if(loginCheck.getDeptno()==100) {
    		card.show(pCenter, "pAdmin");
    		showList();
    	} else {
    		JOptionPane.showMessageDialog(this, "접근 권한이 없습니다.");
    	}
    }

    /**DB에서 list 받아오는 메소드*/
    AdminEditDAO aDao=new AdminEditDAO();
    public void showList() {
    	ArrayList<AdminRegisterVO> list=aDao.selectAll();
    	showTaList(list);
    }
    
    /**TaList에 list 붙이는 메소드*/
    String[] aColHeader= {"사원번호","이름","부서명","전화번호","직위","이메일","입사일","성별","비밀번호"};
    public void showTaList(ArrayList<AdminRegisterVO> list) {
    	Object[][] data=new Object[list.size()][9];
    	if(list.size()==0) {
    		tabEmpList.setToolTipText("사원정보가 존재하지 않습니다.");
    		return;
    	}else {
    		for(int i=0;i<data.length;i++) {
    			AdminRegisterVO emp=list.get(i);
    			data[i][0]=emp.getEmpid();
    			data[i][1]=emp.getEname();
    			data[i][2]=emp.getDname();
				data[i][3]=emp.getTel();
				data[i][4]=emp.getRank();
				data[i][5]=emp.getEmail();
				data[i][6]=emp.getHiredate();
				data[i][7]=emp.getSex();
				data[i][8]=emp.getPwd();
    		}
    		DefaultTableModel model=new DefaultTableModel(data,aColHeader);
    		tabEmpList.setModel(model);
    		tabEmpList.setRowHeight(20);
    	}
    }
    
    /**사원 정보 추가*/
    private void btEmpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpAddActionPerformed
    	//AdminRegister 창 띄우기
    	register.pack();
    	register.setLocation(170,130);
    	register.setVisible(true);
    }

    /**사원 정보 수정 버튼*/
    private void btEmpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpEditActionPerformed
    	System.out.println(selectedRow+", "+selectedCol);
		if(selectedRow<0) return;
		Object objIdx=tabEmpList.getValueAt(selectedRow, 0);
		idx=(Integer)objIdx;
		
    	//AdminEdit 창 띄우기
		edit.pack();
		edit.setLocation(170,130);
		edit.setVisible(true);
		
		//사원 정보 불러오기
		emp=aDao.selectEmp(idx);
		//사원 정보 tf에 붙이기
		edit.tfEmpid.setText(emp.getEmpid()+"");
		edit.tfPwd.setText(emp.getPwd());
		edit.tfEname.setText(emp.getEname());
		if(emp.getSex().trim().contentEquals("M")) {
			edit.btSexM.setSelected(true);
		}else if(emp.getSex().trim().contentEquals("F")) {
			edit.btSexF.setSelected(true);
		}
		edit.tfTel.setText(emp.getTel());
		edit.tfEmail.setText(emp.getEmail());
		edit.tfDept.setText(emp.getDname());
		edit.tfRank.setText(emp.getRank());		
    }
    
    /**사원 정보 삭제*/
    private void btEmpDelActionPerformed(java.awt.event.ActionEvent evt) {                                         
		System.out.println(selectedRow+", "+selectedCol);
		if(selectedRow<0) return;
		Object objIdx=tabEmpList.getValueAt(selectedRow, 0);
		int idx=(Integer)objIdx;
		int yn=JOptionPane.showConfirmDialog(tabEmpList, "사번 "+idx+" 정보를 삭제하시겠습니까?");
		if(yn==JOptionPane.YES_OPTION) {
			int cnt=aDao.deleteEmp(idx);
			if(cnt>0) {
				JOptionPane.showMessageDialog(null, "사원 정보 삭제 성공");
				showList();
			}else {
				JOptionPane.showMessageDialog(null, "사원 정보 삭제 실패");
			}
		}
    }
    
    //로그아웃----------------------------------------------------------------------------------
    /**로그아웃: 클릭시 로그아웃 여부 확인*/
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {
    	logoutConfirm();
    }
    //로그아웃 여부 확인 메소드
    public void logoutConfirm() {
    	int yn=JOptionPane.showConfirmDialog(this, "로그아웃하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
    	
    	if(yn==JOptionPane.YES_OPTION) {
    		System.exit(0);
    	}
    }
    
    //기업로고------------------------------------------------------------------------------------
    /**기업로고: 클릭시 공지사항 메인으로 이동*/
    private void lbLogoMouseClicked(java.awt.event.MouseEvent evt) {
    	card.show(pCenter, "pNoticeMain");
    	showNotice();
    }
    
    //===============================================================================================================================END-ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Intra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	EmpVO owner=new EmpVO(1501);
            	Msg msg=new Msg(owner);
    			msg.setVisible(false);
                new Intra(owner,msg).setVisible(true);
            }
        });
    }//===============================================================================================================================END-Main

    //변수
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lbBoard;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMeetroom;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JLabel lbMypage;
    private javax.swing.JLabel lbNotice;
    private javax.swing.JButton nm_btSearch;
    private javax.swing.JButton nm_btWrite;
    private javax.swing.JComboBox<String> nm_cbPriority;
    private javax.swing.JLabel nm_lbHeader;
    private javax.swing.JScrollPane nm_spList;
    private javax.swing.JTable nm_tabList;
    private javax.swing.JTextField nm_tfSearch;
    private javax.swing.JButton nr_btDel;
    private javax.swing.JButton nr_btEdit;
    private javax.swing.JButton nr_btList;
    private javax.swing.JLabel nr_lbEmpid;
    private javax.swing.JLabel nr_lbHeader;
    private javax.swing.JLabel nr_lbPriority;
    private javax.swing.JLabel nr_lbTitle;
    private javax.swing.JLabel nr_lbWdate;
    private javax.swing.JScrollPane nr_spText;
    private javax.swing.JTextField nr_tfEmpid;
    private javax.swing.JTextField nr_tfPriority;
    private javax.swing.JTextArea nr_taText;
    private javax.swing.JTextField nr_tfTitle;
    private javax.swing.JTextField nr_tfWdate;
    private javax.swing.JButton nw_btCancle;
    private javax.swing.JButton nw_btWrite;
    private javax.swing.JComboBox<String> nw_cbPriority;
    private javax.swing.JLabel nw_lbEmpid;
    private javax.swing.JLabel nw_lbHeader;
    private javax.swing.JLabel nw_lbPriority;
    private javax.swing.JLabel nw_lbTitle;
    private javax.swing.JScrollPane nw_spText;
    private javax.swing.JTextArea nw_taText;
    private javax.swing.JTextField nw_tfTitle;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pNoticeMain;
    private javax.swing.JPanel pNoticeRead;
    private javax.swing.JPanel pNoticeWrite;
    private javax.swing.JPanel pTop;
    private javax.swing.JLabel bd_lbHeader;
    private javax.swing.JScrollPane bd_spList;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReply;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btWrite;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel lbEmpno;
    private javax.swing.JLabel lbWriter;
    private javax.swing.JPanel pBoard;
    private javax.swing.JTable tbBoard;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfWrite;


//    private javax.swing.JButton bd_btSearch;
//    private javax.swing.JComboBox<String> bd_cbSearch;
//    private javax.swing.JTable bd_tabList;
//    private javax.swing.JTextField bd_tfSearch;
//    private javax.swing.JButton btCancle;
//    private javax.swing.JButton btEditOk;
    private javax.swing.JButton btEmpAdd;
    private javax.swing.JButton btEmpDel;
    private javax.swing.JButton btEmpEdit;
//    private javax.swing.JRadioButton btSexF;
//    private javax.swing.JRadioButton btSexM;
    private javax.swing.JLabel lbAdminHeader;
//    private javax.swing.JLabel lbDept;
//    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmpList;
//    private javax.swing.JLabel lbEmpid;
//    private javax.swing.JLabel lbEname;
//    private javax.swing.JLabel lbMypageHeader;
//    private javax.swing.JLabel lbPwd;
//    private javax.swing.JLabel lbPwdConfirm;
//    private javax.swing.JLabel lbRank;
//    private javax.swing.JLabel lbSex;
//    private javax.swing.JLabel lbTel;
//    private javax.swing.JButton mr_btReserve;
//    private javax.swing.JComboBox<String> mr_cbEtime;
//    private javax.swing.JComboBox<String> mr_cbRoomid;
//    private javax.swing.JComboBox<String> mr_cbStime;
//    private javax.swing.JLabel mr_lbDate;
//    private javax.swing.JLabel mr_lbDatehyphen;
//    private javax.swing.JLabel mr_lbHeader;
//    private javax.swing.JLabel mr_lbList;
//    private javax.swing.JLabel mr_lbReserve;
//    private javax.swing.JLabel mr_lbReserveid;
//    private javax.swing.JLabel mr_lbRoomid;
//    private javax.swing.JScrollPane mr_spList;
//    private javax.swing.JTable mr_tabList;
//    private javax.swing.JTextField mr_tfReserveid;
//    private javax.swing.JTextArea nr_tfText;
//    private javax.swing.JButton nw_btSearch;
//    private javax.swing.JLabel nw_lbSearch;
//    private javax.swing.JTextField nw_tfSearch;
    private javax.swing.JPanel pAdmin;
//    private javax.swing.JPanel pMeetRoom;
    private javax.swing.JPanel pMypage;
    private javax.swing.JScrollPane spEmpList;
    private javax.swing.JTable tabEmpList;
//    private javax.swing.JTextField tfDept;
//    private javax.swing.JTextField tfEmail;
//    private javax.swing.JTextField tfEmpid;
//    private javax.swing.JTextField tfEname;
//    private javax.swing.JTextField tfPwd;
//    private javax.swing.JTextField tfPwdConfirm;
//    private javax.swing.JTextField tfRank;
//    private javax.swing.JTextField tfTel;
  //===============================================================================================================================END-V
}
