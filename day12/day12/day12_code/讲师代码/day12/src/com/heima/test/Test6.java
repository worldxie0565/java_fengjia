package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * * A:������ʾ
		* ���󣺰��ַ�����ת
			* ����������¼��"abc"		
			* ��������"cba"
		*����:
		*1,ͨ������¼���ȡ�ַ���Scanner
		*2,���ַ���ת�����ַ�����
		*3,���ű����ַ�����,���ٴ�ƴ�ӳ��ַ���
		*4,��ӡ 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();						//������¼����ַ����洢��line��
		
		char[] arr = line.toCharArray();					//���ַ���ת��Ϊ�ַ�����
		
		String s = "";
		for(int i = arr.length-1; i >= 0; i--) {			//���ű����ַ�����
			s = s + arr[i];									//ƴ�ӳ��ַ���
		}
		
		System.out.println(s);
	}

}
