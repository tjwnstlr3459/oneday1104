package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMgr {
	Scanner sc;
	User user;

	public UserMgr() {
		super();
		sc = new Scanner(System.in);
	}
	
	public void main() {
		while(true) {
			System.out.println("1. ���� ���� ���");
			System.out.println("2. ���� ���� ���");
			System.out.println("3. ���� ���� �ҷ�����");
			System.out.println("4. ���� ���� ��������");
			System.out.print("����>>");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				System.out.print("�̸� �Է�:");
				String name = sc.next();
				System.out.print("���� �Է�:");
				int age = sc.nextInt();
				System.out.print("�ּ� �Է�:");
				sc.nextLine();
				String addr = sc.nextLine();
				user = new User(name, age, addr);
				break;
			case 2:
				if(user != null) {
					System.out.println("�̸� : "+user.getName());
					System.out.println("���� : "+user.getAge());
					System.out.println("�ּ� : "+user.getAddr());
				}else {
					System.out.println("ȸ�� ������ �����ϴ�.");
				}
				break;
			case 3:
				objectInput();
				break;
			case 4:
				objectOutput();
				break;
			case 0:
				return;
			default:
				System.out.println("�߸� �Է���");

			}
		}
	}
	public void objectInput() {
		ObjectInputStream ois = null;
		try {
			//����Ʈ �ֽ�Ʈ������
			FileInputStream fis = new FileInputStream("object.txt");
			//��ü�� �о�������� ������Ʈ������
			ois = new ObjectInputStream(fis);
			//��ü�� �о���� �ڵ�
			user = (User)ois.readObject();
			System.out.println("�ҷ����� �Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void objectOutput() {
		ObjectOutputStream oos = null;
		try {
			//����Ʈ �ֽ�Ʈ�� ����
			FileOutputStream fos = new FileOutputStream("object.txt");
			//��ü�� ������������ ������Ʈ�� ����
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user);	//��ü�� �������� �ڵ�
			System.out.println("����Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


























