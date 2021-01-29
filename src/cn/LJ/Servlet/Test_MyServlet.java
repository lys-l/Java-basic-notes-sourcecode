package cn.LJ.Servlet;
/**
 * 模拟Servlet中方法的调用
 * @author 李劲
 *
 */
public class Test_MyServlet extends Test_Servlet{
	public void doGet() {
		 System.out.println("我是重写后的doGet();");
	}
}
