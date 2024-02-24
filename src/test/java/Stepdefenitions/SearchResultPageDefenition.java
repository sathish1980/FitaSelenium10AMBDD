package Stepdefenitions;

import org.testng.Assert;

import DriverUtils.Browser;
import Pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchResultPageDefenition extends Browser {


	@Given("Click On BackButton")
	public void Click_On_BackButton() throws InterruptedException {
		driver.navigate().back();
	}

	@Then("I close the Browser")
	public void I_close_the_Browser() throws InterruptedException {
		driver.quit();
	}

	@When("i wait for the popup and click on it")
	public void i_wait_for_the_popup_and_click_on_it() throws InterruptedException {
		SearchResultPage SRP = new SearchResultPage(driver);
		SRP.WaitforPopupAndClickinToit();
	}

	@Then("i get the search result and validate")
	public void i_get_the_search_result_and_validate() {
		SearchResultPage SRP = new SearchResultPage(driver);
		String actualResult =SRP.GetActualSearchResult();
		Assert.assertEquals(SearchPageDefenition.expectedResult, actualResult);

	}


}
