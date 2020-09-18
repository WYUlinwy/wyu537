package a;
import  java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.sun.java.util.jar.pack.Package.File;

public class IBM1 {
public static void copyFile(String src,String dest)throws Exception {
	FileInputStream in = new  FileInputStream(src);
	File file = new File(dest);
	if(!file.exists())
		file.createNewFile();
	FileOutputStream out = new FileOutputStream(file);
     int c;
     byte buffer[] = new byte[1024];
     while((c=in.read(buffer))!=1) {
    	 for(int i =0;i<c;i++)
    		 out.write(buffer[i]);
     }
     in.close();
     out.close();
}
	public static void main(String[] args)throws Exception {
		String fileSrc="F:/myfile.txt"; 
		String fileDes="F:/Copy/myfile.txt"; 
		copyFile(fileSrc,fileDes);
		System.out.println("F:/myfile/Copy文件夹文件复制成功");

}
}
