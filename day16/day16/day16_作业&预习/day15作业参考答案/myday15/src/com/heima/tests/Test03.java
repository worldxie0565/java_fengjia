package com.heima.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)����List���ϣ��������ַ���
 *	(2)ɾ�������а���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
 *	(3)Ȼ�����õ�������������Ԫ�ز����
 * @author JX
 *
 */
public class Test03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abce0fgh");
		list.add("ab2e0fgh");
		list.add("ab3e0fgh");
		list.add("ab5e0fgh");
		list.add("ab6e0fgh");
		list.add("ab5e0f8gh");
		list.add("000234ab5e0f8g9h");
		list.add("abc");
		list.add("def");
		list.add("ghi");
		deleteNum4(list);
		//���õ�������������Ԫ�ز����
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	// ���ñ����ķ�ʽ�ж��Ƿ����0-9���ַ���
	private static void deleteNum1(List<String> list) {
		// 1.��������
		Iterator<String> it = list.iterator();// ��ȡ������
		while (it.hasNext()) {// it.remove();
			String str = (String) it.next();// str.contains(String str)
			for (int i = 0; i <= 9; i++) {// 0-9������
				// 2.�ж��ַ������Ƿ����0-9���ַ���
				if (str.contains(i + "")) {// 0->"0"
					it.remove();
					break;
				}
			}
		}
	}

	// ����������ʽ
	private static void deleteNum2(List<String> list) {
		// 1.��������
		Iterator<String> it = list.iterator();// ��ȡ������
		// 2.����������ʽ
		String regex = "\\w*\\d+\\w*";
		while (it.hasNext()) {// it.remove();
			String str = it.next();// str.contains(String str)
			// 3.������ȥƥ��
			if (str.matches(regex)) {
				// 4.ɾ��ƥ����ַ���
				it.remove();
			}
		}
	}

	// ����������ʽ����2
	private static void deleteNum3(List<String> list) {
		// 1.��������
		Iterator<String> it = list.iterator();// ��ȡ������
		// 2.����������ʽ
		String regex = "\\d+";
		Pattern p = Pattern.compile(regex);
		while (it.hasNext()) {// it.remove();
			String str = (String) it.next();// str.contains(String str)
			// 3.��ȡƥ��������
			Matcher m = p.matcher(str);
			// 4.��ƥ��������ȥѰ��
			if (m.find()) {
				// 5.ɾ��ƥ����ַ���
				it.remove();
			}
		}
	}
	// ����remove(int index)����ɾ��
	private static void deleteNum4(List<String> list) {
		// 1.��������
		for(int i = 0;i<list.size();i++) {
			/*if(list.get(i).matches("\\w*\\d+\\w*")) {
				list.remove(i--);
			}*/
			String str = list.get(i);
			for (int j = 0; j <= 9; j++) {// 0-9������
				// 2.�ж��ַ������Ƿ����0-9���ַ���
				if (str.contains(j + "")) {// 0->"0"
					list.remove(i--);
					break;
				}
			}			
		}		
	}

}
