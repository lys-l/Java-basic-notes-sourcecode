package cn.LJ.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ����try{}catch{}finally{}���顣
 * @author �
 *
 */
public class Test_3Exception {
	public static void main(String[] args) {
		/**
		 * ����ļ������ڣ�������һ��Ŀ¼��������һ�������ļ�����ᱨ���޷��򿪡�
		 */
		FileReader a = null;
		try {
			a = new FileReader("D:/����/a.txt");	//��ȡ�ַ��ļ�
			char c = (char)a.read();
			char c2 = (char)a.read();
			System.out.println(c+c2);
		}catch(FileNotFoundException e) {
			e.printStackTrace();	//���������Ҵ�ӡһ��
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(a!=null) {
					a.close();									
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
