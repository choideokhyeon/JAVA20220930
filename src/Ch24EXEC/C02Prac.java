package Ch24EXEC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class GUI extends JFrame implements ActionListener
{
	JTextArea area;
	JScrollPane scroll;
	JButton btn1;
	JButton btn2;
	Thread th1;
	BufferedImage pic;
	
	
	GUI() throws Exception
	{
		super("가챠 시뮬레이터");
		
		JPanel pannel = new JPanel();
		
		pannel.setLayout(null);
		
		area = new JTextArea();
		area.setEditable(false);
		scroll = new JScrollPane(area);
		scroll.setBounds(10,10,260,280);
		
		btn1 = new JButton("10회 뽑기");
		btn1.setBounds(10,300,100,30);
		btn1.addActionListener(this);
		
		btn2 = new JButton("종료");
		btn2.setBounds(170,300,100,30);
		btn2.addActionListener(this);

		pannel.add(btn1);
		pannel.add(btn2);
		pannel.add(scroll);
		add(pannel);
		
		setBounds(100,100,300,400);
		pannel.setBackground(new Color(255, 128, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1)
		{
			area.append("=====================\n");
			area.append("10회 뽑기를 실행합니다\n");
			C02Task task = new C02Task(this);
			th1 = new Thread(task);
			th1.start();
		}
		
		else if(e.getSource() == btn2)
		{
			System.exit(-1);
		}
	}
}

public class C02Prac {
	
	public static void main(String[] args) throws Exception
	{
		new GUI();
	}
}
