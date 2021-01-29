package cn.LJ.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * 测试Collection工具类 java.util.Collections
 * 
 * @author NGU
 *
 */
public class Test_04TollClass {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("lijin" + i);
		}
		System.out.println(list);

		Collections.shuffle(list);// 随机排列
		System.out.println(list);

		Collections.reverse(list);// 逆序排序
		System.out.println(list);

		Collections.sort(list);// 正常排序
		System.out.println(list);

		System.out.println(Collections.binarySearch(list, "lijin3"));// 二分法查找

	}

}
