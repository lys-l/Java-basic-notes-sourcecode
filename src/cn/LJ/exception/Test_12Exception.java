package cn.LJ.exception;
/**
 * �����쳣
 * @author �
 *
 */
public class Test_12Exception {
	public static void main(String[] args) {
		//int a = 1/0;		//Unchecked��δ��顣����Ҫ������Ϊ̫Ƶ���ˡ����Զ�����
		
		try {
			Thread.sleep(30000);	//Checked Exception�쳣������д��Ҫ�����쳣��Checked���Ѽ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Computer c = null;
		//c.statr();	//��ָ���쳣����c��null�����ö��󷽷������ԡ�
		
	}

}
class Computer{
	void statr() {
		System.out.println("����������");
	}
}
