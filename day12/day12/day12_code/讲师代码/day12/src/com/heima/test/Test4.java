package com.heima.test;

public class Test4 {

	/**
	 * * A:������ʾ
	 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
	 * ��ʽ���:ֻҪ��֤ÿ�ε����귽�����ص��Ƕ���,�Ϳ��Լ�������
	 */
	public static void main(String[] args) {
		String s = "woaiHEImaniaima";
		String s2 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s2);
	}

}
