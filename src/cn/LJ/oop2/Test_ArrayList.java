package cn.LJ.oop2;
/**
 * ģ��ArrayList����
 * ģ��ʵ��JDK���ṩ��Array List��
 * @author �
 *
 */
public class Test_ArrayList {
/**
 * ��ʼ������
 */
	private Object[] value;
	
	private int size;

	public int size() {	//����������Ԫ�ظ���
		return size;
	}
	
	public boolean isEmpty() {	//�ÿ�
        return size == 0;
    }
	
	public Test_ArrayList() {	//�չ�����
		value = new Object[16];
		//this(16);������ȼۣ������·���������
	}
	
	public Test_ArrayList(int size) {	//���ع�����
		if(size<0) {
			try {
				throw new Exception();	//�ֶ��׳�һ���쳣������ὲ��
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value = new Object[size]; 
	}
	
/**
 * �����ﶪ����
 */
	public void add(Object obj) {	//���������롣
		value[size] = obj;
		size++;
		if(size>=value.length) {
			//װ���£�����
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
			//System.arraycopy(src, srcPos, dest, destPos, length);
			for(int i=0;i<value.length;i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	
	public Object get(int index) {	//ȡ��
		if(index<0 || index>size-1) {
			try {
				throw new Exception();	//�ֶ��׳�һ���쳣������ὲ��
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value[index];
	}
	
	public int indexOf(Object obj) {	//˳������
		if(obj==null) {
			return -1;
		}else {
			for(int i=0;i<value.length;i++) {
				if(obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public int LastindexOf(Object obj) {	//��������
		if(obj==null) {
			return -1;
		}else {
			for(int i=value.length;i>=0;i--) {
				if(obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Test_ArrayList list= new Test_ArrayList(2);
		list.add("aaa");
		list.add(new Human("�"));
		list.add("bbb");

		//list.get(1)����Object��toString����,����getClass().getName() + "@" + Integer.toHexString(hashCode());
		Human a = (Human) list.get(1);		//ǿ��ת�ͣ�תΪHuman
		//System.out.println(a.name);		//nameΪHuman�ڹ������ԣ����ã���һ��Ϊ�˹淶��Ҫ��Ϊ˽�����ԡ�
		
		System.out.println(a.getName());
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.indexOf("bbb"));
		
	}
	
}
class Human{
	private String name;

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}






