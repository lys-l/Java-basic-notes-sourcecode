package cn.LJ.oop1;
/**
 * ���Է�װ
 * @author �
 *
 */
public class Test_Encapsulation {
	public static void main(String[] args) {
		
		fenz a=new fenz();
		//a.age=20;	age��˽�����ԣ�����ֱ�Ӹ�ֵ��
		a.setAge(20);
		System.out.println(a.getAge());
	}

}
class fenz{
	private int age;
	private String name;
	private boolean man;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
}