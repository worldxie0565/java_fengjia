package com.heima.string;

public class Demo5_StringMethod {

	/**
	 * * int length():��ȡ�ַ����ĳ��ȡ�
	* char charAt(int index):��ȡָ������λ�õ��ַ�
	* int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
	* int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
	* int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
	* int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
	* lastIndexOf
	* String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
	* String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
	 */
	public static void main(String[] args) {
		demo1();
		//demo2();
		//demo3();
		//demo4();
		String s = "woaiheima";
		s.substring(4);									//subString�����һ���¶��ַ���,��Ҫ���µ��ַ�����¼
		System.out.println(s);
	}

	private static void demo4() {
		String s1 = "heimawudi";
		String s2 = s1.substring(5);
		System.out.println(s2);

		String s3 = s1.substring(0, 5);					//����ͷ,������β,����ҿ�
		System.out.println(s3);
	}

	private static void demo3() {
		String s1 = "woaiheima";
		int index1 = s1.indexOf('a', 3);					//��ָ��λ�ÿ�ʼ�����
		System.out.println(index1);

		int index2 = s1.lastIndexOf('a');					//�Ӻ���ǰ��,��һ�γ��ֵ��ַ�
		System.out.println(index2);

		int index3 = s1.lastIndexOf('a', 7);				//��ָ��λ����ǰ��
		System.out.println(index3);
	}

	private static void demo2() {
		String s1 = "heima";
		int index = s1.indexOf('e');						//�������յ���int���͵�,����char���͵Ļ��Զ�����
		System.out.println(index);

		int index2 = s1.indexOf('z');						//��������ڷ��ؾ���-1
		System.out.println(index2);

		int index3 = s1.indexOf("ma");						//��ȡ�ַ����е�һ���ַ����ֵ�λ��
		System.out.println(index3);

		int index4 = s1.indexOf("ia");
		System.out.println(index4);
	}

	private static void demo1() {
		//int[] arr = {11,22,33};
		//System.out.println(arr.length);					//�����е�length������
		String s1 = "heima";
		System.out.println(s1.length());					//length()��һ������,��ȡ����ÿһ���ַ��ĸ���
		String s2 = "��Ҫ����,����?";
		System.out.println(s2.length());

		char c = s2.charAt(5);								//����������ȡ��Ӧλ�õ��ַ�
		System.out.println(c);
		char c2 = s2.charAt(10);							//StringIndexOutOfBoundsException�ַ�������Խ���쳣
		System.out.println(c2);
	}

}
