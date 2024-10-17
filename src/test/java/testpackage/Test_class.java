package testpackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;


import basepackage.Base_class;
import pagepackage.Page_class;
import utilities.Utilities_class;

	public class Test_class extends Base_class{
		@Test
		public void logodisplay()
		{
			WebElement logo=driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[2]/div[1]/a/img"));
			Boolean logodisplay=logo.isDisplayed();
			if(logodisplay)
			{
				System.out.println("Logo is displayed");
			}
			else
			{
				System.out.println("failed");
			}
		}
//		@Test
//		public void titleverification()
//		{
//			String actaultitle=driver.getTitle();
//			String exptitle="Kerala Spices Online - The Online Spices Store";
//			Assert.assertEquals(actaultitle,exptitle,"title failed");
//			if(actaultitle.equals(exptitle))
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("Fail");
//			}
//		}
		@Test
		public void keralaspice() throws Exception
		{
			Page_class p1=new Page_class(driver);
			p1.account();
			
			String xl="C:\\Users\\USER\\Desktop\\Luminar\\DataDriven.xlsx";
			String Sheet="Sheet1";
			int rowCount=Utilities_class.getRowCount(xl, Sheet);
			for(int i=1;i<=rowCount;i++)
			{
		
				String Email=Utilities_class.getCellValues(xl, Sheet, i, 0);
				System.out.println("username----"+Email);
				driver.navigate().refresh();
				
				String Password=Utilities_class.getCellValues(xl, Sheet, i, 1);
				System.out.println("password----"+Password);
				
				p1.setvalues(Email, Password);
				driver.navigate().refresh();
				driver.navigate().back();
				p1.products();
				p1.cart();
				
				
			
			}
			
		}
	}
	
		


	
		

