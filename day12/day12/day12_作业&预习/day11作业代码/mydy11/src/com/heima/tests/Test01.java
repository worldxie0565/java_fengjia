package com.heima.tests;

/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��int���͵Ķ�ά����
 *	(2)��ȡ�ö�ά������СԪ�أ������
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//1.����int���͵Ķ�ά����
		int[][] arr = {{10,20,30},{3,2,1},{4,5,6},{100,200,300}};
		//2.�����int���͵Ķ�ά�����еĵ�һ��Ԫ��arr[0][0]����С��
		int min = arr[0][0];
		//3.������ά�����е�ÿ��һά����
		for(int i=0;i<arr.length;i++) {
			//4.������ǰһά�����е�ÿ��Ԫ�أ�ֻҪ��minС���ͽ���ǰԪ�ظ�ֵ��min
			for(int j=0;j<arr[i].length;j++) {
				if(min>arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		//4.��ӡ��Сֵ
		System.out.println("min="+min);
	}
}
