class Demo6_Extends {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName() + "..." + s1.getAge());
		System.out.println("--------------------");
		Son s2 = new Son("����",23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}
/*
* A:������ʾ
	* ����û���޲ι��췽��,������ô��?
	* super���
	* this���
* B:ע������
	* super(��)����this(��.)��������ڹ��췽���ĵ�һ�������
*/
class Father {
	private String name;			//����
	private int age;				//����

	public Father() {				//�ղι���
		System.out.println("Father �ղι���");
	}

	public Father(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
		System.out.println("Father �вι���");
	}

	public void setName(String name) {	//��������
		this.name = name;
	}

	public String getName() {			//��ȡ����
		return name;
	}

	public void setAge(int age) {		//��������
		this.age = age;
	}

	public int getAge() {				//��ȡ����
		return age;
	}
}

class Son extends Father {
	public Son() {						//�ղι���
		this("����",25);				//�����еĹ��췽��
		//super("����",24);				//���ø����еĹ��췽��
		
		System.out.println("Son �ղι���");
	}

	public Son(String name,int age) {	//�вι���
		super(name,age);
		System.out.println("Son �вι���");
	}
}