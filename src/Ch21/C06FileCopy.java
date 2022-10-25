package Ch21;

import java.io.*;

public class C06FileCopy {

	public static void main(String[] args) throws Exception{
		InputStream in = new FileInputStream("C:\\iotest\\city.jpg");
		OutputStream out = new FileOutputStream("C:\\iotest\\copy.jpg");
		
		byte [] buff = new byte[4096];
		
//		while(true)
//		{
//			int cnt = in.read(buff);	//buff크기만큼 읽어와서 buff에 저장, 읽은 개수를 리턴
//			if(cnt == -1)
//				break;
//			out.write(buff, 0, cnt);
//			out.flush();
//		}
		
		
		int cnt = 0;
		while((cnt = in.read(buff)) != -1)
		{
			out.write(buff, 0, cnt);
			out.flush();
		}

	}
}
