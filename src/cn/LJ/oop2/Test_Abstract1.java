package cn.LJ.oop2;
/**
 * 抽象类及抽象方法的概念
 * @author 李劲
 *
 */
public class Test_Abstract1 {
	public static void main(String[] args) {
		//Test_Abstract a=new Test_Abstract;	不能实例化Test_Abstract
		//抽象类不能构造对象，但可以作为一个类型
		@SuppressWarnings("unused")
		Test_Abstract a=new Abstract();	//可以父类引用指向子类对象
	}

}
