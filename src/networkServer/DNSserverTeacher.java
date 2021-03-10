package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class DNSserverTeacher {

	private int count;

	public void main() {
		HashMap<String , String> dns = new HashMap<>();
		dns.put("www.naver.com", "125.209.222.142");
//	case "www.naver.com":
//		 dos.writeUTF("125.209.222.142");
//		break;
//	case "www.google.com ":
//		dos.writeUTF("172.217.175.4");
//		break;
//	case "www.iei.or.kr":
//		dos.writeUTF("211.43.14.187");
		int port = 8787;
		ServerSocket server = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
			server = new ServerSocket(port);
			System.out.println("DNS 서버 준비 완료");
			
			System.out.println("클라이언트 요청 대기...");
			Socket client = server.accept();
			
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			
			String domain = dis.readUTF();
			if(dns.containsKey(domain)) {
				dos.writeUTF(domain+"의 주소는 "+dns.get(domain)+"입니다.");
			}else {
				dos.writeUTF("주소가 없습니다.");
			}
			System.out.println("요청"+ (count++)+"건 처리완료");
			System.out.print("서버를 종료하시겠습니까?[y/s]");
			String str = sc.next();
			if(str.equals("y")) {
				break;
			}else if(str.equals("n")) {
				continue;
			}else {
				break;
			}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				dos.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
