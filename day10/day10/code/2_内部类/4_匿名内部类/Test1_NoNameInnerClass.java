class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//��ε���PersonDemo�е�method������?
		PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person() {
			public void show() {
				System.out.println("show");
			}
		});
	}
}
//����д�����࣬�ӿڶ���
abstract class Person {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//��������ָ���������
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
	public void method(Person p) {
		p.show();
	}
}

class Student extends Person {
	public void show() {
		System.out.println("show");
	}
}