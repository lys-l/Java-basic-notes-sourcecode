package cn.LJ.oop1;
/**
 * ���Զ�̬�������ת��
 * @author �
 *
 */
public class Test_Polymorphism {
	public static void main(String[] args) {
		AShout a=new AShout();
		DyShout(a);
		Dog d=new Dog();
		DyShout(d);
		DyShout(new Cat());
		System.out.println("\n");
		
		AShout a1=new Dog();		//�Զ�����ת��
		DyShout(a1);
		//a1.seedoor();				//a1�ǹ������Զ�����ת�ͳ���AShout��AShout��û��seedoor();
		Dog a2=(Dog)a1;				//ǿ������ת�ͣ�a2��Dog������seedoor();
		a2.seedoor();
		
		AShout b1=new Cat();
		DyShout(b1);
		//Dog b=(Dog)b1;				//b1��Ȼ����ת�ͳ���AShout����֮ǰ��è��ת��Dog����Ȼû�б�����������ʱ�����
	}
	static void DyShout(AShout a) {	//���������Ϳ��Ե�������ʵ�ֶ�̬��������һֱд�·���������ʵ�֡�
		a.shout();
	}
	/*
	static void Dshout(Dog a){
		a.shout();
	}
	static void Cshout(Cat a) {
		a.shout();
	}*/

}
class AShout{
	public void shout() {
		System.out.println("����һ��");
	}
}
class Dog extends AShout{
	public void shout() {
		System.out.println("������");
	}
	public void seedoor() {
		System.out.println("����");
	}
}
class Cat extends AShout{
	public void shout() {
		System.out.println("������");
	}
}
