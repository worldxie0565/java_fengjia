package com.heima.domain;
/**
 * 7.�����������󣬲��ô���ʵ�֣�
 *	(1)�ڵ�5�ⴴ����java��Ŀmyday11�У�������com.heima.domain
 *	(1)��com.heima.domain������һ��ѧ����Student����������(String name)���Ա�(String gender)��
 *		����(int age)���ɼ�(int score)����������Ҫ˽��
 *	(2)���ÿ�ݼ����ɿղι��졢�вι��졢set������get������hashCode������toString������equals����
 *	(3)����Eclipse�Զ����ɵ�equals�����Ĵ�������
 * @author JX
 *
 */
public class Student {
	//��������
	private String name;
	//�Ա�����
	private String gender;
	//��������
	private int age;
	//�ɼ�����
	private int score;
	//�ղι��죬��ݼ�alt+/ ����alt+shift+s ->c
	public Student() {
		
	}
	//�вι��죬��ݼ�alt+shift+s -> o ->�س�
	public Student(String name, String gender, int age, int score) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.score = score;
	}
	//set��get��������ݼ�alt+shif+s -> r -> tab -> �س� -> shift+tab ��> �س�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//hashCode��������ݼ�alt+shif+s -> h -> �س� 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	//equals��������ݼ�alt+shif+s -> h -> �س� 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	//toString��������ݼ�alt+shift+s -> s
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age
				+ ", score=" + score + "]";
	}	
}
