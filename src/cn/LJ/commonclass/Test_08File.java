package cn.LJ.commonclass;

import java.io.File;
import java.io.IOException;

/**
 * 测试File类
 * @author 李劲
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
		
		f.mkdir();//创建文件夹，父目录存在创建，否则创建失败。
		f.mkdirs();//创建文件夹，不管父目录存在与否，都创建。
		
		try {
			d.createNewFile();//创建一个文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.delete();//删除文件
		if(a.isFile()) {
			System.out.println("是一个文件");
		}
		if(b.isDirectory()) {
			System.out.println("是一个目录");
		}
		
		
	}

}
