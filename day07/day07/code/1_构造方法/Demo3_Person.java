class Demo3_Person {
	public static void main(String[] args) {
		Person p1 = new Person("����",23);
		//p1 = new Person("����һ",23);	//���ַ�ʽ�����н��ò���Ǹ�����,��ʵ�ǽ�ԭ����������
		System.out.println(p1.getName() + "..." + p1.getAge());

		System.out.println("--------------------");
		Person p2 = new Person();		//�ղι��촴������
		p2.setName("����");
		p2.setAge(24);

		p2.setName("���");
		System.out.println(p2.getName() + "..." + p2.getAge());
	}
}
/*
���췽��
	�����Խ��г�ʼ��
setXxx����
	�޸�����ֵ
	�����ַ�ʽ,�ڿ�������setXxx����һЩ,��Ϊ�Ƚ����
*/
class Person {
	private String name;				//����
	private int age;					//����

	public Person() {					//�ղι���
	}

	public Person(String name,int age) {//�вι���
		this.name = name;
		this.age = age;
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