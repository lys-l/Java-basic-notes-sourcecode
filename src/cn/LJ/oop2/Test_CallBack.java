package cn.LJ.oop2;
/**
 * 测试回调
 * @author 李劲
 *
 */
public class Test_CallBack {
	public static void drawFrame(MyFrame f) {		//常见的用接口IMyFrame
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();//目前f是一个未知对象，当你想怎么用的时候在后面定义后回调即可。
		
		System.out.println("启动线程，增加效率");
		
	}
	public static void main(String[] args) {
		drawFrame(new MyFrame01());
	}
}
interface IMyFrame{			//定义接口
	void paint();
}
class MyFrame03 implements IMyFrame{	//接口实现
	public void paint() {
		System.out.println("把自己窗口画出来04");
	}
}
class MyFrame{
	public void paint() {
		System.out.println("把自己窗口画出来");
	}
}
class MyFrame01 extends MyFrame{
	public void paint() {
		System.out.println("把自己窗口画出来01");
	}
}
class MyFrame02 extends MyFrame{
	public void paint() {
		System.out.println("把自己窗口画出来02");
	}
}