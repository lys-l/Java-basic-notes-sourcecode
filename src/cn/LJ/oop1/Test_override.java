package cn.LJ.oop1;
/**
 * 测试重写
 * @author 李劲
 *
 */
public class Test_override {
	public static void main(String[] args) {
		house a=new house();
		a.run();
	}
}
class text{				//text和house这两个名字别用text和Text,好像区分不了，会出错。
	
	public void run() {
		System.out.println("快跑。。。。");
	}
	
	public void stop() {
		System.out.println("站住。。。。。");
	}
	
	public Person chengke() {
		return new Person();
	}
	
}
class house extends text{			//重写父类方法
	public void run() {
		System.out.println("跑啊啊。。。。。。");
	}
	
	public Student chengke() {			//Student类型小于Person所以可以重写。如果时Object则不行，Object大于（高于）Person。
		return new Student();
	}
}