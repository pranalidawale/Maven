package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pom.CampaginPage;
import Pom.Dashboardpage;
import Pom.LoginVpage;

public class VtigerProperties {
	@Test 
	public void viter() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  FileInputStream fis = new FileInputStream("src\\test\\resources\\Vtiger.properties.txt");
	    
	    Properties p = new Properties();
	    p.load(fis);
	   String URL = p.getProperty("url");
	   String CAMPAIGNNAME = p.getProperty("CampaignName");
	   String Audiance = p.getProperty("TargetAudience");
	    String Size = p.getProperty("TargetSize");
	     String SPONSER = p.getProperty("Sponsor");
	      String DATE = p.getProperty("ExpectedCloseDate");
	     String EXPECTEDSALE = p.getProperty(" ExpectedSalesCount");
	     String ACTULSALE = p.getProperty("ActualSalesCount");
	    String EXPECTEDRESPONSE = p.getProperty("ExpectedResponseCount");
	    String ACTULRESPONSE = p.getProperty("ActualResponseCount");
	     
	     
	     
	     
	    driver.get(URL);
	    LoginVpage lg= new LoginVpage();
		PageFactory.initElements(driver, lg);
		lg.getSingup().click();
		Dashboardpage dp = new Dashboardpage();
		
		PageFactory.initElements(driver, dp);
		dp.getApp().click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(dp.getMarketing()).perform();
		dp.getCampaigns().click();
		
		
		
		 
		 
		 
		 
		 
		CampaginPage cp= new CampaginPage();
		PageFactory.initElements(driver, cp);
	    cp.getAddcampaigns().click();
		cp.getCapname().sendKeys(CAMPNAME);
		cp.getTargetaudi().sendKeys(Audiance);
		cp.getTargetsize().sendKeys(Size);
		cp.getSponser().sendKeys(SPONSER);
		cp.getExdate().sendKeys(DATE);
		cp.getExdate().sendKeys(Keys.ENTER);
		cp.getExsales().sendKeys(EXPECTEDSALE);
		cp.getActulsale().sendKeys(ACTULSALE);
		cp.getExrespons().sendKeys(EXPECTEDRESPONSE);
		cp.getActulrespons().sendKeys(ACTULRESPONSE);
	}

}
