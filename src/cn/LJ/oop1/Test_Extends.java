package cn.LJ.oop1;
/**
 * ���Լ̳�
 * @author �
 *
 */
public class Test_Extends {
	public static void main(String[] args) {
		
		Student stu=new Student();//��������ʱ���ȵ��ø��๹�췽�����ٵ�������
		//stu.rest();
		stu.study();//�����д˷���ʱ���������෽����û��ʱ���ø��෽��
		System.out.println(stu instanceof Person);
		System.out.println(new Person() instanceof Student);
	}

}
class Person{
	String name;
	int age;
	public Person() {
		System.out.println("���๹�췽����д");
	}
	public void study() {
		System.out.println("��Ҫ˯��������ѧJava");
	}
}
class Student extends Person{
	
	public Student() {
		System.out.println("���๹�췽����д");
	}
	public void study() {
		System.out.println("��������ѧ��");
	}
	
}