package cn.LJ.oop2;
/**
 * 抽象类及抽象方法的概念
 * @author 李劲
 *
 */
public abstract class Test_Abstract {	//抽象类
	
	//抽象方法的意义：将方法的设计和方法的实现分离。
	String name;
	public abstract void run();		//抽象方法	方法的设计
	public void a() {
		System.out.println("我是普通方法~~~");
		run();			//到时候调的时候是子类对象被调用。
	}
	//自己加个构造器。也不能实例化Test_Abstract，不能用new实例化抽象类
	public Test_Abstract() {
		System.out.println("创造~~~~~");
	}

}
class Abstract extends Test_Abstract{	//方法的实现

	@Override
	public void run() {			//继承抽象类后必须重写子类的抽象方法。
		// TODO Auto-generated method stub
		
	}
	
}