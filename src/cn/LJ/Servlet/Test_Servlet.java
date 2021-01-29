package cn.LJ.Servlet;
/**
 * 模拟Servlet中方法的调用
 * @author 李劲
 *
 */
public class Test_Servlet {
	public void service() {
		System.out.println("我是第一个service();"); 
		doGet();
	}
	
	public void doGet() {
		System.out.println("我是第一个doGet();");
	}
}
