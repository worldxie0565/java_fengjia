package com.heima.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.heima.domain.Person;
/**
 * 2.�����������󣬲��ô���ʵ�֣�
 *	(1)�����´��룺
 *		//....
 *	(2)Ҫ��Լ�������ӵ�Ԫ������
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("c");
		list.add("a");
		list.add("d");
		sort(list);
		System.out.println(list); // a, b, c, d, e, f	
	}

	// �Լ����е�Ԫ������(����ΪString)
	private static void sort(List<String> list) {
		// ֱ��ʹ��ð������,û�н�����ת������
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				String str1 = list.get(j);
				String str2 = list.get(j + 1);
				// �������ַ�ʽ�޷�ʵ��list�����е�Ԫ�صĽ���
				/*
				 * if (str1.compareTo(str2) > 0) { String temp = str1; str1 =
				 * str2; str2 = temp; }
				 */
				if (str1.compareTo(str2) > 0) {
					list.set(j, str2);
					list.set(j + 1, str1);
				}
			}
		}
	}
	
}
