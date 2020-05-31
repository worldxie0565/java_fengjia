package com.heima.tests;

import java.util.Arrays;
import java.util.LinkedHashSet;
/**
 * 2.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,6,1,2,6,7,8}
 *	(2)ȥ�����涨��������е��ظ�Ԫ�أ���ӡ���ս��{6, 2, 9, 1, 7, 8}
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr = {6,2,9,6,1,2,6,7,8};
		arr = getSingleArr(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==============");
		int[] arr2 = new int[]{6,2,9,6,1,2,6,7,8};
		System.out.println(printArr(arr2));
	}
	//����ȥ�صķ���
	public static int[] getSingleArr(int[] arr) {
		//index��ʾ���ܱ�ʾ��ǰ�����������������е�λ�ã����ܱ�ʾ�����������е����ݵĸ���
		int index = 0;
		//1.����һ���������鳤����ͬ������
		int[] newArr = new int[arr.length];
		//2.���������������
		for(int i = 0;i<arr.length;i++) {
			//3.����flag��ǣ���ʾ���������Ƿ������ǰ������������������
			boolean flag = false;
			//4.���������飬�鿴�Ƿ�����������еĵ�ǰԪ�أ������������flag��Ϊtrue
			for (int j = 0;j<newArr.length;j++) {
				if (arr[i] == newArr[j]) {
					flag = true;
					break;
				}
			}
			//5.flagΪfalseʱ˵���������в�������ǰ����������������ݣ�������ǰ�������������Ԫ�ش�����������
			if (!flag) {
				newArr[index++] = arr[i];
			}
		}
		//return Arrays.copyOf(newArr, index);
		//6.ȥ���������е���Ч��Ԫ��
		//7.����һ����Ҫ���ظ������ߵ�����returnArr��������ĳ���Ϊindex
		int[] returnArr = new int[index];
		//8.���������е�index��Ԫ�ش���returnArr�����У����������鷵��
		for(int i=0;i<index;i++) {
			returnArr[i] = newArr[i];
		}
		return returnArr;
	}
	//�Զ����ӡ����ķ���prinArr����ʽ{6, 2, 9, 1, 7, 8}
	public static String printArr(int[] arr) {
		//1.���arr==null��ֱ�ӷ���"null"
		if(null == arr) {
			return "null";
		}
		//2.�������ĳ���Ϊ0��ֱ�ӷ���"[]"
		int maxLength = arr.length-1;
		String s = "";
		if(-1==maxLength) {
			return "[]";
		}
		//3.��������Ԫ�ؽ������װ��"[6, 2, 9, 1, 7, 8]"��ʽ
		s+="{";		
		for(int index = 0;;index++ ) {
			s+=arr[index];
			if(index==maxLength)
				return s+"}";
			s+=", ";
		}
	}
}
