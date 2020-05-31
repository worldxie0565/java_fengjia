package com.heima.string;

public class Demo2_StringCon {

	/**
	 	* public String():�չ���
		* public String(byte[] bytes):���ֽ�����ת���ַ���
		* public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
		* public String(char[] value):���ַ�����ת���ַ���
		* public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		* public String(String original):���ַ�������ֵת���ַ���
	 */
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		byte[] arr1 = {97,98,99};		
		String s2 = new String(arr1);			//����,����������Ķ���ת�������Ƕ��Ķ�
		System.out.println(s2);
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);		//��arr2�ֽ������2������ʼת��3��
		System.out.println(s3);
		
		char[] arr3 = {'a','b','c','d','e'};	//���ַ�����ת�����ַ���
		String s4 = new String(arr3);
		System.out.println(s4);
		
		String s5 = new String(arr3,1,3);		//��arr3�ַ�����,��1������ʼת��3��
		System.out.println(s5);
		
		String s6 = new String("heima");
		System.out.println(s6);
	}

}
