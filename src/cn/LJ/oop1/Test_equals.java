package cn.LJ.oop1;
/**
 * ����equals����
 * @author �
 *
 */
public class Test_equals {
	public static void main(String[] args) {
		
		qual a=new qual(1001,"�",1216);
		qual b=new qual(1001,"�ܺ���",0302);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String a1=new String("lijin");
		String b1=new String("lijin");
		System.out.println(a1==b1);			//����ͬһ������false
		System.out.println(a1.equals(b1));	//������ͬtrue
	}

}
class qual{
	int id;
	String name;
	int paw;
	
	public qual(int id, String name, int paw) {
		super();
		this.id = id;
		this.name = name;
		this.paw = paw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		qual other = (qual) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
