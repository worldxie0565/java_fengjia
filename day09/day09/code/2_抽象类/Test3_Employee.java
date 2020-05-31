class Test3_Employee {
	public static void main(String[] args) {
		Coder c = new Coder("��������","007",8000);
		c.work();

		Manager m = new Manager("����ʦ","9527",3000,20000);
		m.work();
	}
}
/*
* ���������ڿ���һ��ϵͳʱ��Ҫ�Գ���Ա�������ƣ�����Ա����3�����ԣ������������Լ����ʡ�
	* �������˺��г���Ա�������⣬��Ϊ����һ���������ԡ�
	* ��ʹ�ü̳е�˼����Ƴ�����Ա��;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
*/

abstract class Employee {
	private String name;					//����
	private String id;						//����
	private double salary;					//����

	public Employee() {}					//�ղι���

	public Employee(String name,String id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name) {		//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public void setId(String id) {			//����id
		this.id = id;
	}

	public String getId() {					//��ȡid
		return id;
	}

	public void setSalary(double salary) {	//���ù���
		this.salary = salary;
	}

	public double getSalary() {				//��ȡ����
		return salary;
	}

	public abstract void work();
}

//����Ա
class Coder extends Employee {
	public Coder() {}					//�ղι���

	public Coder(String name,String id,double salary) {
		super(name,id,salary);
	}

	public void work() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵĹ�����:" + this.getId() + ",�ҵĹ�����:" 
			+ this.getSalary() + ",�ҵĹ����������ô���");
	}
}

//��Ŀ����
class Manager extends Employee {
	private int bonus;					//����
	public Manager() {}					//�ղι���

	public Manager(String name,String id,double salary,int bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵĹ�����:" + this.getId() + ",�ҵĹ�����:" 
			+ this.getSalary() + ",�ҵĽ�����:" + bonus + ",�ҵĹ��������ǹ���");
	}
}