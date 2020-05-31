package com.heima.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.heima.domain.Student;

/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��ѧ����Student���������ԣ�����(String name)������(int age)
 *	(2)����Map���ϣ���Student������Ϊkey�����ַ���(�˱�ʾ��ʾѧ����סַ)��Ϊvalue
 *	(3)�������ַ�ʽ����Map�����е����ݣ���ʽ��key::value
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		// 1.����HashMap����,��ΪStudent����,ֵΪString���͵Ķ���,��ʾ��ַ
		HashMap<Student, String> map = new HashMap<>();
		map.put(new Student("����", 20), "����");
		map.put(new Student("����", 20), "�Ͼ�");
		map.put(new Student("����", 20), "�Ϻ�");
		map.put(new Student("����", 20), "����");
		map.put(new Student("����", 20), "����");

		// ������ʽһ:��ǿforѭ��(entrySet)
		for (Map.Entry<Student, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		
		//������ʽ��:��ǿforѭ��(keySet)
		System.out.println("-----------------------------------------");
		for(Student student :map.keySet()) {
			String address = map.get(student);
			System.out.println(student+"::"+address);
		}
		
		// ������ʽ��:������(ͨ��entrySet())
		System.out.println("-----------------------------------------");
		Set<Map.Entry<Student, String>> set = map.entrySet();
		Iterator<Map.Entry<Student, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Student, String> entry = it.next();
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}

		// ������ʽ��:������(ͨ��keySet())
		System.out.println("-----------------------------------------");
		Set<Student> keySet = map.keySet();
		Iterator<Student> it2 = keySet.iterator();
		while(it2.hasNext()) {
			Student student = it2.next();
			String address = map.get(student);
			System.out.println(student+"::"+address);
		}

	}
}
