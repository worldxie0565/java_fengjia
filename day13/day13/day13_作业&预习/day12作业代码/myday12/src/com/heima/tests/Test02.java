package com.heima.tests;
/**
 * 4.�����������󣬲��ô���ʵ�֣�
 *	(1)���������ַ�������{"010","3223","666","7890987","123123"}
 *	(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ��ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ���������
 *	(3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵ�
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//Ӣ�ĵ���symmetrical����ʾ�ԳƵ�
		String[] strs = {"010","3223","666","7890987","123123"};
		for (String str : strs) {
			boolean b = isSymmString(str);
			System.out.println(str+(b==true?" ��":" ����")+"�ԳƵ�");			
		}
		
	}
	//�ж������ַ����Ƿ��ǶԳƵ�
	private static boolean isSymmString(String str) {
		char[] arr = str.toCharArray();
		for(int start =0,end=arr.length-1;start<=end;start++,end--) {
			if(arr[start]!=arr[end]) {
				return false;
			}
		}
		return true;
	}
}
