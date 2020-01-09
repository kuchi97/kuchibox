/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author 2class-005
 */
public class MyNotePad extends javax.swing.JFrame {

	CardLayout card;
	
	//textfile 읽어올땐 bufferedReader
	BufferedReader br;			//filter stream
	//BufferedReader로 읽은걸 내보낼때는 BufferedWriter/PrintWriter
	PrintWriter pw;
	
	//textfile을 읽을때는
	FileReader fr;				//node stream
	FileWriter fw;
	
	String fonts[];				//시스템서체를 가져와 콤보박스랑 연결할것
	
    public MyNotePad() {
    	super("::MyNotePad v1.1");
        initComponents();
        
        tfDir.setText("c:/");
        
        //콤보박스에 서체를 가져와서 저장하긴
        fonts= this.getFonts();			//배열에 폰트 저장
        DefaultComboBoxModel<String> cmodel=(DefaultComboBoxModel)comboFont.getModel();			//콤보박스모델에 만들어둔 comboFont박스를 연결
        if(fonts!=null)
        {
        	for(String f:fonts)
        	{
        		cmodel.addElement(f);
        	}
        }
        
        comboSize.setSelectedIndex(2);
        
    }
    
    //시스템의 서체를 반환하는 메소드
    public String[] getFonts()
    {
    	GraphicsEnvironment ge= GraphicsEnvironment.getLocalGraphicsEnvironment();
    	String[] fnts= ge.getAvailableFontFamilyNames();			//배열에 사용가능한 폰트패밀리를 넣어
    	
    	return fnts;
    }
    
    //dialog메시지 띄워주는 메소드
    public void showMessage(String msg)
    {
    	JOptionPane.showMessageDialog(this, msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btNew = new javax.swing.JButton();
        btOpen = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        comboFont = new javax.swing.JComboBox<>();
        comboSize = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));
        btHelp = new javax.swing.JButton();
        sp = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        tfDir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFile = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jsp1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jsp2 = new javax.swing.JScrollPane();
        lbImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 500));

        jToolBar1.setRollover(true);

        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btNew.setFocusable(false);
        btNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btNew);

        btOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        btOpen.setFocusable(false);
        btOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(btOpen);

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

//        comboFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verdana", "Dialog", "San Serif", "Ariel", "Consolas" }));
        comboFont.setMaximumSize(new java.awt.Dimension(60, 32767));
        comboFont.setMinimumSize(new java.awt.Dimension(45, 21));
        comboFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFontItemStateChanged(evt);
            }
        });
        jToolBar1.add(comboFont);

        comboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "12", "16", "20", "50" }));
        comboSize.setMaximumSize(new java.awt.Dimension(60, 32767));
        comboSize.setMinimumSize(new java.awt.Dimension(45, 21));
        comboSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSizeItemStateChanged(evt);
            }
        });
        jToolBar1.add(comboSize);
        jToolBar1.add(filler1);

        btHelp.setText("도움!");
        btHelp.setFocusable(false);
        btHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btHelp);

        sp.setDividerSize(3);

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 457));

        tfDir.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, java.awt.Color.lightGray), javax.swing.BorderFactory.createTitledBorder("Directory")));
        tfDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDirActionPerformed(evt);
            }
        });

        listFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listFile.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFileValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listFile);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfDir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(tfDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        sp.setLeftComponent(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 457));
        jPanel2.setLayout(card= new java.awt.CardLayout());

        ta.setColumns(20);
        ta.setRows(5);
        ta.setPreferredSize(new java.awt.Dimension(500, 104));
        jsp1.setViewportView(ta);

        jPanel2.add(jsp1, "txtFile");

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fallout-4-1-2.jpg"))); // NOI18N
        jsp2.setViewportView(lbImage);

        jPanel2.add(jsp2, "imgFile");

        sp.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JFileChooser jfc= new JFileChooser("c:/myjava");			//매개변수로 기본경로 지정
    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
    	//JFileChooser 실행시켜 선택한파일명을 받아 절대경로를 만들어 readFile() 에 넘긴다
    	//JFileChooser: 파일을 열거나 저장할때 나오는 창 그거
    	int n=jfc.showOpenDialog(this);
    		//n= 열기0 취소1
//    	System.out.println(n);			//test
    	
    	if(n==JFileChooser.APPROVE_OPTION)
    	{
    		File file= jfc.getSelectedFile();
    		
    		//절대경로 만들기
    		String path= file.getAbsolutePath();
    		System.out.println(path);
    		//readFile()에서 읽기
    		showFile(path);		//확장자 검사해서 이미지파일이면 이미지, 텍스트파일이면 텍스트 보여준다
    	}
    	
    }//GEN-LAST:event_btOpenActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
    	ta.setText(null);
    }//GEN-LAST:event_btNewActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

    	int n= jfc.showSaveDialog(this);
    	if(n==JFileChooser.APPROVE_OPTION)
    	{
    		String contents= ta.getText();
    		File file= jfc.getSelectedFile();
    		try {
    			OutputStreamWriter ow= new OutputStreamWriter(new FileOutputStream(file),"EUC-KR");
    			pw= new PrintWriter(ow,true);
    			pw.println(contents);
    			
    			pw.close();
    			ow.close();
    			
    			showMessage(file.getAbsolutePath()+"에 저장 완료!");
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일을 찾을수 없어");
			}
    	}
    	
    }//GEN-LAST:event_btSaveActionPerformed

    private void btHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHelpActionPerformed
    	String str="MyNotePad version 1.1\n작성자: 나";
    	showMessage(str);
    }//GEN-LAST:event_btHelpActionPerformed

	private void tfDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDirActionPerformed
    	//1. 사용자가 입력한 값 받기
    	String dirStr= tfDir.getText();
    	
    	//2. 유효성체크(빈문자열, 디렉토리가 아닐경우)
    	if(dirStr==null || dirStr.trim().isEmpty())
    	{
    		showMessage("입력을 해라고");
    		tfDir.setText("");
    		tfDir.requestFocus();
    		return;
    	}
    	File file= new File(dirStr);
    	if(file.isDirectory()==false)	//!file.isDirectory()
    	{
    		showMessage("디렉토리가 아닌데?");
    		tfDir.setText("");
    		tfDir.requestFocus();
    		return;
    	}
    	
    	//3. 디렉토리가 맞다면 해당 디렉토리의 파일목록 얻어오기
