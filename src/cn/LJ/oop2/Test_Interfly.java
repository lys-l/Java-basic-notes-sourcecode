package cn.LJ.oop2;
/**
 * �ӿھ���
 * @author �
 *
 */
public interface Test_Interfly {
	int MAX_SPEED=11000;
	int MIN_HEIGHT=1;
	void fly();

}
interface Eat{
	void eat();
}
class Plane implements Test_Interfly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ɻ����Է�~~~~");
	}
	
}
class Person implements Test_Interfly,Eat {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("��Ҫ�ɵĸ���~~~~~");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ö�����Ҫ�Է�~~~~~~");
	}
	
}
/*class Person implements Eat{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ö�����Ҫ�Է�~~~~~~");
	}
	
}*/