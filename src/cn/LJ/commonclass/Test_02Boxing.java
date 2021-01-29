package cn.LJ.commonclass;
/**
 * 测试自动装箱(auto-boxing)与拆箱(unboxing)
 * @author 李劲
 *
 */
public class Test_02Boxing {
	public static void main(String[] args) {
		//Integer a = new Integer(1000);
		
		//左边对象，右边数字，不符合基本规则。为解决此问题JDK5.0在编译器上做了手脚
		//会自动加new Integer(自动装箱)
		@SuppressWarnings("unused")
		Integer a = 1000;			//等价于Integer a = new Integer(1000);
		//会自动加.intValue()(自动拆箱)
		@SuppressWarnings({ "deprecation", "unused" })
		int c = new Integer(1500);	//等价于int c = new Integer(1500).intValue();
		
		Integer a1 =1234;
		Integer a2 =1234;
		System.out.println(a1==a2);//false
		System.out.println(a1.equals(a2));//true
		Integer a3 =127;		//当数值大小在【-128，127】之间，仍然当作基本数据类型处理
		Integer a4 =127;
		System.out.println(a3==a4);//true
		System.out.println(a3.equals(a4));//false
		
		
	}

}
