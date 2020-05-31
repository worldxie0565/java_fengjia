package com.heima.string;

public class Demo7_StringMethod {

	/**
	 * * A:String���滻���ܼ�������ʾ
			* String replace(char old,char new)
			* String replace(String old,String new)
		* B:String��ȥ���ַ������ո񼰰�����ʾ
			* String trim()
		* C:String�İ��ֵ�˳��Ƚ������ַ�����������ʾ
			* int compareTo(String str)(��ʱ��������)
			* int compareToIgnoreCase(String str)(�˽�)
			 
			* 
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		String s1 = "a";
		String s2 = "aaaa";
		
		int num = s1.compareTo(s2);				//�������ֵ�Ƚ�
		System.out.println(num);
		
		String s3 = "��";
		String s4 = "��";
		int num2 = s3.compareTo(s4);
		System.out.println('��' + 0);			//���ҵ���unicode���ֵ
		System.out.println('��' + 0);
		System.out.println(num2);
		
		String s5 = "heima";
		String s6 = "HEIMA";
		int num3 = s5.compareTo(s6);
		System.out.println(num3);
		
		int num4 = s5.compareToIgnoreCase(s6);
		System.out.println(num4);
		
		/*
		 * public int compare(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            int min = Math.min(n1, n2);
            for (int i = 0; i < min; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    c1 = Character.toUpperCase(c1);						//��c1�ַ�ת���ɴ�д
                    c2 = Character.toUpperCase(c2);						//��c2�ַ�ת���ɴ�д
                    if (c1 != c2) {
                        c1 = Character.toLowerCase(c1);					//��c1�ַ�ת����Сд
                        c2 = Character.toLowerCase(c2);					//��c2�ַ�ת����Сд
                        if (c1 != c2) {
                            // No overflow because of numeric promotion
                            return c1 - c2;
                        }
                    }
                }
            }
            return n1 - n2;
		 */
	}

	private static void demo2() {
		String s = "   hei   ma   ";
		String s2 = s.trim();
		System.out.println(s2);
	}

	private static void demo1() {
		String s = "heima";
		String s2 = s.replace('i', 'o');			//��o�滻i
		System.out.println(s2);
		
		String s3 = s.replace('z', 'o');			//z������,����ԭ�ַ����ı�
		System.out.println(s3);
		
		String s4 = s.replace("ei", "ao");
		System.out.println(s4);
	}

}
