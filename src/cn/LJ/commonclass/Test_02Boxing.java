package cn.LJ.commonclass;
/**
 * �����Զ�װ��(auto-boxing)�����(unboxing)
 * @author �
 *
 */
public class Test_02Boxing {
	public static void main(String[] args) {
		//Integer a = new Integer(1000);
		
		//��߶����ұ����֣������ϻ�������Ϊ���������JDK5.0�ڱ������������ֽ�
		//���Զ���new Integer(�Զ�װ��)
		@SuppressWarnings("unused")
		Integer a = 1000;			//�ȼ���Integer a = new Integer(1000);
		//���Զ���.intValue()(�Զ�����)
		@SuppressWarnings({ "deprecation", "unused" })
		int c = new Integer(1500);	//�ȼ���int c = new Integer(1500).intValue();
		
		Integer a1 =1234;
		Integer a2 =1234;
		System.out.println(a1==a2);//false
		System.out.println(a1.equals(a2));//true
		Integer a3 =127;		//����ֵ��С�ڡ�-128��127��֮�䣬��Ȼ���������������ʹ���
		Integer a4 =127;
		System.out.println(a3==a4);//true
		System.out.println(a3.equals(a4));//false
		
		
	}

}
