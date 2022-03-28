package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Readconfig {
	
	private String url;
	private String userName;
	private String password;
	private String browserName;
	private String browserMode;
	
	public Readconfig()
	{
		try {
			Properties prop =  readConfigfile();
			url = prop.getProperty("url");
			userName = prop.getProperty("username");
			password = prop.getProperty("password");
			browserName = prop.getProperty("browsername");
			browserMode = prop.getProperty("browsermode");
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getBrowserName() {
		return browserName;
	}

	public String getBrowserMode() {
		return browserMode;
	}
	
	private Properties readConfigfile() throws FileNotFoundException, IOException
	{
		Properties prop;
		try(InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties"))
		{
			prop = new Properties();
			prop.load(input);
		}
		
		return prop;
		
	}
}
