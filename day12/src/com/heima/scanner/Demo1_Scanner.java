package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//����¼��
		//int i = sc.nextInt();								//����¼�������洢��i��
		//System.out.println(i);
		if(sc.hasNextInt()) {								//�жϼ���¼����Ƿ���int���͵�����
			int i = sc.nextInt();							//����¼������ݴ洢��i��
			System.out.println(i);
		}else {
			System.out.println("��������ʹ���");
		}
		
	}

}
