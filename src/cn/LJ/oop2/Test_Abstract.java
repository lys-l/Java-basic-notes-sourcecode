package cn.LJ.oop2;
/**
 * �����༰���󷽷��ĸ���
 * @author �
 *
 */
public abstract class Test_Abstract {	//������
	
	//���󷽷������壺����������ƺͷ�����ʵ�ַ��롣
	String name;
	public abstract void run();		//���󷽷�	���������
	public void a() {
		System.out.println("������ͨ����~~~");
		run();			//��ʱ�����ʱ����������󱻵��á�
	}
	//�Լ��Ӹ���������Ҳ����ʵ����Test_Abstract��������newʵ����������
	public Test_Abstract() {
		System.out.println("����~~~~~");
	}

}
class Abstract extends Test_Abstract{	//������ʵ��

	@Override
	public void run() {			//�̳г�����������д����ĳ��󷽷���
		// TODO Auto-generated method stub
		
	}
	
}