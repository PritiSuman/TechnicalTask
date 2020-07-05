package dataProvider;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/*
 This class is used to read property file 
 */

public class ConfigFileReader {
	
	private Properties properties;
    private final String propertyFilePath = "configs//Config.properties";
    
    /*
   Reusable method to read property file 
    */
    public ConfigFileReader()
    {
    	
    	BufferedReader reader;
    	
    	try
    	{
    		reader = new BufferedReader (new FileReader(propertyFilePath));
    		properties = new Properties();
    		
    		try
    		{
    			properties.load(reader);
    			reader.close();
    		}catch (IOException e)
    		
    		{
    			e.printStackTrace();
    		}
    	}catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    		throw new RuntimeException("Comfiguration.properties not found at  " + propertyFilePath);
    	}
    }
    
    
    
    public String getDriverPath()
    {
    	String driverPath = properties.getProperty("driverPath");
    	if(driverPath != null) 
		return driverPath;
    	
   	else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
     }
    
    
    
    public String getApplicationURL()
    {
    	String url = properties.getProperty("url");
    	if(url != null) 
    		return url;
        	
       	else throw new RuntimeException("url not specified in the Configuration.properties file.");
    	
    }
   
    
   
    
    public String getUserName()
    {
    	String userName =properties.getProperty("userName");
    	if (userName!=null)return userName;
    	else throw new RuntimeException("user Name is not specified in Configuration.properties file");
    	
    }
    
    
    public String getPassword()
    {
    	String password =properties.getProperty("password");
    	if (password!=null)return password;
    	else throw new RuntimeException("password is not specified in Configuration.properties file");
    	
    }
  
   
}
