package com.heima.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)ͨ������¼�������ַ�������ʽ(2015-10-20)
 *	(2)��������������ڼ�����һ��ĵڼ���
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) throws Exception {
		//1.��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������ַ���(��ʽ:2015-10-20):");
		//2.��ȡ����¼����ַ�������
		String dateStr = sc.nextLine();
		//3.�����ʽ���ͽ������ڵĶ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��-MM��-dd��");
		//4.��������ַ�������ת�������ڶ���
		Date date = sdf.parse(dateStr);
		//5.�����ڶ���ת����Calendar����
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//6.��ȡ�����ڶ�����һ�ܵĵڼ���
		int week = c.get(Calendar.DAY_OF_WEEK);
		//7.��ȡ�����ڶ�����һ���еĵڼ���
		int day = c.get(Calendar.DAY_OF_YEAR);
		//8.��ʽ��date�������ڴ�ӡ
		String dateStr2 = sdf2.format(date);
		System.out.println(dateStr2+" �� "+getWeek(week)+"����  "+c.get(Calendar.YEAR)+"��ĵ� "+day+" ��");
	}
	
	/*
	 * �����ڴ洢���н��в��
	 * 1,����ֵ����String
	 * 2,�����б�int week
	 */	
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		
		return arr[week];
	}
}
