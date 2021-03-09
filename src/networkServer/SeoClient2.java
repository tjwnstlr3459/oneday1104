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
		String addr = "1.220.236.74";
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

			
			
			
			StringTokenizer st= new StringTokenizer(dis.readUTF(),"\n");
			while(st.hasMoreTokens()) {
			String str = dis.readUTF();
			System.out.println(str);
			String name = "ÀÌÀ±¼ö";
			dos.writeUTF(name);
			}		
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}