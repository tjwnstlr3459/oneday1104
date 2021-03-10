package networkServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class BaseBallServer {
	public void main() {

		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ServerSocket server = null;
		Random r = new Random();

		int serverPort = 3459;

		try {
			while (true) {
				server = new ServerSocket(serverPort);
				System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��ϴ�....");

				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");

				OutputStream out = client.getOutputStream();
				InputStream in = client.getInputStream();

				dis = new DataInputStream(in);
				dos = new DataOutputStream(out);

				int num1 = r.nextInt(8) + 1;
				int num2 = r.nextInt(8) + 1;
				int num3 = r.nextInt(8) + 1;

				int strike = 0;
				int ball = 0;
				int count = 0;
				
				int cliNum1 = 0;
				int cliNum2 = 0;
				int cliNum3 = 0;

				while (true) {
					if (num1 == num2 || num2 == num3 || num3 == num1) {
						num1 = r.nextInt(8) + 1;
						num2 = r.nextInt(8) + 1;
						num3 = r.nextInt(8) + 1;
					} else {
						break;
					}
				}
				System.out.println("�������� : " + num1 + " " + num2 + " " + num3);
				System.out.println("<<<Game Start>>>");

				while (true) {
					while (true) {
						cliNum1 = dis.readInt();
						if (cliNum1 == num1) {
							strike++;
							break;
						} else if (cliNum1 == num2 || cliNum1 == num3) {
							ball++;
							break;
						} else {
							break;
						}
					}
					while (true) {
						cliNum2 = dis.readInt();
						if (cliNum2 == num2) {
							strike++;
							break;
						} else if (cliNum2 == num1 || cliNum2 == num3) {
							ball++;
							break;
						} else {
							break;
						}
					}
					while (true) {
						cliNum3 = dis.readInt();
						if (cliNum3 == num3) {
							strike++;
							break;
						} else if (cliNum3 == num1 || cliNum3 == num2) {
							ball++;
							break;
						} else {
							break;
						}
					}

					dos.writeInt(strike);
					dos.writeInt(ball);
					
					dos.writeInt(num1);
					dos.writeInt(num2);
					dos.writeInt(num3);

					System.out.println("Ŭ���̾�Ʈ�� �Է��� �� : "+cliNum1+" "+cliNum2+" "+cliNum3);
					System.out.println(count+"ȸ"+strike + "��Ʈ����ũ" + ball + "��");
					strike = 0;
					ball = 0;
					count++;
					if (count == 11) {
						System.out.println("�õ�Ƚ�� 10ȸ�� Ŭ���̾�Ʈ ������ �����մϴ�.");
						server.close();
						dis.close();
						dos.close();
						break;
					}
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

	}
}
