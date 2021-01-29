package cn.LJ.oop;

import cn.LJ.oop1.Test_Import;

/**
 * 面向对象基础
 * @author NGU
 *
 */
public class Student {
	
	int age;
	int num;
	String name;
	
	Computer pinpai;
	
	void Study() {
		System.out.println("东华理工大学长江学院    "+pinpai.brand);
	}
	
	void Play() {
		System.out.println("信息工程系计算机科学与技术");
	}
	
	public static void main(String[] args) {
		
		Test_Import a=new Test_Import();
		a.impor();//Test_Import中导入的类
		
		Student stu=new Student();
		Computer c1=new Computer();
		
		c1.brand="联想";
		stu.pinpai=c1;
		
		stu.Study();
		stu.Play();
		
		
	}
}
class Computer{
	String brand;
}
