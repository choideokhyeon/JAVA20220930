package Ch21;

import java.io.*;

public class C03FileCopy {

	public static void main(String[] args) throws Exception {
		
		//File.separator를 \\ 대신에 쓸 수 있다.
		Reader in = new FileReader("C:\\iotest\\original.txt");		//원본
		Writer out = new FileWriter("C:\\iotest\\copyfile.txt");	//복사본
		
		//버퍼 배열
		char buff[] = new char[100];
		
		while(true)
		{
			int cnt = in.read(buff);	//buff 크기만큼 읽어서 buff에 저장한 뒤 읽은 개수를 cnt에 전달
			if(cnt == -1)
				break;
			System.out.println("CNT : " + cnt);
			out.write(buff,0,cnt);
			out.flush();
		}
		out.close();
		
	}
}
