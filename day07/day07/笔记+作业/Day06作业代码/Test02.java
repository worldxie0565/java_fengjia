public class Test02 {
	public static void main(String[] args) {
		Person p = new Person();	//��������Ķ���
		p.setName("����");			//���˵����ָ�ֵ
		p.setAge(18);				//���˵����丳ֵ
		p.setGender("��");			//���˵��Ա�ֵ
		System.out.println(p.getName() + "---" + p.getAge() +"---"+ p.getGender());//��ӡ�˵���Ϣ
		p.study();
		p.sleep();
	}
}

class Person {
	private String name;//����
	private int age;	//����
	private String gender;//�Ա�
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void study() {
		System.out.println("ѧϰ");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}
