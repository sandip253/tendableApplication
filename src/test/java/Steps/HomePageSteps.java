package Steps;



import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {
	public HomePage homePage;
	
	


	
	@Given("user open a login page url in {string} browser")
	public void user_is_on_sign_in_page(String browsername) {
		homePage = new HomePage();
		BaseClass.initialization(browsername); 
		
		
		
	    
	}
	@When("user verify Home Page Title, Our Story , Our Solution & Why Tendable Is Enabled")
	public void user_verify_home_page_title_our_story_our_solution_why_tendable_is_enabled() {
		homePage = new HomePage();
		
		boolean homepageTextisEnabled = homePage.VerifyHomePageText();
		Assert.assertEquals(homepageTextisEnabled, true);
	}
	@Then("user Request a Demo button is displayed on home page")
	public void user_request_a_demo_button_is_displayed_on_home_page()
	{
		homePage = new HomePage();
		boolean requestDemobtsIsDisplayed = homePage.RequestDemobtnStatus();
		Assert.assertEquals(requestDemobtsIsDisplayed, true);
	}
	@Then("user verify top level button Enabled")
	public void user_verify_top_level_button_enabled() {
		homePage = new HomePage();
		boolean VerifyTopLevelBtnisEnabled = homePage.VerifyTopLevelBtnStatus();
		Assert.assertEquals(VerifyTopLevelBtnisEnabled, true);
	    
	}
	@Then("user click on contactUs button")
	public void user_click_on_contact_us_button() throws InterruptedException {
		homePage = new HomePage();
		homePage.ContactUsBtnClick();
	}
	@Then("user verify system redirected to Contact Us page")
	public void user_verify_system_redirected_to_contact_us_page() {
		homePage = new HomePage();
		boolean CurrenturlCheckatContactUs = homePage.CurrentURLCheckContactUsPage().contains("contact-us");
		Assert.assertEquals(CurrenturlCheckatContactUs, true);
		
	   
	}
	@Then("user click on Contact at Marketing option")
	public void user_click_on_contact_at_marketing_option() throws InterruptedException {
		homePage = new HomePage();
		homePage.MarketingContactBtn();
	    
	}
	@Then("Enter full name")
	public void enter_full_name() throws InterruptedException {
		homePage = new HomePage();
		
		homePage.EnterFullName();
	}
	@Then("Enter Oranization Name")
	public void enter_oranization_name() throws InterruptedException {
		homePage = new HomePage();
		homePage.EnterOrgName();
	   
	}
	@Then("Enter phone number")
	public void enter_phone_number() throws InterruptedException {
		homePage = new HomePage();
		homePage.EnterPhoneNumber();
	   
	}
	@Then("Enter email")
	public void enter_email() throws InterruptedException {
		homePage = new HomePage();
		homePage.EnterEmail();
	   
	}
	@Then("user select job Role from dropdown")
	public void user_select_job_role_from_dropdown() throws InterruptedException {
		homePage = new HomePage();
		homePage.SelectJobRole();
	   
	}
	@Then("user type message to textbox")
	public void user_type_message_to_textbox() throws InterruptedException {
		homePage = new HomePage();
		homePage.EnterMessage();
	   
	}
	@Then("user click on I Agree radio btn")
	public void user_click_on_i_agree_radio_btn() throws InterruptedException {
		homePage = new HomePage();
		homePage.ClickRadioBtn();
	   
	}
	@Then("user click on Submit btn")
	public void user_click_on_submit_btn() throws InterruptedException {
		homePage = new HomePage();
		homePage.SubmitBtnClick();
	}
	@Then("user verify error message displayed")
	public void user_verify_error_message_displayed() throws InterruptedException {
		homePage = new HomePage();
		boolean successMsgDisplayed = homePage.ErrorMessageCheck();
		Assert.assertEquals(successMsgDisplayed, false);
	   
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			if (getDriver() != null) {
				getDriver().quit();
			}
		}
	}

}
