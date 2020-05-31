package com.heima.tests;

import java.util.ArrayList;
import java.util.List;

import com.heima.domain.Person;

/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)�����´��룺
 *		//.....
 *	(2)���巽��ͳ�Ƽ�����ָ��Ԫ�س��ֵĴ�������"a" 3,"b" 2,"c" 1
 * @author JX
 *
 */
public class Test03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		//���Է��� System.out.println(frequency(list, "a")); // 3
		System.out.println(frequency(list, "b")); // 2
		System.out.println(frequency(list, "c")); // 1
		System.out.println(frequency(list, "d")); // 5
		System.out.println(frequency(list, "xxx")); // 0		
	}

	// 1.ͳ�Ƽ�����Ԫ�س��ֵĴ���
	private static int frequency(List<String> list, String value) {
		int count = 0;
		// 1.ʹ����ǿfor��������
		for (String str : list) {
			// 2.�����ǰԪ����Ҫ���ҵ�Ԫ��value,������count��1
			if (value.equals(str))
				count++;
		}
		// 3.���ؼ�����
		return count;
	}
}
