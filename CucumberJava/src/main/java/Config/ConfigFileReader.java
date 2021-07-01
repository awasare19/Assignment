package Config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "C:/Users/omkara/git/Assignment/CucumberJava/src/main/java/Config/Config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getUserName() {
		String userName = properties.getProperty("userName");
		if (userName != null)
			return userName;
		else
			throw new RuntimeException("username not specified in the Configuration.properties file.");
	}

	public String getPassword() {
		String password = properties.getProperty("password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("password not specified in the Configuration.properties file.");
	}

	public String getHomePageTitle() {
		String homePageTitle = properties.getProperty("homePageTitle");
		if (homePageTitle != null)
			return homePageTitle;
		else
			throw new RuntimeException("homepage title not specified in the Configuration.properties file.");
	}

	public String getCourseName() {
		String course = properties.getProperty("course");
		if (course != null)
			return course;
		else
			throw new RuntimeException("course not specified in the Configuration.properties file.");
	}

	public String getExpectedCourse() {
		String course = properties.getProperty("course");
		if (course != null)
			return course;
		else
			throw new RuntimeException("course is not specified in the Configuration.properties file.");
	}

}