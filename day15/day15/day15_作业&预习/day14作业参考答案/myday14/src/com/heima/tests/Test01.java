package com.heima.tests;
/**
 * 1.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ������ֻ�����������ַ�������{"16210626656","18601066888","13912387666","13156166693","15115888028"}
 *	(2)����������ʽ���˳������������ֻ����룬
 *		���򣺵�1λ��1���ڶ�λ����������358����֮һ������6λ�������֣����5λΪ������ͬ�����֡�
 *	(3)�磺18601066888 13912387666
 * @author JX
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String regex = "[1][358]\\d{6}(\\d)\\1{2}";
		String phone1 = "18601088888";
		String phone2 = "13912366666";
		String[] numbers = {"16210626656","18601066888","13912387666","13156166693","15115888028"};
		System.out.println("�����º������Ҫ��");
		for(int i = 0;i<numbers.length;i++) {
			boolean flag = numbers[i].matches(regex);
			if(flag) {
				System.out.println(numbers[i]);
			}
		}		
	}
}
