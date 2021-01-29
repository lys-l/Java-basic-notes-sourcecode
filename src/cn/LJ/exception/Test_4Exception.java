package cn.LJ.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 声明异常throw的使用。
 * @author 李劲
 *
 */
public class Test_4Exception {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String str;
		try {
			str = new Test_4Exception().openFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(str);
		
		
	}
	String openFile() throws FileNotFoundException,IOException{
		@SuppressWarnings("resource")
		FileReader reader = new FileReader("d:/a.txt");
		char c = (char)reader.read();
		System.out.println();
		return ""+c;
	}
	
	
	

}
