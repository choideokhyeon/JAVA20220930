package Ch21EXEC;

import java.io.*;

public class C02Prac {

	public static void main(String[] args) throws Exception {
		
		OutputStream out = new FileOutputStream("C:\\iotest\\iotest.txt");
		byte[] data = "ABCDEFGHIJKLMNOP".getBytes();
		out.write(data, 0, 5);
		
		
	}
}
