class Test05 {
	public static void main(String[] args) {
		Cat c = new Cat("�ӷ�",8);	//����è����󣬲�ʹ���вι����ʼ������ֵ
		c.eat();					//����è�ĳԷ���
		c.sleep();					//����˯������

		JumpCat jc = new JumpCat("����è",3);//��������è��Ķ��󣬲�ʹ���вι����ʼ������ֵ
		jc.eat();					//������è�ĳԵķ���
		jc.sleep();					//����˯���ķ���
		jc.jump();					//������è�����ķ���
	}
}

/*
* ��֪�����ࣨ���������䣬�Է���˯�����������������࣬�ֱ���è��͹��ࡣ
		��ͬ����è���㣬�����⡣
		������Ϸ�ŵ���ѵ�󣬲���è�����ߣ����ֹ�Ҳ�����ߡ�

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

	public void sleep() {				//˯��
		System.out.println("����˯��");
	}
	public abstract void eat();			//�Է�
	
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

class Dog extends Animal {
	public Dog() {}					//�ղι���

	public Dog(String name,int age) {//�вι���
		super(name,age);
	}

	public void eat() {
		System.out.println("������");
	}

	
}

class JumpDog extends Dog implements Jumping {
	public JumpDog() {}					//�ղι���

	public JumpDog(String name,int age) {//�вι���
		super(name,age);
	}

	public void jump() {
		System.out.println("������");
	}
}