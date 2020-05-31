package com.heima.string;

public class Demo4_StringMethod {

	/**
	 	* boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		* boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		* boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		* boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		* boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
		* boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
		* 
		* ""��null������
		* ""���ַ�������,ͬʱҲ��һ��String��Ķ���,��Ȼ�Ƕ���Ȼ���Ե���String���еķ���
		* null�ǿճ���,���ܵ����κεķ���,�������ֿ�ָ���쳣,null�������Ը�����������������͸�ֵ
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		String s1 = "heima";
		String s2 = "";
		String s3 = null;
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());	//java.lang.NullPointerException
	}

	private static void demo2() {
		String s1 = "�Ұ�heima,����";
		String s2 = "heima";
		String s3 = "baima";
		String s4 = "�Ұ�";
		String s5 = "����";
		
		System.out.println(s1.contains(s2));		//�ж��Ƿ����������ַ���
		System.out.println(s1.contains(s3));
		
		System.out.println("------------------");
		System.out.println(s1.startsWith(s4));		//�ж��Ƿ��Դ�����ַ�����ͷ
		System.out.println(s1.startsWith(s5));
		
		System.out.println("------------------");
		System.out.println(s1.endsWith(s4));		//�ж��Ƿ��Դ�����ַ�����β
		System.out.println(s1.endsWith(s5));
	}

	private static void demo1() {
		String s1 = "heima";
		String s2 = "heima";
		String s3 = "HeiMa";
		
		System.out.println(s1.equals(s2));		//true
		System.out.println(s2.equals(s3));		//false
		
		System.out.println("---------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));	
		System.out.println(s1.equalsIgnoreCase(s3)); 	//�����ִ�Сд
	}

}
