package Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	
	@When("click on login button button")
	public void login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("homepage should be displayed")
	public void verifypage()
	{
		System.out.println("page is verifies as " + driver.getTitle());
	}

}
	