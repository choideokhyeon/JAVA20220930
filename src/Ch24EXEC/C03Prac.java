package Ch24EXEC;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class C03Prac {

	public static void main(String[] args) throws Exception{
		URL url = new URL("https://www.gotokyo.org/jp/plan/tokyo-outline/images/main.jpg");
		BufferedImage img = ImageIO.read(url);
		JLabel lb = new JLabel(new ImageIcon(img));
		JFrame f = new JFrame("이미지 그리기");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(lb);
		f.pack();
		f.setLocation(200,200);
		f.setVisible(true);
		

	}

}
