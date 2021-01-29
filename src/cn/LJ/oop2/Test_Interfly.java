package cn.LJ.oop2;
/**
 * 接口举例
 * @author 李劲
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
		System.out.println("飞机可以飞~~~~");
	}
	
}
class Person implements Test_Interfly,Eat {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我要飞的更高~~~~~");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("好饿，我要吃饭~~~~~~");
	}
	
}
/*class Person implements Eat{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("好饿，我要吃饭~~~~~~");
	}
	
}*/