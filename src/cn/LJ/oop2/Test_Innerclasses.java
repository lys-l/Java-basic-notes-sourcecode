package cn.LJ.oop2;

//import cn.LJ.oop2.Face.Nose;

/**
 * 测试内部类
 * @author 李劲
 *
 */
public class Test_Innerclasses {
	public static void main(String[] args) {
		Face f=new Face();
		//Nose n=new Nose();错误定义内部类的方法，不可实现。
		//Nose n=f.new Nose(); 		//此法定义必须导入内部类
		Face.Nose n=f.new Nose();	//此法定义正确
		n.breath();
		Face.Ear e=new Face.Ear();
		e.listen();
	}

}
class Face{
	int type=11;
	String shape="李劲";
	static String color="红";
	
	public void hh() {
		//System.out.println(age);	//不能直接访问内部类
	}
	
	//内部类可以调用外部类相关内容。
	class Nose{						//非静态内部类
		int type;
		void breath() {						//不能定义为静态方法
			System.out.println(shape);			//内部类没有shape即可直接调
			System.out.println(Face.this.type);		//内部类有type重名，用Face.this调用
			System.out.println("呼吸!·······");
		}
	}
	static class Ear{				//静态内部类
		void listen() {
			//System.out.println(shape);		//静态的不能调用非静态的 
			System.out.println(color);			//可以调用静态的
			System.out.println("\n我在听!·~~~~~~~~~");
		}
	}
}