package com.heima.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2.�����������󣬲��ô���ʵ�֣�
	(1)����List���ϣ��������ַ���
	(2)ɾ���������ַ���"def"
	(3)Ȼ�����õ�������������Ԫ�ز����
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
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
		//����deleteStrFromList����ɾ�������е��ַ���"def"
		deleteStrFromList(list, "def");
		//���õ�������������Ԫ�ز����
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
	// ɾ��ArrayList�����е�"abc"�ַ���
	public static void deleteStrFromList(List<String> list,String delStr) {
		//1.��ȡ���������󣬲����б���
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			//2.�жϼ����е�Ԫ���Ƿ����"abc",�����ȣ���ɾ��
			if(null!=delStr&&delStr.equals(str)) {
				it.remove();
			}
		}
	}
}
