package cn.LJ.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试try{}catch{}finally{}语句块。
 * @author 李劲
 *
 */
public class Test_3Exception {
	public static void main(String[] args) {
		/**
		 * 如果文件不存在，或者是一个目录，而不是一个常规文件，则会报错无法打开。
		 */
		FileReader a = null;
		try {
			a = new FileReader("D:/桌面/a.txt");	//读取字符文件
			char c = (char)a.read();
			char c2 = (char)a.read();
			System.out.println(c+c2);
		}catch(FileNotFoundException e) {
			e.printStackTrace();	//遇到错误我打印一下
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
