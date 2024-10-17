package pagepackage;

	
	

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Page_class {
		WebDriver driver;
		@FindBy(xpath="//*[@id=\"menu-item-22089\"]/a/div")
		WebElement loginsign;
		@FindBy(xpath="//*[@id=\"username\"]")
		WebElement username;
		@FindBy(xpath="//*[@id=\"password\"]")
		WebElement password;
		@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
		WebElement login;
	    @FindBy(xpath="//*[@id=\"nav-menu-item-22088\"]/a")
	    WebElement productcategory;
	    @FindBy(xpath="//*[@id=\"main\"]/div[2]/ul/li[12]/div[2]/a")
	    WebElement bananachips;
	    @FindBy(xpath="//*[@id=\"main\"]/div[2]/ul/li[5]/div[2]/a")
	    WebElement checkout;
	    
	    
	    
	    public Page_class(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	
	    }
	    public void account()
	    {
	    	loginsign.click();
	    }
	    public void setvalues(String Email,String Password)
	    {
	    	
	    	username.sendKeys(Email);
	    	password.sendKeys(Password);
	    	login.click();
	    }
	    	public void products()
	    	{
    	    productcategory.click();
	    	
	    	}
	    	public void cart()
	    	{
	    	bananachips.click();
	    	checkout.click();
	    	
	    	
	    	}
			

	    	
	    	
	    	
	    }
	    
	   
		
		
	


