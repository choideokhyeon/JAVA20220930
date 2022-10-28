package Ch27;

import java.net.Socket;

public class ClientChat {
	
	public static void main(String[] args) throws Exception {
		// 1
		Socket client = new Socket("192.168.3.254", 9999);

		// 3 송수신 스레드객체 생성
		ClientRecvThread recv = new ClientRecvThread(client);
		ClientSndThread send = new ClientSndThread(client);
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);

		// 4 스레드 실행
		th1.start();
		th2.start();
		
	}
	
}
