class Demo2_Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);
	}
}
/*
* ��Ա������ֻ���ǳ����������Ǿ�̬�Ĳ������ġ�
			* Ĭ�����η���public static final	�����ؼ��ֿ��Ի��ཻ��λ��
			* ���飺�Լ��ֶ�������
	* ���췽�����ӿ�û�й��췽����
	* ��Ա������ֻ���ǳ��󷽷���
			* Ĭ�����η���public abstract
			* ���飺�Լ��ֶ�������
*/
interface Inter {
	public static final int num = 10;
	//public Inter(){}					�ӿ���û�й��췽��

	/*public void print() {				�ӿ��в��ܶ���ǳ��󷽷�
	
	}*/

	public abstract void print();
}

class Demo /*extends Object*/ implements Inter {	//һ���಻д�̳��κ���,Ĭ�ϼ̳�Object��
	public void print() {
		//num = 20;
		System.out.println(num);
	}

	public Demo() {
		super();
	}

}