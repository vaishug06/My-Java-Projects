package com.interfaces.fileoperation;

public class FileOperationExample {
	public static void main(String[] args) {
		System.out.println("Read Operation:");
		FileOperation f1=new ReadFile();
		f1.processFile();
		System.out.println("Write Operation:");
		WriteFile w=new WriteFile();
		w.processFile();
		System.out.println("Delete Operation:");
		FileOperation f2=new DeleteFile();
		f2.processFile();
	}

}
