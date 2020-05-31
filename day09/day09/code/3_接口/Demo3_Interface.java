class Demo3_Interface {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
* A:������,����ӿ�,�ӿ���ӿڵĹ�ϵ
	* a:�����ࣺ
		* �̳й�ϵ,ֻ�ܵ��̳�,���Զ��̳С�
	* b:����ӿڣ�
		* ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ�֡�
		* ���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿڡ�
	* c:�ӿ���ӿڣ�
		* �̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳С�
*/

interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

interface InterC extends InterB,InterA {
}
//class Demo implements InterA,implements InterB {		//��ô���������ǷǷ���
class Demo extends Object implements InterA,InterB {
	public void printA() {
		System.out.println("printA");
	}

	public void printB() {
		System.out.println("printB");
	}
}

