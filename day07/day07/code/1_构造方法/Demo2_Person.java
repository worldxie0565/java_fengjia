class Demo2_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();

		System.out.println("---------------------");

		Person p2 = new Person("����",23);
		p2.show();

		System.out.println("---------------------");

		Person p3 = new Person("����",24);
		p3.show();
	}
}
/*
* A:������ʾ
	* ���췽��������
	* ����:��������ͬ,�뷵��ֵ�����޹�(���췽��û�з���ֵ),ֻ�������б�
* B:���췽��ע������
	* a:�������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
	* b:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
		* ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
		
*/
class Person {
	private String name;			//����
	private int age;				//����

	public Person() {				//�ղι���
		System.out.println("�ղεĹ���");
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вεĹ���");
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
}