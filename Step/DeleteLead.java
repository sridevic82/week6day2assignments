package Step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	
	@When("Click delete")
	public void deleteButton() {
		driver.findElement(By.linkText("Delete")).click();

	}
	@Then("Delete Lead is performed")
	public void deleteLeadAction() {
	System.out.println("Delete lead is performed");

	}

}
