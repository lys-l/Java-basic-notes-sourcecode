package cn.LJ.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map容器方法
 * 
 * @author NGU
 *
 */
public class Test_02Map {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		// 键key不能重复，重复则采用最新键所对应的值
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "sdf");
		System.out.println(m.get(1));
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("sss"));
		System.out.println(m);

	}

}
