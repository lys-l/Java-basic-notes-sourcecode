package cn.LJ.commonclass;

import java.util.Date;

/**
 * Date(时间)类的使用
 * @author 李劲
 *
 */
public class Test_03Date {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date a1 = new Date();	//无参显示当前时间
		System.currentTimeMillis();	//北京时间
		System.out.println(a1);
		Date a2 = new Date(10000);
		
		System.out.println(a2.toGMTString());	//国际标准时间
		a2.setTime(38467346);	//重新设值
		System.out.println(a2.getTime());	//得到毫秒数
		
	}

}
