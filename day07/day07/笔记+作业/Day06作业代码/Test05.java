public class Test05 {
	public static void main(String[] args) {
		Cat a = new Cat();	//����è�����
		a.setName("����");	//��è������ֵ
		a.setAge(3);		//��è���丳ֵ
		System.out.println(a.getName() +"---"+ a.getAge()); //��ӡè��Ϣ
		a.eat();	//���óԷ�����
		a.catchMouse();//����ץ����ķ���
	}
}
/*
è��Cat
			����:����name,����age
			��Ϊ:�Է�eat��ץ����catchMouse
 */
class Cat{
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
	public void catchMouse() {
		System.out.println("èץ����");
		
	}
}