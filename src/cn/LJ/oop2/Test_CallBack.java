package cn.LJ.oop2;
/**
 * ���Իص�
 * @author �
 *
 */
public class Test_CallBack {
	public static void drawFrame(MyFrame f) {		//�������ýӿ�IMyFrame
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint();//Ŀǰf��һ��δ֪���󣬵�������ô�õ�ʱ���ں��涨���ص����ɡ�
		
		System.out.println("�����̣߳�����Ч��");
		
	}
	public static void main(String[] args) {
		drawFrame(new MyFrame01());
	}
}
interface IMyFrame{			//����ӿ�
	void paint();
}
class MyFrame03 implements IMyFrame{	//�ӿ�ʵ��
	public void paint() {
		System.out.println("���Լ����ڻ�����04");
	}
}
class MyFrame{
	public void paint() {
		System.out.println("���Լ����ڻ�����");
	}
}
class MyFrame01 extends MyFrame{
	public void paint() {
		System.out.println("���Լ����ڻ�����01");
	}
}
class MyFrame02 extends MyFrame{
	public void paint() {
		System.out.println("���Լ����ڻ�����02");
	}
}