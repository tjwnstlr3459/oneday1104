package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {

	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		sc.nextLine();	//���� ��������
		
		FileOutputStream fis = null;	
		//���α׷�->���Ϸ� �����͸� �����ϴ� ��ü
		
		try {
			//�Է¹��� ���ϸ����� ���ϻ���->������ ���ϰ� Stream����
			fis = new FileOutputStream(fileName);
			System.out.println("["+fileName+"] ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";	
				//\r\n ->window����ó�� ���ڸ� ������
				if(str.equals("exit\r\n")){
					break;
				}
				//���Ͽ� �Է¹��� ���� ���� �޼ҵ�
				//getBytes() -> ���ڿ��� ����Ʈ�迭�� ��ȯ
				fis.write(str.getBytes());	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();	//������ ��ȯ�� ����� �ٸ��������� ��밡��
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}





















