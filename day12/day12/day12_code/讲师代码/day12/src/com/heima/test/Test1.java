package com.heima.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * * A:������ʾ
		* ����ģ���¼,�����λ���,����ʾ���м��Ρ�
		* �û��������붼��admin
		* ����:
		* 1,ģ���¼,��Ҫ����¼��,Scanner
		* 2,�����λ���,��Ҫѭ��,for
		* 3,����ʾ�м���,��Ҫ�ж�,if
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������¼�����
		
		for(int i = 0; i < 3; i++) {
			System.out.println("�������û���:");
			String userName = sc.nextLine();			//������¼����û����洢��userName��
			System.out.println("����������:");
			String password = sc.nextLine();			//������¼�������洢��password��
			
			//������ַ����������ַ��������Ƚ�,ͨ�������ַ����������÷���,������������������,��ֹ��ָ���쳣
			if("admin".equals(userName) && "admin".equals(password)) {
				System.out.println("��ӭ" + userName + "��¼");
				break;									//����ѭ��
			}else {
				if(i == 2) {
					System.out.println("���Ĵ�������ѵ�,������������");
				}else {
					System.out.println("¼�����,������" + (2-i) + "�λ���");
				}
			}
		
		}
	}

}
