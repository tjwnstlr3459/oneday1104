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
		//1. ���� �������ּ� / ��Ʈ��ȣ ����
		String serverIp = "172.30.1.7";
		int severPort = 7777;
		
		Socket socket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			//2. ������ ���� �����ǿ� ��Ʈ�� ���ϰ�ü�� �����ϸ鼭 ��û
			socket = new Socket(serverIp, severPort);
			System.out.println("���� ���� �Ϸ�!");
			//3. ������ �Է� �� ��� ��Ʈ������
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//4. ������Ʈ���� ���� ���ɰ���
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			//5. ��Ʈ���� ���� �Է� �� ���
			while(true) {
			String serverMsg = dis.readUTF();
			System.out.println("server : "+ serverMsg);
			System.out.print("�Է� : ");
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
