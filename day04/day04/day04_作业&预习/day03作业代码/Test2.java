public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//��������¼�����		
		//����¼����ϰ������¼���������ݣ���ȡ�����������е���Сֵ
		System.out.println("�������һ������:");
		int x = sc.nextInt();					//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();					//������¼������ݴ洢��y��
		int min = (x < y) ? x : y;				//��ȡx��y�е���Сֵ
		System.out.println("min = " + min);
	}
}