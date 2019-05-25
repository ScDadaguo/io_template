package com.sxt.io;

import java.io.File;

/**
 * 其他信息
 * length() : 文件的字节数 
*
 * 
 * @author 裴新
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/java300/IO_study01/IO.png");
		System.out.println("长度:"+ src.length());
		
		src = new File("D:/java300/IO_study01");
		System.out.println("长度:"+ src.length());
		
		src = new File("D:/java300/IO_study02");
		System.out.println("长度:"+ src.length());
		
		
	}
}
