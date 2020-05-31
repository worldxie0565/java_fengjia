class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("�ӷ�",8);
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat("����è",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}

/*
* A:������ʾ
	* �����ࣺ���������䣬�Է���˯����
	* è�͹�
	* ������ѵ�ӿڣ�����
*/

abstract class Animal {
	private String name;				//����
	private int age;					//����

	public Animal() {}					//�ղι���

	public Animal(String name,int age) {//�вι���
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

	public abstract void sleep();		//˯��
}

interface Jumping {						//���ߵĽӿ�
	public void jump();
}

class Cat extends Animal {
	public Cat() {}					//�ղι���

	public Cat(String name,int age) {//�вι���
		super(name,age);
	}

	public void eat() {
		System.out.println("è����");
	}

	public void sleep() {
		System.out.println("����˯");
	}
}

class JumpCat extends Cat implements Jumping {
	public JumpCat() {}					//�ղι���

	public JumpCat(String name,int age) {//�вι���
		super(name,age);
	}

	public void jump() {
		System.out.println("è����");
	}
}