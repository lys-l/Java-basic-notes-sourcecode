package cn.LJ.commonclass;
/**
 * 包装类的使用
 * @author 李劲
 *
 */
public class Test_01Wrapper {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer a = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(a));
		Integer a2 = Integer.parseInt("234");
		System.out.println(a2);
	}

}
