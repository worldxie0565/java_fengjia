
public class Test1 {

	/**
	 * 
		1,1-6λ��ĸ�����֣�
		2,�ֻ���
		3,Email
		4,�û���. ��ĸ�����»���10λ����, ��������ĸ��ͷ
		5,����. �����ַ�, 6-16λ
		6,����,����������,�ֺ��ֺ�
		7,�ֻ�����,�����λ��������ͬ��
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		//demo7();
		String regex1 = "1[34578]\\d{9}";
		String regex2 = "1[34578]\\d{4}(\\d)\\1{4}";
		System.out.println("13812300000".matches(regex2));
		System.out.println("15932166666".matches(regex2));
		System.out.println("13812345678".matches(regex2));
	}

	public static void demo7() {
		String regex = "(.)\\1+(.)\\2+";
		System.out.println("�������".matches(regex));
		System.out.println("�߸�����".matches(regex));
		System.out.println("����������".matches(regex));
		
		String regex2 = "(..)\\1";
		System.out.println("�ֺ��ֺ�".matches(regex2));
		System.out.println("��������".matches(regex2));
	}

	public static void demo6() {
		//5,����. �����ַ�, 6-16λ
		String regex = ".{6,16}";
		System.out.println("123456".matches(regex));
		System.out.println("abcde".matches(regex));
		System.out.println("1234567890987654".matches(regex));
		System.out.println("12345678909876543".matches(regex));
	}

	public static void demo5() {
		//4,�û���. ��ĸ�����»���10λ����, ��������ĸ��ͷ
		String regex = "[a-zA-Z]\\w{0,9}";
		System.out.println("0abcde".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("abcdef12345".matches(regex));
	}

	public static void demo4() {
		//3,Email   fengjia@itcast.cn
		//          fengjia@itcast.com.cn
		String regex = "[\\w-\\.]+@([\\w-]+\\.)+[a-z]{2,3}";
		System.out.println("fengjia@itcast.cn".matches(regex));
		System.out.println("2553868@qq.com".matches(regex));
		System.out.println("fengjia@itcast.cn".matches(regex));
	}

	public static void demo3() {
		//2,�ֻ���
		String regex = "1[34578]\\d{9}";
		System.out.println("13898765432".matches(regex));
		System.out.println("01234567890".matches(regex));
		System.out.println("16123456789".matches(regex));
		System.out.println("159123456780".matches(regex));
	}

	public static void demo2() {
		//1,1-6λ��ĸ�����֣�
		String regex = "[\\d[a-zA-Z]]{1,6}";
		System.out.println("123456".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("abcd".matches(regex));
	}

	public static void demo1() {
		//qq����
		String regex = "[1-9]\\d{4,10}";
		System.out.println("2553868".matches(regex));
		System.out.println("012345".matches(regex));
		System.out.println("12345678987".matches(regex));
	}

}
