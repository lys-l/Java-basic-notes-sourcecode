package cn.LJ.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 测试Collection各类容器方法
 * 
 * @author NGU
 *
 */
public class Test_01Collection {
	public static void main(String[] args) {
//		testCollection();
//		testList();
		testSet();

	}

	public static void testCollection() {
		Collection<String> c = new ArrayList<>();

		System.out.println(c.size());// 容器大小
		System.out.println(c.isEmpty());// 容器是否为空

		c.add("dfsf");
		c.add("sdfsfdsf");
		System.out.println(c);
		System.out.println(c.size());

		System.out.println(c.contains("dfsf"));// 判断容器中是否存在dfsf

		Object[] objs = c.toArray();// 转出Object数组
		System.out.println(objs);

		c.remove("dfsf");// 移除容器中引用dfsf的地址，实际dfsf这个对象还在
		System.out.println(c);

		c.clear();// 移除容器中所有元素
		System.out.println(c.size());

		List<String> list01 = new ArrayList<>();// List有序可重复的容器
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");

		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");

		list01.addAll(list02);
		list01.removeAll(list02);
		list01.retainAll(list02);
		System.out.println(list01);
		System.out.println(list01.containsAll(list02));
	}

	public static void testList() {
		/**
		 * List有序可重复的容器 List接口常用的实现类有3个 ArrayList LinkedList Vector 数组 链表 数组
		 */
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("bb");
		System.out.println(list);
		list.add(2, "ddd");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.set(2, "kdkdk");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.indexOf("bb"));
		System.out.println(list.lastIndexOf("bb"));

	}

	public static void testSet() {
		Set<String> set = new HashSet<>();

		set.add("sss");
		System.out.println(set);

		Set<Integer> seta = new HashSet<>();
		seta.add(100);
		seta.add(200);
		seta.add(300);
		for (Integer m : seta) {
			System.out.println(m);
		}
	}

}
