package com.heima.tests;

import com.heima.domain.Student;

/**
 * ����Student��
 * @author JX
 *
 */
public class Test05 {
	public static void main(String[] args) {
		//1.���ÿղι��촴������
		Student s1 = new Student();
		//2.����set�������������Ը�ֵ
		s1.setName("���");
		s1.setAge(20);
		s1.setGender("��");
		s1.setScore(95);
		//3.����get������ӡѧ�������������,�������õĴ�ӡ��ʽ��toString�ĸ�ʽһ��
		System.out.println("Student [name="+s1.getName()+", gender="+s1.getGender()+", age="+s1.getAge()+", score="+s1.getScore()+"]");
		//4.����tostring��ӡѧ��������Ϣ
		System.out.println(s1.toString());
		System.out.println("==========================================");
		//5.�����вι��촴������
		Student s2 = new Student("С��Ů","Ů",35,80);
		//6.����hashCode������������ѧ�������hashCodeֵ������ӡ
		int hashCode1 = s1.hashCode();
		int hashCode2 = s2.hashCode();
		System.out.println("����s1��hashCodeֵΪ��"+hashCode1+",����s2��hashCodeֵΪ��"+hashCode2);
		//7.����equals�����ж����������Ƿ���ͬ������ӡ
		boolean b = s1.equals(s2);
		System.out.println("����s1�Ͷ���s2��"+(b?"��ͬ":"��ͬ")+"��");
	}
}
