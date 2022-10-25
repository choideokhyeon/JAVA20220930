package Ch21;

import java.io.*;

public class C04OutputStream {

	public static void main(String[] args) throws Exception{
		
		OutputStream out = new FileOutputStream("c:\\iotest\\test.exe");
		out.write('A');
		out.write('B');
		out.write('C');
		out.flush();
		
		
		
	}
}
