package PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='Tendable Logo']")
	private WebElement homePageLogo;

	@FindBy(xpath = "//a[text()='Our Story ']")
	private WebElement ourStory;

	@FindBy(xpath = "//a[text()='Our Solution ']")
	private WebElement ourSolution;

	@FindBy(xpath = "//a[text()='Why Tendable? ']")
	private WebElement whyTendable;

	@FindBy(xpath = "//a[text()='Request A Demo']")
	private WebElement requestDemoBtn;

	@FindBy(xpath = "(//a[text()='Sign In'])[2]")
	private WebElement signInBtn;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsBtn;

	@FindBy(xpath = "(//button[text()='Contact'])[1]")
	private WebElement marketingContactBtn;

	@FindBy(id = "form-input-fullName")
	private WebElement fullNametextbox;

	@FindBy(id = "form-input-organisationName")
	private WebElement orgNameTextbox;

	@FindBy(id = "form-input-cellPhone")
	private WebElement phoneNumberTextbox;

	@FindBy(id = "form-input-email")
	private WebElement emailTextbox;

	@FindBy(id = "form-input-jobRole")
	private WebElement jobRoleDropdown;

	@FindBy(id = "form-input-message")
	private WebElement messageTextbox;

	@FindBy(id = "form-input-consentAgreed-0")
	private WebElement radioBtn;

	@FindBy(name = "form_page_submit")
	private WebElement submitBtn;

	@FindBy(xpath = "(//h3[text()='Form has been submitted successfully!'])[1]")
	private WebElement successMessage;

	// =====================================

	// =====================================

	public HomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	public boolean VerifyHomePageText() {

		if (homePageLogo.isEnabled() && ourStory.isEnabled() && ourSolution.isEnabled() && whyTendable.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean RequestDemobtnStatus() {

		if (requestDemoBtn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean VerifyTopLevelBtnStatus() {

		if (requestDemoBtn.isEnabled() && signInBtn.isEnabled() && contactUsBtn.isEnabled()
				&& whyTendable.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public void ContactUsBtnClick() throws InterruptedException {
		Thread.sleep(3000);
		contactUsBtn.click();
	}

	public String CurrentURLCheckContactUsPage() {

		return getDriver().getCurrentUrl();
	}

	public void MarketingContactBtn() throws InterruptedException {
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", marketingContactBtn);
		//marketingContactBtn.click();
	}

	public void EnterFullName() throws InterruptedException {
		Thread.sleep(2000);
		fullNametextbox.sendKeys("Sandip Patil");
	}

	public void EnterOrgName() throws InterruptedException {
		Thread.sleep(2000);
		orgNameTextbox.sendKeys("Livegage Services");

	}

	public void EnterPhoneNumber() throws InterruptedException {
		Thread.sleep(2000);
		phoneNumberTextbox.sendKeys("9123719712");

	}

	public void EnterEmail() throws InterruptedException {
		Thread.sleep(2000);

		emailTextbox.sendKeys("Sandip@gmail.com");
	}

	public void SelectJobRole() throws InterruptedException {
		Thread.sleep(2000);

		Select obj = new Select(jobRoleDropdown);
		obj.selectByVisibleText("Management");

	}

	public void EnterMessage() throws InterruptedException {
		Thread.sleep(2000);
		messageTextbox.sendKeys("Message");
	}

	public void ClickRadioBtn() throws InterruptedException {
		Thread.sleep(2000);
		radioBtn.click();

	}

	public JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public void SubmitBtnClick() throws InterruptedException {
		Thread.sleep(5000);

		js.executeScript("arguments[0].scrollIntoView();", submitBtn);
		js.executeScript("arguments[0].click();", submitBtn);

	}

	public boolean ErrorMessageCheck() throws InterruptedException {
		Thread.sleep(10000);
		js.executeScript("arguments[0].scrollIntoView();", successMessage);
		if (successMessage.getText().contains("Form has been submitted successfully!")) {
			return false;
		} else {
			return true;
		}
	}

}
