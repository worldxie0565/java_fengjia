class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "����";
	private int age = 23;

	public Student() {
		name = "����";
		age = 24;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}