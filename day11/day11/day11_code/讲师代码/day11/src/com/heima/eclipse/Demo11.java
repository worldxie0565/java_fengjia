package com.heima.eclipse;

import com.heima.animal.Cat;


public class Demo11 {
	/*  
	    * A:�½� ctrl + n
		* B:��ʽ��  ctrl+shift+f
		* C:�����  ctrl+shift+o 
		* D:ע��  ctrl+/,ctrl+shift+/,ctrl+shift+\
		* E:���������ƶ� ѡ�д���alt+��/�¼�ͷ
		* F:�鿴Դ��  ѡ������(F3����Ctrl+�����)
		* G:���Ҿ������ ctrl + shift + t
		* H:���Ҿ�����ľ��巽�� ctrl + o
		* I:������ ctrl+1,�����ұ�������ߵ���������,���ɷ���
		* J:ɾ������ ctrl + d
		* K:��ȡ����alt + shift + m 
		* L:����alt + shift + r 
	*/

	public static void main(String[] args) {
		//demo2();
		//Student student = new Student("����", 23);
		//System.out.println(student.getName() +"..."+ student.getAge());
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
	
	
	}

	private static void demo2() {
		int[] arr1 = { 11, 22, 33, 44, 55 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// Scanner scanner = new Scanner(System.in);

		int a = 10;
		int b = 20;
		int sum = add(a, b);
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
