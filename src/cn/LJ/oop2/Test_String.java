package cn.LJ.oop2;
/**
 * String类的使用方法。
 * @author 李劲
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
		
		System.out.println(st.indexOf("c"));//返回字符位置
		System.out.println(st1.substring(2));//返回某位置的字符
		String st2 = st.replace("b", "d");//用新字符替换字符
		System.out.println(st2);
		
		String st3 = "aaaaa,bbbbb,ccccc,ddddd";
		String[] st4 =  st3.split(",");//按所给字符切割字符
		for(int i=0;i<st4.length;i++){
			System.out.println(st4[i]);
		}
		
		System.out.println("ADC".equalsIgnoreCase("adc"));//忽略大小写
		System.out.println("abcbd".indexOf("b"));//从前检索字符输出位置
		System.out.println("abcbd".lastIndexOf("b"));//从后检索字符输出位置
		System.out.println("abcbd".startsWith("ab"));//是否以某某开头
		System.out.println("abcbd".endsWith("bd"));//是否以某某结尾
		System.out.println("aBcbd".toLowerCase());//全部变为小写
		System.out.println("abcbd".toUpperCase());//全部变为大写
		
		System.out.println("##########");
		String gh="a";//一个对象“a”	new String("a");两个对象（“a”和value）。
		for(int i=0; i<3; i++) {//拼字符代码
			gh =gh + i;
		}
		System.out.println(gh);
		
	}
}
