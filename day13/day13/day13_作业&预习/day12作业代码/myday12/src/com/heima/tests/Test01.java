package com.heima.tests;
/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)�������·���public static String getPropertyGetMethodName(String property);
 *	(2)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
 *	(3)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"

 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String property = "name";
		String propertyGetMethodName = getPropertyGetMethodName(property);
		System.out.println(propertyGetMethodName);
	}
	public static String getPropertyGetMethodName(String property) {
		//1.property.substring(0, 1).toUpperCase():��ȡ����property�ĵ�һ����ĸ����ɴ�д��ĸ
		//2.property.substring(1):��ȡ����property�ĵڶ�����ĸ�Ժ����ĸ
		//3.��concat�����ַ���������		
		return "get".concat(property.substring(0, 1).toUpperCase()).concat(property.substring(1));
	}
}
