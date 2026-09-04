package com.Step_Definition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Base_Class.Base_Class;
import com.Pom_Class.Pom_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Definition extends Base_Class {
	Pom_Class pom = new Pom_Class(driver);

	@Given("User Validates the Login Page")
	public void user_validates_the_login_page() {
		Assert.assertTrue(Url().contains("espocrm"));

	}

	@Given("User clicks on the Login")
	public void user_clicks_on_the_login() {
		click(pom.Login);

	}

	@Then("User validates the HomePage")
	public void user_validates_the_home_page() {
		Assert.assertTrue(gettxt(pom.HomeVali).contains("Home"));

	}

	@Then("User clicks on the Sales & Puchases")
	public void user_clicks_on_the_sales_puchases() {
		WindowsScroll(pom.SalesandP);
		wait.until(ExpectedConditions.elementToBeClickable(pom.SalesandP));
		click(pom.SalesandP);

	}

	@Given("User clicks on Retun Orders")
	public void user_clicks_on_retun_orders() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.ReturnOrder));
		click(pom.ReturnOrder);

	}

	@Then("User Validates the Return Orders Page")
	public void user_validates_the_return_orders_page() {
		Assert.assertTrue(gettxt(pom.ReturnOrderV).contains("Return"));

	}

	@Then("User Clicks on Create Return Order")
	public void user_clicks_on_create_return_order() {
		click(pom.CreateReturnOrder);

	}

	@Then("User Validates the Create Return Order Page")
	public void user_validates_the_create_return_order_page() {
//		Assert.assertTrue(gettxt(pom.CreateReturnOrderV).contains("create"));

	}

	@Then("User clicks on the Accounts")
	public void user_clicks_on_the_accounts() {
		click(pom.Account);

	}

	@Then("User validates Accounts")
	public void user_validates_accounts() {
//		Assert.assertTrue(gettxt(pom.AccountsV).contains("Accounts"));

	}

	@Then("User cliks on Name")
	public void user_cliks_on_name() {
		click(pom.Afp);

	}

	@Given("User clicks on the Status")
	public void user_clicks_on_the_status() {
//		wait.until(ExpectedConditions.elementToBeClickable(pom.Status));
		click(pom.Status);

	}

	@Then("User clicks on Completed")
	public void user_clicks_on_completed() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.Completed));
