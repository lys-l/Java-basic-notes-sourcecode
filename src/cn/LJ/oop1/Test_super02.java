package cn.LJ.oop1;
/**
 * 测试super方法
 * @author 李劲
 *
 */
public class Test_super02 {
	public static void main(String[] args) {
		System.out.println("你想学Java吗？");
		new csup();
	}
}
class fsup{
	public fsup() {
		System.out.println("不想学Java，我要玩王者");
	}
}
class csup extends fsup{
	public csup() {
		//默认使用super();
		System.out.println("不，你想学，你不想打王者");
	}
}
