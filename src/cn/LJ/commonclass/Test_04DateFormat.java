package cn.LJ.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间和字符串互相转换
 * @author 李劲
 *
 */
public class Test_04DateFormat {
	public static void main(String[] args) {
		/**
		 * DateFormat为抽象类，不能直接new.需要调用子类SimpleDateFormat
		 */
		DateFormat a1 = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss");
		
		Date b1 = new Date(1232131232323L);
		String str = a1.format(b1);	//将时间对象按照格式化字符串，转化成字符串
		System.out.println(str);
		
		String b2 = "2019-10-6";
		DateFormat a2 = new SimpleDateFormat("yyyy-MM-dd");
		Date str1;
		try {
			str1 = a2.parse(b2);
			System.out.println(str1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
