package networkServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
	public void main() {
		//1. 서버 포트번호 지정
		int serverPort = 9090;
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket();//포트 안넣어도됨
			//서버아이피 지정
			InetAddress serverIp = InetAddress.getByName("172.30.1.7");
			String msg = "안녕 난 UDP 클라이언트야!";
			byte[] outMsg = msg.getBytes();//보낼 메세지를 바이트배열로 변환
			//데이터를 보내기위한 객체생성
			DatagramPacket outPacket 
			= new DatagramPacket(outMsg, outMsg.length,serverIp,serverPort);
			socket.send(outPacket); //서버로 데이터 전송
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			socket.close();
		}
	}
}








