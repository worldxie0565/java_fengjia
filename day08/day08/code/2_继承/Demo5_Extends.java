class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
/*
* A:������ʾ
	* ���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
* B:Ϊʲô��?
	* ��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
	* ���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
	
	* ��ʵ��
		* ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super() Object�����ĸ��ࡣ
*/

class Father extends Object {
	public Father() {
		super();
		System.out.println("Father �Ĺ��췽��");
	}
}

class Son extends Father {
	public Son() {
		super();							//����һ�����,�����д,ϵͳ��Ĭ�ϼ���,�������ʸ����еĿղι���
		System.out.println("Son �Ĺ��췽��");
	}
}