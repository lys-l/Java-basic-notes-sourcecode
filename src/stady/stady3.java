package stady;

/**
 * ����������
 * 
 * @author NGU
 *
 */
public class stady3 {

	// ����
	int id;
	int age;
	String name;
	Computer comp;

	// ����
	void study() {
		System.out.println("########" + comp.brand);
	}

	void play() {
		System.out.println("nihao ");
	}

	// ���췽��
	stady3() {
	}

	// ����ִ�е����
	public static void main(String[] args) {
		stady3 stu = new stady3(); // ����һ������
		stu.id = 10001;
		stu.age = 18;
		stu.name = "�";
		System.out.println(stu.id + " " + stu.age + " " + stu.name);
		Computer a = new Computer();
		a.brand = "lenovo";

		stu.comp = a;
		stu.play();
		stu.study();
	}
}

class Computer {
	String brand;
}