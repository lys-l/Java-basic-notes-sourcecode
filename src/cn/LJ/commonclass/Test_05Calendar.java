package cn.LJ.commonclass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ����������(���ڻ���)
 * @author �
 *
 */
public class Test_05Calendar {
	public static void main(String[] args) {
		Calendar a = new GregorianCalendar();
		Calendar c = new GregorianCalendar();//ʹ������
		
		a.set(2019, 10, 6, 17, 42 ,32);
		a.add(Calendar.DATE, -4);//�������ӻ����4��
		Date b = a.getTime();//<==>a.setTime(new Date());
		System.out.println(b);
		
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DATE, 10);//û����ʱ�䣬ϵͳ�Զ�ʹ�õ�ǰʱ��
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));//��ȡʱ���е����
		
		
	}

}
