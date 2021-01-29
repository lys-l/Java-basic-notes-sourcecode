package cn.LJ.Servlet;
/**
 * 模拟Servlet中方法的调用
 * @author 李劲
 *
 */
public class Test_Ser {
	public static void main(String[] args) {
		Test_Servlet s=new Test_MyServlet();
		s.service();
	}
}