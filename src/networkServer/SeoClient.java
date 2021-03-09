package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SeoClient {
	public void main() {
		int port = 4448;
		String addr = "172.30.1.7";
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("====��Ʈ��ũ ���α׷��� �ǽ�====");
			System.out.println("1. ä�� Ŭ���̾�Ʈ ����");
			System.out.println("2. DNS Ŭ���̾�Ʈ ����");
			System.out.print("����>>");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				sc.nextLine();
				try {
					socket = new Socket(addr, port);
					System.out.println("���� ���� �Ϸ�");

					OutputStream out = socket.getOutputStream();
					InputStream in = socket.getInputStream();

					dis = new DataInputStream(in);
					dos = new DataOutputStream(out);

					while (true) {
						
						String serverMsg = dis.readUTF();
						if(serverMsg.equals("exit")) {
							System.out.println("ä���� ����Ǿ����ϴ�.");
							socket.close();							
							dis.close();
							
							break;
						}else {
						System.out.println("���� : " + serverMsg);
						System.out.print("�� : ");
						String str = sc.nextLine();
						if (str.equals("exit")) {
							System.out.println("ä���� ����Ǿ����ϴ�.");
							dos.writeUTF("exit");
							socket.close();							
							dis.close();
							break;
						}else {
							dos.writeUTF(str);
						}
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						dis.close();
						dos.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 2:
				try {
					socket = new Socket(addr, port);

					OutputStream out = socket.getOutputStream();
					InputStream in = socket.getInputStream();

					dis = new DataInputStream(in);
					dos = new DataOutputStream(out);

					String str = dis.readUTF();
					System.out.print(str);
					String domain = sc.next();
					dos.writeUTF(domain);
					System.out.println("������ ����");
					
					String ServerDomain = dis.readUTF();
					System.out.println(domain+"�� �ּҴ� "+ServerDomain+"�Դϴ�");
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						dis.close();
						dos.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			}
		}

	}
}
