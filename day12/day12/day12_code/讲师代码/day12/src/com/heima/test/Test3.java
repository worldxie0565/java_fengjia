package com.heima.test;

public class Test3 {

	/**
	 * A:������ʾ
		* ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
		* ABCDEabcd123456!@#$%^
		* ����:�ַ��������ַ���ɵ�,���ַ���ֵ�����з�Χ��,ͨ����Χ���ж��Ƿ�������ַ�
		* ����������ü�������������
	 */
	public static void main(String[] args) {
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		//1,��ȡÿһ���ַ�,ͨ��forѭ������
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);						//ͨ��������ȡÿһ���ַ�
			//2,�ж��ַ��Ƿ��������Χ��
			if(c >= 'A' && c <= 'Z') {
				big++;									//��������Ǵ�д��ĸ,�������Ӧ�ı�������
			}else if(c >= 'a' && c <= 'z') {
				small++;
			}else if(c >= '0' && c <= '9') {
				num++;
			}else {
				other++;
			}
		}
		
		//3,��ӡÿһ���������Ľ��
		System.out.println(s + "�д�д��ĸ��:" + big + "��,Сд��ĸ��:" + small + "��,�����ַ�:" 
		+ num + "��,�����ַ�:" + other + "��");
	}

}
