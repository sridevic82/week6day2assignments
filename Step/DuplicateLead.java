package Step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass {
	
	@When("Click duplicatelead")
	public void duplicatelead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();

	}
	@When("Click on submit")
	public void duplicateSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Duplicate Lead is performed")
	public void duplicateLeadAction() {
	System.out.println("Duplicate lead is performed");

	}

}
