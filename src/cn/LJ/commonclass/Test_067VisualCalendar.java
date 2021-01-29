package cn.LJ.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author 李劲
 *
 */
public class Test_067VisualCalendar {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入日期，年-月-日：");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//获得了1号是周几
			//System.out.println(calendar.getActualMaximum(Calendar.DATE));//获得了这个月有多少天
			int max = calendar.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print('\t');
			}
			
			for(int i=1;i<=max;i++) {
				if(i==day) {
					System.out.print("#");
				}
				System.out.print(i+"\t");
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY) {
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			} 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 