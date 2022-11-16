package Team.View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIView extends JFrame implements ActionListener {
	
	// Controller 관련 처리 멤버
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0;
	
	
	//액션 처리 관련 멤버
	JButton btn1;JButton btn2;JButton btn3;JButton btn4;JButton btn5;JButton btn6;
	JLabel lbprodname;
	JTextField txprodname;
	JTextArea area;JScrollPane scroll;
	
	//인증 관련 처리 프레임 멤버
	JFrame Loginview = new JFrame("Login View");
	JButton Loginbtn;JButton exitbtn;JButton joinbtn;
	JTextField txid;JTextField txpw;
	
	//상품 관리 관련 처리
	JFrame Prodview = new JFrame("Prod View");
	JButton Insert;JButton Update;JButton Select;JButton EXIT;
	JLabel lbprodname2;JLabel lbprodamount;JLabel lbprodprice;
	JTextField txprodname2;JTextField txprodamount;JTextField txprodprice;
	
	//회원 가입 관련 처리
	JFrame Joinview = new JFrame("회원 가입");
	JTextField txjname;JTextField txjpw;JTextField txjaddr;
	

	GUIView() {
		super("쇼핑몰 프로그램 ver 0.0");
		
		JPanel pannel = new JPanel();
		pannel.setLayout(null);
		
		btn1 = new JButton("상품 검색");
		btn1.setBounds(340,20,130,35);
		btn1.addActionListener(this);
		
		btn2 = new JButton("장바구니 담기");
		btn2.setBounds(340,65,130,35);
		btn2.addActionListener(this);
		
		btn3 = new JButton("상품 관리");
		btn3.setBounds(340,110,130,35);
		btn3.addActionListener(this);
		
		btn4 = new JButton("결제하기");
		btn4.setBounds(340,155,130,35);
		btn4.addActionListener(this);
		
		btn5 = new JButton("로그인");
		btn5.setBounds(340,200,130,35);
		btn5.addActionListener(this);
		
		btn6 = new JButton("로그아웃");
		btn6.setBounds(340,245,130,35);
		btn6.addActionListener(this);
		
		//TextArea + ScrollPane
		area = new JTextArea();
		scroll = new JScrollPane(area);
		scroll.setBounds(10,300,465,150);
		
		txprodname = new JTextField();
		txprodname.setBounds(120,20,170,35);
		
		lbprodname = new JLabel("상품명");
		lbprodname.setBounds(10,20,130,35);
		
		pannel.add(btn1);pannel.add(btn2);pannel.add(btn3);pannel.add(btn4);pannel.add(btn5);pannel.add(btn6);
		pannel.add(txprodname);pannel.add(lbprodname);
		pannel.add(scroll);
		add(pannel);
		setBounds(100,100,500,500);
		pannel.setBackground(new Color(255,178,102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		Loginview.setBounds(100,100,500,200);
		JPanel loginpanel = new JPanel();
		loginpanel.setLayout(null);
		
		Loginbtn = new JButton("로그인");
		exitbtn = new JButton("종료");
		joinbtn = new JButton("회원가입");
		txid = new JTextField("ID");
		txpw = new JTextField("PW");
		
		txid.setBounds(10,10,350,40);
		txpw.setBounds(10,60,350,40);
		Loginbtn.setBounds(370,10,100,40);
		exitbtn.setBounds(370,60,100,40);
		joinbtn.setBounds(370,110,100,40);
		Loginbtn.addActionListener(this);
		exitbtn.addActionListener(this);
		joinbtn.addActionListener(this);
		
		loginpanel.add(Loginbtn);loginpanel.add(exitbtn);loginpanel.add(joinbtn);
		loginpanel.add(txid);loginpanel.add(txpw);
		
		Loginview.add(loginpanel);
		Loginview.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		Loginview.setVisible(false);
		
		
		
		
		Prodview.setBounds(100,100,500,500);
		JPanel prodpanel = new JPanel();
		prodpanel.setLayout(null);
		
		Insert = new JButton("상품 등록");
		Insert.setBounds(340,20,130,35);
		Insert.addActionListener(this);
		Select = new JButton("상품 조회");
		Select.setBounds(340,65,130,35);
		Select.addActionListener(this);
		Update = new JButton("상품 수정");
		Update.setBounds(340,110,130,35);
		Update.addActionListener(this);
		EXIT = new JButton("나가기");
		EXIT.setBounds(340,155,130,35);
		EXIT.addActionListener(this);
		
		//JLabel
		lbprodname2 = new JLabel("상품명");
		lbprodname2.setBounds(10,20,130,35);
		lbprodamount = new JLabel("상품 수량");
		lbprodamount.setBounds(10,65,130,35);
		lbprodprice = new JLabel("상품 가격");
		lbprodprice.setBounds(10,110,130,35);
		
		//TextField
		txprodname2 = new JTextField();
		txprodname2.setBounds(120,20,170,35);
		txprodamount = new JTextField();
		txprodamount.setBounds(120,65,170,35);
		txprodprice = new JTextField();
		txprodprice.setBounds(120,110,170,35);
		
		prodpanel.add(Insert);prodpanel.add(Select);prodpanel.add(Update);prodpanel.add(EXIT);
		prodpanel.add(txprodname2);prodpanel.add(txprodamount);prodpanel.add(txprodprice);
		prodpanel.add(lbprodname2);prodpanel.add(lbprodamount);prodpanel.add(lbprodprice);
		
		Prodview.add(prodpanel);
		Prodview.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		Prodview.setVisible(false);
		
		
		
		
		Joinview.setBounds(100,100,500,500);
		JPanel joinpanel = new JPanel();
		joinpanel.setLayout(null);
		txprodname2 = new JTextField();
		txprodname2.setBounds(120,20,170,35);
		txprodamount = new JTextField();
		txprodamount.setBounds(120,65,170,35);
		txprodprice = new JTextField();
		txprodprice.setBounds(120,110,170,35);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn1)
		{
			area.setText("");
			area.append("상품을 검색합니다\n");
		}
		
		if(e.getSource() == btn2)
		{
			area.setText("");
			if(perm < 1)
			{
				JOptionPane.showMessageDialog(null, "로그인이 필요한 서비스 입니다.");
				Loginview.setVisible(true);
			}
			else
			{
				area.append("장바구니에 담습니다\n");
			}
		}
		
		if(e.getSource() == btn3)
		{
			if(perm < 2)
			{
				if(!Loginstate)
				{
					JOptionPane.showMessageDialog(null, "로그인이 필요한 서비스 입니다.");
					Loginview.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "권한이 부족합니다");
			}
			
			else
			{
				Prodview.setVisible(true);
			}
		}
		
		if(e.getSource() == btn4)
		{
			area.setText("");
			if(perm < 1)
			{
				JOptionPane.showMessageDialog(null, "로그인이 필요한 서비스 입니다.");
			}
			else
			{
				area.append("결제를 진행합니다\n");
			}
		}
		
		if(e.getSource() == btn5)
		{
			if(Loginstate)
			{
				JOptionPane.showMessageDialog(null, "이미 로그인 상태입니다.");
			}
			else
			{
				Loginview.setVisible(true);
			}
		}
		
		if(e.getSource() == btn6)
		{
			if(!Loginstate)
			{
				JOptionPane.showMessageDialog(null, "로그인 상태가 아닙니다");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "로그아웃 합니다");
				Loginstate = false;
				perm = 0;
			}
		}
		
		if(e.getSource() == Loginbtn)
		{
			String id = txid.getText();
			String pw = txpw.getText();
			if(id.equals("admin") && pw.equals("1234"))
			{
				Loginstate = true;
				perm = 2;
				JOptionPane.showMessageDialog(null, "로그인 성공");
				Loginview.setVisible(false);
			}
			else if(id.equals("user") && pw.equals("1234"))
			{
				Loginstate = true;
				perm = 1;
				JOptionPane.showMessageDialog(null, "로그인 성공");
				Loginview.setVisible(false);
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "로그인 실패");
				Loginview.setVisible(true);
			}
		}
		
		if(e.getSource() == exitbtn)
			Loginview.setVisible(false);
		
		if(e.getSource() == Insert)
		{
			String pname = txprodname2.getText();
			Integer pamount = Integer.parseInt(txprodamount.getText());
			Integer price = Integer.parseInt(txprodprice.getText());
			JOptionPane.showMessageDialog(null, price + "원의 " + pname + " 상품을 " + pamount + "개 등록하여" + price*pamount + "원 입니다");
		}
		
		if(e.getSource() == EXIT)
			Prodview.setVisible(false);
	}
		

		
		
	
	public static void main(String[] args) {
		new GUIView();
	}


	
}
