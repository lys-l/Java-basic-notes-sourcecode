package cn.LJ.oop1;
/**
 * ����super����
 * @author �
 *
 */
public class Test_super02 {
	public static void main(String[] args) {
		System.out.println("����ѧJava��");
		new csup();
	}
}
class fsup{
	public fsup() {
		System.out.println("����ѧJava����Ҫ������");
	}
}
class csup extends fsup{
	public csup() {
		//Ĭ��ʹ��super();
		System.out.println("��������ѧ���㲻�������");
	}
}
