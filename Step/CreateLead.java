package Step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click the Crmsfa link")
	public void crmsfalink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@When("Click leads button")
	public void leadsbutton() {
		
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click Createlead")
	public void createLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("enter the company name as {string}")
	public void cName(String companyname) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@When("Enter the first name as {string}")
	public void fName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);

	}
	@When("Enter the last name as {string}")
	public void lName(String lastname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@When("Click Create lead")
	public void createLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Create lead is created")
	public void createleadmessage() {
		
		System.out.println("The lead is created");


}
}
