package cn.LJ.oop1;
/**
 * ������д
 * @author �
 *
 */
public class Test_override {
	public static void main(String[] args) {
		house a=new house();
		a.run();
	}
}
class text{				//text��house���������ֱ���text��Text,�������ֲ��ˣ������
	
	public void run() {
		System.out.println("���ܡ�������");
	}
	
	public void stop() {
		System.out.println("վס����������");
	}
	
	public Person chengke() {
		return new Person();
	}
	
}
class house extends text{			//��д���෽��
	public void run() {
		System.out.println("�ܰ���������������");
	}
	
	public Student chengke() {			//Student����С��Person���Կ�����д�����ʱObject���У�Object���ڣ����ڣ�Person��
		return new Student();
	}
}