package com.heima.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * ArrayList<Integer>��һ��������������������һ���ַ������ݣ����ʵ���أ�
	 * ����ֻ�ڱ�������Ч,�������ڻᱻ������
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");				//��ȡ�ֽ������
		Method m = clazz.getMethod("add", Object.class);				//��ȡadd����
		m.invoke(list, "abc");
		
		System.out.println(list);
		
	}

}
