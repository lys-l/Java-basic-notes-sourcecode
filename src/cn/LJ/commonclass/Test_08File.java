package cn.LJ.commonclass;

import java.io.File;
import java.io.IOException;

/**
 * ����File��
 * @author �
 *
 */
public class Test_08File {
	public static void main(String[] args) {
		File a = new File("D:/#Swift/open/abc.txt");
		File b = new File("D:/#Swift/open");
		@SuppressWarnings("unused")
		File c = new File(b,"abc.txt");
		File d = new File(b,"abcd.txt");
		File f = new File("D:/#Swift/open/zzzz");
		
		f.mkdir();//�����ļ��У���Ŀ¼���ڴ��������򴴽�ʧ�ܡ�
		f.mkdirs();//�����ļ��У����ܸ�Ŀ¼������񣬶�������
		
		try {
			d.createNewFile();//����һ���ļ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.delete();//ɾ���ļ�
		if(a.isFile()) {
			System.out.println("��һ���ļ�");
		}
		if(b.isDirectory()) {
			System.out.println("��һ��Ŀ¼");
		}
		
		
	}

}
