package cn.LJ.oop1;
/**
 * 数组的用法
 * @author 李劲
 *
 */
public class Test_Array {
	public static void main(String[] args) {
		
		////数组的使用
		int[] a=new int[10];
		a[0]=1;
		for(int i=0;i<a.length;i++)
			a[i]=i*10;
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
		System.out.println();
		shuzu[] sz=new shuzu[3];
		sz[0]=new shuzu(20,"李劲");
		sz[1]=new shuzu(20,"李云浩");
		sz[2]=new shuzu(20,"周海朋");
		for(int i=0;i<sz.length;i++)
		System.out.print(sz[i].getName());
		System.out.println();
		////数组的初始化:
		//静态初始化
		shuzu[] sz1= {	new shuzu(16,"李劲"),
						new shuzu(13,"周海朋"),
						new shuzu(15,"李云浩")
						};
		System.out.println(sz1[0].getAge());
		//默认初始化:整型全为0、字符型全为null、Boolean型全为false
		int[] sz2=new int[3];
		System.out.println(sz2[0]);
		//动态初始化
		int[] sz3=new int[2];
		sz3[0]=1;
		sz3[1]=1;
		
		//数组的遍历
		for(int i=0;i<a.length;i++)
			a[i]=i*10;
		for(int i=0;i<a.length;i++)	
		System.out.print(a[i]);
		System.out.println();
		//foreach循环
		for(int m:a) {
			System.out.print(m);
		}
	}
	
}
class shuzu{
	private int age;
	private String name;
	//构造函数
	public shuzu(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
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
	
	
}