/**
 * 3.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
 *	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
 * @author JX
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr = {6,2,9,15,1,5,20,7,18};
		int maxIndex = getMaxOrMinIndex(arr, true); // ��ȡ���ֵ����
		int minIndex = getMaxOrMinIndex(arr, false); // ��ȡ��Сֵ����
		printArr(arr, maxIndex, minIndex); // ��������ӡ
	}
	//���彻���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
	public static void printArr(int[] arr, int maxIndex, int minIndex) {
		/*
		//�������Ԫ�������һλԪ�ؽ��н���
		int temp = arr[maxIndex]; 
		arr[maxIndex] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		//��СԪ�����һλԪ�ؽ��н���
		temp = arr[0]; // ������СԪ��
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		*/
		//�������Ԫ�������һλԪ�ؽ��н���
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
	//���巽����ȡ�����е����ֵ������Сֵ��Ӧ��������flagΪ"true"��ʾ�����ֵ��������flagΪfalse��ʾ����Сֵ������
	//���Խ���ȡ���ֵ��������Сֵ�����ķ���д������ķ��������ǽ���ֿ�д
	public static int getMaxOrMinIndex(int[] arr, boolean flag) {
		// ��������ĵ�һ��Ԫ��Ϊ��ֵ
		int index = 0; 
		for (int i = 0; i < arr.length; i++) { // ��������
			if (flag) { // ���ֵ
				if (arr[index] < arr[i]) {
					index = i;
				}
			} else {
				if (arr[index] > arr[i]) { // ��Сֵ
					index = i;
				}
			}
		}
		return index; // ������ֵ����
	}

}
