package com.heima.tests;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 2.�����������󣬲��ô���ʵ�֣�
 *	(1)���ü���¼�룬����һ���ַ���
 *	(2)ͳ�Ƹ��ַ����и����ַ�������
 *	(3)�磺
 *		�û������ַ���"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
 *		������������-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//1.�������¼����������ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = sc.nextLine();
		//2.����getCharNum����ͳ��ÿ���ַ����ֵĴ���,������һ���µ��ַ���a(2)b(1)k(2)...
		String newStr = getCharNums(str);
		//3.��ӡ�ַ���
		System.out.println(newStr);
	}

	private static String getCharNums(String str) {
		//1.���ַ�������ַ�����
		char[] chars = str.toCharArray();
		//2.���弯��TreeMap
		TreeMap<Character,Integer> map = new TreeMap<>();
		//3.�����ַ�����,����Ӧ���ַ��ʹ�������map������
		for (char c : chars) {
			map.put(c, map.get(c)!=null?map.get(c)+1:1);//��Ԫ�����ͳ��ÿ���ַ��ĸ���
		}
		//4.����StringBuilder
		StringBuilder sb = new StringBuilder();
		//5.����map����,����StringBuilder��key-valueת��a(2)b(1)...��ʽ
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			sb.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
		}
		//6.����StringBuilder���ַ���������ʽ
		return sb.toString();
	}
}
