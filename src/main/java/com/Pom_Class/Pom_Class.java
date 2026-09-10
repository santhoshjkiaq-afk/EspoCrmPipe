package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	WebDriver driver;

	public Pom_Class(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	

	@FindBy(xpath = "//button[@id='btn-login']")
	public WebElement Login;
	@FindBy(xpath = "(//span[@class='full-label'])[1]")
	public WebElement HomeVali;
	@FindBy(xpath = "(//a[@class='nav-link-group'])[1]")
	public WebElement SalesandP;
	@FindBy(xpath = "//span[text()='Return Orders']")
	public WebElement ReturnOrder;
	@FindBy(xpath = "(//span[text()='Return Orders'])[2]")
	public WebElement ReturnOrderV;
	@FindBy(xpath = "//a[@class='btn action btn-default btn-xs-wide main-header-manu-action']")
	public WebElement CreateReturnOrder;
	@FindBy(xpath = "//span[text()='create']")
	public WebElement CreateReturnOrderV;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[1]")
	public WebElement Account;
	//@FindBy(xpath = "//span[text()='Select · Accounts']")
	//public WebElement AccountsV;
	@FindBy(xpath = "//a[text()='AFP Supply']")
	public WebElement Afp;
	@FindBy(xpath = "//div[@data-name='status']//div[contains(@class,'selectize-input')]")
	public WebElement Status;
	@FindBy(xpath = "//div[contains(@class,'text-success option')]")
	public WebElement Completed;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[3]")
	public WebElement SalesOrder;
	@FindBy(xpath = "//span[contains(text(),'Selec')]")
	public WebElement SalesOrderV;
	@FindBy(xpath = "//span[text()='Create']")
	public WebElement Create;
	@FindBy(xpath = "//span[text()='Create Sales Order']")
	public WebElement CreateSalesV;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[18]")
	public WebElement Accounts2;
	@FindBy(xpath = "//a[text()='AFP Supply']")
	public WebElement Afp2;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[22]")
	public WebElement Opurtunity;
	@FindBy(xpath = "//a[text()='Laptops for employees']")
	public WebElement Lapforemp;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-xs-wide']")
	public WebElement Save;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon date-picker-btn'])[2]")
	public WebElement Calender;
	@FindBy(xpath = "(//td[@class='day'])[4]")
	public WebElement Date;
	@FindBy(xpath = "(//textarea[@class='form-control auto-height'])[1]")
	public WebElement Street;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public WebElement City;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	public WebElement Country;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	public WebElement Postalcode;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[5]")
	public WebElement Warehouses;
	@FindBy(xpath = "//span[text()='Select · Warehouses']")
	public WebElement WarhousesV;
	@FindBy(xpath = "//a[text()='Main Warehouse']")
	public WebElement MainWarhouses;
	@FindBy(xpath = "(//textarea[@class='form-control auto-height'])[2]")
	public WebElement ShipStreet;
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	public WebElement ShipCity;
	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	public WebElement ShipCountry;
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	public WebElement ShipPostal;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[7]")
	public WebElement Billing;
	@FindBy(xpath = "//span[text()='Select · Contacts']")
	public WebElement ContactV;
	@FindBy(xpath = "//a[text()='Frederick Devine']")
	public WebElement Frederick;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[9]")
	public WebElement ShippingCon;
	@FindBy(xpath = "//a[text()='Frederick Devine']")
	public WebElement Freddev;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[11]")
	public WebElement Tax;
	@FindBy(xpath = "//span[text()='Select · Tax Profiles']")
	public WebElement TaxProV;
	@FindBy(xpath = "//a[text()='Standard']")
	public WebElement Standard;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[13]")
	public WebElement ShippingProv;
	@FindBy(xpath = "//span[text()='Select · Shipping Providers']")
	public WebElement ShippingProvV;
	@FindBy(xpath = "//a[text()='Speedy Shipping']")
	public WebElement Speedy;
	@FindBy(xpath = "//input[@class='main-element form-checkbox']")
	public WebElement Checkbox;
	@FindBy(xpath = "(//input[@class='main-element form-control numeric-text'])[3]")
	public WebElement Charges;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[15]")
	public WebElement AssignedUser;
	@FindBy(xpath = "//span[text()='Select · Users']")
	public WebElement UserV;
	@FindBy(xpath = "//a[text()='Jack Adams']")
	public WebElement Jack;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[17]")
	public WebElement Teams;
	@FindBy(xpath = "//span[text()='Select · Teams']")
	public WebElement TeamsV;
	@FindBy(xpath = "//a[text()='Sales']")
	public WebElement SalesB;
	@FindBy(xpath = "//button[@class='btn action btn-primary detail-action-item btn-xs-wide']")
	public WebElement SaveButton;
	@FindBy(xpath = "//span[text()='Create Receipt']")
	public WebElement CreateReceipt;
	@FindBy(xpath = "(//span[text()='Create Receipt'])[2]")
	public WebElement CreateReceiptV;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-icon'])[3]")
	public WebElement Warehouse2;
	@FindBy(xpath = "//span[text()='Select · Warehouses']")
	public WebElement Warehouse2V;
	@FindBy(xpath = "//a[text()='Repair Center']")
	public WebElement Repair;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs-wide']")
	public WebElement ClickCreate;
	@FindBy(xpath = "//span[@class='font-size-flexible title']")
	public WebElement SRO;

//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;

}
