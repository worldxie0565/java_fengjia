class Demo1_Interface {
	public static void main(String[] args) {
		//Inter i = new Inter();		//�ӿڲ��ܱ�ʵ����,��Ϊ���ó��󷽷�û������
		Inter i = new Demo();			//��������ָ���������
		i.print();
	}
}
/*
* A:�ӿڸ���
	* ������ĽǶȽ�����ָjava�е�interface
	* �ӹ���ĽǶȽ������ṩ����Ķ��ǽӿ� 
* B:�ӿ��ص�
	* a:�ӿ��ùؼ���interface��ʾ	
		* interface �ӿ��� {}
	* b:��ʵ�ֽӿ���implements��ʾ
		* class ���� implements �ӿ��� {}
	* c:�ӿڲ���ʵ����
		* ��ô���ӿ����ʵ������?
		* ���ն�̬�ķ�ʽ��ʵ������
	* d:�ӿڵ�����
		* a:�����ǳ����ࡣ�������岻��
		* b:�����Ǿ����ࡣҪ��д�ӿ��е����г��󷽷���(�Ƽ�����)
* C:������ʾ
	* �ӿ��ص�
*/

interface Inter {
	public abstract void print();					//�ӿ��еķ������ǳ����
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}