class Demo1_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();			//����: Animal�ǳ����; �޷�ʵ����
		Animal a = new Cat();				//��������ָ���������
		a.eat();
	}
}
/*
* B:�������ص�
	* a:������ͳ��󷽷�������abstract�ؼ�������
		* abstract class ���� {}
		* public abstract void eat();
	* b:�����಻һ���г��󷽷����г��󷽷�����һ���ǳ���������ǽӿ�
	* c:�����಻��ʵ������ô�����������ʵ������?
		* ���ն�̬�ķ�ʽ���ɾ��������ʵ��������ʵ��Ҳ�Ƕ�̬��һ�֣��������̬��
	* d:�����������
		* Ҫô�ǳ�����
		* Ҫô��д�������е����г��󷽷�
*/
abstract class Animal {						//������
	public abstract void eat();				//���󷽷�

	public Animal() {
		System.out.println("����ղι���");
	}
}

class Cat extends Animal {
	public Cat() {
		super();
	}
	public void eat() {
		System.out.println("è����");
	}
}