/*
 * ѧ����Student
			����:���ĳɼ�chinese����ѧ�ɼ�math��Ӣ��ɼ�english
			��Ϊ:���ܳɼ��ķ���getSum()
 */
public class Test06 {
	public static void main(String[] args) {
		Student s = new Student();	//����ѧ�������
		s.setName("����");	//��ѧԱ������ֵ
		s.setChinese(99);	//��ѧԱ���ĳɼ���ֵ
		s.setMath(98);		//��ѧԱ��ѧ�ɼ���ֵ
		s.setEnglish(60);	//��ѧԱӢ��ɼ���ֵ
		System.out.println(s.getName() + " ���ģ�" + s.getChinese() + "��ѧ��"+ s.getMath() + "Ӣ�"+ s.getEnglish() + "�ܷ֣�" + s.getSum());//��ӡѧԱ�ɼ�
	}
}

class Student{
	private String name;//����
	private int chinese;//���ĳɼ�
	private int math;//��ѧ�ɼ�
	private int english;//Ӣ��ɼ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getSum() {		//���ܳɼ��ķ���
		return chinese + math +english ;
	}
}