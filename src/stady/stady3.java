package stady;

/**
 * 面向对象基础
 * 
 * @author NGU
 *
 */
public class stady3 {

	// 属性
	int id;
	int age;
	String name;
	Computer comp;

	// 方法
	void study() {
		System.out.println("########" + comp.brand);
	}

	void play() {
		System.out.println("nihao ");
	}

	// 构造方法
	stady3() {
	}

	// 程序执行的入口
	public static void main(String[] args) {
		stady3 stu = new stady3(); // 创建一个对象
		stu.id = 10001;
		stu.age = 18;
		stu.name = "李劲";
		System.out.println(stu.id + " " + stu.age + " " + stu.name);
		Computer a = new Computer();
		a.brand = "lenovo";

		stu.comp = a;
		stu.play();
		stu.study();
	}
}

class Computer {
	String brand;
}