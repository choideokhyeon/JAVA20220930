package Ch24EXEC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C01GUI extends JFrame implements ActionListener, KeyListener
{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	
	C01GUI()
	{
		super("Chatting Server");
		
		JPanel pn = new JPanel();
		
		pn.setLayout(null);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBounds(10,10,300,350);
		
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,300,350);
		
		txt1 = new JTextField();
		txt1.setBounds(10,400,300,30);
		txt1.addKeyListener(this);
		
		button1 = new JButton("파일로 저장");
		button1.setBounds(320,20,150,30);
		button1.addActionListener(this);
		
		button2 = new JButton("1:1 요청");
		button2.setBounds(320,80,150,30);
		button2.addActionListener(this);
		
		button3 = new JButton("대화기록보기");
		button3.setBounds(320,140,150,30);
		button3.addActionListener(this);
		
		button4 = new JButton("종료");
		button4.setBounds(320,200,150,30);
		button4.addActionListener(this);
		
		button5 = new JButton("입력");
		button5.setBounds(320,400,150,30);
		button5.addActionListener(this);
		
		pn.add(button1);
		pn.add(button2);
		pn.add(button3);
		pn.add(button4);
		pn.add(button5);
		pn.add(txt1);
		pn.add(scroll);
		add(pn);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{
			area.append("저장하기\n");
		}
		
		else if(e.getSource() == button2)
		{
			area.append("1:1 요청\n");
		}
		
		else if(e.getSource() == button3)
		{
			area.append("대화기록보기\n");
		}
		
		else if(e.getSource() == button4)
		{
			System.exit(0);
		}
		
		else if(e.getSource() == button5)
		{
			area.append(txt1.getText() + "\n");
			txt1.setText("");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == 10)
		{	
			area.append(txt1.getText() + "\n");
			txt1.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}

public class C01Prac {

	public static void main(String[] args) {
		new C01GUI();
	}

}
