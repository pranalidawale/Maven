package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage
{
	@FindBy(id="appnavigator")
	WebElement app;
	@FindBy(xpath ="//span[text()=' MARKETING']")
	WebElement marketing;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	WebElement campaigns;

	public WebElement getCampaigns() {
		return campaigns;
	}

	public WebElement getApp() {
		return app;
	}

	public WebElement getMarketing() {
		return marketing;
	}

	
	
	

}
