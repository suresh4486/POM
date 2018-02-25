package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement enterCompanyName;
	
	public CreateLeadPage enterCompanyName(String data) {
		type(enterCompanyName, data);
		return this;
	}
		
	@FindBy(how=How.ID,using="createLeadForm_firstName")
		private WebElement enterFName;
		
		public CreateLeadPage enterFName(String data) {
			type(enterFName, data);
			return this;
		}
			@FindBy(how=How.ID,using="createLeadForm_lastName")
			private WebElement enterLName;
			
			public CreateLeadPage enterLName(String data) {
				type(enterLName, data);
				return this;
			}
			@FindBy(how=How.CLASS_NAME,using="smallSubmit")
			private WebElement clickCreateLead;
			
			public ViewLeadPage clickCreateLead() {
				click(clickCreateLead);
				return new ViewLeadPage();
	}
		
	}
	
