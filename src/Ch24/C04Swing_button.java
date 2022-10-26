package Ch24;

import java.awt.*;
import javax.swing.*;

class C04GUI extends JFrame
{
	C04GUI()
	{
		super("네번째 프레임입니다");						//프레임창 제목
		
		JPanel pannel = new JPanel();				//패널 생성
		
		pannel.setLayout(null);						//Layout 설정 x
		
		JTextArea area = new JTextArea();			//텍스트 영역창
		area.setBounds(10,10,260,240);
		
		JScrollPane scroll = new JScrollPane(area);	//area에 스크롤 추가하기
		scroll.setBounds(10,10,260,240);
		
		JTextField txt1 = new JTextField();			//텍스트 입력창
		txt1.setBounds(10,260,260,30);				//크기
		
		JButton button = new JButton("버튼1");		//버튼 생성
		button.setBounds(10,300,100,30);			//버튼 위치, 크기 지정
		
		JButton button2 = new JButton("버튼2");		//버튼 생성
		button2.setBounds(170,300,100,30);			//버튼 위치, 크기 지정
		
		pannel.add(button);	//패널에 추가
		pannel.add(button2);
		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);	//scroll은 area를 포함한다
		add(pannel);	//프레임에 패널 추가
		
		
		setBounds(100,100,300,400);	//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
	}
}

public class C04Swing_button {

	public static void main(String[] args) {
		new C04GUI();
		
	}

}
