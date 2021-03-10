package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SeoClient2 {
	public void main() {
		int port = 18080;
		String addr = "1.220.236.74";//"172.30.1.7";
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(addr, port);	
			
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);


			while(true) {
				while(true) {
					String str = dis.readUTF();
					System.out.println(str);
					if(str.charAt(str.length()-1)=='?') {
						System.out.print("나의답변 : ");
						String myMsg = sc.next();
						if(myMsg.equals("headset")) {
							int sum = 0;
							for (int i = 0; i < myMsg.length(); i++) {
								char ch = myMsg.charAt(i);
								sum += (int)ch;
							}
							String sum1 = String.valueOf(sum);
							System.out.println(sum1);
							dos.writeUTF(sum1);				
						}else {
						dos.writeUTF(myMsg);
						}
					}
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