package networkServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
	public void main() {
		//1. �������� ����� ��Ʈ��ȣ ����
		int port = 9090;
		
		DatagramSocket socket = null;
		
		try {
			//2. DatagramSocket��ü ����(UDP ��Ʈ ����)
			socket = new DatagramSocket(port);
			System.out.println("���� ���� ���� �Ϸ�");
			//Ŭ���̾�Ʈ�� ���� �����͸� �����ϱ� ���� �����������
			byte[] inMsg = new byte[1024];
			
			//Ŭ���̾�Ʈ�� ���� �����͸� �ޱ����� ��ü
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);//Ŭ���̾�Ʈ�� ���� �޼����� �ޱ����� ��ٸ�
			String clientMsg = new String(inMsg).trim();//������� �ʴ� �κ��� �߶�
			
			System.out.println(clientMsg);
		} catch (SocketException e) {
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
