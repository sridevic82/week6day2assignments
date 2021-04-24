package Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	
	@When("Click Merge Leads")
	public void mergeleads() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}
	@When("Click 1st lookup")
	public void lookup1() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

	}
	@When("find window handle and go to first window")
	public void windowhandle() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));

	}
	@When("enter first name as Naveen")
	public void fname1() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Naveen");

	}
	@When("select 1st leadid")
	public void leadid() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("go to first window")
	public void firstwindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));

	}
	@When("Click 2nd lookup")
	public void lookup2() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

	}
	@When("enter first name as Jacob")
	public void fname2() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sri");

	}
	@When("Click Mergelead")
	public void mergeleadButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}
	@Then("merge lead is done")
	public void mergeLeadAction() {
		System.out.println("Merge lead is completed");

	}

}
