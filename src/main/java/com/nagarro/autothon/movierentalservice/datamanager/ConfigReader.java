package com.nagarro.autothon.movierentalservice.datamanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
static Properties p=null;
	
	
	
	public ConfigReader() throws IOException
	{
	
	p=new Properties();
	
	File file = null;
 if(System.getenv("Env").equalsIgnoreCase("INT"))
 {
	
	
	 file=new File(System.getProperty("user.dir")+"\\DataFiles\\"+"INT_Env.properties");
	 System.out.println("****Currenlty Executing in Integration environment******");
	 
	
 }
 
 
 else if(System.getenv("Env").equalsIgnoreCase("STG"))
 {
	 file=new File(System.getProperty("user.dir")+"\\DataFiles\\"+"STG_Env.properties");
 
    System.out.println("****Currenlty Executing in Stage environment******");
 }
 
	 
 
		
	
		
	
	FileInputStream in=new FileInputStream(file);
	p.load(in);
	}
	
	
	public static String getValueFromPropertyFile(String key) 
	{
		if(p==null)
		{
			try {
				new ConfigReader();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String value=p.getProperty(key);
		return value;
	}

}

	


