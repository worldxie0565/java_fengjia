package com.heima.tests;
/**
 * 4.�����������󣬲��ô���ʵ�֣�
 *	(1)��ӡ��7��8��9����������ɵ���λ����Ҫ�����λ����������λ���ֲ�����ͬ
 *	(2)��ӡ��ʽ������λ�����Կո�ָ�����789 798 879 897 978 987
 * @author JX
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr = {7,8,9};
		int len = arr.length;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				for(int k=0;k<len;k++) {
					if((arr[i]!=arr[j])&&(arr[j]!=arr[k])&&(arr[k]!=arr[i])) {
						int temp = arr[i]*100+arr[j]*10+arr[k];
						sb.append(temp+" ");
					}
				}
			}
		}
		//��ʽ���ȥ�����һ���ո�
		sb.replace(sb.lastIndexOf(" "), sb.length(), "");
		System.out.println(sb.toString());
	}
}
