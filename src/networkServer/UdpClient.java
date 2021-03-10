package networkServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
	public void main() {
		//1. ���� ��Ʈ��ȣ ����
		int serverPort = 9090;
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket();//��Ʈ �ȳ־��
			//���������� ����
			InetAddress serverIp = InetAddress.getByName("172.30.1.7");
			String msg = "�ȳ� �� UDP Ŭ���̾�Ʈ��!";
			byte[] outMsg = msg.getBytes();//���� �޼����� ����Ʈ�迭�� ��ȯ
			//�����͸� ���������� ��ü����
			DatagramPacket outPacket 
			= new DatagramPacket(outMsg, outMsg.length,serverIp,serverPort);
			socket.send(outPacket); //������ ������ ����
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








