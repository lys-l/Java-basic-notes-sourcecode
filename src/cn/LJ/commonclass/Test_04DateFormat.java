package cn.LJ.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ʱ����ַ�������ת��
 * @author �
 *
 */
public class Test_04DateFormat {
	public static void main(String[] args) {
		/**
		 * DateFormatΪ�����࣬����ֱ��new.��Ҫ��������SimpleDateFormat
		 */
		DateFormat a1 = new SimpleDateFormat("yyyy��MM��dd��  hh:mm:ss");
		
		Date b1 = new Date(1232131232323L);
		String str = a1.format(b1);	//��ʱ������ո�ʽ���ַ�����ת�����ַ���
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
