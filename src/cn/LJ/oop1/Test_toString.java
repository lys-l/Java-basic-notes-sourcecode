package cn.LJ.oop1;
/**
 * 测试toString方法
 * @author 李劲
 *
 */
public class Test_toString {
	public static void main(String[] args) {
		
		Test_toString to=new Test_toString();
		System.out.println(to.toString());
		
		ceshi p=new ceshi("李劲",20);
		System.out.println(p.toString());
	}
	public String toString() {
		return "测试Object方法";
	}

}
class ceshi{
	String name;
	int age;
	public String toString() {
		return name+",年龄："+age;
	}
	public ceshi(String name,int age) {
		this.name=name;
		this.age=age;
	}
}