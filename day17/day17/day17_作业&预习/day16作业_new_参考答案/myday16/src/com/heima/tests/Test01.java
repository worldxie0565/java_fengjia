package com.heima.tests;

import java.util.ArrayList;
import java.util.List;

import com.heima.domain.Person;

/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ����ʱ����, ��ס����һ��Ԫ��
 *	(2)˼·
 *		a.����һ����ʱ����, ��ס����һ��Ԫ��
 *		b.�õ�һ��λ�ô�ŵڶ���λ���ϵ�Ԫ��
 *		c.�õڶ���λ�ô����ʱ������ס��Ԫ��
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//���Լ����д����ַ���
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.println(al);
		swap(al,0,3);
		System.out.println(al);
		//���Լ����д����Զ������
		ArrayList<Person> al2 = new ArrayList<>();
		al2.add(new Person("zs", 20));
		al2.add(new Person("ls", 30));
		al2.add(new Person("ww", 10));
		al2.add(new Person("zl", 40));
		al2.add(new Person("kw", 22));
		System.out.println("------------------");
		System.out.println(al2);
		swap(al2,0,4);
		System.out.println(al2);
	}
	
	//����һ�������͵ķ���
	public static void swap(List list,int index1,int index2) {
		//1.��ȡlist����������Ϊindex1��ֵ
		Object obj = list.get(index1);
		//2.������������index1λ������Ϊ����index2��ֵ
		list.set(index1, list.get(index2));
		//3.������index2λ������Ϊt
		list.set(index2, obj);
	}
	
	//����һ�������͵ķ���
	public static <T> void swap2(List<T> list,int index1,int index2) {
		//1.��ȡlist����������Ϊindex1��ֵ
		T t = list.get(index1);
		//2.������������index1λ������Ϊ����index2��ֵ
		list.set(index1, list.get(index2));
		//3.������index2λ������Ϊt
		list.set(index2, t);
	}
}
