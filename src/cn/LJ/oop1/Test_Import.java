package cn.LJ.oop1;
/**
 * 测试类的导入
 * @author 李劲
 *
 */
public class Test_Import {
	
	public void impor() {		//只有加了public后在别的包里用import导入类才会有用。
	System.out.println("恭喜！导入成功");
	}
	public static void main(String[] agrs) {
		Test_Import a=new Test_Import();
		a.impor();
	}
	
}
