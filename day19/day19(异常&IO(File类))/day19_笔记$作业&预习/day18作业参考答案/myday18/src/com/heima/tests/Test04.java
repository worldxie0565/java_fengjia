package com.heima.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 4.�����������󣬲��ô���ʵ�֣�
 *	(1)����һ��ѧ����Student�����ԣ�����(String name)���༶���(String no)���ɼ�(double score)
 *	(2)������Student�������List���ϣ���ͳ��ÿ���༶���ֺܷ�ƽ����
 *		˼·��
 *			a.������������˼��
 *			b.���Ƽ�ʹ��Map<String,List<Student>> ����������
 *			c.�Ƽ�ʹ��Map<String��ClassRoom>
 * @author JX
 *
 */
public class Test04 {
	public static void main(String[] args) {
		//1.����
		List<Student> stuList = exam();
		//2.�����ɼ�
		Map<String,ClassRoom> map = count(stuList);
		//3.�鿴�ɼ�(�ܷ�,ƽ����)
		view(map);
	}
	/**
	 * �鿴ÿ������ֺܷ�ƽ�ַ�
	 */
	public static void view(Map<String,ClassRoom> map){
		Set<String> keys = map.keySet();
		//��ȡ������
		Iterator<String> keysIt = keys.iterator();
		//���ж�
		while(keysIt.hasNext()){
			//�ٻ�ȡ
			String no = keysIt.next();
			ClassRoom room = map.get(no);
			//�鿴�ܷ� ����ƽ����
			double total = room.getTotal();
			double avg = total/room.getStuList().size();
			System.out.println(no+"-->"+total+"-->"+avg);
		}
		
	}
	/**
	 * ͳ�Ʒ���
	 */
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		//1.����List
		for(Student stu:list){
			//�ּ� �鿴�Ƿ���ڸñ�ŵİ༶
			String no = stu.getNo();//�༶���
			double score = stu.getScore();//�ɼ�
			//���������,�����༶
			ClassRoom room = map.get(no);
			if(null == room){
				room = new ClassRoom(no);
				map.put(no, room);
			}
			//����,����ѧ��
			room.getStuList().add(stu);//����ѧ��
			room.setTotal(room.getTotal()+score);//�����ܷ�
			
		}
		return map;
		
	}
	/**
	 * ģ�⿼�� �������ݷŵ�List��
	 */
	public static List<Student> exam(){
		List<Student> list = new ArrayList<Student>();
		//���ѧ���ɼ�
		list.add(new Student("���ʦ̫","Android",80));
		list.add(new Student("���»�","Android",70));
		list.add(new Student("�Ż���","Android",60));
		list.add(new Student("�ƽ���","Android",90));
		list.add(new Student("����","JavaEE",85));
		list.add(new Student("���ǳ�","JavaEE",65));
		list.add(new Student("����","JavaEE",70));
		list.add(new Student("����","JavaEE",50));
		return list;
		
	}
}
//����ѧ����
class Student {
	private String name;//����
	private String no;//�༶���
	private double score;//�ɼ�
	public Student() {
		
	}
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}	
}
//����༶��(һ���༶�ж��ѧ��)
class ClassRoom {
	private String no;//�༶
	private List<Student> stuList;//�༶�б�
	private double total;//�ܷ�
	public ClassRoom() {
		stuList = new ArrayList<Student>();
	}
	public ClassRoom(String no) {
		this();
		this.no = no;
	}
	public ClassRoom(String no, List<Student> stuList, double total) {
		super();
		this.no = no;
		this.stuList = stuList;
		this.total = total;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}	
}
