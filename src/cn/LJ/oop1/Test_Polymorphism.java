package cn.LJ.oop1;
/**
 * 测试多态及对象的转型
 * @author 李劲
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
		
		AShout a1=new Dog();		//自动向上转型
		DyShout(a1);
		//a1.seedoor();				//a1是狗但是自动向上转型成了AShout，AShout中没有seedoor();
		Dog a2=(Dog)a1;				//强制向下转型：a2是Dog可以用seedoor();
		a2.seedoor();
		
		AShout b1=new Cat();
		DyShout(b1);
		//Dog b=(Dog)b1;				//b1虽然向上转型成了AShout。但之前是猫，转成Dog后虽然没有报错，但是运行时会出错。
	}
	static void DyShout(AShout a) {	//有了它，就可以调用它来实现多态，而不用一直写下方的重载来实现。
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
		System.out.println("叫了一声");
	}
}
class Dog extends AShout{
	public void shout() {
		System.out.println("汪汪汪");
	}
	public void seedoor() {
		System.out.println("看门");
	}
}
class Cat extends AShout{
	public void shout() {
		System.out.println("喵喵喵");
	}
}
