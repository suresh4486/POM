package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="login to LeafTaps And Logout";
		testNodes="Leads";
		category="Smoke";
		authors="Suresh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String companyName,String FirstName, String LastName) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFName(FirstName)
		.enterLName(LastName)
		.clickCreateLead()
		.verifyCompanyName(companyName);
		
		
		
		
		
		
	}

}
