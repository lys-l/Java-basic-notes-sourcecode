package cn.LJ.oop2;
/**
 * String���ʹ�÷�����
 * @author �
 *
 */
public class Test_String {
	public static void main(String[] args) {
		String str = "ab";
		String str1 = str;
		String str2 =new String("ab");
		System.out.println(str1.equals(str));//true
		System.out.println(str2.equals(str));//true
		System.out.println(str==str1);//true
		System.out.println(str==str2);//false
		
		String st ="abc";
		String st1 ="abc";
		System.out.println(st.equals(st1));//true
		System.out.println(st==st1);//true
		
		System.out.println(st.indexOf("c"));//�����ַ�λ��
		System.out.println(st1.substring(2));//����ĳλ�õ��ַ�
		String st2 = st.replace("b", "d");//�����ַ��滻�ַ�
		System.out.println(st2);
		
		String st3 = "aaaaa,bbbbb,ccccc,ddddd";
		String[] st4 =  st3.split(",");//�������ַ��и��ַ�
		for(int i=0;i<st4.length;i++){
			System.out.println(st4[i]);
		}
		
		System.out.println("ADC".equalsIgnoreCase("adc"));//���Դ�Сд
		System.out.println("abcbd".indexOf("b"));//��ǰ�����ַ����λ��
		System.out.println("abcbd".lastIndexOf("b"));//�Ӻ�����ַ����λ��
		System.out.println("abcbd".startsWith("ab"));//�Ƿ���ĳĳ��ͷ
		System.out.println("abcbd".endsWith("bd"));//�Ƿ���ĳĳ��β
		System.out.println("aBcbd".toLowerCase());//ȫ����ΪСд
		System.out.println("abcbd".toUpperCase());//ȫ����Ϊ��д
		
		System.out.println("##########");
		String gh="a";//һ������a��	new String("a");�������󣨡�a����value����
		for(int i=0; i<3; i++) {//ƴ�ַ�����
			gh =gh + i;
		}
		System.out.println(gh);
		
	}
}
