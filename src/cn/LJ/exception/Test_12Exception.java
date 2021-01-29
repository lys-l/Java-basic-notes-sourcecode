package cn.LJ.exception;
/**
 * 测试异常
 * @author 李劲
 *
 */
public class Test_12Exception {
	public static void main(String[] args) {
		//int a = 1/0;		//Unchecked：未检查。不需要捕获，因为太频繁了。会自动捕获。
		
		try {
			Thread.sleep(30000);	//Checked Exception异常，单独写需要捕获异常。Checked：已检查
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Computer c = null;
		//c.statr();	//空指针异常对象c是null，调用对象方法或属性。
		
	}

}
class Computer{
	void statr() {
		System.out.println("哈哈哈哈哈");
	}
}
