package com.heima.test;

public class Test5 {

	/**
	 * * A:������ʾ
		* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
			* ������
				* int[] arr = {1,2,3};	
			* ��������
				* "[1, 2, 3]"
				* 
		����:
		1,��Ҫ����һ���ַ���"["
		2,���������ȡÿһ��Ԫ��
		3,���ַ����������е�Ԫ�ؽ���ƴ��
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = "[";							//����һ���ַ���������������Ԫ��ƴ��
		
		for (int i = 0; i < arr.length; i++) {	//{1,2,3}
			if(i == arr.length - 1) {
				s = s + arr[i] + "]";			//[1, 2, 3]
			}else {
				s = s + arr[i] + ", ";			//[1, 2, 
			}
		}
		
		System.out.println(s);
	}

}
