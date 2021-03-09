package networkServer;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SeoServer {

	public void main() {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ServerSocket server = null;
		Scanner sc = new Scanner(System.in);
		int port = 4448;

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
					server = new ServerSocket(port);
					System.out.println("���� �غ� �Ϸ�");
					System.out.println("Ŭ���̾�Ʈ ���� ��û�� ��ٸ��ϴ�.");
					Socket client = server.accept();
					System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");

					OutputStream out = client.getOutputStream();
					InputStream in = client.getInputStream();

					dos = new DataOutputStream(out);
					dis = new DataInputStream(in);

					while (true) {
						System.out.print("�� : ");
						String str = sc.nextLine();
						if(str.equals("exit")) {
							System.out.println("ä���� ����Ǿ����ϴ�.");
							dos.writeUTF("exit");
							server.close();						
							dis.close();
							
							break;
						}else {
						dos.writeUTF(str);
						String clientMsg = dis.readUTF();
						if (clientMsg.equals("exit")) {
							System.out.println("ä���� ����Ǿ����ϴ�.");
							server.close();							
							dis.close();
			
							break;
						}else {	
						System.out.println("client : " + clientMsg);
						}
						}
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						dos.close();
						dis.close();
						server.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case 2:
				try {
					while (true) {
						int count = 1;
						server = new ServerSocket(port);
						System.out.println("DNS���� �غ� �Ϸ�");
						System.out.println("Ŭ���̾�Ʈ ���� ��û�� ��ٸ��ϴ�.");
						Socket client = server.accept();
						
						OutputStream out = client.getOutputStream();
						InputStream in = client.getInputStream();
						
						dos = new DataOutputStream(out);
						dis = new DataInputStream(in);
						
						String str2 = "�˰���� �������ּҸ� �Է��ϼ��� : ";
						dos.writeUTF(str2);
						
						String domain =dis.readUTF();
						switch (domain) {
						case "www.naver.com":
							 dos.writeUTF("125.209.222.142");
							break;
						case "www.google.com ":
							dos.writeUTF("172.217.175.4");
							break;
						case "www.iei.or.kr":
							dos.writeUTF("211.43.14.187");
							break;
						default:
							dos.writeUTF("�������� �ʴ� �������ּ��Դϴ�.");
							break;
						}
						System.out.println("Ŭ���̾�Ʈ�� �������ּ� ����");
							
						System.out.println("��û" + (count++) + "�� ó�� �Ϸ�");
						System.out.print("������ �����Ͻðڽ��ϱ�?[y/n] : ");
						char ch = sc.next().toLowerCase().charAt(0);
						if (ch == 'n') {
							continue;
						} else {
							break;
						}	
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						server.close();
						dis.close();
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			default:
				break;
			}
		}

	}
}
