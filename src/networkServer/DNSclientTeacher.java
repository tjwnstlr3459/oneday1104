package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class DNSclientTeacher {
	public void main() {
		Scanner sc = new Scanner(System.in);
		String serverIp = "172.30.1.7";
		int serverPort = 8787;
		Socket socket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			socket = new Socket(serverIp, serverPort);
			
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			
			System.out.print("도메인 주소를 입력:");
			String str = sc.next();
			dos.writeUTF(str);
			
			String serverMgs = dis.readUTF();
			System.out.println(serverMgs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				dos.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
