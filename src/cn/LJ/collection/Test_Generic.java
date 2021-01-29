package cn.LJ.collection;

/**
 * 测试泛型
 * 
 * @author NGU
 *
 */
public class Test_Generic {
	public static void main(String[] args) {

		MyCollection<String> mc = new MyCollection<String>();
		mc.set("sdf", 0);
		// mc.set(999, 1);
		// Integer a = (Integer) mc.get(1);
		String b = mc.get(0);
		// System.out.println(a);
		System.out.println(b);

		/**
		 * List,Map,Set
		 */

	}
}

class MyCollection<T> {
	Object[] objs = new Object[5];

	public void set(T obj, int index) {
		objs[index] = obj;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) objs[index];
	}
}
