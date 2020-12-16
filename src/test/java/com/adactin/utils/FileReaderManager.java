package com.adactin.utils;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
		
	}
	
	public static FileReaderManager getinstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;

	}
	
	
	public ConfigurationReader getcrinstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}
	
	

}
