package cn.LJ.oop2;
/**
 * 接口（比抽象类还要抽象的类）
 * @author 李劲
 *
 */
public interface Test_Interface {
	//抽像类中还可以写非抽象方法（实现一定的功能），接口则只能写抽象方法和常量。
	
	//只有常量和抽象方法。
	/*public static final:系统默认一定有这三个单词*/String MAX_G="BOSS";
	int MAX_S=120;
	
	public/*public可写可不写，一定是公开的，不能定义为private*/ void test01();
	public int text02(int a,int b);
	//实现规范和实现分离，多人协作时实现分工。
	
	//在多个对象中找共同点时，由于继承只能单继承，所以只能用接口来实现。
}