package cn.LJ.oop2;
/**
 * ���Կɱ��ַ�����StringBuilder(�̲߳���ȫ��Ч�ʸ�)��StringBuffer(�̰߳�ȫ��Ч�ʵ�)
 * @author �
 *
 */
public class Test_Stringbuilder {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StringBuilder sb =new StringBuilder();//�ַ����鳤�ȳ�ʼΪ16
		@SuppressWarnings("unused")
		StringBuilder sb1 =new StringBuilder(32);//�ַ����鳤�ȳ�ʼΪ32
		StringBuilder sb2 =new StringBuilder("abcd");//�ַ����鳤�ȳ�ʼΪ32{"a","b","c","d",\u0000,\u0000,....}
		sb2.append("efg");
		sb2.append(true).append(321).append("hhh").append("ooo");//ͨ��return thisʵ�ַ�������
		
		System.out.println(sb2);//�ַ��ۼ�
		
		StringBuilder sb3 =new StringBuilder("a");
		for(int i=0; i<3; i++) {//һ����������
			sb3.append(i);
		}
		System.out.println(sb3);
	/**
	 * ���Գ��÷���
	 */
		StringBuilder st =new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		st.delete(3, 5).delete(3 ,5);//ɾ����3��5���ַ���3����5
		System.out.println(st);
		st.reverse();	//�����ַ�����
		System.out.println(st);
	}

}