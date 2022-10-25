package Ch21;

import java.io.*;

public class C01Writer {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter("C:\\iotest\\test.txt", true);
		//뒤에 true를 붙이면 실행시마다 기존 내용이 유지되고 추가 내용이 누적됨
		//기본적으로는 false상태라서 덮어쓰기 되어버림
		
		out.write("aaa\n");
		out.write("bbb\n");
		out.write("ccc\n");
		
		out.flush();	//버퍼 초기화
		out.close();	//스트림 제거
	}
}
