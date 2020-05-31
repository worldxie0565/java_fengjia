class Test01 {
	public static void main(String[] args) {	
		//������������ʦ����
		BasicClassTeache bct = new BasicClassTeache("С��",27);
		//���ý��η���
		bct.teach();
		
		//������ҵ����ʦ����
		EmploymentClassTeacher ect = new EmploymentClassTeacher("��",28);
		//���ý��η���
		ect.teach();
	}
}

abstract class Teacher{
	private String name;	//����
	private int age;		//����
	
	
	public Teacher() {		//�ղ�
	}

	public Teacher(String name, int age) {//�в�
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
	
	public abstract void teach();
}

//��������ʦ��
class BasicClassTeache extends Teacher{
	public BasicClassTeache() {		//�ղ�
	}

	public  BasicClassTeache(String name, int age) {//�в�
		super(name, age);
	}
	
	public void teach() {	//���η���
		System.out.println("��������ʦ��JavaSE");
	}

}

//��ҵ����ʦ��
class EmploymentClassTeacher extends Teacher{
	public EmploymentClassTeacher() {		//�ղ�
	}

	public EmploymentClassTeacher(String name, int age) {//�в�
		super(name, age);
	}
	public void teach() {	//���η���
		System.out.println("��ҵ����ʦ��Android");
	}
}