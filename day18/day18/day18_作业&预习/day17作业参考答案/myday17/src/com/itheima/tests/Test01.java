package com.itheima.tests;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*

1.�����������󣬲��ô���ʵ�֣�
	(1)����һ��Ա����Employee�������������ԣ�����(String name)������(int age)������(int salary)
	(2)����5������װ��TreeSet�����չ��ʴӸߵ�������������(������ͬ����������ӵ͵��ߣ����ʺ����䶼��ͬ��
		���������ֵ�˳�����У����ǲ���ȥ��(���������䡢���ʶ���ͬ))


*/
import com.itheima.domain.Employee;
			public class Test01 {
				public static void main(String[] args) {
					TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {

						@Override
						public int compare(Employee o1, Employee o2) {
							int num = o2.getSalary()-o1.getSalary();
							num = (num==0?o1.getAge()-o2.getAge():num);
							num = (num==0?o1.getName().compareTo(o2.getName()):num);
							num = (num==0?1:num);
							return num;
						}
						
					});
					set.add(new Employee("����",30,8000));
					set.add(new Employee("����",20,9000));
					set.add(new Employee("����",10,7000));
					set.add(new Employee("����",10,7000));
					set.add(new Employee("����",40,9000));
					set.add(new Employee("����",60,6000));
					set.add(new Employee("ˮ��",30,6000));
					//���õ�������ʾset���ϵ�����
					Iterator<Employee> it = set.iterator();
					while(it.hasNext()) {
						Employee employee = it.next();
						System.out.println(employee);
					}
				}
			}