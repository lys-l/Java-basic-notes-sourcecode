package cn.LJ.Servlet;
/**
 * ģ��Servlet�з����ĵ���
 * @author �
 *
 */
public class Test_Servlet {
	public void service() {
		System.out.println("���ǵ�һ��service();"); 
		doGet();
	}
	
	public void doGet() {
		System.out.println("���ǵ�һ��doGet();");
	}
}
