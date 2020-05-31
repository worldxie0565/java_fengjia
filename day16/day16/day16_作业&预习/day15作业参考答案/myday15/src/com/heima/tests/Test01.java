package com.heima.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)����10��1��100֮����������(�����ظ�)������һ��List����(�����Ȳ����÷��ͣ��������콲)
 *	(2)��д������List���Ͻ�������,����Collections.sort������TreeSet
 *	(2)Ȼ�����õ�������������Ԫ�ز����
 *	(3)�磺15 18 20 40 46 60 65 70 75 91
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = getRandomNum();
		sort(list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	
	//����10��1-100�������
	public static List<Integer> getRandomNum() {
		//1.����ArrayList���ϴ�����ɵ������
		List<Integer> list = new ArrayList<Integer>();
		//2.����Random����,�������������
		Random r = new Random();
		//3.�����ɵ�5�����������list������
		while(list.size()<10) {
			int num = r.nextInt(100)+1;
			//ȥ��
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		return list;
	}
	//��List�����е����ֽ��д�С���������
	public static void sort(List<Integer> list) {
		//1.��list����ת��Integer���͵�����
		Integer[] arr = list.toArray(new Integer[list.size()]);
		//2.����ð�������㷨
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {//3.�Զ�����
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//4.������������е�Ԫ�����·��뼯����
		for(int i = 0;i<arr.length;i++) {
			list.set(i, arr[i]);
		}
	}
}
