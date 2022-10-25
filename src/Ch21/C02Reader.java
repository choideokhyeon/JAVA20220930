package Ch21;

import java.io.*;

public class C02Reader {

	public static void main(String[] args) throws Exception {

		Reader in = new FileReader("C:\\iotest\\test.txt");
		while(true)
		{
			int data = in.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}
	}
}
