class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("�ӷ�",8);
		System.out.println(c.getName() + "..." + c.getAge());
		c.eat();
		c.catchMouse();

		Dog d = new Dog("�˹�",30);
		System.out.println(d.getName() + "..." + d.getAge());
		d.eat();
		d.lookHome();
	}
}
/*
* A:������ʾ
	* �������è����
	* ���ԣ����������䣬�Է�
	* è������:ץ����
	* ��������:����
*/
abstract class Animal {
	private String name;				//����
	private int age;					//����

	public Animal(){}					//�ղ�

	public Animal(String name,int age) {//�в�
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

	public abstract void eat();			//�Է�
}

class Cat extends Animal {
	public Cat(){}					//�ղ�

	public Cat(String name,int age) {//�в�
		super(name,age);
	}

	public void eat() {
		System.out.println("è����");
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public Dog(){}					//�ղ�

	public Dog(String name,int age) {//�в�
		super(name,age);
	}

	public void eat() {
		System.out.println("������");
	}

	public void lookHome() {
		System.out.println("����");
	}
}