package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo2_Reflect {

	/**
	 * * ե֭��(Juicer)ե֭�İ���
	 * �ֱ���ˮ��(Fruit)ƻ��(Apple)�㽶(Banana)����(Orange)ե֭(squeeze)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();									//����ե֭��
		//j.run(new Apple());
		//j.run(new Orange());
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());					//��ȡ������ֽ����ļ�
		Fruit f = (Fruit) clazz.newInstance();						//����ʵ������
		j.run(f);
	}
}
interface Fruit {
	public void squeeze();
}
class Apple implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ��ƻ��֭��");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("ե��һ������֭��");
	}
}

class Juicer {
	/*public void run(Apple a) {
		a.squeeze();
	}
	
	public void run(Orange o) {
		o.squeeze();
	}*/
	
	public void run(Fruit f) {
		f.squeeze();
	}
}