package study;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class BankApp {
	//static Bank b = new Bank();�� ��ü�迭�� �ٲ�
	//static Bank[] b = new Bank[10]; //��ü�迭(�����迭)
	//�����迭(vector)
	static Vector b = new Vector();
	static Scanner s = new Scanner(System.in);
	
	//1. ���»��� �޼ҵ� ����(createAccount)
	static void createAccount() {
		System.out.println("==���»���==");
		System.out.print("���¹�ȣ : ");
		String number = s.next();
		System.out.print("������ : ");
		String name = s.next();
		System.out.print("�ʱ��Աݾ� : ");
		int count = s.nextInt();
		
		Bank cnt = new Bank(number, name, count);
		b.add(cnt);		//�������� bank�� ����Ǿ��ִ� �ּҸ� vectorŬ������ �߰��ϰ� �� 
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		
	}//createaccount����
	
	//2. ���¸�� �޼ҵ� ����(accountlist)
	static void accountlist() {
		System.out.println("==���¸��==");
		for(int i=0; i<b.size(); i++ ) {
			Bank bnk = (Bank)b.get(i);
			if(bnk!=null) {
				System.out.print(bnk.getNumber()+" ");
				System.out.print(bnk.getName()+" ");
				System.out.println(bnk.getCount());	
			}
			
		}//for ����
		
	}//accountlist ����
	
	//3. ���� �޼ҵ� ���� deposit
	static void deposit() {
		System.out.print("���¹�ȣ>");
		String number = s.next();
		System.out.print("���ݾ�>");
		int money = s.nextInt();
		Bank bnk = findaccount(number);
		if(bnk==null) {
			System.out.println("�ش��ϴ� ���°� �����ϴ�.");
		}else {
		//Ű����� �Է��� ���¹�ȣ�� bankŬ������ �ִ� ���¹�ȣ�� ������
			bnk.setCount(bnk.getCount() + money);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
		}
		
	}//deposit ����
	
	//4. ��� �޼ҵ� ���� withdraw
	static void withdraw() {
		System.out.print("���¹�ȣ>");
		String number = s.next();
		System.out.print("��ݾ�>");
		int money = s.nextInt();
		Bank bnk = findaccount(number);
		if(bnk==null) {
			System.out.println("�ش��ϴ� ���°� �����ϴ�.");
		}else {
		//Ű����� �Է��� ���¹�ȣ�� bankŬ������ �ִ� ���¹�ȣ�� ������
			bnk.setCount(bnk.getCount() - money);
			System.out.println("���: ����� �����Ǿ����ϴ�.");
		}
		
	}//withdraw ����
	
	//���¹�ȣ ã�� �޼ҵ� ���� findaccount
	static Bank findaccount(String number) {
		// bank Ŭ������ �ִ� ���¹�ȣ�� Ű����� �Է��� ���¹�ȣ�� ������
		Bank bnk = null;
		for(int i=0;i<b.size(); i++) {
			//bankŬ������ �ִ� ���¹�ȣ
			if(b.get(i)!=null) {
				bnk = (Bank)b.get(i);
				String Arraynum = bnk.getNumber();
				//Ű����� �Է��� ���¹�ȣ(�Ű������� ���� �Ѿ�� number)
				//BankŬ������ �ִ� ���¹�ȣ(Arraynum) == Ű����� �Է��� ���¹�ȣ
				if(Arraynum.equals(number)) {
					bnk = (Bank)b.get(i);
				}
			}

		}//for ����
		return bnk;
	}//findaccount ����
	
	
	public static void main(String[] args) {
		//main�޼ҵ�� static�� �ֱ� ������ Ŭ���� �޼ҵ尡 �ȴ�
		//void createaccoutn()�޼ҵ�� �ν��Ͻ��� ȣ���� �ȵȴ�.
		//���� static void createaccount()�� �ؼ� ȣ���Ѵ�.
		while(true) {
			System.out.println("~~~~~~~~~~~~");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����|");
			System.out.println("~~~~~~~~~~~~");
			System.out.print("����>");
			int select = s.nextInt();
			
			if(select==1) { //1�� �Է��ϸ�
				createAccount();
			}
			else if(select==2) {
				accountlist();
			}
			else if(select==3) {
				deposit();
			}
			else if(select==4) {
				withdraw();
			}
			else if(select==5) {
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("1~5���߿��� �������ּ���");
			}
		}//while�� ����

	}//���θ޼ҵ� ����
}