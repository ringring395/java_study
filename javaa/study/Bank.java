package study;
import java.util.Scanner;
//��ũ ��ü
public class Bank {
	Scanner s = new Scanner(System.in);
	private String number;	//���¹�ȣ
	private String name;	//������
	private int count;		//�ʱ��Աݾ�
	
	Bank(String num, String na, int c){
		this.number = num;
		this.name = na;
		this.count = c;
	}

	//getter�� setter �޼ҵ� ����
	//static������, �ν��Ͻ� �޼ҵ�
	public String getNumber() {return number;}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {return count;}
	public void setCount(int count) {
		this.count = count;
	}

	

}
