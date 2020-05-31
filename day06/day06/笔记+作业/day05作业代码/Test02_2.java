/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
 *	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
 * @author JX
 *
 */
public class Test02_2 {
	public static void main(String[] args) {
		int[] arr = {6,2,9,15,1,5,20,7,18};
		printArr(arr); // ��������ӡ
	}
	//���彻���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
	//ע�⣺��������Ƕ�׵��õ��ǲ���Ƕ�׶���
	public static void printArr(int[] arr) {
		//�������Ԫ�������һλԪ�ؽ��н���
		int maxIndex = getMaxIndex(arr);
		int minIndex = getMinIndex(arr);
		swap(arr,maxIndex,arr.length-1);
		swap(arr,minIndex,0);
		for (int i : arr) { // �����������
			System.out.print(i + " ");
		}
	}
	//���彻������ָ��λ�õ�Ԫ�صķ���
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//���巽����ȡ�������ֵ��Ӧ������λ��
	public static int getMaxIndex(int[] arr) {
		// ��������ĵ�һ��Ԫ��Ϊ���ֵ
		int index = 0; 
		for (int i = 0; i < arr.length; i++) { // ��������
			if (arr[index] < arr[i]) {
				index = i;
			}
		}
		return index; // ������ֵ����
	}
	//���巽����ȡ������Сֵ��Ӧ������λ��
	public static int getMinIndex(int[] arr) {
		// ��������ĵ�һ��Ԫ��Ϊ��Сֵ
		int index = 0; 
		for (int i = 0; i < arr.length; i++) { // ��������
			if (arr[index] > arr[i]) {
				index = i;
			}
		}
		return index; // ������ֵ����
	}
}
