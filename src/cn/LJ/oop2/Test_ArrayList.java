package cn.LJ.oop2;
/**
 * 模拟ArrayList容器
 * 模拟实现JDK中提供的Array List类
 * @author 李劲
 *
 */
public class Test_ArrayList {
/**
 * 初始化容器
 */
	private Object[] value;
	
	private int size;

	public int size() {	//计算容器中元素个数
		return size;
	}
	
	public boolean isEmpty() {	//置空
        return size == 0;
    }
	
	public Test_ArrayList() {	//空构造器
		value = new Object[16];
		//this(16);与上面等价，调用下方构造器。
	}
	
	public Test_ArrayList(int size) {	//重载构造器
		if(size<0) {
			try {
				throw new Exception();	//手动抛出一个异常，后面会讲。
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value = new Object[size]; 
	}
	
/**
 * 容器里丢东西
 */
	public void add(Object obj) {	//方法，放入。
		value[size] = obj;
		size++;
		if(size>=value.length) {
			//装不下，扩容
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
			//System.arraycopy(src, srcPos, dest, destPos, length);
			for(int i=0;i<value.length;i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	
	public Object get(int index) {	//取出
		if(index<0 || index>size-1) {
			try {
				throw new Exception();	//手动抛出一个异常，后面会讲。
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value[index];
	}
	
	public int indexOf(Object obj) {	//顺序索引
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
	
	public int LastindexOf(Object obj) {	//逆序索引
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
		list.add(new Human("李劲"));
		list.add("bbb");

		//list.get(1)调用Object的toString方法,返回getClass().getName() + "@" + Integer.toHexString(hashCode());
		Human a = (Human) list.get(1);		//强制转型，转为Human
		//System.out.println(a.name);		//name为Human内公共属性，可用，但一般为了规范，要设为私有属性。
		
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






