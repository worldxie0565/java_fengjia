package cn.itcast.question;

import java.io.File;
import java.io.IOException;

/*����: ������������������Ŀ¼�д����ļ�a.txt, ��ô�����ʵ��?
 E:\\hello\\world\\Java\\a.txt ����һ���ļ�.*/

////��ʽ��д���� F������û��˫б��   
//		���File����ĸ�Ŀ¼( F��)�뵱ǰ��Ŀ�����̷�һ�£���ô�ͻ��ڸó����ó��������Ŀ¼�����ļ����ļ��У�ʹ�ÿ������߻���һЩ�仯����
//		���File����ĸ�Ŀ¼( F��)�뵱ǰ��Ŀ�����̷���һ�£��ͻ��ڸø�Ŀ¼�´����ļ����ļ���(��������⼴��)
		

public class WrongFileTest2 {
	public static void main(String[] args) {
		// ��������ָ��·�����ļ�����

		File file = new File("F:hello\\world\\Java");//��ʽ��д���� F������û��˫б��
			
		System.out.println(file);
		File txtFile = new File(file, "a.txt");
		System.out.println(txtFile);
		System.out.println(file.mkdirs());
		try {
			System.out.println(txtFile.createNewFile());
		} catch (IOException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
	}
}
