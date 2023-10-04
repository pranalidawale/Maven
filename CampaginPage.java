package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaginPage {
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	 private WebElement addcampaigns;
	
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	 private WebElement capname;
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	 private WebElement targetaudi;
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	 private WebElement sponser;
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	 private WebElement exdate;
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement Exsales;
	@FindBy(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement  exrespons;
	@FindBy(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actulsale;
	@FindBy(id="Campaigns_editView_fieldName_actualresponsecount")
	 private WebElement actulrespons;
	public WebElement getExrespons() {
		return exrespons;
	}
	public WebElement getActulsale() {
		return actulsale;
	}
	public WebElement getActulrespons() {
		return actulrespons;
	}
	
	public WebElement getExsales() {
		return Exsales;
	}
	public WebElement getExdate() {
		return exdate;
	}
	public WebElement getTargetsize() {
		return targetsize;
	}
	public WebElement getAddcampaigns() {
		return addcampaigns;
	}
	public WebElement getCapname() {
		return capname;
	}
	
	public WebElement getTargetaudi() {
		return targetaudi;
	}
	public WebElement getSponser() {
		return sponser;
	}

}
