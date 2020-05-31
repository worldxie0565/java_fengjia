class Test02 {
	public static void main(String[] args) {
		//����������ѧ������
		BasicClassStudent bct = new BasicClassStudent("����",20);
		//����ѧϰ����
		bct.study();
		
		//������ҵ��ѧ������
		EmploymentClassStudent ect = new EmploymentClassStudent("����С��",21);
		//����ѧϰ����
		ect.study();
	}
}

abstract class Student{
	private String name;	//����
	private int age;		//����
	
	public Student() {		//�ղ�
	}

	public Student(String name, int age) {//�в�
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//��������
		this.name = name;
	}
	public String getName() {			//��ȡ����
		return name;
	}
	public int getAge() {				//��������
		return age;
	}
	public void setAge(int age) {		//��ȡ����
		this.age = age;
	}
	
	public abstract void study();		//�����ѧϰ����
}

//������ѧ����
class BasicClassStudent extends Student{
	public BasicClassStudent() {		//�ղ�
	}

	public BasicClassStudent(String name, int age) {//�в�
		super(name, age);
	}
	
	public void study() {				
		System.out.println("������ѧ��ѧJavaSE");
	}

}

//��ҵ��ѧ����
class EmploymentClassStudent extends Student{
	public EmploymentClassStudent() {		//�ղ�
	}

	public EmploymentClassStudent(String name, int age) {//�в�
		super(name, age);
	}
	
	public void study() {
		System.out.println("��ҵ��ѧ��ѧAndroid");
	}
}