package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BaseBallClient {
	public void main() {
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket socket = null;
		String ipAddr = "172.30.1.7";
		int port = 3459;
		int count = 0;
			
		
		try {
			socket = new Socket(ipAddr, port);
			
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			
			System.out.println("<<<<BaseBall Game>>>>");
			System.out.println("<<<<Game Start>>>>");
			
			while(true) {
			for (int i = 0; i < 3; i++) {
				System.out.print(i+1+"번째 숫자 입력 :");
				int CliNum = sc.nextInt();
				dos.writeInt(CliNum);		
			}
			int strike = dis.readInt();
			int ball = dis.readInt();
			
			int num1 = dis.readInt();
			int num2 = dis.readInt();
			int num3 = dis.readInt();
			
			System.out.println(count+++"회--->"+strike+"스트라이크"+ball+"볼");
			if(count==11) {
				System.out.println("10회--->기회를 모두 사용했습니다. 정답은"+num1+" "+num2+" "+num3);
				System.out.println("프로그램을 종료합니다");
				socket.close();
				dos.close();
				dis.close();
				//dos.writeUTF("exit");
				break;
			}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
