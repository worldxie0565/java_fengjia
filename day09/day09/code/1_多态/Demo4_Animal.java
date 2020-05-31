class Demo4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
		//c1.eat();
		method(new Cat());
		method(new Dog());

		//Animal a = new Cat();			�������Ǻ����ڴ��������ʱ���ø�������ָ���������,ֱ�Ӵ���������������,����ʹ�������е��������Ժ���Ϊ
	}
	
	//Cat c = new Dog();����һֻè,���Ǵ����
	/*public static void method(Cat c) {			
		c.eat();
	}

	public static void method(Dog d) {
		d.eat();
	}*/
	
	//����ѹ�ǿת��è�ͻ��������ת���쳣,ClassCastException
	public static void method(Animal a) {	//����������ʱ���ö�̬���,��Ϊ��չ��ǿ
		//�ؼ��� instanceof �ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.eat();
			c.catchMouse();
		}else if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
	}
}
/*
* A:��̬�ĺô�
	* a:����˴����ά����(�̳б�֤)
	* b:����˴������չ��(�ɶ�̬��֤)
* B:������ʾ
	* ��̬�ĺô�
	* ���Ե�����ʽ����,���Խ��������������
* C:��̬�ı׶�
	* ����ʹ��������������Ժ���Ϊ��
*/

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}

	public void lookHome() {
		System.out.println("����");
	}
}