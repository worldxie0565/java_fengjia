class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		//Outer.method().show();			//��ʽ���,ÿ�ε��÷������ܼ������÷���,֤�����÷������ص��Ƕ���
		Inter i = Outer.method();
		i.show();
	}
}
//����Ҫ�󣬲������
interface Inter { 
	void show(); 
}

class Outer { 
	//������� 
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("show");
			}
		};
	}
}

//Ҫ���ڿ���̨�����HelloWorld��