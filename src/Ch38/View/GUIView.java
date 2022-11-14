package Ch38.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Ch38.Controller.FrontController;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDTO;
import Ch38.Domain.MemberDTO;

public class GUIView extends JFrame implements ActionListener {
	
	// Controller 관련 처리 멤버
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0;	//0 비회원, 1 회원, 2 관리자(사서)
	
	
	//액션 처리 관련 멤버
	JButton btn1;JButton btn2;JButton btn3;JButton btn4;
	JLabel lbbookcode;JLabel lbbookname;JLabel lbislend;
	JTextField txbookcode;JTextField txbookname;JTextField txislend;
	JTextArea area;JScrollPane scroll;
	
	//인증 관련 처리 프레임 멤버
	JFrame Loginview = new JFrame("Login View");
	JButton Loginbtn;JButton exitbtn;
	JTextField txid;JTextField txpw;
	
	
	private FrontController controller = new FrontController();
	
	GUIView() {
		super("도서 관리 프로그램 Ver 0.0 CopyRight 홍길동");
		
		JPanel pannel = new JPanel();
		pannel.setLayout(null);
		
		//Button - 도서전체조회(권한x) , 대여요청 , 도서등록 , 종료
		btn1 = new JButton("도서 조회");
		btn1.setBounds(340,20,130,35);
		btn1.addActionListener(this);
		
		btn2 = new JButton("도서 대여");
		btn2.setBounds(340,65,130,35);
		btn2.addActionListener(this);
		
		btn3 = new JButton("도서 등록");
		btn3.setBounds(340,110,130,35);
		btn3.addActionListener(this);
		
		btn4 = new JButton("종료");
		btn4.setBounds(340,155,130,35);
		btn4.addActionListener(this);
		
		//JLabel
		lbbookcode = new JLabel("도서코드");
		lbbookcode.setBounds(10,20,130,35);
		lbbookname = new JLabel("도서명");
		lbbookname.setBounds(10,65,130,35);
		lbislend = new JLabel("대여가능여부");
		lbislend.setBounds(10,110,130,35);
		
		//TextField - Bookcode,Bookname,islend
		txbookcode = new JTextField();
		txbookcode.setBounds(120,20,170,35);
		txbookname = new JTextField();
		txbookname.setBounds(120,65,170,35);
		txislend = new JTextField();
		txislend.setBounds(120,110,170,35);
		
		//TextArea + ScrollPane
		area = new JTextArea();
		scroll = new JScrollPane(area);
		scroll.setBounds(10,230,465,220);
			
		pannel.add(btn1);pannel.add(btn2);pannel.add(btn3);pannel.add(btn4);
		pannel.add(txbookcode);pannel.add(txbookname);pannel.add(txislend);
		pannel.add(lbbookcode);pannel.add(lbbookname);pannel.add(lbislend);
		pannel.add(scroll);
		add(pannel);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		//인증창 관련 기본 설정
		Loginview.setBounds(100,100,500,170);
		JPanel loginpanel = new JPanel();
		loginpanel.setLayout(null);
		
		Loginbtn = new JButton("로그인");
		exitbtn = new JButton("종료");
		txid = new JTextField("ID");
		txpw = new JTextField("PW");
		
		txid.setBounds(10,10,350,40);
		txpw.setBounds(10,60,350,40);
		Loginbtn.setBounds(370,10,100,40);
		exitbtn.setBounds(370,60,100,40);
		Loginbtn.addActionListener(this);
		
		loginpanel.add(Loginbtn);loginpanel.add(exitbtn);
		loginpanel.add(txid);loginpanel.add(txpw);
		
		Loginview.add(loginpanel);
		Loginview.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		Loginview.setVisible(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn1)
		{
			//1 컨트롤러로부터 모든 책정보 가져오기
			List<BookDTO> list = (List<BookDTO>)controller.ExSubController("/book", 5, null);
			
			//2 Area로 전달하기
			area.setText("");
			for (int i = 0; i < list.size(); i++)
			{
				area.append(list.get(i).toString()+"\n");
			}
			System.out.println("[SYSTEM] Count : " + list.size());
				
		}
		
		if(e.getSource() == btn2) //도서 대여 요청
		{
			if(!Loginstate)
			{
				//로그인 상태가 아니라면 -> 로그인창 띄우기 -> 인증 작업 -> 로그인상태,퍼미션
				Loginview.setVisible(true);		
			}
			else
			{
				//로그인 상태라면 -> 퍼미션 체크  + BookCode받아서 대여 처리 후 View확인
				if(perm>0) {
					//권한충족
					int bookcode= Integer.parseInt(txbookcode.getText());
					LendDTO dto = new LendDTO();
					dto.setLogin(true);
					dto.setPerm(perm);
					dto.setMemid(userid);
					dto.setBookcode(bookcode);
					String msg=(String)controller.ExSubController("/lend", 1, dto);
					 
					JOptionPane.showMessageDialog(null,msg);
					
				}
				else
				{
					//권한부족..메시지창 띄우기
					JOptionPane.showMessageDialog(null,"권한부족..");
				}
			}
		}
		
		if(e.getSource() == btn3) //도서 등록 요청
		{
			if(!Loginstate)
			{
				//로그인 상태가 아니라면 -> 로그인창 띄우기 -> 인증 작업 -> 로그인상태,퍼미션
				Loginview.setVisible(true);		
			}
			else
			{
				//로그인 상태라면 -> 퍼미션 체크  + BookCode받아서 등록
				if(perm >= 2) {
					//권한충족
					int bookcode= Integer.parseInt(txbookcode.getText());
					String bookname = txbookname.getText();
					String msg=(String)controller.ExSubController("/book", 1, new BookDTO(bookcode, bookname));
					JOptionPane.showMessageDialog(null,msg);
					
				}
				else
				{
					//권한부족..메시지창 띄우기
					JOptionPane.showMessageDialog(null,"권한부족..");
				}
			}
		}
		
		else if(e.getSource() == btn4)
			System.exit(-1);
		
		else if(e.getSource() == Loginbtn)
		{
			String id = txid.getText();
			String pw = txpw.getText();
			Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO(id, pw));
			if(result != null)
			{
				//권한 1,2를 획득
				Loginstate = true;
				perm = result;
				userid = id;
				JOptionPane.showMessageDialog(null, "로그인 성공");
				Loginview.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "로그인 실패");
				Loginview.setVisible(true);
			}
		}
	}
		

		
		
	
	public static void main(String[] args) {
		new GUIView();
	}


	
}
