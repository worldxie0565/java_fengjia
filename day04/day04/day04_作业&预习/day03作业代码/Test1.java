import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// ¼����������
		Scanner sc = new Scanner(System.in); // ��������¼�����
		System.out.println("�������һ������:");
		int x = sc.nextInt(); // ������¼������ݴ洢��x��
		System.out.println(x);
		System.out.println("������ڶ�������:");
		int y = sc.nextInt(); // ������¼������ݴ洢��y��
		// boolean b = (x == y) ? true : false;
		boolean b = (x == y);
		System.out.println("b = " + b);
	}
}
