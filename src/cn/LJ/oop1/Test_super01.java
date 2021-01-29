package cn.LJ.oop1;
/**
 * ²âÊÔsuper·½·¨
 * @author Àî¾¢
 *
 */
public class Test_super01 {
	public static void main(String[] args) {
		new csupe().f();
	}

}
class fsupe{
	public int a;
	
	public void f() {
		a=100;
		System.out.println("fsupe="+a);
	}
}
class csupe extends fsupe{
	public int a;
	
	public void f() {
		super.f();
		a=200;
		System.out.println("csupe="+a);
		System.out.println(a);
		System.out.println(super.a);
	}
}