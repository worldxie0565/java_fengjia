package com.heima.test;

public class Test7 {

	/**
	 * * A:��ͼ��ʾ
	 * ����ͳ�ƴ���С�����ֵĴ���
	 * ����Ĵ󴮺�С�������Լ������������
	 * 
	 */
	public static void main(String[] args) {
		//�����
		String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		//����С��
		String min = "heima";
		
		//�������������
		int count = 0;
		//��������
		int index = 0;
		//����ѭ��,�ж�С���Ƿ��ڴ��г���
		while((index = max.indexOf(min)) != -1) {
			count++;									//����������
			max = max.substring(index + min.length());
		}
		
		System.out.println(count);
	}

}
