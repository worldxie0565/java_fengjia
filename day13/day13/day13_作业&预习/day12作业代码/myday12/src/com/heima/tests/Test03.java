package com.heima.tests;

import java.util.Scanner;
/**
 * 5.�����������󣬲��ô���ʵ�֣�
 *	(1)�Ӽ���¼��һ���ַ���
 *	(2)ͳ�Ƹô����д�д��ĸ��Сд��ĸ�����ָ��ж��ٸ���
 *		����:
 *			Hello12345World
 *			��д : 2��
 *			Сд : 8��
 *			���� : 5��
 * @author JX
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//1.��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���(���԰������֡���ĸ����������):");
		//2.�û������ַ���"ABCDEabcd123456!@#$%^"
		String s = sc.nextLine();
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
