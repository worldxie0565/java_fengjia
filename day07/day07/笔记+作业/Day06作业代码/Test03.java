public class Test03 {
	public static void main(String[] args) {
		Animal a = new Animal();	//�������������
		a.setName("����");	//������������ֵ
		a.setAge(3);		//���������丳ֵ
		System.out.println(a.getName() +"---"+ a.getAge()); //��ӡ������Ϣ
		a.eat();	//���óԷ�����
	}
}
/*
 * ������Animal
			����:����name,����age
			��Ϊ:�Է�eat
 */
class Animal{
	private String name;
	private int age;
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
	
}