package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.heima.bean.Person;

public class Demo4_Field {

	/**
	 * Class.getField(String)�������Ի�ȡ���е�ָ���ֶ�(�ɼ���),
	 * �����˽�еĿ�����getDeclaedField("name")������ȡ,ͨ��set(obj, "����")������������ָ�������ϸ��ֶε�ֵ,
	 * �����˽�е���Ҫ�ȵ���setAccessible(true)���÷���Ȩ��,�û�ȡ��ָ�����ֶε���get(obj)���Ի�ȡָ�������и��ֶε�ֵ
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);	//��ȡ�вι���
		Person p = (Person) c.newInstance("����",23);						//ͨ���вι��촴������
		
		//Field f = clazz.getField("name");								//��ȡ�����ֶ�
		//f.set(p, "����");												//�޸�������ֵ
		Field f = clazz.getDeclaredField("name");						//���������ȡ�ֶ�
		f.setAccessible(true);											//ȥ��˽��Ȩ��
		f.set(p, "����");	
		
		System.out.println(p);
	}

}
