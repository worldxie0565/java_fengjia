package com.heima.object;

import com.heima.bean.Student;

public class Demo4_Equals {

	/**
	 * @param args
	 * equals�������Ƚ����������Ƿ����
	 * public boolean equals(Object obj){
	 *    return (this == obj);
	 * }
	 * 
	 * Object�е�equals�����ǱȽ϶���ĵ�ֵַ��û��ʲô���壬���� ��Ҫ��д����
	 * ��Ϊ�ڿ���������ͨ���Ƚϵ��Ƕ����е�����ֵ��������Ϊ ��ͬ������ͬһ�������������Ǿ���Ҫ��дequals������
	
	   ==��equals����������
	       ��ͬ�㣺���������Ƚϣ�����ֵ����boolean
	        ����1��==�ǱȽ��������,�ȿ��ԱȽϻ�����������,Ҳ���ԱȽ�������������,�����������ͱȽϵ���ֵ,�����������ͱȽϵ��ǵ�ֵַ
	 	    2��equals����ֻ�ܱȽ�������������,equals������û����д֮ǰ,�Ƚϵ��ǵ�ֵַ���ײ���������==�ţ����ǱȽϵ�ֵַ��û
	 	               ������ģ�������Ҫ��дequals�����Ƚ϶����е�����ֵ��
	 	    
	 */
	public static void main(String[] args) {

		Student s1 =  new Student("����", 23);
		Student s2 =  new Student("����", 23);
		boolean b = s1.equals(s2);   			//�Ƚ�2�������Ƿ����
		System.out.println(s1 == s2);
		System.out.println(b);					//��д֮��Ƚϵ��Ƕ����е�����ֵ
	}

}
