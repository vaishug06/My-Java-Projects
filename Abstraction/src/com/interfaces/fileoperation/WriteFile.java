package com.interfaces.fileoperation;

public class WriteFile  implements FileOperation{

	@Override
	public void processFile() {
		System.out.println("File write operation completed!");
	}

}
