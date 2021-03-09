package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public void main() {
		//1. 서버 아이피주소 / 포트번호 지정
		String serverIp = "172.30.1.7";
		int severPort = 7777;
		
		Socket socket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			//2. 지정된 서버 아이피와 포트로 소켓객체를 생성하면서 요청
			socket = new Socket(serverIp, severPort);
			System.out.println("서버 접속 완료!");
			//3. 서버와 입력 및 출력 스트림생성
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//4. 보조스트림을 통한 성능개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			//5. 스트림을 통한 입력 및 출력
			while(true) {
			String serverMsg = dis.readUTF();
			System.out.println("server : "+ serverMsg);
			System.out.print("입력 : ");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
			if(msg.equals("exit")) {
				break;	
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
