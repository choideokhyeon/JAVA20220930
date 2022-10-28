package Ch25;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(7070);	//192.168.3.6:5050
		System.out.println("Server Start");

		
		while(true){
			Socket client = server.accept();
			
			System.out.println(client.getInetAddress() + " 에서 접속했습니다");
			OutputStream out = client.getOutputStream();
			DataOutputStream Dout = new DataOutputStream(out);
			Dout.writeUTF("Server 접속이 확인되었습니다 - from 학생컴");
			Dout.flush();
//			server.close();
			client.close();
		}
	
		
	}
}
