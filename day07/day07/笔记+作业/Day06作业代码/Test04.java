public class Test04 {
	public static void main(String[] args) {
		Dog a = new Dog();	//�����������
		a.setName("����");	//����������ֵ
		a.setAge(3);		//�������丳ֵ
		System.out.println(a.getName() +"---"+ a.getAge()); //��ӡ����Ϣ
		a.eat();	//���óԷ�����
		a.lookHome();	//���ÿ��ҵķ���
	}
}
/*
����Dog
			����:����name,����age
			��Ϊ:�Է�eat������lookHome
 */
class Dog{
	private String name;	//����
	private int age;		//����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("�Է�");
	}
	public void lookHome() {
		System.out.println("������");
		
	}
}