package cn.LJ.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 测试Iterator迭代器
 * 
 * @author NGU
 *
 */
public class Test_03Iterator {
	public static void main(String[] args) {
		testList();
		testSet();
		testMap();
	}

	public static void testList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");

		for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
			String temp = iter.next();// 获取当前数据并指向下一个数据
			System.out.println(temp);
		}
	}

	public static void testSet() {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");

		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String temp = iter.next();// 获取当前数据并指向下一个数据
			System.out.println(temp);
		}
	}

	public static void testMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "aa");
		map.put(200, "bb");
		map.put(300, "cc");
		// 方法一
		Set<Entry<Integer, String>> ss = map.entrySet();
		for (Iterator<Entry<Integer, String>> iter = ss.iterator(); iter.hasNext();) {
			Entry<Integer, String> temp = iter.next();// 获取当前数据并指向下一个数据
			System.out.println(temp.getKey() + "--" + temp.getValue());
		}
		// 方法二
		Set<Integer> sss = map.keySet();
		for (Iterator<Integer> iter = sss.iterator(); iter.hasNext();) {
			Integer temp = iter.next();// 获取当前数据并指向下一个数据
			System.out.println(temp + "--" + map.get(temp));
		}
	}

}
