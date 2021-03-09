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
			System.out.println("====네트워크 프로그래밍 실습====");
			System.out.println("1. 채팅 클라이언트 시작");
			System.out.println("2. DNS 클라이언트 시작");
			System.out.print("선택>>");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				sc.nextLine();
				try {
					server = new ServerSocket(port);
					System.out.println("서버 준비 완료");
					System.out.println("클라이언트 접속 요청을 기다립니다.");
					Socket client = server.accept();
					System.out.println("클라이언트 접속 완료");

					OutputStream out = client.getOutputStream();
					InputStream in = client.getInputStream();

					dos = new DataOutputStream(out);
					dis = new DataInputStream(in);

					while (true) {
						System.out.print("나 : ");
						String str = sc.nextLine();
						if(str.equals("exit")) {
							System.out.println("채팅이 종료되었습니다.");
							dos.writeUTF("exit");
							server.close();						
							dis.close();
							
							break;
						}else {
						dos.writeUTF(str);
						String clientMsg = dis.readUTF();
						if (clientMsg.equals("exit")) {
							System.out.println("채팅이 종료되었습니다.");
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
						System.out.println("DNS서버 준비 완료");
						System.out.println("클라이언트 접속 요청을 기다립니다.");
						Socket client = server.accept();
						
						OutputStream out = client.getOutputStream();
						InputStream in = client.getInputStream();
						
						dos = new DataOutputStream(out);
						dis = new DataInputStream(in);
						
						String str2 = "알고싶은 도메인주소를 입력하세요 : ";
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
							dos.writeUTF("존재하지 않는 도메인주소입니다.");
							break;
						}
						System.out.println("클라이언트에 도메인주소 전송");
							
						System.out.println("요청" + (count++) + "건 처리 완료");
						System.out.print("서버를 종료하시겠습니까?[y/n] : ");
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
