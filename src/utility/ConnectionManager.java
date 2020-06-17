package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException
	{
		  Connection connection=null;
		  Properties prop=null;
		 
			  prop=loadPropertiesFile();
		 
		   String  driver=prop.getProperty("driver");
		   String url=prop.getProperty("url");
		   String user=prop.getProperty("username");
			String password=prop.getProperty("password");
		  
		
				Class.forName(driver);
				connection = DriverManager.getConnection(url,user,password);
		
			return connection;
		}
	public static Properties loadPropertiesFile() throws IOException
	{
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties"); 
		prop.load(in);
		in.close(); 
		return prop;
	}
	}
