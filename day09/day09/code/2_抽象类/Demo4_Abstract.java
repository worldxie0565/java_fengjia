class Demo4_Abstract {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
/*
* A:������1
	* һ�����������û�г��󷽷����ɲ����Զ���Ϊ������?������ԣ���ʲô����?
	* ����
	* ��ô��Ŀ��ֻ��һ��,���ǲ��������ഴ���������,�����������
* B:������2
	* abstract���ܺ���Щ�ؼ��ֹ���
	abstract��static
	��abstract���εķ���û�з�����
	��static���εĿ���������.����,��������.���ó��󷽷���û�������
	abstract��final
	��abstract���εķ���ǿ��������д
	��final���εĲ���������д,����������ì��
	abstract��private
	��abstract���ε���Ϊ�������࿴����ǿ����д
	��private���β����������,����������ì�ܵ�
*/

abstract class Demo {
	//public static abstract void print();		//����: �Ƿ������η����: abstract��static
	//public final abstract void print();		//����: �Ƿ������η����: abstract��final
	private abstract void print();				//����: �Ƿ������η����: abstract��private
}