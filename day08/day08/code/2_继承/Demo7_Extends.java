class Demo7_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
		s.method();
	}
}
/*
* a:��ͬ���ķ���
* b:ͬ���ķ���
*/

class Father {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son extends Father {
	public void method() {
		System.out.println("Zi Method");
	}

	public void print() {
		super.print();							//super���Ե��ø���ĳ�Ա����
		System.out.println("Zi print");
	}
}