//		wait.until(ExpectedConditions.visibilityOf(e));
		click(pom.Completed);

	}

	@Then("User CLicks on Sales Order")
	public void user_c_licks_on_sales_order() {
		click(pom.SalesOrder);

	}

	@Then("User Validates the Sales Order")
	public void user_validates_the_sales_order() {
		Assert.assertTrue(pom.SalesOrderV.isDisplayed());

	}

	@Then("User clicks on Create")
	public void user_clicks_on_create() {
		click(pom.Create);

	}

	@Then("User Validates the Create Sales Order")
	public void user_validates_the_create_sales_order() {
		Assert.assertTrue(pom.CreateSalesV.isDisplayed());

	}

	@Then("User clicks on Account")
	public void user_clicks_on_account() {
		click(pom.Accounts2);

	}

	@Then("User Clicks on the Name")
	public void user_clicks_on_the_name() {
		click(pom.Afp2);

	}

	@Then("user clicks on Oppurtunity")
	public void user_clicks_on_oppurtunity() {
		click(pom.Opurtunity);
	}

	@Then("User clicks on the laptop")
	public void user_clicks_on_the_laptop() {
		click(pom.Lapforemp);

	}

	@Then("User clicks on Save")
	public void user_clicks_on_save() {
		click(pom.Save);

	}

	@Then("User Clicks on Delivery Calender")
	public void user_clicks_on_delivery_calender() {
		click(pom.Calender);

	}

	@Then("User clicks on the DeliveryDate")
	public void user_clicks_on_the_delivery_date() {
		click(pom.Date);

	}

	@Given("User Enters the Street name {string}")
	public void user_enters_the_street_name(String Street) throws InterruptedException {
		Thread.sleep(2000);
		Sendkeys(pom.Street, Street);

	}

	@Given("User Enters the City name {string}")
	public void user_enters_the_city_name(String City) {
		Sendkeys(pom.City, City);
	}

	@Given("User Enters the Country name {string}")
	public void user_enters_the_country_name(String Country) {
		Sendkeys(pom.Country, Country);

	}

	@Given("User Enters the Postal Code {string}")
	public void user_enters_the_postal_code(String Postalcode) {
		Sendkeys(pom.Postalcode, Postalcode);

	}

	@Given("User clicks on the Warhouses")
	public void user_clicks_on_the_warhouses() {
		click(pom.Warehouses);

	}

	@Then("User Validates the Warhouses")
	public void user_validates_the_warhouses() {
		Assert.assertTrue(pom.WarhousesV.isDisplayed());

	}

	@Then("User Clicks on MainWarehouse")
	public void user_clicks_on_main_warehouse() {
		click(pom.MainWarhouses);

	}

	@Given("User Enters the Ship Street name {string}")
	public void user_enters_the_ship_street_name(String ShipStreet) {
		Sendkeys(pom.ShipStreet, ShipStreet);

	}

	@Given("User Enters the Ship City name {string}")
	public void user_enters_the_ship_city_name(String ShipCity) {
		Sendkeys(pom.ShipCity, ShipCity);

	}

	@Given("User Enters the Ship Country name {string}")
	public void user_enters_the_ship_country_name(String ShipCountry) {
		Sendkeys(pom.ShipCountry, ShipCountry);

	}

	@Given("User Enters the Ship Postal Code {string}")
	public void user_enters_the_ship_postal_code(String ShipPostal) {
		Sendkeys(pom.ShipPostal, ShipPostal);

	}

	@Given("User clicks on the Billig contact")
	public void user_clicks_on_the_billig_contact() {
		click(pom.Billing);

	}

	@Then("User Validates the Contact")
	public void user_validates_the_contact() {
		Assert.assertTrue(pom.ContactV.isDisplayed());

	}

	@Then("User clicks on Frederick")
	public void user_clicks_on_frederick() {
		click(pom.Frederick);

	}

	@Then("User clicks on the Shipping Contact")
	public void user_clicks_on_the_shipping_contact() {
		click(pom.ShippingCon);

	}

	@Then("User clicks on Stanley")
	public void user_clicks_on_stanley() {
		click(pom.Freddev);

	}

	@Then("User clicks on the Tax")
	public void user_clicks_on_the_tax() {
		click(pom.Tax);

	}

	@Then("User Validates the Tax")
	public void user_validates_the_tax() {
		click(pom.TaxProV);

	}

	@Then("User clicks on the Standard")
	public void user_clicks_on_the_standard() {
		click(pom.Standard);

	}

	@Then("User clicks on Shipping Provider")
	public void user_clicks_on_shipping_provider() {
		click(pom.ShippingProv);

	}

	@Then("User Validates the Shipping Providers")
	public void user_validates_the_shipping_providers() {
		Assert.assertTrue(pom.ShippingProvV.isDisplayed());

	}

	@Then("User clicks on the Speedy")
	public void user_clicks_on_the_speedy() {
		click(pom.Speedy);

	}

	@Then("User clisk on Tax Checkbox")
	public void user_clisk_on_tax_checkbox() {
		click(pom.Checkbox);

	}

	@Then("User enters Charges {string}")
	public void user_enters_charges(String Charges) {
		Sendkeys(pom.Charges, Charges);

	}

	@Then("User click on the Assigned User")
	public void user_click_on_the_assigned_user() {
		click(pom.AssignedUser);

	}

	@Then("User Validates the User")
	public void user_validates_the_user() {
		Assert.assertTrue(pom.UserV.isDisplayed());

	}

	@Then("User clicks on Jack")
	public void user_clicks_on_jack() {
		click(pom.Jack);

	}

	@Then("User clicks on Teams")
	public void user_clicks_on_teams() {
		click(pom.Teams);

	}

	@Then("User Validates the Teams")
	public void user_validates_the_teams() {
		Assert.assertTrue(pom.TeamsV.isDisplayed());

	}

	@Then("User clicks on Sales")
	public void user_clicks_on_sales() {
		click(pom.SalesB);
	}

	@Then("User clicks on SaveButton")
	public void user_clicks_on_save_button() {
		click(pom.SaveButton);
	}

	@Then("User clicks on Create Receipt")
	public void user_clicks_on_create_receipt() {
		click(pom.CreateReceipt);

	}

	@Then("User Validates the Create Receipt")
	public void user_validates_the_create_receipt() {
		Assert.assertTrue(pom.CreateReceiptV.isDisplayed());
	}

	@Then("User  clicks on Warhouse2")
	public void user_clicks_on_warhouse2() {
		click(pom.Warehouse2);

	}

	@Then("User validates the Warhouse2")
	public void user_validates_the_warhouse2() {
		Assert.assertTrue(pom.Warehouse2V.isDisplayed());

	}

	@Then("User clicks on the Repair Center")
	public void user_clicks_on_the_repair_center() {
		click(pom.Repair);

	}

	@Then("User clicks on CreateOption")
	public void user_clicks_on_create_option() {
		click(pom.ClickCreate);

	}

	@Then("User Validates the SRO")
	public void user_validates_the_sro() {
		Assert.assertTrue(pom.SRO.isDisplayed());

	}

}
