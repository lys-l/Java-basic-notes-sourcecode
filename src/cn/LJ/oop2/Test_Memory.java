package cn.LJ.oop2;
/**
 * �ڴ����
 * @author �
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
		System.out.println("���������");
	}
}
class Cat extends Animal{
	public void voice() {
		System.out.println("������~~~~");
	}
	public void catchMouse() {
		System.out.println("ץ����~~~~");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.println("������~~~");
	}
	public void seeDoor() {
		System.out.println("����~~~~~");
	}
}