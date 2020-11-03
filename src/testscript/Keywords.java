package testscript;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Keywords {
static FirefoxDriver driver;
static FileInputStream file;
static Properties prop;
public void openbrowser()throws Exception
{
	
   driver =new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   file = new FileInputStream("C:\\Users\\Swati\\workspace\\CRMFramework\\objectrepository.properties");
   prop=new Properties();
   prop.load(file);
    
}
public void navigate(String inputvalue)
{
	driver.get(inputvalue);
}
 public void login(String objectName)
 {
	 driver.findElementByXPath(prop.getProperty(objectName)).click(); 
 }
public void input(String inputvalue,String objectName)throws Exception

{
	//driver.findElementByXPath("//a[contains(text(),'Login')]").click();
	driver.findElementByXPath(prop.getProperty(objectName)).sendKeys(inputvalue);
	
	}
public void click(String objectName)throws Exception 
{
	driver.findElementByXPath(prop.getProperty(objectName)).click();
	
}
} 

