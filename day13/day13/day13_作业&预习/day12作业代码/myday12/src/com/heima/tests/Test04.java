package com.heima.tests;
/**
 * A:������ʾ	
 * 	ͳ�ƴ���С�����ֵĴ���
 * @author JX
 *
 */
public class Test04 {

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
		while(max.indexOf(min,index)!= -1) {
			count++;									//����������
			index = max.indexOf(min,index)+min.length();
		}
		
		System.out.println(count);
	}
}

