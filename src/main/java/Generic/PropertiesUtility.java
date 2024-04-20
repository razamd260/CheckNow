package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class PropertiesUtility {
	public Properties property;
	public void propertiesInt(String path) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 property=new Properties();
		 try {
			 property.load(fis);
		 }
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getproperty(String Element) {
		 return property.getProperty(Element);
	}
}
