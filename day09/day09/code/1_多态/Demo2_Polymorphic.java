class Demo2_Polymorphic {
	public static void main(String[] args) {
		/*Father f = new Son();					//��������ָ���������
		System.out.println(f.num);

		Son s = new Son();
		System.out.println(s.num);*/

		Father f = new Son();
		//f.print();
		f.method();							//�൱����Father.method()
	}
}
/*
��Ա����
���뿴���(����),���п����(����)
��Ա����
���뿴���(����)�����п��ұ�(����)����̬��
��̬����
���뿴���(����)�����п����(����)��
(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
ֻ�зǾ�̬�ĳ�Ա����,���뿴���,���п��ұ� 
*/
class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}

	public static void method() {
		System.out.println("father static method");
	}
}

class Son extends Father {
	int num = 20;

	public void print() {
		System.out.println("son");
	}

	public static void method() {
		System.out.println("son static method");
	}
}