package cn.LJ.oop2;
/**
 * 测试可变字符序列StringBuilder(线程不安全，效率高)、StringBuffer(线程安全，效率低)
 * @author 李劲
 *
 */
public class Test_Stringbuilder {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StringBuilder sb =new StringBuilder();//字符数组长度初始为16
		@SuppressWarnings("unused")
		StringBuilder sb1 =new StringBuilder(32);//字符数组长度初始为32
		StringBuilder sb2 =new StringBuilder("abcd");//字符数组长度初始为32{"a","b","c","d",\u0000,\u0000,....}
		sb2.append("efg");
		sb2.append(true).append(321).append("hhh").append("ooo");//通过return this实现方法链。
		
		System.out.println(sb2);//字符累加
		
		StringBuilder sb3 =new StringBuilder("a");
		for(int i=0; i<3; i++) {//一共两个对象
			sb3.append(i);
		}
		System.out.println(sb3);
	/**
	 * 测试常用方法
	 */
		StringBuilder st =new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		st.delete(3, 5).delete(3 ,5);//删除从3到5的字符含3不含5
		System.out.println(st);
		st.reverse();	//倒置字符数组
		System.out.println(st);
	}

}