//    	String fileList[]= file.list();
    	File fileList[]= file.listFiles();
//    	String fileName= fileList[0].getName();
    	
		//4. listFile에 DefaultListModel 얻어와서 해당 모델과 파일목록배열 연결
		DefaultListModel<String> lmodel= new DefaultListModel<>();
		
		if(fileList!=null)
		{
			for(File fname: fileList)
			{
				if(fname.isDirectory())
				{
					lmodel.addElement(fname.getName()+" <dir>");
				}
				else
					lmodel.addElement(fname.getName());
			}
		}
		//5. jlist와 lmodel 연결
		listFile.setModel(lmodel);

    	
    	
    }//GEN-LAST:event_tfDirActionPerformed

	int fontSize=12;
	String fontFamily="San Serif";
    private void comboFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFontItemStateChanged

    	// 콤보박스에서 선택한 서체 얻어오기
    	fontFamily= comboFont.getSelectedItem().toString();
    	
    	//Font 객체 생성
    	Font font= new Font(fontFamily, Font.PLAIN, fontSize);
    	
    	//ta에 적용
    	ta.setFont(font);
    	
    }//GEN-LAST:event_comboFontItemStateChanged

    private void comboSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSizeItemStateChanged
    	
    	String fsize=comboSize.getSelectedItem().toString();
    	fontSize=Integer.parseInt(fsize.trim());
    	Font font= new Font(fontFamily, Font.PLAIN, fontSize);
    	ta.setFont(font);
    	
    }//GEN-LAST:event_comboSizeItemStateChanged

    private void listFileValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFileValueChanged
//    	System.out.println("test"+b);
        //이거 리스트 클릭하면 pressed released 에서 각각 이벤트 먹음    	
    	boolean b= evt.getValueIsAdjusting();				//pressed 일때 true / released일때 false
    	if(b == false)
    	{
    		//1. listFile에서 사용자가 선택한 값 얻어오기		//타이틀에 띄워서 한번 테스트
    		String fileName= listFile.getSelectedValue();
    		String path=tfDir.getText()+"/"+fileName;
//    		System.out.println(path);			//for test
      		
    		showFile(path);
    		
    		
    	}
    }//GEN-LAST:event_listFileValueChanged
    
    public void showFile(String path)
    {
    	//2. 해당 값의 확장자 검색. 확장자가 .java또는 .html, .txt라면 내용을 ta에 출력 card.show();
		//	.jpg, .png, .gif 이라면 lb에 출력
		//3. readFile() 호출해서 해당파일과 스트림연결하여 읽고 ta/lb에 보여주기
		String fileName= path.toLowerCase();
		if(fileName.endsWith(".java") || fileName.endsWith(".html") || fileName.endsWith(".txt"))
		{
			card.show(jPanel2, "txtFile");
			
			//파일읽기
			readFile(path);
		}
		else if(fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".gif"))
		{
			card.show(jPanel2, "imgFile");
			ImageIcon image= new ImageIcon(path);
			lbImage.setIcon(image);
		}
		else
		{
			card.show(jPanel2, "txtFile");
			ta.setText(fileName);
			return;
		}
    }
    
    //파일과 스트림 연결하여 읽은 뒤 ta에 보여주는 메소드
    public void readFile(String path)
    {
    	
    	ta.setText("");
    	try {
    		//파일과 연결하는 노드스트림 생성
//    		fr= new FileReader(path);
    		InputStreamReader ir= new InputStreamReader(new FileInputStream(path), "EUC-KR");
    			//인코딩이 안맞아서 브릿지 스트림을 사용한다
    		
    		String line="";
    		
    		//반복문 돌면서 읽고 읽은내용을 ta에 append();
    		br= new BufferedReader(ir);
    		while((line=br.readLine())!=null)
    		{
    			ta.append(line+"\r\n");
    		}
			
    		br.close();
    		ir.close();
		} catch (IOException e) {
			showMessage("IOException 오류: 사실 뭔오류인지 모르겠지?");
		}
    	
    }
    
    //파일을 타겟경로에 지정하여 저장해주는 메소드
    public void saveAs(String fileName)
    {
    	String path="c:/myjava/target/"+fileName+".txt";
    	String sourcePath=tfDir.getText()+"/"+listFile.getSelectedValue();
//    	System.out.println(sourcePath);		//for test
    	
    	try {
    		fr= new FileReader(sourcePath);
    		fw= new FileWriter(path);
    		
    		int n=0;
    		while((n=fr.read())!=-1)
    		{
    			fw.write(n);
    			fw.flush();
    			
    		}
    		
    		fw.close();
    		fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

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
            java.util.logging.Logger.getLogger(MyNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyNotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHelp;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btOpen;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> comboFont;
    private javax.swing.JComboBox<String> comboSize;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane jsp1;
    private javax.swing.JScrollPane jsp2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JList<String> listFile;
    private javax.swing.JSplitPane sp;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tfDir;
    // End of variables declaration//GEN-END:variables
}
