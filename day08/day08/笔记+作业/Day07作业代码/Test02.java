class Test02 {						//employeeԱ��
	public static void main(String[] args) {
		Employee e = new Employee("�����","9527",20000);
		e.work();
	}
}

class Employee {
	private String name;					//����
	private String id;						//����
	private double salary;					//����

	public Employee() {}					//�ղι���

	public Employee(String name, String id, double salary) {//�вι���
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

	public void work() {
		System.out.println("�ҵ�������:" + name + ",�ҵĹ�����:" + id + ",�ҵĹ�����:" + salary 
			+ ",�ҵĹ����������ô���");
	}
}
	