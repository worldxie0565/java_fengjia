public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������¼�����
		//����¼����ϰ������¼���������ݣ���ȡ�����������е���Сֵ
		System.out.println("�������һ������:");
		int x = sc.nextInt();						//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();						//������¼������ݴ洢��y��
		System.out.println("���������������:");
		int z = sc.nextInt();						//������¼������ݴ洢��y��
		//������ʱ������¼ס�Ƚϳ�ǰ���������е���Сֵ
		//int temp = (x < y) ? x : y;
		//���ȽϺ�Ľ��������������е�ֵ�Ƚ�,�Ƚϳ��������е���Сֵ
		//int min = (temp < z) ? temp : z;
		//��һ����Ԫ������㶨
		int min = ((x < y) ? x : y)<z?((x < y) ? x : y):z;
		System.out.println("min="+min);
	}
}
