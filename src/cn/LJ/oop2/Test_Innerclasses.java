package cn.LJ.oop2;

//import cn.LJ.oop2.Face.Nose;

/**
 * �����ڲ���
 * @author �
 *
 */
public class Test_Innerclasses {
	public static void main(String[] args) {
		Face f=new Face();
		//Nose n=new Nose();�������ڲ���ķ���������ʵ�֡�
		//Nose n=f.new Nose(); 		//�˷�������뵼���ڲ���
		Face.Nose n=f.new Nose();	//�˷�������ȷ
		n.breath();
		Face.Ear e=new Face.Ear();
		e.listen();
	}

}
class Face{
	int type=11;
	String shape="�";
	static String color="��";
	
	public void hh() {
		//System.out.println(age);	//����ֱ�ӷ����ڲ���
	}
	
	//�ڲ�����Ե����ⲿ��������ݡ�
	class Nose{						//�Ǿ�̬�ڲ���
		int type;
		void breath() {						//���ܶ���Ϊ��̬����
			System.out.println(shape);			//�ڲ���û��shape����ֱ�ӵ�
			System.out.println(Face.this.type);		//�ڲ�����type��������Face.this����
			System.out.println("����!��������������");
		}
	}
	static class Ear{				//��̬�ڲ���
		void listen() {
			//System.out.println(shape);		//��̬�Ĳ��ܵ��÷Ǿ�̬�� 
			System.out.println(color);			//���Ե��þ�̬��
			System.out.println("\n������!��~~~~~~~~~");
		}
	}
}