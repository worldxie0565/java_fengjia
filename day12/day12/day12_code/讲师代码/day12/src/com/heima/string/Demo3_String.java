package com.heima.string;

public class Demo3_String {

	/**
	 * * 1.�ж϶���ΪString���͵�s1��s2�Ƿ����
			* String s1 = "abc";
			* String s2 = "abc";
			* System.out.println(s1 == s2); 					
			* System.out.println(s1.equals(s2)); 		
		* 2.������仰���ڴ��д����˼�������?
			* String s1 = new String("abc");			
		* 3.�ж϶���ΪString���͵�s1��s2�Ƿ����
			* String s1 = new String("abc");			
			* String s2 = "abc";
			* System.out.println(s1 == s2); ?			
			* System.out.println(s1.equals(s2)); ?	
		* 4.�ж϶���ΪString���͵�s1��s2�Ƿ����
			* String s1 = "a" + "b" + "c";
			* String s2 = "abc";
			* System.out.println(s1 == s2); ?			
			* System.out.println(s1.equals(s2)); ?	
		* 5.�ж϶���ΪString���͵�s1��s2�Ƿ����
			* String s1 = "ab";
			* String s2 = "abc";
			* String s3 = s1 + "c";
			* System.out.println(s3 == s2);
			* System.out.println(s3.equals(s2)); ?	
			 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 		//true
	}

	private static void demo4() {
		//byte b = 3 + 4;						//�ڱ���ʱ�ͱ��7,��7��ֵ��b,�����Ż�����
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); 			//true,java���г����Ż�����	
		System.out.println(s1.equals(s2)); 		//true
	}

	private static void demo3() {
		String s1 = new String("abc");			//��¼���Ƕ��ڴ����ĵ�ֵַ		
		String s2 = "abc";						//��¼���ǳ������еĵ�ֵַ
		System.out.println(s1 == s2); 			//false
		System.out.println(s1.equals(s2)); 		//true
	}

	private static void demo2() {
		//������������
		//������������,һ���ڳ�������,һ���ڶ��ڴ���
		String s1 = new String("abc");		
		System.out.println(s1);
	}

	private static void demo1() {				//��������û������ַ�������,�ʹ���һ��,�����ֱ���ü���
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 			//true	
		System.out.println(s1.equals(s2)); 		//true
	}

}
