package com.heima.tests;
/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)ģ��Arrays.toString(int[] arr);�������Լ���װһ��public static String toString(int[] arr);
 *	(2)���int��������arrΪnull��toString���������ַ���"null"
 *	(3)���int��������arr����Ϊ0��toString���������ַ���"[]"
 *	(4)���int��������arr������Ϊ{1,2,3,4,5},toString���������ַ���"[1, 2, 3, 4, 5]"
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr1 = null;
		System.out.println(toString(arr1));
		int[] arr2 = new int[0];
		System.out.println(toString(arr2));
		int[] arr3 = {1,2,3,4,5};
		System.out.println(toString(arr3));
	}
	public static String toString(int[] arr) {
		//����Ϊ��ֱ�ӷ����ַ���"null"
        if (arr == null)
            return "null";
        int maxLen = arr.length - 1;
        //���鳤��Ϊ0�������ַ���"[]"
        if (maxLen == -1)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(arr[i]);
            if (i == maxLen)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }
}
