package com.heima.tests;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)ͳ��ÿ�����ʳ��ֵĴ���
 *	(2)�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
 *	(3)��ӡ��ʽ��
 *		to=3
 * 		think=1
 * 		you=2
 * 		//........
 * @author JX
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//1.�ָ��ַ���
		String[] arr = "If you want to change your fate I think you must come to the dark horse to learn java".split(" ");
		//2.�ּ�洢
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String key:arr){
			//System.out.println(key);ÿ������
			/*if(!map.containsKey(key)){//�鿴�Ƿ���ڸõ���
				map.put(key, 1);
			} else {//����
				map.put(key, map.get(key)+1);
			}*/
			Integer value = map.get(key);
			if(null == value) {
				map.put(key, 1);
			} else {
				map.put(key, value+1);
			}
		}
		//3.�鿴ÿ�����ʳ��ֵĴ���
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}
	}
}
