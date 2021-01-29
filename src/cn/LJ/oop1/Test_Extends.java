package cn.LJ.oop1;
/**
 * 测试继承
 * @author 李劲
 *
 */
public class Test_Extends {
	public static void main(String[] args) {
		
		Student stu=new Student();//创建对象时，先调用父类构造方法，再调用子类
		//stu.rest();
		stu.study();//子类有此方法时，调用子类方法，没有时调用父类方法
		System.out.println(stu instanceof Person);
		System.out.println(new Person() instanceof Student);
	}

}
class Person{
	String name;
	int age;
	public Person() {
		System.out.println("父类构造方法重写");
	}
	public void study() {
		System.out.println("我要睡觉，不想学Java");
	}
}
class Student extends Person{
	
	public Student() {
		System.out.println("子类构造方法重写");
	}
	public void study() {
		System.out.println("不，你想学。");
	}
	
}