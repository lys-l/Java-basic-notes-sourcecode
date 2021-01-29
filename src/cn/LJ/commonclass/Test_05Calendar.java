package cn.LJ.commonclass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类(日期机算)
 * @author 李劲
 *
 */
public class Test_05Calendar {
	public static void main(String[] args) {
		Calendar a = new GregorianCalendar();
		Calendar c = new GregorianCalendar();//使用子类
		
		a.set(2019, 10, 6, 17, 42 ,32);
		a.add(Calendar.DATE, -4);//日期增加或减少4天
		Date b = a.getTime();//<==>a.setTime(new Date());
		System.out.println(b);
		
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DATE, 10);//没设置时间，系统自动使用当前时间
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));//获取时间中的年份
		
		
	}

}
