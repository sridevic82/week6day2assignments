package Step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	@When("Click Findleads")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@When("Click on phone")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@When("enter the pnum as {string}")
	public void pnum(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);

	}
	@When("Click findleads")
	public void findLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	@When("select firstlead")
	public void firstLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("Click edit")
	public void edit() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@When("enter cname{string}")
	public void cnames(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}
	@When("Click update")
	public void updateButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Edit lead is performed")
	public void editLeadAction() {
	System.out.println("Edit lead is performed");

	}

}
