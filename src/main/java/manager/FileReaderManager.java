package manager;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
/*
This class is used to manage object for FileReader
*/
public class FileReaderManager extends Base {
	
	private static ConfigFileReader configFileReader;
	private static FileReaderManager fileReaderManager = new FileReaderManager();

	
	public FileReaderManager()
	{
		
	}
	/*
	This method to return FileReaderManager object
	*/
	

	public static FileReaderManager getFileReaderManager()
	{
		return fileReaderManager;
	}
	
	/*
	This method to return ConfigFileReader object
	*/	
	
	public ConfigFileReader getConfigFileReader()
	{
		return (configFileReader == null)? new ConfigFileReader(): configFileReader;
	}
	
	

	
	
}
