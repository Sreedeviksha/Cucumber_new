package com.cucumber.helper;

import java.io.IOException;



public class FileReaderManager {
	//singleton design pattern
		//pvt empty constructor for not creating the obj of FRM anywhere else
		private FileReaderManager() {

		}
		
		//In the static method we create the object for the FRM through this we call non static method
		public static FileReaderManager getInstance() {
			FileReaderManager frm = new FileReaderManager();
			return frm;
		}
		
		//In the non-static method we create the object CRM
		public ConfigurationReader getCrInstance() throws IOException {
			ConfigurationReader cr = new ConfigurationReader();
			return cr;
		}
		
}
