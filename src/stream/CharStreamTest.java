package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {

	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		sc.nextLine();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\���ؽ�\\Desktop\\"+fileName);
			System.out.println("'"+fileName+"' ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" :");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				fw.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		BufferedWriter bw = null;	//���� ��Ʈ��
		
		try {
			//�ֽ�Ʈ�� ����
			FileWriter fw = new FileWriter(fileName);
			//������ �ֽ�Ʈ���� �̿��� ������Ʈ�� ����
			bw = new BufferedWriter(fw);
			System.out.println("["+fileName+"] ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			int lineNumber = 1;
			while(true) {
				System.out.println((lineNumber++)+" : ");
				String str = sc.nextLine();	//\r\n�� ����
				if(str.equals("exit")){
					break;
				}
				bw.write(str);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//���Ͽ��� ���α׷����� ������
	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		//1.��Ʈ������(��ü�� ����)
		//2.�޼ҵ带 �̿��� �Է� or ���
		//3. �ڿ���ȯ
		System.out.print("�ε� �� ���ϸ� �Է� :");
		String fileName = sc.next();
		sc.nextLine();
		//�����͸� �о�� �����̹Ƿ� Reader���
		BufferedReader br = null;
		
		try {
			//�ֽ�Ʈ������
			FileReader fr = new FileReader(fileName);
			//�ֽ�Ʈ���� �̿��Ͽ� ������Ʈ������
			br = new BufferedReader(fr);
			while(true) {
				//���Ͽ��� 1���� �о��
				//���̻� �о�ð��� ������ null�� ����
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}



























