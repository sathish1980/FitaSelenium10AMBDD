package Stepdefenitions;

import org.testng.Assert;

import DriverUtils.Browser;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageDefenition extends Browser{

	public String expectedSameCityError = "From & To airports cannot be the same";
	protected static String expectedResult=null;
	@Given("Launch the browser and Enter the url")
	public void launch_the_browser_and_enter_the_url() {
		LaunchTheBrowser();
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

	}

	@When("i select the valid from location")
	public void i_select_the_valid_from_location() {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnFromLocation("MAA");
	}

	@When("i select the valid from location from table as ([^\"]*)$")
	public void i_select_the_valid_from_location_from_table_as(String From) {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnFromLocation(From);
	}

	@When("i select the valid from location as {string}")
	public void i_select_the_valid_from_location_as(String From) {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnFromLocation(From);
	}

	@When("i select the valid to Location")
	public void i_select_the_valid_to_location() {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnToLocation("PNQ");
	}

	@When("i select the valid to Location from table as ([^\"]*)$")
	public void i_select_the_valid_to_Location_from_table_as(String to) {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnToLocation(to);
	}

	@When("i select the valid to Location as {string}")
	public void i_select_the_valid_to_Location_as(String date) {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnToLocation(date);
	}

	@When("i select the valid date from table as ([^\"]*)$")
	public void i_select_the_valid_date_from_table_as(String date) {
		SearchPage sp = new SearchPage(driver);
		sp.SelectDepatureDate(date);
		expectedResult = sp.GetFromandToLocationName();

	}

	@When("i select the valid date")
	public void i_select_the_valid_date() {
		SearchPage sp = new SearchPage(driver);
		sp.SelectDepatureDate("28");
		expectedResult = sp.GetFromandToLocationName();

	}

	@When("i select the valid date as {string}")
	public void i_select_the_valid_date_as(String date) {
		SearchPage sp = new SearchPage(driver);
		sp.SelectDepatureDate(date);
		expectedResult = sp.GetFromandToLocationName();

	}

	@When("i click on Search button")
	public void i_click_on_search_button() {
		SearchPage sp = new SearchPage(driver);
		sp.ClickOnSearch();
	}

	@Then("i get the same city validation")
	public void i_get_the_same_city_validation() {
		SearchPage sp = new SearchPage(driver);

		sp.ClickOnFromLocation("MAA");
		sp.ClickOnToLocation("MAA");
		Assert.assertEquals(expectedSameCityError, sp.ActualGetSameCityError());

	}
}
