package cn.itcast_01;

import java.io.File;
import java.io.IOException;

/*
 * ����: �����������ָ���̷�����ġ�hello\\world\\Java��
 * ���Ŀ¼�д����ļ�a.txt, ��ô�����ʵ��?
 */
public class FileTest {
	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\hello\\world\\Java");
		file1.mkdirs();
		// File file2 = new File("D:\\hello\\world\\Java\\a.txt");
		// File file2 = new File("D:\\hello\\world\\Java","a.txt");
		File file2 = new File(file1, "a.txt");
		file2.createNewFile();

	}
}
