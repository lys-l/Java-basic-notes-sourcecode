package cn.LJ.commonclass;

import java.util.Date;

/**
 * Date(ʱ��)���ʹ��
 * @author �
 *
 */
public class Test_03Date {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date a1 = new Date();	//�޲���ʾ��ǰʱ��
		System.currentTimeMillis();	//����ʱ��
		System.out.println(a1);
		Date a2 = new Date(10000);
		
		System.out.println(a2.toGMTString());	//���ʱ�׼ʱ��
		a2.setTime(38467346);	//������ֵ
		System.out.println(a2.getTime());	//�õ�������
		
	}

}
