package cn.LJ.oop2;
/**
 * 内存分析
 * @author 李劲
 *
 */
public class Test_Memory {
	
	public static void main(String[] args) {
		Animal a=new Cat();
		Cat a2 = (Cat)a;
		testAnimalVoice(a2);
	}
	public static void testAnimalVoice(Animal c) {
		c.voice();
		if(c instanceof Cat) {
			((Cat)c).catchMouse();
		}
	}
	
}
class Animal{
	String str;
	public void voice() {
		System.out.println("动物叫声：");
	}
}
class Cat extends Animal{
	public void voice() {
		System.out.println("喵喵喵~~~~");
	}
	public void catchMouse() {
		System.out.println("抓老鼠~~~~");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.println("汪汪汪~~~");
	}
	public void seeDoor() {
		System.out.println("看门~~~~~");
	}
}