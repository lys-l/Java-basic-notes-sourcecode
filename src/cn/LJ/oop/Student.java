package cn.LJ.oop;

import cn.LJ.oop1.Test_Import;

/**
 * ����������
 * @author NGU
 *
 */
public class Student {
	
	int age;
	int num;
	String name;
	
	Computer pinpai;
	
	void Study() {
		System.out.println("��������ѧ����ѧԺ    "+pinpai.brand);
	}
	
	void Play() {
		System.out.println("��Ϣ����ϵ�������ѧ�뼼��");
	}
	
	public static void main(String[] args) {
		
		Test_Import a=new Test_Import();
		a.impor();//Test_Import�е������
		
		Student stu=new Student();
		Computer c1=new Computer();
		
		c1.brand="����";
		stu.pinpai=c1;
		
		stu.Study();
		stu.Play();
		
		
	}
}
class Computer{
	String brand;
}
