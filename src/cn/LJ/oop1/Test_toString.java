package cn.LJ.oop1;
/**
 * ����toString����
 * @author �
 *
 */
public class Test_toString {
	public static void main(String[] args) {
		
		Test_toString to=new Test_toString();
		System.out.println(to.toString());
		
		ceshi p=new ceshi("�",20);
		System.out.println(p.toString());
	}
	public String toString() {
		return "����Object����";
	}

}
class ceshi{
	String name;
	int age;
	public String toString() {
		return name+",���䣺"+age;
	}
	public ceshi(String name,int age) {
		this.name=name;
		this.age=age;
	}
}