package cn.itcast.question;

import java.io.File;
import java.io.IOException;

/*����: ������������������Ŀ¼�д����ļ�a.txt, ��ô�����ʵ��?
 E:hello\\world\\Java\\a.txt ����һ���ļ�.*/

//java.io.IOException: �豸δ������

public class WrongFileTest1 {
	public static void main(String[] args) {
		// ��������ָ��·�����ļ�����
		// ָ�����̷���ռ�ã����������Ĵ洢�̷�
		File file = new File("E:\\hello\\world\\Java");
		File txtFile = new File(file, "a.txt");
		file.mkdirs();
		try {
			txtFile.createNewFile();
		} catch (IOException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
	}
}
