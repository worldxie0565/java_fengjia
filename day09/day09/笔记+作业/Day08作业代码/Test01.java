public class Test01 {
	public static void main(String[] args) {
		Programer p = new Programer("����","0001",6888.8);	//��������Ա����󣬲�ʹ���вι�������Ը�ֵ
															//��ӡ�������Ա�������
		System.out.println(p.getName() +"--"+ p.getId() +"--"+p.getSalary());
		p.work();											//���ó���Ա�Ĺ�������
															//������Ŀ��������󣬲�ʹ���вι�������Ը�ֵ
		ProjectManager pm = new ProjectManager("����", "0002", 8888.88, 250);
															//��ӡ�����Ŀ�����������
		System.out.println(pm.getName()+"--"+ pm.getId() +"--"+pm.getSalary() + "--" + pm.getBouns());
		pm.work();											//������Ŀ����Ĺ�������
		
	}
}

class Emplyee {				//Ա��
					
	private String name;	//����
	private String id;		//����
	private double salary;	//����
	
	public Emplyee(){}		//�޲ι��췽��
							//�вι��췽��
	public Emplyee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void work(){
		System.out.println("����");
	}
}

class Programer extends Emplyee	//����Ա
{
	public Programer(){}		//�޲ι��췽��
								//�вι��췽��
	public Programer(String name, String id, double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println("����Ա����");
	}
}

class ProjectManager extends Emplyee// ��Ŀ����
{
	private double bouns;			//����

	public ProjectManager(){}		//�޲ι��췽��
									//�вι��췽��
	
	public ProjectManager(String name, String id, double salary, double bouns){
		super(name,id,salary);
		this.bouns = bouns;
	}
	public void setBouns(double bouns){
		this.bouns = bouns;
	}
	public double getBouns(){
		return bouns;
	}
	public void work(){
		System.out.println("��Ŀ������");
	}
}
