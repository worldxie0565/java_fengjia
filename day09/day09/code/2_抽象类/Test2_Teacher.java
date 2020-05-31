class Test2_Teacher {
	public static void main(String[] args) {
		BaseTeacher bt = new BaseTeacher("���",18);
		bt.teach();
	}
}
/*
* ���������������ʦ����ҵ����ʦ
	* ���ԣ����������䣬���Ρ�
*/

abstract class Teacher {
	private String name;				//����
	private int age;					//����

	public Teacher(){}					//�ղ�

	public Teacher(String name,int age) {//�в�
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

	public abstract void teach();
}

class BaseTeacher extends Teacher {
	public BaseTeacher(){}					//�ղ�

	public BaseTeacher(String name,int age) {//�в�
		super(name,age);
	}

	public void teach() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵ�������:" + this.getAge() + ",����������java����");
	}
}