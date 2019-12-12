package k03AttributeMaple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakeCharacter extends JFrame implements ActionListener{
	
	JPanel mainP,bottomP, topP;
	JButton dice, confirm;
	JTextField strTF,dexTF,intTF,lukTF;
	JLabel strLb,dexLb,intLb,lukLb;
	ImageIcon img;
	JLabel topLb;
	
	public MakeCharacter()
	{
		Container cp= this.getContentPane();
		
		//bglayout
		
		//mainP border insets
		cp.add(mainP= new JPanel() {
			@Override
			public Insets getInsets()
			{
				return new Insets(100,20,100,20);
			}
		}, "Center");
		cp.add(bottomP= new JPanel(), "South");
		
		//anonymous class·Î add bgimage
		img= new ImageIcon("./images/maplemushrooms.png");
		cp.add(topP= new JPanel() {
			@Override
			//public void paintComponent(Graphics g)
			public void paintComponent(Graphics g)
			{
				setSize(new Dimension(300,80));
				//1. display img at full size
				g.drawImage(img.getImage(),0,0,null);
				//2. scale image to size of components
					//Dimension d= getSize();
					//g.drawImage(img.getImage(),0,0, d.width, d.height, null);
				setOpaque(false);
				super.paintComponent(g);
				System.out.println(topP.getWidth());
				System.out.println(topP.getHeight());
			}
		}, "North");
		mainP.setLayout(new GridLayout(2,2,20,20));
		mainP.setBackground(Color.white);
		bottomP.add(dice= new JButton("DICE!"),"South");
		bottomP.add(confirm= new JButton("CONFIRM"),"South");
		topP.setBackground(Color.cyan);
		//- - - bgsetting
		
		mainP.add(strLb= new JLabel("STR"));
		mainP.add(strTF= new JTextField());
		mainP.add(dexLb= new JLabel("DEX"));
		mainP.add(dexTF= new JTextField());
		mainP.add(intLb= new JLabel("INT"));
		mainP.add(intTF= new JTextField());
		mainP.add(lukLb= new JLabel("LUK"));
		mainP.add(lukTF= new JTextField());
		
		
		strTF.setEditable(false);
		dexTF.setEditable(false);
		intTF.setEditable(false);
		lukTF.setEditable(false);
		
		
		//add actionlistener
		dice.addActionListener(this);
		
		//²ô±â
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= new Object();
		obj= e.getSource();
		
		String str,dex,intg,luk;
		if(obj==dice)
		{
			
			AttDispensor2 att= new AttDispensor2();
			att.run();
			str=String.valueOf(att.att[0]);
			dex=String.valueOf(att.att[1]);
			intg=String.valueOf(att.att[2]);
			luk=String.valueOf(att.att[3]);
			
			strTF.setText(str);
			dexTF.setText(dex);
			intTF.setText(intg);
			lukTF.setText(luk);

		}
		else if(obj==confirm)
		{
			
		}
		
	}
	
	public static void main(String[] args)
	{
		MakeCharacter mc= new MakeCharacter();
		
		mc.setSize(300,400);
		mc.setVisible(true);
		mc.setResizable(false);
	}


}
