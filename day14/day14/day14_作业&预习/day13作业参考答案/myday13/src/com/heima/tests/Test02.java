package com.heima.tests;
/**
 * 2.�����������󣬲��ô���ʵ�֣�
 *	(1)��һ�������ַ���"25 11 -6 20 102 9",����֮���ÿո���	
 *	(2)����ð��������⴮���ְ��մ�С������������һ����ֵ������ַ���"-6 9 11 20 25 102"
 *	(3)��ʾ:��String���ṩ��split����(��" "(�ո�)��Ϊsplit�����Ĳ������и�)��Ȼ�����ɶ�Ӧ�������ַ�������
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "25 11 -6 20 102 9";
		//1.���ַ������ֱ���ַ�������
		String[] arr = str.split(" ");
		//2.����һ��int����,���Ⱥ�arr��ͬ
		int[] intArr = new int[arr.length];
		//3.��arr�е��ַ������͵�����ת��int���Ͳ�����������intArr��
		for(int i =0;i<arr.length;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		//4.����sort��������������
		sort(intArr);
		//5.toString()�������������ַ���
		System.out.println(toString(intArr));
	}
	//����toString����,��int[]�������ַ�����ʽ"23 9 -4 18 100 7"
	private static String toString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;;i++) {
			sb.append(arr[i]);
			if(i==arr.length-1)
				return sb.toString();	
			sb.append(" ");
		}			
	}
	//ð�������������������
	public static void sort(int[] arr) {
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
