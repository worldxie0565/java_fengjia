package com.heima.string;

import com.heima.bean.Person;

public class Demo6_StringMethod {

	/**
	 * * byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		* char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
		* static String valueOf(char[] chs):���ַ�����ת���ַ�����
		* static String valueOf(int i):��int���͵�����ת���ַ�����
			* ע�⣺String���valueOf�������԰��������͵�����ת���ַ�����
	
	
		* String toLowerCase():���ַ���ת��Сд��(�˽�)
		* String toUpperCase():���ַ���ת�ɴ�д��
		* String concat(String str):���ַ���ƴ�ӡ�
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		String s1 = "heiMA";
		String s2 = "chengxuYUAN";
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3 + s4);				//��+ƴ���ַ�����ǿ��,�������ַ����������������
		System.out.println(s3.concat(s4));			//concat�������õĺʹ���Ķ��������ַ���
	}

	private static void demo3() {
		char[] arr = {'a','b','c'};
		String s = String.valueOf(arr);			//�ײ�����String��Ĺ��췽����ɵ�
		System.out.println(s);
		
		String s2 = String.valueOf(100);		//��100ת��Ϊ�ַ���
		System.out.println(s2 + 100);
		
		Person p1 = new Person("����", 23);
		System.out.println(p1);
		String s3 = String.valueOf(p1);			//���õ��Ƕ����toString����
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "heima";
		char[] arr = s.toCharArray();			//���ַ���ת��Ϊ�ַ�����
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void demo1() {
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + " ");
		}
		
		String s2 = "������";
		byte[] arr2 = s2.getBytes();				//ͨ��gbk����ַ���ת�����ֽ�����
		for (int i = 0; i < arr2.length; i++) {		//����:�����ǿ��Ķ�ת��Ϊ��������Ķ���
			//System.out.print(arr2[i] + " ");		//gbk���һ�����Ĵ��������ֽ�
		}											//gbk����ص�,���ĵĵ�һ���ֽڿ϶��Ǹ���
		
		String s3 = "�i";
		byte[] arr3 = s3.getBytes();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
