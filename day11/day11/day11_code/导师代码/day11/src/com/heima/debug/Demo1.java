package com.heima.debug;

public class Demo1 {

  /**
	* 
	* ��β鿴����ִ������		
	* ʲô�Ƕϵ㣺
		* ����һ����ǣ������￪ʼ��
	* ������öϵ㣺
		* ���뿴����ĳ���������Ǹ���Ч��������˫�����ɡ�
	* ���������öϵ㣺
		* ���ﲻ������
		* Ŀǰ�����Ǿ���ÿ�������ĵ�һ����Ч����϶��ӡ�
	* ����������öϵ��ĳ���
		* �Ҽ� -- Debug as -- Java Application
	* ����Щ�ط���
		* Debug���ϵ���Եĵط�
		* ������ط�����סF6�����ߵ��Ҳ���ԡ�һ�ο�һ�е�ִ�й��̡�
		* Variables���鿴����ı����仯
		* ForDemo�����鿴��Դ�ļ�
		* Console������̨
	* ���ȥ�ϵ㣺
		* a:�ٴ�˫������
		* b:�ҵ�Debug��ͼ��Variables���棬�ҵ�Breakpoints���������Ȼ�󿴵����еĶϵ㣬������Ǹ�˫��
    */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}
