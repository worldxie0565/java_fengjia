package com.heima.tests;

import java.util.Scanner;

/**
 * 4.�����������󣬲��ô���ʵ�֣�
 *	(1)����¼��6��int���͵����ݴ�������arr��
 *	(2)��arr�����е����ݷ�ת
 *	(3)����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
 *	(4)����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
 *	(5)��ӡ���յ�����(ʵ����1-4��֮�������)
 *	(6)�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]
 * @author JX
 *
 */
public class Test04 {
	public static void main(String[] args) {
		//1.ͨ������¼���ȡ����
		int[] arr = getArrayByKeyBoard();
		//2.����Ҫ����������
		getSecurityArray(arr);
		//3.��ӡ��������
		print(arr);		
	}	
	//1.ͨ������¼��6��int���͵����ֲ�����������
	public static int[] getArrayByKeyBoard() {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("����������6��������");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	//2.���鷴ת
	public static void reverseArray(int[] arr) {
		int startIndex = 0;//�ʼ������
		int endIndex = arr.length-1;//��������	
		
		for(;startIndex<=endIndex;startIndex++,endIndex--) {			
			swap(arr,startIndex,endIndex);
		}		
	}	
	//3.����arr�����нǱ�ΪstartIndex��endIndex��Ԫ��
	private static void swap(int[] arr, int startIndex, int endIndex) {
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}
	//4.����ķ�ת ��ת������� �Ǳ�Ϊ�����Ļ��໻ 1 ��3�� 3�� 5���Դ����� 
	public static void reverseArrayByIndex(int[] arr){
		//i=1,j=3;i=3,j=5;i=5,j=7
		for(int i=1,j=i+2;i<arr.length&&j<arr.length;i+=2,j+=2) {
			swap(arr,i,j);
		}
		
	}
	//5.Ȼ���������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
	private static void swap(int[] arr){
		//�����е����һ��Ϊ�����ĽǱ�
		int lastIndex = (arr.length-1)%2==0?arr.length-2:arr.length-1;
		swap(arr,1,lastIndex);
	}
	//6.��ӡ���飬�������Ϊ0����ӡ[],�������Ϊnull,��ӡnull�������ӡ��ʽ�磺[1, 2, 3, 4, 5, 6]
	public static void print(int[] arr){
		//�������Ϊnull,��ӡnull
		if(arr==null) {
			System.out.println("null");
			return;
		}
		//�������Ϊ0����ӡ[]
		if(0==arr.length) {
			System.out.println("[]");
			return;
		}
		System.out.print("[");
		for(int i =0;i<arr.length;i++) {				
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	//7.ֱ�ӻ�ȡ���ܺ������
	public static void getSecurityArray(int[] arr) {
		//1.���鷴ת
		reverseArray(arr);
		//2.����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
		reverseArrayByIndex(arr);
		//3.Ȼ���������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
		swap(arr);
	}
}
