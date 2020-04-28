package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

public class Testbase {

	public Properties prop;
	
	public Testbase() {

		try {

			Properties pro = new Properties();
			pro.load(new FileInputStream(new File(System.getProperty("user.dir") + "src/main/java/com/qa/config/config/config.properties")));
			String browser = pro.getProperty("Browser");
			String prod = pro.getProperty("proEnv");
			System.out.println("from config file        " + browser);
			System.out.println("from config file        " + prod);

		} catch (FileNotFoundException e) {
			System.out.println("file not found" + e.getMessage());
			Assert.assertTrue(false);
		} catch (IOException e) {
			System.out.println("could not read properties file" + e.getMessage());
			Assert.assertTrue(false);
		}

	
	}
}
