package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class TcpServer {
	public void main() {
		//1. �������� ����� ��Ʈ��ȣ�� ����
		//(0~65535 / 1000	�̳��� �����ȣ�� �����Ƿ� 1000�� ���� ��� ����)
		int port = 7777;
		//��ȯ�� ��ü���� �̸�����
		ServerSocket server = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		//2. ������ ���ϰ�ü�� ���� -> ������ ��Ʈ�� �����鼭 ������ �����°� ����
		
		try {
			//2. ������ ���ϰ�ü�� ���� -> ������ ��Ʈ�� �����鼭 ������ �����°� ����
			//���Ϸ��۷��� ������ ��Ʈ��ȣ�� �Ű������� �����ϸ� �ش���Ʈ ���
			server = new ServerSocket(port);
			System.out.println("���� �غ� �Ϸ�....");
			//3. Ŭ���̾�Ʈ ���� ��û ��� (server.accpet())
			//4. Ŭ���̾�Ʈ ���� ��û�� ������ �����Ͽ� Ŭ���̾�Ʈ�� ���� ���ϰ�ü ����(Socket client)
			System.out.println("Ŭ���̾�Ʈ ���� ��û�� ��ٸ��ϴ�.");
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			//5. ����� Ŭ���̾�Ʈ�� �Է� �� ��½�Ʈ�� ����
			//��ü�� ���� ����°��� �ƴ϶� ���Ͽ� ������� ��Ʈ���� �������� ����
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			//6. ������Ʈ���� ���� ���� ����
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			//7. ��Ʈ���� ���� ������ �Է� �� ���
			while(true) {
				System.out.print("�Է� : ");
				String msg = sc.nextLine();
				dos.writeUTF(msg);
				String clientMsg = dis.readUTF();
				System.out.println("client : "+clientMsg);
				if(msg.equals("exit")) {				
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}























