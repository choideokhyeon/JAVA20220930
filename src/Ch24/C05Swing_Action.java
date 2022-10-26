package Ch24;

import java.awt.event.*;
import javax.swing.*;

class C05GUI extends JFrame implements ActionListener, KeyListener
{
	JTextArea area;			//텍스트 영역창
	JScrollPane scroll;		//area에 스크롤 추가하기
	JTextField txt1;		//텍스트 입력창
	JButton button1;		//버튼 생성
	JButton button2;		//버튼 생성
	
	C05GUI()
	{
		super("다섯번째 프레임입니다");			//프레임창 제목
		
		JPanel pannel = new JPanel();		//패널 생성
		
		pannel.setLayout(null);				//Layout 설정 x
		
		area = new JTextArea();
//		area.setBounds(10,10,260,240);		//크기 Scroll사용시 생략가능
		
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,260,240);
		
		txt1 = new JTextField();
		txt1.setBounds(10,260,260,30);		//크기
		txt1.addKeyListener(this);			//이벤트 추가(키보드)
		
		button1 = new JButton("버튼1");
		button1.setBounds(10,300,100,30);	//버튼 위치, 크기 지정
		button1.addActionListener(this);	//이벤트 추가
		
		button2 = new JButton("종료");
		button2.setBounds(170,300,100,30);	//버튼 위치, 크기 지정
		button2.addActionListener(this);	//이벤트 추가
		
		pannel.add(button1);	//패널에 추가
		pannel.add(button2);
		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);	//scroll은 area를 포함한다
		add(pannel);	//프레임에 패널 추가
		
		
		setBounds(100,100,300,400);	//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
	}

	
	//button addActionListener
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{
			System.out.println("버튼 1 클릭");
		}
		
		else if(e.getSource() == button2)
		{
			System.exit(0);
		}
		
	}

	
	//키를 뗐을때(UNICODE 지원)
	public void keyTyped(KeyEvent e)
	{
//		System.out.print("KEYTYPED함수 : " + e.getKeyChar());
	}

	//키를 눌렀을때(UNICODE 지원)
	@Override
	public void keyPressed(KeyEvent e)
	{
//		System.out.println("KEYPRESSED함수 : " + e.getKeyChar());
//		System.out.println("KEYPRESSED함수 : " + e.getKeyCode());
		if(e.getKeyCode() == 10)	//엔터키를 입력했을때
		{
			//1 필드의 내용 -> Area
			area.append("[CLIENT] : " + txt1.getText() + "\n");
			//2 필드의 내용 삭제
			txt1.setText("");
		}
	}

	//키를 뗐을때(UNICODE 미지원)
	@Override
	public void keyReleased(KeyEvent e)
	{
//		System.out.println("KEYRELEASED함수 : " + e.getKeyChar());
	}
}

public class C05Swing_Action {

	public static void main(String[] args) {
		new C05GUI();
		
	}

}
