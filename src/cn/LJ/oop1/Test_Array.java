package cn.LJ.oop1;
/**
 * ������÷�
 * @author �
 *
 */
public class Test_Array {
	public static void main(String[] args) {
		
		////�����ʹ��
		int[] a=new int[10];
		a[0]=1;
		for(int i=0;i<a.length;i++)
			a[i]=i*10;
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
		System.out.println();
		shuzu[] sz=new shuzu[3];
		sz[0]=new shuzu(20,"�");
		sz[1]=new shuzu(20,"���ƺ�");
		sz[2]=new shuzu(20,"�ܺ���");
		for(int i=0;i<sz.length;i++)
		System.out.print(sz[i].getName());
		System.out.println();
		////����ĳ�ʼ��:
		//��̬��ʼ��
		shuzu[] sz1= {	new shuzu(16,"�"),
						new shuzu(13,"�ܺ���"),
						new shuzu(15,"���ƺ�")
						};
		System.out.println(sz1[0].getAge());
		//Ĭ�ϳ�ʼ��:����ȫΪ0���ַ���ȫΪnull��Boolean��ȫΪfalse
		int[] sz2=new int[3];
		System.out.println(sz2[0]);
		//��̬��ʼ��
		int[] sz3=new int[2];
		sz3[0]=1;
		sz3[1]=1;
		
		//����ı���
		for(int i=0;i<a.length;i++)
			a[i]=i*10;
		for(int i=0;i<a.length;i++)	
		System.out.print(a[i]);
		System.out.println();
		//foreachѭ��
		for(int m:a) {
			System.out.print(m);
		}
	}
	
}
class shuzu{
	private int age;
	private String name;
	//���캯��
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