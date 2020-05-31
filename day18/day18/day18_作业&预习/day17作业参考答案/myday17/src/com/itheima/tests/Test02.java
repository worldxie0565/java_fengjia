package com.itheima.tests;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*
2.�����������󣬲��ô���ʵ�֣�	
	(1)����һ��TreeSet���ϣ�Ȼ�����6��Double���͵����ݣ��ֱ���[1.1,5.2,6.3,2.5,5.2,3.3]
	(2)��ȥ�أ�Ȼ��������(�Ӵ�С)

*/
public class Test02 {
				public static void main(String[] args) {
					TreeSet<Double> ts = new TreeSet<>(new Comparator<Double>() {
						@Override
						public int compare(Double o1, Double o2) {	
							int num = o2.compareTo(o1);
							return num==0?1:num;
						}			
					});
					//[1.1,5.2,6.3,2.5,5.2,3.3]
					ts.add(1.1);
					ts.add(5.2);
					ts.add(6.3);
					ts.add(2.5);
					ts.add(5.2);
					ts.add(3.3);
					Iterator<Double> it = ts.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
			}